package org.example.CrackingTheInterview;

public class Gcd {

    public static int calculateGcd(int m,int n){
        if(n==0){
            return m;
        }
        return calculateGcd(n,m%n);


    }

    public static void main(String[] args) {
        int ans = calculateGcd(48,18);
        System.out.println(ans);
    }
}
