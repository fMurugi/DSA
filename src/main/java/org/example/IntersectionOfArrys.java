package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrys {
    public static void main(String[] args) {
        Integer  [] arr1 = {12,26,6,8,9};
        Integer [] arr2 = {12,4,3,6,10,19,9};
        Integer [] ans = findIntersection(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }

    public  static  Integer [] findIntersection(Integer[] num1,Integer[] num2){

        //create two set from the arrays
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // move the contents of arrrays to t
        Collections.addAll(set1,num1);

        Collections.addAll(set2,num2);

        set1.retainAll(set2);
        Integer [] result = set1.toArray(new Integer[0]);

        return  result;

    }
}
