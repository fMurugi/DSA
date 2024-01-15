package org.example;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(        reverserString("mummy"));
        char[] charArr = {'h', 'e', 'l', 'l', 'o'};

        String usingNewString = new String(charArr);
        String usingToString = charArr.toString();

        System.out.println("Using new String: " + usingNewString);
        System.out.println("Using toString: " + usingToString);
    }
    public  static String  reverse(String str){
        return  new StringBuilder(str).reverse().toString();
    }

    public static String reverserString(String s){
        char[] charArr =  s.toCharArray();
        int start = 0 ;
        int end = s.length()-1;

        while(start<end){
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            start++;
            end--;

        }
        return new String(charArr);
//        return charArr.toString(); //  this retrun the memory address of the string not the string itself
    }


}
