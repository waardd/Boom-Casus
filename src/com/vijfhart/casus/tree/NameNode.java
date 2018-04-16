package com.vijfhart.casus.tree;

public class NameNode extends AbstractNode implements Node<NameNode> {

    private String naam;
    private String persnr;
    private String functie;
    private String mgr;
    private int sal;
    private String toeslag;
    private String kantnr;
    private NameNode parent;

    public NameNode(String naam, NameNode parent){
        //setParent(parent);
        this.parent=parent;
        this.naam=naam;
    }

    public NameNode(String naam, NameNode parent, int sal){
        //setParent(parent);
        this.parent=parent;
        this.naam=naam;
        this.sal=sal;
    }

    public NameNode(String naam){
        this.naam=naam;
    }

    public NameNode getParent() {
        return parent;
    }

    @Override
    // het op en aftellen van Childs werkt nog niet.
    public NameNode setParent() {
        // this node hoogt childCount op met 1
        this.parent.childCount=childCount++;
        // previous node verlaagd childCount met 1
        this.getParent().childCount=childCount--;
        return null;
    }

    // misschien te vroeg...
    // review mark
    public int getChildCount(){
        return childCount;
    }

    @Override
    public NameNode compareTo() {
        return null;
    }

    @Override
    public NameNode compareLevelTo() {
        return null;
    }

    // te verbeteren DDW
    // Is dit goed??
    public String getNaam() {
        return naam;
    }

    public void setParent(NameNode parent){
        this.parent=parent;
    }

    public int compareLevelTo(NameNode other){
        if(this.parent == null) return -1;
        if(this.parent == other.parent) return 0;
        if(other.parent == null) return 1;
        return this.parent.compareLevelTo(other.parent);
    }

    public int compareTo(NameNode other){
        return this.compareLevelTo(other);
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    public String toString(){
        return naam;
    }

    // voor aanmaak nieuwe medewerker
    public void medewerker(String persnr,String naam,String functie,String mgr,int sal,String toeslag,String kantnr){
        this.persnr=persnr;
        this.naam=naam;
        this.functie=functie;
        this.mgr=mgr;
        this.sal=sal;
        this.toeslag=toeslag;
        this.kantnr=kantnr;
    }

    // overload
    public void setMedewerkerSalaris(int sal, String toeslag) {
        this.sal = sal;
        this.toeslag=toeslag;
    }

    public void setMedewerkerSalaris(int sal) {
        this.sal = sal;
    }

    public void setFunctie(String functie) {
        this.naam = functie;
    }

    public void setManager(String mgr) {
        this.mgr = mgr;
    }

    public boolean equals(){
        return false;
    }

    public String getPersnr() {
        return persnr;
    }

    public String getFunctie() {
        return functie;
    }

    public String getMgr() {
        return mgr;
    }

    public int getSal() {
        return sal;
    }

    public String getToeslag() {
        return toeslag;
    }

    public String getKantnr() {
        return kantnr;
    }


}
