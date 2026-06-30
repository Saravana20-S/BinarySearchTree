package com.bridgelabz.bst;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeUC3Test {

    @Test
    public void given13Numbers_WhenSearchedFor63_ShouldReturnTrue() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();

        // Add all 13 elements from the UC2 diagram
        myBinaryTree.add(56);
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

        // UC3: Search for element 63
        boolean is63Present = myBinaryTree.search(63);
        System.out.println("Searching for 63 in BST... Found: " + is63Present);
        Assert.assertTrue(is63Present);

        // Optional check for an element that does NOT exist
        boolean is100Present = myBinaryTree.search(100);
        System.out.println("Searching for 100 in BST... Found: " + is100Present);
        Assert.assertFalse(is100Present); // Asserting false
    }
}