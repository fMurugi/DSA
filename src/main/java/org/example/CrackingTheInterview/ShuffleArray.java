package org.example.CrackingTheInterview;

import java.util.Arrays;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int [] ans = new int [2*n];
        int j =0;
        for(int i = 0;i<n;i++){
            ans[j] = nums[i];
            j++;
            ans[j] = nums[i+n];
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
       int[] nums = {2,5,1,3,4,7};
       int [] asn = shuffle(nums,3);
        System.out.println(Arrays.toString(asn));
    }
}
