package prac.SortAlgorthims.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearingNums {
    public static List<Integer> findDisappearedNums(int[]arr){
        //sort
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;

            if(  arr[i]!=arr[correctIndex]){
                //swap;
                int temp = arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;

            }

        }

        System.out.println(Arrays.toString(arr));


        List myList = new ArrayList<>();

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                myList.add(j+1);

            }
        }
        return myList;
    }

//    public static void sort(int []arr){
//
//    }

    public static void main(String[] args) {
        int []nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNums(nums));
    }
}
