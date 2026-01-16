package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        // hashmap will print data according to the hashcode generated not the order it was inserted
//       HashMap<String, Integer> map = new HashMap<>();

        //it preserves the insertion order
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(11, 0.7f, true);


        //if we make access order as true,
        // then values which are recently used, are going to the next of the linkedlist

        map.put("Apple", 1);
        map.put("Banana", 1);
        map.put("Mango", 1);
        map.put("Guava", 1);
        map.put("Pineapple", 1);

        map.get("Apple");
        System.out.println(map);




      Set<Map.Entry<String, Integer>> entries =  map.entrySet();

      for( Map.Entry<String, Integer> entry : entries){
          System.out.println(entry);
          System.out.println(entry.getKey() + " : " + entry.getValue());
      }

//
    }
}
