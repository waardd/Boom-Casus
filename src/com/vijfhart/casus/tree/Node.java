package com.vijfhart.casus.tree;

public interface Node<E extends Node<E>> extends Comparable<E>, LevelComparable<E> {

    E getParent();
    void setParent(E parent);
    boolean isLeaf();

    
}
