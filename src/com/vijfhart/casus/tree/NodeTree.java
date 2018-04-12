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

            /*
            bepaal het level van de medewerker.
            bepalen wat het level is: hoever is deze node van de root verwijderd?
            Om in de level method en in andere methods van de iterator te kunnen verwijzen naar de huidige
            node, bewaren we deze huidige node als instance variable van de TreeIterator.
            Bewaar in de TreeIterator na elke aanroep van next() de opgehaalde node in een instantie
            variabele met de naam current.
            De methode level geeft 0 als de variabele current geen parent heeft. Als current wel een parent
            heeft, tel dan het aantal keer dat van die parent weer de parent opgehaald kan worden.
            Toon ter controle in TreeApp alle nodes met hun level.
             */
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
                //haal de volgende node op
                return iterator.hasNext();
            }

            @Override
            public void remove(){
            }

            @Override
            public E next() {
                //vullen met de node;
                current = iterator.next();
                // geef volgende node
                return current;
            }

            /*
            Als startWith(E node) wordt gebruikt, kunnen we maar een deel van de verzameling doorlopen:
            alleen het deel dat uiteindelijk onder de opgegeven node valt. Maak daarvoor binnen
            startWith() een nieuwe List aan, en stop daarin alleen de nodes die meedoen (zie ook volgende
            tip). Vervang daarna het attribuut iterator door de Iterator van de gevulde List. Bewaar ook de
            opgegeven start node als instantie variabele.
            */
            @Override
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
