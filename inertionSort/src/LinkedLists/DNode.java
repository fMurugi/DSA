//package LinkedLists;
//
//public class DNode {
//    class Node{
//        int data;
//        Node next;
//        public Node(int Data){
//            this.data = data;
////            this.next = null;
//        }
//    }
////    protected int data;
//    public Node head=null,tail=null;
////    protected  LinkedLists.DNode next;
//
//
////    public LinkedLists.DNode(int data) {
////        this.data = data;
////        this.next=null;
////    }
//
////    public LinkedLists.DNode getNext() {
////        return next;
////    }
////
////    public void setNext(LinkedLists.DNode next) {
////        this.next = next;
////    }
//    public void addNode(int data){
//        Node newNode = new Node(data);
//        if(head == null){ // if the list is empty the new
//            //node becomes both the head and the tail
//            head = newNode;
//        }
//        else{
//            head.next = newNode; //whats happenning here;
//            tail = newNode;
//
//        }
//    }
//
//    public void sortList(){
//        Node current = head,index =null;
//        int temp;
//        if(head == null){
//            System.out.print("List is empty");
//        }
//        else{
//            while(current!=null){
//                index = current.next;
//                while(index!=null){
//                    if(current.data>index.data){
//                        temp = current.data;
//                        current.data = index.data;
//                        index.data= temp;
//                    }
//                    index = index.next;
//                }
//                current =current.next;
//            }
//        }
//    }
//    public void display(){
//        Node current = head;
//        if(head==null){
//            System.out.println("List is empty");
//            return;
//        }else{
//            while(current!=null){
//                System.out.print(current.data+" ");
//                current = current.next;
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[]args){
//        DNode myList = new DNode();
//        myList.addNode(8);
//        myList.addNode(3);
//        myList.addNode(7);
//        myList.addNode(4);
//
//        //display list before sorting
//        System.out.println("Original lIst:");
//        myList.display();
//        //sort the list
//        myList.sortList();
//        System.out.println("Sorted list:");
//        myList.display();
//    }
//}
