package prac.Queue;
import java.util.*;
public class PriorityQ {
    public static void main(String[]args){
        PriorityQueue myPQ = new PriorityQueue();
        for (int i =2;i<=20;i=i+2){
            myPQ.add(i);
        }
        System.out.println("priority queue:"+myPQ);
        Iterator qIterator = myPQ.iterator();
        while(qIterator.hasNext()){
            System.out.print(qIterator.next() +" ");
        }

    }


}
