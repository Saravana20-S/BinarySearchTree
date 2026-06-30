package com.bridgelabz.bst;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeUC2Test {

    @Test
    public void given13Numbers_WhenAddedToBST_ShouldReturnSize13() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();

        // Adding all 13 elements from the diagram sequence
        myBinaryTree.add(56); // Root
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(11);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);

        // Print tree to visually confirm sorted execution
        myQueueStructureVerify(myBinaryTree);

        // UC2: Check if all 13 elements are successfully added using size()
        int treeSize = myBinaryTree.getSize();
        System.out.println("Total nodes in Binary Search Tree: " + treeSize);

        Assert.assertEquals(13, treeSize);
    }

    private void myQueueStructureVerify(MyBinaryTree<Integer> myBinaryTree) {
        myBinaryTree.printTree();
    }
}