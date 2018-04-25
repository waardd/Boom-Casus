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

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;

public class TreeApp {
    public static void main(String args[]) {

        NameNode h = new NameNode("Marko",null,100000);
        NameNode a = new NameNode("Danny",h,50000);
        NameNode b = new NameNode("Mark",h,50000);
        NameNode c = new NameNode("Gerrit",b,20000);
        NameNode d = new NameNode("Maarten",a,20000);
        NameNode e = new NameNode("Wendy",d,20000);
        NameNode f = new NameNode("Hans",d,2000);
        NameNode g = new NameNode("Joel",a,2000);
        NameNode i = new NameNode("Wiebe",f,1500);
        //Review Marl
        //kleine test met slaris. Zie gebruik verderop (laatste lijstje)
        NameNode j = new NameNode("Martijn",e,1000);


        //final NodeTree<NameNode> tree = new NodeTree<>();
        final Tree<NameNode> tree = new NodeTree<>();

        tree.add(a);
        tree.add(b);
        tree.add(c);
        tree.add(d);
        tree.add(e);
        tree.add(f);
        tree.add(g);
        tree.add(h);
        tree.add(i);
        tree.add(j);

        TreeIterator<NameNode> iter = tree.iterator();
        while (iter.hasNext()){
            NameNode node = iter.next();
            if(node.getParent()==null){
                System.out.println(node + " is de baas met level " + iter.level()
                        +"(testfase childs "+node.getChildCount()+")");
            } else
            System.out.println(node + " Heeft als baas " + node.getParent()+ " met level " + iter.level()
                    +"(testfase childs "+node.getChildCount()+")");
        }

//        // Show tree from x
//        System.out.println("-------------------------------------------\n" +
//                "Vanaf Maarten\n" +
//                "-------------------------------------------");
//        iter = tree.iterator();
//        iter.startWith(d);
//        while (iter.hasNext()){
//           NameNode node = iter.next();
//            System.out.println(node + " Met salaris "+node.getSal()+" Heeft als baas " + node.getParent()+ " met level " + iter.level());
//        }



    }
}
