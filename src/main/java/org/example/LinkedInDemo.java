package org.example;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedInDemo {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(10);
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);
        System.out.println(list);

        // this will remove the first element
        list.remove();
        System.out.println(list);

        list.addFirst(100);
        list.addLast(1000);
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        //removeIf method needs a predicate and it needs a lambda expression.
        list.removeIf(X -> X % 2 == 0);
        System.out.println(list);


        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Lion"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Cat", "Deer", "Elephant"));


        animals.removeAll(animalsToRemove);
        System.out.println(animals);


    }
}
