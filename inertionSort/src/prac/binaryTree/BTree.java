package prac.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BTree {
    static Node root;

    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    public void createTree(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth =  new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);


        root=first;
        first.left = second;
        first.right = third;
        second.left=fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;

    }

    //recursive inorder traversal of the tree
    public void inorderTraversal(Node root){
        if(root==null){
            return;
        }
        inorderTraversal(root.left); //traverse the left subtree
        System.out.print(root.data+" "); //visit the node
        inorderTraversal(root.right);//traverse the right subtree
    }
    //  iterative inorder traversal of binary tree

    public void inorderIterative(Node root){
        //base case
        if(root==null){
            return;
        }
        Stack <Node> stack = new Stack<>();
        Node current=root;
        //iterate the tree untill the scak is empty and current node if null
        while(!stack.isEmpty()||current!=null){
            if(current!=null){
                stack.push(current);
                current= current.left;
            }else{
                current=stack.pop();
                System.out.print(current.data+" ");
                current= current.right;
            }
        }
    }
    //traverse a tree using level order
    public void levelOrder(){
        if(root==null){
            return;
        }
        Queue<Node> myQueue =new LinkedList<>() ;
        myQueue.offer(root);
        while(!myQueue.isEmpty()){
            Node temp = myQueue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                myQueue.offer(temp.left);
            }
            if(temp.right!=null){
                myQueue.offer(temp.right);
            }
        }

    }
    //find max number in a binary tree
    public int findMax(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int results =root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        //compare the three
        if(left >  results){
            results =left;
        }
        if(right > results){
            results=right;
        }
        return results;
    }
    public static void main(String[]args){
        BTree tree = new BTree();
        tree.createTree();
        tree.inorderTraversal(root);
        System.out.println();
        System.out.println("iterative Inorder traversal:"  );
        tree.inorderIterative(root);
        System.out.println();
        System.out.println("level order traversal:");
        tree.levelOrder();
        System.out.println();
        System.out.println("max number int the tree:" );
        tree.findMax(root);
        System.out.println(tree.findMax(root));

    }
}
