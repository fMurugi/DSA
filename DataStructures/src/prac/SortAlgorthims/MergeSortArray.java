package prac.SortAlgorthims;

import java.util.Arrays;

public class MergeSortArray {

    public static int[] mergeSortDiv(int[] arr){

        if(arr.length<2){
            return arr;
        }
        //divide

        //create two sub arrays
        int mid = arr.length/2;
       int [] arr1 = mergeSortDiv(Arrays.copyOfRange(arr,0,mid));
       int [] arr2 = mergeSortDiv(Arrays.copyOfRange(arr,mid,arr.length));

       //merge them while sorting
       return  mergeSubArrays(arr1,arr2);

        }


    public static int[] mergeSubArrays(int [] first, int [] second){
        int[] sortedArray = new int[first.length + second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                sortedArray[k]= first[i];
                i++;
            }else{
                sortedArray[k] = second[j];
                j++;
            }
            k++;

        }

        ///when one subarray is empty

        while(i<first.length){
            sortedArray[k]=first[i];
            i++;
            k++;

        }
        while(j<second.length){
            sortedArray[k]=second[j];
            j++;
            k++;
        }
        return sortedArray;

    }

    public static  void main(String[]args){
      int [] marks = {45,12,10,70,3,86,56,30,90,54};

        System.out.println(Arrays.toString(marks));
        marks = mergeSortDiv(marks);
        System.out.println(Arrays.toString(marks));

    }


}
