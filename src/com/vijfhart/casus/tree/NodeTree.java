package com.vijfhart.casus.tree;

import java.util.ArrayList;

public class NodeTree<E extends Node<E>> implements Tree<E> {

    private ArrayList nodeList;

    public void add(E node){

    }

    public TreeIterator<E> iterator() {
        return new TreeIterator<E>(){
            // implementeer hierin de methoden van TreeIterator
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }

            @Override
            public int level() {
                return 0;
            }

            @Override
            public void startWith(E node) {

            }

            @Override
            public boolean isLeaf() {
                return false;
            }

        };
    }
}
