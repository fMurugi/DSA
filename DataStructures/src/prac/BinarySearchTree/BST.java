package prac.BinarySearchTree;

public class BST {
      TreeNode root=null;

   static class TreeNode{
        int data;
        TreeNode right;
        TreeNode left;
        public TreeNode(int data){
            this.data=data;
        }
    }

    public TreeNode insert(TreeNode root,int value){
        if(root==null){
            root = new TreeNode(value);
            return root;
        }
        if(value<root.data){
            root=insert(root.left,value);
        } else{
            root=insert(root.right,value);
        }
        return root;
    }
    public void insert(int value){
        insert(root, value);
    }
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public void inOrder(){
        inOrder(root);
    }

    public TreeNode search(int key){
       return search(root,key);
    }
    public TreeNode search(TreeNode root,int key){
       if(root==null ||root.data==key){
           return root;
       }
       if(key<root.data){
           return search(root.left,key);
       }else{
           return search(root.right,key);
       }
    }
    public static void main(String[]args){
        BST bsTree = new BST();
        bsTree.insert(5);
        bsTree.insert(3);
        bsTree.insert(7);
        bsTree.insert(1);

        bsTree.inOrder();

        System.out.println();

        if(bsTree.search(3)!=null){
        System.out.println("found the kay!!!!!");
        }else{
            System.out.println("key not found");}
}   }

