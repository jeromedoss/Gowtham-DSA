package org.gowtham.DataStructures.NonLinearDataStructures.Tree;

public class BinaryTree {

    /**
     * preorder - root left right
     * inorder - left root right
     * post order - left right root
     **/

    public Node root;
    public BinaryTree(int rootData){
        root = new Node(rootData);
    }

    public static void preorder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void insertLeft(Node rootNode, int data){
        Node newNode = new Node(data);
        rootNode.left = newNode;
    }

    public void insertRight(Node rootNode, int data){
        Node newNode = new Node(data);
        rootNode.right = newNode;
    }
    public class Node{
        int data;
        public Node left, right;
        public Node(int val){
            data = val;
            left = null;
            right = null;
        }
    }

}
