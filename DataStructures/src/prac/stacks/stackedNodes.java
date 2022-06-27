package prac.stacks;

import java.util.EmptyStackException;

public class stackedNodes {
    int length=0;
    Node top=null;
    class Node{
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }
    public void push(int val){
        Node temp = new Node(val);
        temp.next=top;
        top=temp;
        length++;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0; //if it is 0 it will be true,otherwise false
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result =top.val;
        top =top.next;
        length--;
        return result;
    }
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result= top.val;
        return result;
    }
    public void display(){
        Node curr = top;
        if(top==null){ //if stack is empty return nothing
            return;
        }
        while(curr!=null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
    public static  void main(String[]args){
        stackedNodes myStack = new stackedNodes();
        myStack.push(5);
        myStack.push(15);
        myStack.push(50);
        myStack.push(56);
        myStack.push(50);
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack.length());
        myStack.display();



    }


}
