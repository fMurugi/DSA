package LinkedLists;

public class SinglyLinkedList {
     static Node head=null;
     Node tail=null ;
    int size;
    Node current;

    class Node{
        public int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next=null;
        }


    }
    public void addNode(int data){
        Node newNode = new Node(data);

        if(head==null){

            head=newNode;
            tail=newNode;
        }else{

                tail.next=newNode;
              tail=newNode;


        }
        size=size+1;


    }
    public void printList(){
        current =head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }else{
            while(current!=null){
                System.out.print(current.data+" ");
                current =current.next;
            }
        }

    }
//    public void reverseList(Node node){
//        if(node ==tail){
//            head=tail;
//            return;
//        }
//        //swap
//        reverseList(node.next);
//        tail.next=node;
//        tail=node;
//        tail.next=null;
//
//
//    }
    public void reverseListIterate(Node node){
        if(node==null){
            return;
        }
        Node prev = null;
        Node current=head;
        Node next = null;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;

    }
    //reverse part of the list
    public void reversePart(Node head,int m,int n){
        //traverse upto m
        if(m>n){
            return;
        }
        Node current =head;
        Node prev = null;

        for(int i=1;current!=null&&i<m;i++){
            prev = current;
             current = current.next;

        }
        Node end =null;
        Node start =current;
        for(int i =1;current!=null&&i<=n-m+1;i++){
            Node next = current.next;
            current.next=end;
            end= current;
            current=next;
        }
        if (start != null)
        {
            start.next = current;
            if (prev != null) {
                prev.next = end;
            }
            else {
                head = end;     // when m = 1, `prev` is null
            }
        }

        return;
    }


    public static void  main(String[]args){
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.addNode(7);
        myList.addNode(2);
        myList.addNode(9);

        myList.addNode(3);
        myList.addNode(10);
        System.out.println("SinglyLinkedList");
        myList.printList();
        System.out.println();

       System.out.println("after revesing");

//        myList.reverseList(head);
        myList.reverseListIterate(head);

        myList.printList();

        myList.reversePart(head,2,4);
        System.out.println("after part reversal");
        myList.printList();



    }
}
