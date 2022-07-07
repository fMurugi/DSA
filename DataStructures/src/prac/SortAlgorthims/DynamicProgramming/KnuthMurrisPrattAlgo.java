package prac.SortAlgorthims.DynamicProgramming;

public class KnuthMurrisPrattAlgo {
    public static int KMPmatch(String text,String pattern){
        int n = text.length();
        int m = pattern.length();

        int [] fail = computeFailFunction(pattern);
        int i =0;
        int j =0;
        while(i<n){
            if(pattern.charAt(j)==text.charAt(i)){
                if(j==m-1) { //there is a match
                    return i - m + 1;
                }
                i++; // otherwise move forward
                j++;

            } else if (j>0) {
                j=fail[j-1];

            }
            else i++;
        }
        return -1;  // no match
    }

    public static int[]computeFailFunction(String pattern){
        int [] fail = new int[pattern.length()];
        fail[0]=0;

        int m = pattern.length();
        int j =0;
        int i =1;
        while(i<m){
            if(pattern.charAt(j)==pattern.charAt(i)){
                fail[i] =j+1;
                i++;
                j++;
            } else if (j>0) {
                j = fail[j-1];

            }
            else{
                fail[i]=0;
                i++;
            }
        }
        return fail;
    }

    public static void main(String[] args) {
        String pattern ="test";
        String text = "this is the test we did";
        System.out.println("pattern: "+pattern);
        System.out.println("text: "+text);
        System.out.println("pattern was found at index: " +KMPmatch(text,pattern));
    }
}
