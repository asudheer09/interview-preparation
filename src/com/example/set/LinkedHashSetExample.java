package com.example.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Float> floatSet= new LinkedHashSet<>();
        floatSet.add(134.56f);
        floatSet.add(144.56f);
        floatSet.add(154.56f);
        floatSet.add(164.56f);

        System.out.println(floatSet.size()); //4
        System.out.println(floatSet.isEmpty());//false

        System.out.println(floatSet.contains(144.56f));//true

        //iterate using iterator

        Iterator<Float> itr= floatSet.iterator();

        while(itr.hasNext()){
            float f=itr.next();
            System.out.println(f);
        }

    }
}
