package org.example;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(40);
        set.add(16);
        set.add(100);
        set.add(11);
        set.add(1);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(40);
        set2.add(16);
        set2.add(100);
        set2.add(11);
        set2.add(1);

        NavigableSet<Integer> set3 = new TreeSet<>();
        set3.add(11);
        set3.add(1);
        System.out.println(set3.ceiling(16));
        System.out.println(set3.ceiling(11));

        System.out.println(set);
        System.out.println(set2);
        System.out.println(set3);

        System.out.println( set.contains(2));

        set.clear();

        System.out.println("is set empty:" + set.isEmpty());
        System.out.println(set);

        //unmodifiable set

        Set<Integer> immutableSet = Set.of(1,3,5,6,9,10,66,77,22,110,32,45,67);

        // Of method has no limitation as map has limit of 10
        System.out.println(immutableSet);
        immutableSet.add(1000); //throws exception , UnsupportedOperationException

        //// we can make this set as immutable using Collections.unmodifiableSET method
        //  but we created a view of the original set
        //   it is risky, it creates two copies.
       Set<Integer> immutableSet2 = Collections.unmodifiableSet(set);


        //for thread safety
        Set<Integer> set4 = new ConcurrentSkipListSet<>();

    }
}
