package com.vijfhart.casus.tree;

public interface Tree<E extends Node<E>> extends Iterable<E> {
    void add(E node);
}
