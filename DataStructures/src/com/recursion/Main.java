package com.recursion;
import java.util.Arrays;
public class Main {
    public static void main(String[]args){
        int[]A = {4,3,6,7,3,10};
        int[]B = {40,50,60,70,80,90};

        int n= A.length;
        Recursion l = new Recursion();
        System.out.println( l.recursiveFact(6));
        System.out.println( l.linearSum(A,n));
        System.out.println(Arrays.toString(A));
        l.reverseArray(A,0,n-1);
        System.out.println(Arrays.toString(A));
        l.reverseArrayIterative(B,0,n-1);
        System.out.println(Arrays.toString(B));



//        System.out.println( l.reverseArray(A,0,n-1));




    }
}
