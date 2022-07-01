package prac.SortAlgorthims.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class DuplicatesNums {
    public static List<Integer> findDuplicates(int[] nums) {
        //sort
        List duplicateList = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[i] != nums[correctIndex]) {
                //swap;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                duplicateList.add(nums[i]);
                i++;

            }

        }

        System.out.println(Arrays.toString(nums));

//
        List myList = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                myList.add(nums[j]); //return numbers that are in the wrong indices because those
                //are the duplicates;

            }
        }
        return myList;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

}