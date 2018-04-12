package com.vijfhart.casus.tree;

public class NameNode implements Node<NameNode> {

    private String naam;
    private String persnr;
    private String functie;
    private String mgr;
    private String sal;
    private String toeslag;
    private String kantnr;
    private NameNode parent;

    public NameNode(String naam, NameNode parent){
        //setParent(parent);
        this.parent=parent;
        this.naam=naam;
    }

    public NameNode(String naam){
        this.naam=naam;
    }

    public NameNode getParent() {
        return parent;
    }

    // te verbeteren DDW
//    public NameNode getNaam() {
//        return naam;
//    }

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
    public void medewerker(String persnr,String naam,String functie,String mgr,String sal,String toeslag,String kantnr){
        this.persnr=persnr;
        this.naam=naam;
        this.functie=functie;
        this.mgr=mgr;
        this.sal=sal;
        this.toeslag=toeslag;
        this.kantnr=kantnr;
    }

    // overload
    public void setMedewerkerSalaris(String sal, String toeslag) {
        this.sal = sal;
        this.toeslag=toeslag;
    }

    public void setMedewerkerSalaris(String sal) {
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

    public String getSal() {
        return sal;
    }

    public String getToeslag() {
        return toeslag;
    }

    public String getKantnr() {
        return kantnr;
    }


}
