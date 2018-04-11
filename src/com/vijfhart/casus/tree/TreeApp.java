/*
voorbeeld data
"3381","SMITS","KLERK","7902","2400","","20"
"3462","ALKEMA","VERKOPER","4621","2600","300","30"
"3518","WALSTRA","VERKOPER","4621","2250","500","30"
"3930","PIETERS","MANAGER","6221","3975","","20"
"4510","VERGEER","VERKOPER","4621","2250","1400","30"
"4621","KLAASEN","MANAGER","6221","3850","","30"
"5810","HEUVEL","MANAGER","6221","3450","","10"
"5931","SANDERS","ANALIST","3930","4000","","20"
"6221","KRAAY","DIRECTEUR","",6000","","10"
"6500","DROST","VERKOPER","4621","2500","0","30"
"6681","ADELAAR","KLERK","5931","2100","","20"
"7900","APPEL","KLERK","4621","1950","","30"
"7902","VERMEULEN","ANALIST","3930","3900","","20"
"8222","MANDERS","KLERK","5810","2300","","10"
 */
package com.vijfhart.casus.tree;

import java.util.*;

public class TreeApp {
    public static void main(String args[]) {

        List<String> lijst = new ArrayList<>();
        Collections.addAll(lijst,"8222","MANDERS","KLERK","5810","2300","","10");
        Collections.addAll(lijst,"3381","SMITS","KLERK","7902","2400","","20");
        Collections.addAll(lijst,"3462","ALKEMA","VERKOPER","4621","2600","300","30");
        Collections.addAll(lijst,"3518","WALSTRA","VERKOPER","4621","2250","500","30");
        Collections.addAll(lijst,"3930","PIETERS","MANAGER","6221","3975","","20");
        Collections.addAll(lijst,"4510","VERGEER","VERKOPER","4621","2250","1400","30");
        Collections.addAll(lijst,"4621","KLAASEN","MANAGER","6221","3850","","30");
        Collections.addAll(lijst,"5810","HEUVEL","MANAGER","6221","3450","","10");
        Collections.addAll(lijst,"5931","SANDERS","ANALIST","3930","4000","","20");
        Collections.addAll(lijst,"6221","KRAAY","DIRECTEUR","","6000","","10");
        Collections.addAll(lijst,"6500","DROST","VERKOPER","4621","2500","0","30");
        Collections.addAll(lijst,"6681","ADELAAR","KLERK","5931","2100","","20");
        Collections.addAll(lijst,"7900","APPEL","KLERK","4621","1950","","30");
        Collections.addAll(lijst,"7902","VERMEULEN","ANALIST","3930","3900","","20");

        System.out.println(lijst);
//        MyComparator mc = new MyComparator();
//        Collections.sort(lijst, mc);
//        System.out.println(lijst);
    }

//    static class MyComparator implements LevelComparable<String> {
//        @Override
//        public int compareLevelTo(String node) {
//            if (this.node.length() < node.length()) {
//                return -1;
//            }
//
//            if (this.node.length() > node.length()) {
//                return 1;
//            }
//            return this.node.compareTo(node);
//        }
//
//    }
}
