package prac.SortAlgorthims.questions;
//leetcode
//import sort method


public class MissingNumber {
    public static void main(String[] args) {
        int [] arr ={4,0,2,1};
        System.out.println(findMissingNo(arr));
    }
    public static int findMissingNo(int[] arr){

        //sort using cyclic algo
       sort(arr);


        //search
        for(int j =0 ;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }

    public static void sort(int [] arr){
        int i =0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[arr[i]]){
                //swap only if element is less than n and when element
                // is not equal to its index

                int temp =arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;

            }
        }
    }

}
