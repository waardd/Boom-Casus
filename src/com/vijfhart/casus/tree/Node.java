package com.vijfhart.casus.tree;

public interface Node<E extends Node<E>> extends Comparable {

    int getParent();
    int setParent();
    boolean isLeaf();
}
