package prac.Queue;

public class Queue {
    Node front;
    Node rear;
    int length;

    public Queue() {
    }

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int size(){
        return length;
    }
    public void enqueue(int data){
        //create a new node and insert it into the queue
        Node node = new Node( data);
        if(isEmpty()){ //if is empty,let add the node and let it be front
            // and rear
            front = node;

        }else{
            //if it is not empty,rear.next=node
            rear.next=node;
        }
        rear = node; // always after adding an element let it be rear;
        length++;

    }
    public int dequeue(){
        if(isEmpty()){
           System.out.println("Queue is empty");
           return 0;
        }
        else{
            int results = front.data;
            front = front.next;
            if(front==null){
                rear = null;
            }
            length--;
            return results;
        }


    }
    //
    public int front(){
        if(isEmpty()){
            return 0;
        }
        return front.data;
    }
    public void display(){
        if(isEmpty()){
            return;
        }
        Node current = front;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[]args){
        Queue myQueue = new Queue();
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);

        System.out.println( myQueue.dequeue());
        System.out.println(myQueue.size());
        myQueue.display();

    }
}
