package org.example;

import java.util.Arrays;

public class LargestNumInArray {
    public static void main(String[] args) {
        int[] nums = {15,7,23,42,9,17};
        System.out.println(findLargestNum(nums));
    }

    public  static  int findLargestNum(int [] nums){
       Arrays.sort(nums);
       int n = nums.length-1;
       return nums[n];
    }
}
