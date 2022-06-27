package prac.SkipLists;

import java.util.Random;

public class SkipList {
    private node head;
    private node tail;
    private final int NEG_INFINITY = Integer.MIN_VALUE;
    private final int POS_INFINITY = Integer.MAX_VALUE;
    private int heightOfSkipList =0;

    public SkipList(){
        head=new node(NEG_INFINITY);
        tail=new node(POS_INFINITY);
        head.next= tail;
        tail.prev=head;
    }
    class node{
        node next;
        node prev;
        node below;
        node above;
        int key;

        public node(int key){
            this.key=key;
            below=null;
            above=null;
            next=null;
            prev=null;

        }
    }
    public node skipSearch(int key){
        node n = head;
        while(n.below!=null){
            n =n.below;

            while(key>=n.next.key){
                n=n.next;
            }
        }
        return n;
    }

//    public node skipInsert(int key){
//        node position = skipSearch(key);
//        node q;
//
//        int level=-1;
//        int numberOfHeads=-1;
//        if(position.key==key){
//            return position;
//        }

//        do{
//            numberOfHeads++;
//            level++;
//        }while(random.nextBoolean()==true);
    }



