package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Mohini");
        map.put(2, "Poonam");
        map.put(3, "Rashmi");

        String s = map.get(1);
//        String s = map.get(9); // this will give null as there is no key as 9

        System.out.println(s);
        System.out.println(map);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey("srk"));

       Set<Integer> keys =  map.keySet();

       for(int key : keys){
           System.out.println(key);
           System.out.println(map.get(key));
       }


        String result = map.getOrDefault(1, "0");
        System.out.println( "Value for Mohini key present or not : " + result);
        String result2 = map.getOrDefault("SRK", "0");
        System.out.println("Value for key present or not : " + result2);


        //this will put entry only when key is not present otherwise it will ignore.
        map.putIfAbsent(4, "Alice");

       // to avoid double lookup in above foreach eway, we use entry set
        //entry set returns a set of map entries.
       Set<Map.Entry<Integer, String>>  entries =  map.entrySet();

       for( Map.Entry<Integer, String>  entry : entries)
       {
           System.out.println(entry);
       }
    }
}
