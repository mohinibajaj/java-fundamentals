package org.example;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {

        Hashtable<Integer, String> map = new Hashtable<>();
        //It is synchronised
        //no null key and value
        //slower than hashmap as it used multithreading

        map.put(1, "Mohini");
        map.put(2, "Poonam");
        map.put(3, "Rashmi");

//        map.put(null, "Rashmi");  // will throw exception , no null key is allowed
//        map.put(3, null); // will throw exception , no null value is allowed
        System.out.println(map);

        map.remove(1);
        System.out.println(map);

    }
}
