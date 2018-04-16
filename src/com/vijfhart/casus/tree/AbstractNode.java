package com.vijfhart.casus.tree;

abstract class AbstractNode implements Node<NameNode> {
    public abstract NameNode getParent();
    public abstract NameNode setParent();
    public abstract NameNode compareTo();
    public abstract NameNode compareLevelTo();
}
