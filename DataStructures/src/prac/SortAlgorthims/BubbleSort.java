package prac.SortAlgorthims;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[]arr){
        boolean swapped;
        //runs n-1 times
        for(int i = 0;i < arr.length;i++){
            swapped=false;
            for(int j =1; j < arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            if(!swapped){ //!swapped = false
                break;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr ={1,3,4,2,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
