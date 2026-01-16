package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutuableMapDemo {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mohini");
        map.put(2, "Poonam");
        map.put(3, "Rashmi");

        System.out.println(map);

        // we can make this map as immutable but we created a view of the original map
        // it is risky, it creates two copies.

//       Map<Integer, String> immutuableMap = Collections.unmodifiableMap(map);
//        immutuableMap.put(4, "SRK");
//

        // this will give exception .UnsupportedOperationException


      Map<Integer, String> immutuableMap = Map.of(1, "Shubham" , 2, "Mohini" );
        immutuableMap.put(3, "Rashmi");   //immutuable map, will return exception

        //limitaton of OF method is only accept 10 key value pairs


        Map<Integer, String> immutuableMap3 = Map.ofEntries(Map.entry(1, "Shubham" ), Map.entry(2, "Mohini" ) );
        immutuableMap3.put(3, "Rashmi");   //immutuable map, will return exception

        // OfEntries has no limitation
    }
}
