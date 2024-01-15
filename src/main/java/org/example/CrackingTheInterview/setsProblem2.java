package org.example.CrackingTheInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class setsProblem2 {

    public static void main(String[] args) {
        int [] A ={1,2,3,4};
        int [] B ={3,3,3,7};
        System.out.println(numberOfUniqueCandies(A,B));

    }

    public static int numberOfUniqueCandies(int[]A,int[]B){
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        for(int a: A){
            setA.add(a);
        }


        for(int b:B){
            setB.add(b);
        }
        //initialize another set with the setA
        Set<Integer> commonElements =  new HashSet<>(setA);
        //intersection of setA nad setB
        commonElements.retainAll(setB);

        //union
        setA.addAll(setB);

        //union-intersection = uniqueElements
        setA.removeAll(commonElements);
        System.out.println(setA);
        return setA.size();
    }
}
