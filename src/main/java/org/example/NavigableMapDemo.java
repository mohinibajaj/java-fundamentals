package org.example;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(100, "Mohini" ) ;
        map.put(99, "Rashmi") ;
        map.put(98, "Poonam") ;
        map.put(97, "SRK") ;

        //Gives you all the keys in sorted order.
        System.out.println(map.navigableKeySet());

        //Ceiling means “give me 99 or the next bigger one.
        System.out.println(map.ceilingEntry(99));

        //next key Lower than 98? That’s 97.
        //“just below, but not equal.
        System.out.println(map.lowerKey(98));

        //next Higher than 98? That’s 99
        System.out.println(map.higherKey(98));

        //You asked for ceiling of 0. Since 0 doesn’t exist, TreeMap gives you the smallest key greater than 0, which is 97.
//smallest key that is GREATER THAN OR EQUAL to x
        System.out.println(map.ceilingKey(98));
    }
}
