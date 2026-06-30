package com.bridgelabz.bst;

public class MyBinaryTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public MyBinaryTree() {
        this.root = null;
    }

    // UC1: Primary add method exposed to the user
    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    // Helper method to recursively find the right slot and link nodes
    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null) {
            return new MyBinaryNode<>(key);
        }

        int compareResult = key.compareTo(current.getKey());

        if (compareResult < 0) {
            // Key is smaller than current node -> go left
            current.setLeft(addRecursively(current.getLeft(), key));
        } else if (compareResult > 0) {
            // Key is larger than current node -> go right
            current.setRight(addRecursively(current.getRight(), key));
        }

        return current;
    }

    public MyBinaryNode<K> getRoot() {
        return this.root;
    }

    // Helper to print the tree structure in In-Order traversal (Left, Root, Right)
    public void printTree() {
        System.out.print("In-Order Traversal: ");
        printRecursively(root);
        System.out.println();
    }

    private void printRecursively(MyBinaryNode<K> current) {
        if (current != null) {
            printRecursively(current.getLeft());
            System.out.print(current.getKey() + " ");
            printRecursively(current.getRight());
        }
    }
}