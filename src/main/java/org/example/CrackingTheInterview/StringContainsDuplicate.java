package org.example.CrackingTheInterview;

import java.util.Arrays;

public class StringContainsDuplicate {

    public static Boolean conatinsDuplicate(String s){
        //change string to char array
        char [] sArray = s.toCharArray();
        //sort the array
        Arrays.sort(sArray);
        int length = sArray.length;

        int i =0;
        int j ;

        while(i<length-1){
            j=i+1;
            if(sArray[i]==sArray[j]){
                return  true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abbc";
        Boolean results = conatinsDuplicate(s);
        System.out.println(conatinsDuplicate(s));
    }
}
