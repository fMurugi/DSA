package LinkedLists;

import java.util.LinkedList;

public class CircularlyList {
    public Node head,tail;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public void insertValue(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next =newNode;
            newNode.next=head;
            tail=newNode;
        }
    }
    public void display(){
        Node current= head;
        if(head!=null){
            do{
                System.out.print(current.data+" ");
                current=current.next;
            }while(current!=head);
        }
    }
    //delete
//    public void delete(int value){
//        Node current =head;
//        if(head!=null){
//            return;
//        }else{
//            if(current.data==value){
//              current=current.next;
//              tail.next=head;
//            }
//            do{
//                Node n =current.next;
//
//            }
//        }
//    }
    public static void main(String[]arags){
        CircularlyList myList = new CircularlyList();
        myList.insertValue(5);
        myList.insertValue(10);
        myList.insertValue(78);
        myList.insertValue(565);
        myList.insertValue(56);
        myList.insertValue(4);
        myList.insertValue(34);

        myList.display();

        LinkedList<Integer>list = new LinkedList();
        list.add(34);
        list.size();

    }

}
