package com.vijfhart.casus.tree;

public interface Tree<E extends TreeIterable<E>> {
    E add(E node);
}
