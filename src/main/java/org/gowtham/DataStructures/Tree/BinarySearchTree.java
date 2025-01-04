package org.example;

import java.util.Arrays;

public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public BinarySearchTree(int rootData) {
        this.root = new Node(rootData);
    }

    public void insert(int val) {
        insert(val, root);
    }

    private Node insert(int val, Node node) {
        if (node == null) {
            return new Node(val);
        }
        if (val < node.data) {
            node.left = insert(val, node.left);
        } else {
            node.right = insert(val, node.right);
        }
        return node;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public boolean search(int val) {
        return search(root, val) != null;
    }

    private Node search(Node node, int val) {
        if (node == null || node.data == val) {
            return node;
        }
        if (val > node.data) {
            return search(node.right, val);
        } else {
            return search(node.left, val);
        }
    }

    public void delete(int val){
        delete(root, val);
    }
    private Node delete(Node node, int val){
        if(node == null){
            return node;
        }
        if(val > node.data){
            node.right = delete(node.right, val);
        } else if (val < node.data) {
            node.left = delete(node.left, val);
        }else {
            if(node.left == null){
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            node.data = min(node.right);
            node.right = delete(node.right, node.data);
        }
        return node;
        //if there are two children - inorder successor should replace the deleted node

    }

    private int min(Node node) {
        int minVal = node.data;
        while (node.left != null){
            minVal = node.left.data;
            node = node.left;
        }
        return minVal;
    }

    class Node {
        int data;
        Node left, right;

        public Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }
}
