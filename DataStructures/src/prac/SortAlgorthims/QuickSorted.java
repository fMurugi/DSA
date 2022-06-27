package prac.SortAlgorthims;

import java.util.Arrays;

public class QuickSorted {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1,5};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
    }
    public static void sort(int [] nums,int low ,int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int middle = start + (end - start) / 2;
        int pivot = nums[middle];


        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        sort(nums, low, end);
        sort(nums, start, high);
    }

}
