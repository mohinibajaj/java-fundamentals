package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

       ArrayList<Integer> list = new ArrayList<>();

       list.add(40);
       list.add(20);
        list.add(50);
        list.add(10);


        // to add value in between index
        list.add(3,70);

//        System.out.println(list.get(2));
        // to print all the values using foreach
        for(int value : list){
            System.out.println(value);
        }

        // to replace element
        list.set(3,90);


       //IndexOutOfBoundsException
//        System.out.println(list.get(3));

        // to remove the value based on INDEX
        list.remove(4);

        // to remove the value directly, because it needs a class, so we do wrapper class of the instance
        list.remove(Integer.valueOf(20));
        System.out.println("sorted list :"  + list);


//        Collections.sort("collection sorted list: " + list);
        list.sort(null);
        // since arraylist calls toString method hence it will print info
        System.out.println("sorted list :"  + list);

        System.out.println(list.contains(10));
        System.out.println(list.contains(50));

        //of method is used to create an arraylist, but no modification is allowed
        List<Integer> list2 = List.of( 100 , 200, 300, 400);
        //addAll method is used to add two lists.
        list.addAll(list2);
//        list2.addAll(list); // this will give .UnsupportedOperationException because list2 is immutable
        System.out.println("sorted list :"  + list);

      Object[] array =   list.toArray(new Integer[0]) ;

        List<String> fruits = Arrays.asList( "Date" , "Apple", "Banana", "Papaya", "Watermelon");

        fruits.sort((a, b) -> a.length() - b.length());;

        System.out.println(fruits);

    }
}
