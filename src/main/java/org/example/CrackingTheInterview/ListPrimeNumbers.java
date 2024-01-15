package org.example.CrackingTheInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPrimeNumbers {
    public static List<Integer> listPrimeNums(int n){
        ArrayList<Integer> results = new ArrayList<>();
        Boolean[] arr = new Boolean[n+1];
        Arrays.fill(arr,true);

        for(int i =2;i*i<n+1;i++){
            if(arr[i] == true){
                //multiples
               for(int j =i*i;j<=n;j+=i){
                   arr[j]=false;
               }
            }
        }
        for(int i =2;i<=n;i++){
            if(arr[i]){
                results.add(i);
            }
        }
        return results;
    }
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList = listPrimeNums(20);
        System.out.println(arrayList.toString());

    }
}
