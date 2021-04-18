package com.unscrambl.histogram.util;

import com.unscrambl.histogram.model.Node;

/**
 * @author kamathp
 * @version 0.0.1
 */
public class BST<T extends Comparable<T>> {

    private Node<T> root;

    public void add(T value) {
        root = insert(root, value);
    }

    private Node<T> insert(Node<T> root, T value) {
        if(null == root) {
            return new Node<>(value);
        }
        if(value.compareTo(root.getValue()) < 0) {
            root.setLeft(insert(root.getLeft(), value));
        } else {
            root.setRight(insert(root.getRight(), value));
        }
        return root;
    }
}
