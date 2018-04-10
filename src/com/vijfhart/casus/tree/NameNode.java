package com.vijfhart.casus.tree;

public class NameNode implements Node{

    private String naam;

    @Override
    public Node getParent() {
        return null;
    }

    @Override
    public void setParent(Node parent) {

    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public int compareLevelTo(Object node) {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

}
