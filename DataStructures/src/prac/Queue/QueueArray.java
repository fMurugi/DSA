package prac.Queue;

public class QueueArray {
     int  capacity;
    int front;
    int rear;
    int[]arr ;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        front=rear=0;
        arr=new int [capacity];
    }


    public int size(){
        return rear;
    }
    public void enqueue(int data){
        if(capacity==rear){
            System.out.println("queue is full");
        }
        arr[rear]=data;
        rear++;
    }
    public void display(){
        if(front==rear){
            System.out.println("empty queue");
            return;
        }
        for(int i=0;i<rear;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public int dequeue(){
        if(front==rear){
            System.out.println("empty queue");

        }else{
           int results = arr[front] ;
           for(int i =0;i<rear-1;i++){
               arr[i]=arr[i+1];
           }
           if(rear<capacity){
               arr[rear]=0;
               rear--;
           }


        }
        return arr[front];
    }
    public int front(){
        if(front==rear){
            System.out.println("queue is empty");
        }
        return arr[front];
    }
    public static void main(String[]args){
        QueueArray myArrQ = new QueueArray(10);
        myArrQ.enqueue(20);
        myArrQ.enqueue(30);
        myArrQ.enqueue(40);
        myArrQ.display();
        System.out.println(myArrQ.dequeue());
        myArrQ.display();
        System.out.println();
        System.out.println(myArrQ.front());

    }
}
