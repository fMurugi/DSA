package org.example.CrackingTheInterview;

public class UglyNum {
    public  static boolean isUgly(int n){
        int [] nums = {2,3,5};
        if(n == 0){
            return false;
        }
        for(int num:nums){
            while(n%num == 0){
                n/=num;
            }

        }
        return n ==1;


    }

    public static void main(String[] args) {
        System.out.println(isUgly(8));

    }
}
