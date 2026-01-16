package org.example;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {

    public static void main(String[] args) {

        //enum knows all the keys in advance, hence it is efficient
        // no hashing, hashcode is required.

        //size of array is same as enum
        Map<Day, Integer> workHours = new EnumMap<>(Day.class); //give enum class in constructor

        workHours.put(Day.MON, 10);
        workHours.put(Day.TUE, 8);
        workHours.put(Day.FRI, 9);

        //ordinal() is the position of the enum constant in its declaration, starting from 0.
        System.out.println( Day.WED.ordinal());

        System.out.println(workHours);

    }
}

// to store constants values
enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}
