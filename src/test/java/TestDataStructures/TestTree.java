package TestDataStructures;


import org.gowtham.DataStructures.NonLinearDataStructures.Tree.BinarySearchTree;
import org.gowtham.DataStructures.NonLinearDataStructures.Tree.BinaryTree;
import org.testng.annotations.Test;

import static org.gowtham.DataStructures.NonLinearDataStructures.Tree.BinarySearchTree.inorder;


public class TestTree {

    @Test
    public void testOrdersInBinaryTree(){
        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree.insertLeft(binaryTree.root, 5);
        binaryTree.insertRight(binaryTree.root, 15);
        binaryTree.insertLeft(binaryTree.root.left, 3);
        binaryTree.insertRight(binaryTree.root.left, 8);
        binaryTree.insertLeft(binaryTree.root.right, 12);

        BinaryTree.preorder(binaryTree.root);
        System.out.println();
        BinaryTree.inorder(binaryTree.root);
        System.out.println();
        BinaryTree.postorder(binaryTree.root);
    }

    @Test
    public void testOrdersInBinarySearchTree(){
        BinarySearchTree tree = new BinarySearchTree(50);
        tree.insert(20);
        tree.insert(70);
        tree.insert(10);
        tree.insert(25);
        tree.insert(60);
        tree.insert(80);
        inorder(tree.getRoot());

        System.out.println(tree.search(60));
        System.out.println(tree.search(69));
        System.out.println(tree.search(10));
        tree.delete(60);
        inorder(tree.getRoot());
    }
}
