package prac.SortAlgorthims;

import java.util.Arrays;

public class CyclicSort {
    public static void sort(int [] arr){
        int i =0;
        while(i<arr.length){

            int correctIndex = arr[i]-1; //value -1;

            if(arr[i]!=arr[correctIndex]){
                //swap
                int temp = arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex] = temp;
            } else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int []  nums= {1,4,3,2,5};
        sort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
