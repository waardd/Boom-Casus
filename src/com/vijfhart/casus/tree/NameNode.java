package com.vijfhart.casus.tree;

public class NameNode implements Node {

    private String naam;
    private String persnr;
    private String functie;
    private String mgr;
    private String sal;
    private String toeslag;
    private String kantnr;

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

    public String toString(Object node){
        return naam+" met functie"+functie;
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

    public String getNaam() {
        return naam;
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
