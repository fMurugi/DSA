package LinkedLists;

public class DoublyLinkedList {
    public Node head =null;
    public Node tail = null;
    int size;
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }


    }
    public void addNode(int data){ //insertLast
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail = newNode;
            tail.next =null;
            head.prev=null;

        }else{ //new nide will be inserted at end of the list
            // such that tails next will poitn to newNode
            tail.next=newNode;

            //newNode prev will point to the tail
            newNode.prev = tail;

            //newNode becomes the tail;
            tail=newNode;

            //as now the newNode is the tail it next will be null
            tail.next=null;
        }
    }
    public void display(){
        Node current = head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }else{
            while(current!=null){
                System.out.print(current.data+" ");
                current =current.next;
            }
            System.out.println();

        }
    }
    public void displayRev(){
        Node last = tail;
        if(head==null){
            System.out.println("list is empty");
            return;
        }else{
            while(last!=null){ //to avoud nullPointerException
                System.out.print(last.data+" ");
                last =last.prev;
            }

        }
    }
    public void insertAfter(int after, int data ){
        Node p = findNode(after);
        if(p==null){
           System.out.println("Node does not exists");
           return;
        }
        Node newNode = new Node(data);
        newNode.next=p.next;
        newNode.prev=p;
        p.next=newNode;
        if(newNode.next!=null){
            newNode.next.prev=newNode;

        }
    }

    public Node findNode(int value){
        Node node = head;
        while(node!=null){
            if(node.data == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertionSort(){

    }
    public static void  main(String[]args){
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.addNode(1);
        myList.addNode(5);
        myList.addNode(3);
        myList.addNode(8);
        myList.addNode(10);
        myList.addNode(2);
        myList.addNode(13);
        myList.addNode(20);

        myList.insertAfter(3,98);

        myList.display();
        myList.displayRev();

    }
}
