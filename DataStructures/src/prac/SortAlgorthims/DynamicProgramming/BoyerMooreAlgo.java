package prac.SortAlgorthims.DynamicProgramming;

public class BoyerMooreAlgo {
    public static int BoyerMatch(String pattern,String text){
        int [] last = buildLastFunction(pattern);
        int n = text.length();
        int m =pattern.length();
        int j = m-1;
        int i = m-1;
        if(j>n-1){
            return -1;
        }

        do{
            if(pattern.charAt(j)==text.charAt(i)){
                if(j==0)
                    return i;
                else{
                    i--;
                    j--;
                }
            }else{
                //character jump
                i=i+m - Math.min(j,1+ last[text.charAt(i)]);
                j=m-1;
            }
        }while(i<=n-1);
        return -1;
    }
    public static int [] buildLastFunction (String pattern){
        int [] last = new int[128];
        for(int i =0;i<128;i++){
            last[i]=-1;
        }
        for(int i =0;i<pattern.length();i++){
            last[pattern.charAt(i)] = i;
        }
        return last;
    }

    public static void main(String[] args) {
        String pattern = "test";
        String text = "this is a test done ";
        System.out.println(BoyerMatch(pattern,text));

    }
}
