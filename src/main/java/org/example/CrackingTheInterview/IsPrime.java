package org.example.CrackingTheInterview;

public class IsPrime {
    public static boolean  isPrime(int n){
//        for(int i = 2;i<n;i++){ //O(n)
//            if(n%i==0){
//                return false;
//            }
//        }
        for(int i =2;i<=Math.sqrt(n);i++){ //
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(isPrime(31));
    }
}
