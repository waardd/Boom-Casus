package com.vijfhart.casus.tree;

public interface Node<E extends Node<E>> {

    int getParent();
    int setParent();
}
