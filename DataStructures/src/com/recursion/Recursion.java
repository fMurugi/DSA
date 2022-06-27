package com.recursion;

import java.util.Arrays;

public class Recursion {
    int fact;
    public int recursiveFact(int n){
        //base case
        if(n==0){
            return 1;
        }else{
             fact = n*recursiveFact(n-1); //6*factorial(6-1)
            return fact;
        }
    }

    //sum of elements of an array
    public int linearSum(int[]A,int n){
        if(n==1){
            return A[0];
        }else{
            return A[n-1]+linearSum(A,n-1); //lsat thing here is addition
        }
    }
    //reverse an array
    public void reverseArray(int [] A, int i, int j){  // a tail recursion
        if((j==i)||(i>j)){
            return ;
        } else  {
            int temp ;
             temp = A[i];
            A[i]=A[j];
            A[j]=temp;
          reverseArray(A, i+1, j-1); //last thing it does
        }
    }
//use iteration to reverse te array
    //other tha recursion;
    //this can be done only in the tail recurson
    //ie where the last thing the method does is the recursive call;
    public void reverseArrayIterative(int [] A, int i, int j){
        int temp;
        while(i<j){
           temp=A[i] ;
           A[i]=A[j];
           A[j]=temp;
           i++;
           j--;
        }
    }

}
