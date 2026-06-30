package com.bridgelabz.bst;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeUC1Test {

    @Test
    public void given3Numbers_WhenAddedToBST_ShouldCreateCorrectTreeStructure() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();

        // Add keys in requested sequence
        myBinaryTree.add(56); // Root
        myBinaryTree.add(30); // Left Child
        myBinaryTree.add(70); // Right Child

        // Visually print tree elements (Should print sorted: 30 56 70)
        myBinaryTree.printTree();

        // Assert structural boundaries of the BST
        MyBinaryNode<Integer> rootNode = myBinaryTree.getRoot();
        Assert.assertNotNull(rootNode);
        Assert.assertEquals(Integer.valueOf(56), rootNode.getKey());

        Assert.assertNotNull(rootNode.getLeft());
        Assert.assertEquals(Integer.valueOf(30), rootNode.getLeft().getKey());

        Assert.assertNotNull(rootNode.getRight());
        Assert.assertEquals(Integer.valueOf(70), rootNode.getRight().getKey());
    }
}