package org.example.CrackingTheInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setsproblem {
    public static void main(String[] args) {
//        int [] A ={1,2,3,4};
//        int[] B ={3,3,3,7};
        int[] A = {2,2,2,2,2,2};
        int [] B ={7,4,2,5,1,2};

        System.out.println(ans(A,B));
    }

    public static int ans(int[]A, int[]B){
        Set<Integer> Aset = new HashSet<>();
        Set<Integer> Bset = new HashSet<>();


        for(int a:A){
            Aset.add(a);
        }
        int m = Aset.size();
//        System.out.println("size of set A:" +m);

        for(int b:B){
            Bset.add(b);
        }
        int n =Bset.size();
//        System.out.println("size of set B:" + n);

        Aset.retainAll(Bset);
        int ans = m + n - (Aset.size() * 2);
        System.out.println(ans);
        return ans;
//        return Arrays.asList(Aset.toArray());
    }
}
