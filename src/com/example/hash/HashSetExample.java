package com.example.hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set= new HashSet<>();
        set.add("hi");
        set.add("hello");
        set.add("hi");

        Iterator<String> itr=set.iterator();

        while(itr.hasNext()){
            String s= itr.next();
            System.out.println(s);
        }

        Set<Integer> set1= new HashSet<>();
        set1.add(12);
        set1.add(456);
        set1.add(239);

        for(Integer i: set1){
            System.out.println(i);
        }

        System.out.println(set.size());
        System.out.println(set1.contains(new Integer(456)));
        set1.remove(new Integer(12));

        System.out.println("print set1 using java8 after removing");
        set1.stream().forEach(System.out::println);
        System.out.println(set1.isEmpty());
    }
}
