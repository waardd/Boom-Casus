package com.vijfhart.casus.tree;

abstract class AbstractNode<E extends AbstractNode<E>> implements Node<E> {

    public int childCount;

    public abstract E getParent();
    public abstract E setParent();
    public abstract E compareTo();
    public abstract E compareLevelTo();
    public abstract boolean isLeaf();

    private boolean isDescendant(NameNode Node){
        return false;
    }

    private boolean isChild(E t){
        E Node = t;
        if(Node == this) return true;
        if(Node == null) return false;
        return isChild(Node.getParent());
    }
}
