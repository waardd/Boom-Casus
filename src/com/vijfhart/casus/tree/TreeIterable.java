package com.vijfhart.casus.tree;

import java.util.Iterator;

public interface TreeIterable<E extends Node<E> & Iterator<E>> extends Iterable<E> {
   E iterator();
}