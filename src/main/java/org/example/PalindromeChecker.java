package org.example;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
       str = str.replaceAll("\\s","").toLowerCase();

       int start = 0;
       int end = str.length()-1;

       while(start<end){
           if(str.charAt(start)!=str.charAt(end)){
               return  false;
           }
           start++;
           end--;
       }
       return true;
    }

    public static void main(String[] args) {
//        String palindromeStr = "A man a plan a canal Panama";
        String palindromeStr = "racecar";

        boolean isPalindrome = isPalindrome(palindromeStr);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
