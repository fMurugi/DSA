package prac.SortAlgorthims.DynamicProgramming;

import java.util.Hashtable;

public class BoyerMooreAlgorithm {
    public static void main(String[] args) {
        String pattern ="this is a test";
        String text = "test";
        System.out.println( patternMatching(pattern,text));

    }

    public static int patternMatching(String pattern, String text){
        Hashtable<Character,Integer> mistmatchTable = badmatchTable(pattern);
        int lengthofPattern = pattern.length();

        int lengthOfText = text.length();
        int numOfSkips=0;

        if(pattern.length()>text.length()){
            return -1;
        }

        for (int i =0;i<=lengthOfText - lengthofPattern;i+=numOfSkips){
            numOfSkips = 0;
            for(int j = lengthofPattern-1;j>=0;j--){
                if(pattern.charAt(j)!=text.charAt(i+j)){

                    //if the letter in text exist in the pattern
                    if(mistmatchTable.get(text.charAt(i+j))!=null){
                        numOfSkips = mistmatchTable.get(text.charAt(i+j));
                    }else{
                        numOfSkips = lengthofPattern;
                        break;
                    }
                }
                if(j==0){
                    return i;
                }
                break;

            }
            return i;

        }
        return -1;
    }
    public  static Hashtable<Character, Integer> badmatchTable(String pattern){
        Hashtable<Character,Integer> mistmatchTable =new Hashtable();
        int lengthofPattern = pattern.length();

        for(int i = 0;i<lengthofPattern;i++){
            char actualCharacter = pattern.charAt(i);
            int maxShift = Math.max(1,lengthofPattern-i-1);
            mistmatchTable.put(actualCharacter,maxShift);
        }
        return mistmatchTable;
    }
}
