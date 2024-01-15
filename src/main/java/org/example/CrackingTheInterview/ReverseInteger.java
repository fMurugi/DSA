package org.example.CrackingTheInterview;

public class ReverseInteger {
    public  static int reverse(int n){
        int reversed =0;

        while(n!=0){
            int mod =n%10;
            reversed =reversed*10 + mod;
            n=n/10;
        }
        if(reversed>Integer.MAX_VALUE || reversed<Integer.MIN_VALUE){
            return 0;
        }
        return reversed;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-234));

    }
}
