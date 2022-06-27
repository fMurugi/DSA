package prac.Queue;

import java.util.Arrays;

public class MaxPQ {
  private  static Integer [] heap;
  private int n;
   public MaxPQ(int C){
       heap= new Integer[C+1];
       n =0;
   }
   public boolean isEmpty(){
       return n ==0;
   }
   public int size(){
       return n;
   }
   public void insert(int element){
       if(n ==heap.length-1){
           resize(2*heap.length);
       }
       n++;
       heap[n]=element;
       swim(n);
   }
   public void resize(int capacity){
       Integer [] temp= new Integer[capacity];
       for(int i =0;i<heap.length;i++){
           temp[i]=heap[i];
       }
       heap=temp;
   }
   public void swim(int k){
       while(k>1&&heap[k/2]<heap[k]){
           int temp= heap[k];
           heap[k]=heap[k/2];
           heap[k/2]=temp;
           k=k/2;
       }
   }
   public static void main(String[]args){
       MaxPQ PQue = new MaxPQ(7);
       System.out.println(PQue.isEmpty());
       System.out.println(PQue.size());
       PQue.insert(3);
       PQue.insert(4);
       PQue.insert(7);
       PQue.insert(5);
       System.out.println(Arrays.toString(heap));
       System.out.println(PQue.size());



   }
}
