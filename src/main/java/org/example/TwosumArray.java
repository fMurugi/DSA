package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwosumArray {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        int [] result = findTwoSum(nums,target);

        if(result[0]!=-1 && result[1]!=-1){
            System.out.println("indicies of two elements are: "+ result[0]+ " "+result[1]);
            System.out.println("numbers are: "+ nums[result[0]]+ " "+ nums[result[1]]);
        }else {
            System.out.println("No solution found");
        }
    }

    public static int[] findTwoSum(int [] arr,int target){
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int compliment = target - arr[i];
            if(numMap.containsKey(compliment)){
                return new int[]{numMap.get(compliment),i};
            }
        numMap.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
