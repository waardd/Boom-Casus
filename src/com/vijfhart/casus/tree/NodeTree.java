package com.vijfhart.casus.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NodeTree<E extends Node<E>> implements Tree<E> {

    private List<E> nodeList = new ArrayList<>();

    public void add(E node){
        nodeList.add(node);
    }

    public TreeIterator<E> iterator() {
        return new TreeIterator<E>(){
            // sorteermethode
            // static initializer block
            Iterator<E> iterator;
            E current;
            E volgendeNode;
            E startNode;
            {Collections.sort(nodeList);
                iterator = nodeList.iterator();
            }

            // implementeer hierin de methoden van TreeIterator

            // bepaal het level van de medewerker.
            public int level(){
                int level=0;
                E follow=current;
                while(follow.getParent() != null){
                    level += 1;
                    follow=follow.getParent();
                }
                return level;
            }

            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public void remove(){
            }

            @Override
            public E next() {
                current = iterator.next(); //vullen met de node;
                // geef volgende node
                return current;
            }

            @Override
            /*
            Als startWith(E node) wordt gebruikt, kunnen we maar een deel van de verzameling doorlopen:
            alleen het deel dat uiteindelijk onder de opgegeven node valt. Maak daarvoor binnen
            startWith() een nieuwe List aan, en stop daarin alleen de nodes die meedoen (zie ook volgende
            tip). Vervang daarna het attribuut iterator door de Iterator van de gevulde List. Bewaar ook de
            opgegeven start node als instantie variabele.
            */
            public void startWith(E node) {
                startNode = node;
                List<E> partialNodeList = new ArrayList<>();
                //zoek de nodes
                for(E volgendeNode:nodeList){
                 if(descendantOfStartWith(volgendeNode)) {
                     partialNodeList.add(volgendeNode);
                 }
                }
                iterator =  partialNodeList.iterator();
                //boolean descendant = descendantOfStartWith(E node);
            }

            /*
            descendantOfStartWith(E node)
            Deze geeft true als de opgegeven node onder de opgegeven start-node valt,
            en anders false.
            */
            private boolean descendantOfStartWith(E node){
                if (node==startNode) return true;
                if (node==null) return false;
                return descendantOfStartWith(node.getParent());
            }

            @Override
            public boolean isLeaf() {
                if (iterator.next() != null);
                //return true;
                return false;
            }
        };
    }
}
