package prac.binaryTree;

import java.util.Stack;

public class BinaryTree {
    //node
    private static TreeNode root;
    private class TreeNode{
        int data; //generic data type;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root =first;
        first.left =second;
        first.right= third;
        second.left=fourth;
        second.right=fifth;
        fourth.left=sixth;
        sixth.right = seventh;

    }
    public static void preOrder(TreeNode root){
        if(root==null){ //base case
            return;
        }
        System.out.print(root.data+",");
        preOrder(root.left);
        preOrder(root.right);
    }
    //traverse uisng iteration
    public static void preOrderIterative(){
        if(root==null){
            return;
        }
        //create  stack
        Stack<TreeNode> myStack  = new Stack<>();
        myStack.push(root);
        while(!myStack.isEmpty()){
            TreeNode temp = myStack.pop();
            System.out.print(temp.data+",");
            //push the right child in the stack
            //the push the left
            if(temp.right!=null){
                myStack.push(temp.right);
            }
            if(temp.left!=null){
                myStack.push(temp.left);
            }
        }

    }

    public static void main(String[]args){
        BinaryTree myTree = new BinaryTree();
        myTree.createBinaryTree();
        myTree.preOrder(myTree.root);
        System.out.println();
        myTree.preOrderIterative();
    }
}
