package prac.SortAlgorthims.DynamicProgramming;

import java.util.Hashtable;

import static java.lang.String.*;

public class BoyerMooreAlgorithm {
    public static void main(String[] args) {
        String text ="this is a test to be done";
        String pattern = "test";
        System.out.println( patternMatching(pattern,text));

    }

    public static int patternMatching(String pattern, String text){
        Hashtable<Character,Integer> mistmatchTable = badmatchTable(pattern);
        int lengthofPattern = pattern.length();

        int lengthOfText = text.length();
        int m = lengthofPattern;
        int n=lengthOfText;
        int i = m-1;
        int j = m-1;
        int numOfSkips=0;

        if(pattern.length()>text.length()){
            return -1;
        }
        do{
            if(pattern.charAt(j)==text.charAt(i)){
                if(j==0){
                    return i;
                }
                else{
                    i--;
                    j--;

                }
            }
            else{
                i=lengthofPattern-1-pattern.indexOf(i);
                j=m-1;
            }
        }while(i<=n-1);

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
