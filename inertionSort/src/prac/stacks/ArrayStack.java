package prac.stacks;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class ArrayStack {
    int top  =-1;
    int capacity =90;

    int [] A= new int [20];

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        A = new int[capacity];
    }
    public ArrayStack(){

    }

    public int size(){
        return top+1;
    }
    public boolean isEmpty(){
        return top<0;
    }

    public void push(int val) {
        if (size()==capacity) {
           System.out.println("Stack is full");

        }
//        top++;
        A[++top] = val;
//        A[++top] = val;
    }
    public  int peek(){
        if(isEmpty() ){
            throw new EmptyStackException();
        }
        return A[top];
    }
    public void display(){
        if(isEmpty()){
            return ;
        }
        int current = top;
        while(current>=0){
            System.out.print(A[current]+" ");
            current--;
        }

    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int results = A[top];
        top--;
        return results;
    }
    public static void reverseStackArray(int[]A){
        //cretae a new stack
         ArrayStack S = new ArrayStack(A.length);
         for(int i =0;i<A.length;i++){
             S.push(A[i]);
         }
         for(int i =0;i< A.length;i++){
             A[i] = S.pop();
         }
    }

    public static  void main(String[]args){
        ArrayStack B = new ArrayStack();
        B.push(10);
        B.push(12);
        B.push(92);
        B.push(152);
        System.out.println(B.peek());
       B.display(); //just call the method to print the elements
        System.out.println(B.pop());
        System.out.println("After pop:");
        B.display();
        System.out.println();
        System.out.println(B.size());

        int[]A = {4,6,7,5,3,1};
        System.out.println("Array:"+ Arrays.toString(A));
        reverseStackArray(A);
        System.out.println("Array after reverse:"+ Arrays.toString(A));



    }

}
