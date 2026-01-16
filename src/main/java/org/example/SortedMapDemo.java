package org.example;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[] args) {

        // to print result in reverse alpahbetical order, used below lambda expression
        SortedMap<String, Integer> map = new TreeMap<>((a,b) -> b.compareTo(a) );
        map.put("Mohini" , 100) ;
        map.put("Rashmi" , 99) ;
        map.put("Poonam" , 98) ;
        map.put("SRK" , 90) ;

        //it will not allow null key because it has to compare and sort.
        // it will null pointer exception

//        map.put(null , 90) ;

        System.out.println(map.containsKey("Rashmi"));

        System.out.println(map.containsKey("Aish"));

        System.out.println(map.firstKey());
        System.out.println( map.lastKey());

//“Give me all entries strictly before 'Mohini'.”
//But Mohini is already the first key. There is literally nothing before it.
        //hence it will give empty array
        System.out.println(map.headMap("Mohini")); //before mohini(key) and exclude mohini

        System.out.println(map.tailMap("Mohini")); // from mohini key and includes mohini


        System.out.println(map);
        {


        };
    }
}
