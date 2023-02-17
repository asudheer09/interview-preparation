package com.example.hash;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample{
    public static void main(String[] args) {
        Set<String> set= new TreeSet<>();
        set.add("A");
        set.add("Z");
        set.add("R");
        set.add("P");
        set.add("G");

        System.out.println(set);

        Set<Integer> integerSet= new TreeSet<>();
        integerSet.add(12);
        integerSet.add(1);
        integerSet.add(9);
        integerSet.add(3);

        System.out.println(integerSet);

        // int ---> Integer
        //flot --->Float
        //char ---> Character
        //double ---> Double
        //long ---> Long
        //boolean --->Boolean






    }
}
