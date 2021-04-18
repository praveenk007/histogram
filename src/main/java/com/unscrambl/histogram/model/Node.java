package com.unscrambl.histogram.model;

import lombok.Data;

/**
 * @author kamathp
 * @version 0.0.1
 */
@Data
public class Node<T extends Comparable<T>> {

    public Node(T value) {
        this.value = value;
    }

    private T value;

    private Node<T> left;

    private Node<T> right;
}
