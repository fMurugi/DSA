package prac.SortAlgorthims.questions;
//https://leetcode.com/problems/set-mismatch/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SetMisMatch {
    public static int[] findErrorNums(int[] nums) {
        //sort
        int i =0;
        while(i<nums.length){

            int correctIndex = nums[i]-1; //value -1;

            if(nums[i]!=nums[correctIndex]){ //if number is not equal to
                //ht number at its correct index swap
                //swap
                int temp = nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex] = temp;
            } else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));

        ///look for duplicate
        int [] arr= new int[2];

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                arr[0]=j;
                arr[1]=j+1;
                //return numbers that are in the wrong indices because those
                //are the duplicates;

            }
        }
        return arr ;
    }



    public static void main(String[] args) {
        int[] arr = {2,4,1,2};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
}