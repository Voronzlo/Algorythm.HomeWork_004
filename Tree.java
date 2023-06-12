package Algorythm.HomeWork_004;

import java.util.Objects;

public class Tree<T extends Comparable<T>> {

    private Node root;

    private class Node {
        private T value;
        private Node left;
        private Node right;

        public Node(T value) {
            this.value = value;
        }

    }

    public void add(T value) {
        Objects.requireNonNull(value);
        root = appendNode(root, value);
    }

    private Node appendNode(Node current, T value) {
        if (current == null) {
            return new Node(value);
        }

        int compare = value.compareTo(current.value);
        if (compare < 0) {
            current.left = appendNode(current.left, value);
        } else if (compare > 0) {
            current.right = appendNode(current.right, value);
        }

        return current;
    }

    public boolean contains(Node current, T value) {
        if (current == null) {
            return false;
        }
        if (current.value.compareTo(value) == 0) {
            return true;
        } else if (current.value.compareTo(value) > 0) {
            return contains(current.left, value);
        } else {
            return contains(current.right, value);
        }

    }

    public boolean contains(T value) {
        // FIXME: 12.06.2023
        return contains(root, value);
    }
}