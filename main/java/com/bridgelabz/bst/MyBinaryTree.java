package com.bridgelabz.bst;

public class MyBinaryTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public MyBinaryTree() {
        this.root = null;
    }

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null) {
            return new MyBinaryNode<>(key);
        }
        int compareResult = key.compareTo(current.getKey());
        if (compareResult < 0) {
            current.setLeft(addRecursively(current.getLeft(), key));
        } else if (compareResult > 0) {
            current.setRight(addRecursively(current.getRight(), key));
        }
        return current;
    }

    public MyBinaryNode<K> getRoot() {
        return this.root;
    }

    // UC2: Public method to get total node count in the tree
    public int getSize() {
        return this.getSizeRecursively(root);
    }

    // Helper method to recursively count nodes down both branches
    private int getSizeRecursively(MyBinaryNode<K> current) {
        if (current == null) {
            return 0;
        }
        return 1 + this.getSizeRecursively(current.getLeft()) + this.getSizeRecursively(current.getRight());
    }

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