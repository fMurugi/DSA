package org.example.CrackingTheInterview;

public class NumberPalindrome {
    public static boolean reverse(int n){
        int reversedNum = 0;
        int originalNum =  n;

        while(n>0){
            int digit = n%10;
            reversedNum = reversedNum  *10 +digit;
            n= n/10;
        }
        if(originalNum == reversedNum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(reverse(10));
    }
}
