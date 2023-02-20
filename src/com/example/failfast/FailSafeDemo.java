package com.example.failfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list= new CopyOnWriteArrayList<>();
       // ArrayList<Integer> list= new ArrayList<>();
        list.add(18);
        list.add(21);
        list.add(24);
        list.add(27);
        list.add(29);

        Iterator iterator= list.iterator();

        while (iterator.hasNext()){
            Integer i=(Integer)iterator.next();
            System.out.println(i);
            list.add(23);
        }


    }
}
