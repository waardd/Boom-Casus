package com.vijfhart.casus.tree;

import java.util.Iterator;

public interface TreeIterable<E extends Node<E>> extends Iterable<E> {
   TreeIterator<E> iterator();
}