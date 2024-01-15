package org.example;

import java.util.Arrays;

public class maxSubArray {

    public static void main(String[] args) {
        int [] arr = {4,2,3,1,5};

        int [] subArr = findMaxSubArray(arr);
        System.out.println(Arrays.toString(subArr));
    }

    public static  int[]  findMaxSubArray(int [] arr){

        int currentSum = 0;
        int maxSum =0;
        int start =0;
        int end = 0;
        int tempStart=0;

        for(int i =0;i<arr.length;i++){

            if(arr[i]>currentSum+arr[i]){
                tempStart =i;
            }

            //calculate currentSum
            currentSum = Math.max(currentSum,currentSum+arr[i]);

            if(currentSum>maxSum){
                maxSum=currentSum;
                start= tempStart;
                end=i;
            }

        }
        //construct the subarray
        int [] subArr = new int[end -start +1];
        for(int i=start;i<=end;i++){
            subArr[i-start] = arr[i];
        }
        return subArr;
    }
}
