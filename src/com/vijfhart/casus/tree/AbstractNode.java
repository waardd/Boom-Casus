package com.vijfhart.casus.tree;

abstract class AbstractNode implements Node<NameNode> {

    public int childCount;

    public abstract NameNode getParent();
    public abstract NameNode setParent();
    public abstract NameNode compareTo();
    public abstract NameNode compareLevelTo();
    public abstract boolean isLeaf();

    private boolean isDescendant(NameNode Node){
        return false;
    }

//    private boolean isChild(E t){
//        E Node = t;
//        if(Node == this) return true;
//        if(Node == null) return false;
//        return isChild(Node.getParent());
//    }
}
