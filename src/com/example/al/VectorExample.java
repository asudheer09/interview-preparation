package com.example.al;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        List v1= new Vector();
        v1.add(134);
        v1.add("hello");
        System.out.println(v1.isEmpty());
        System.out.println(v1.size());
        System.out.println(v1.contains(134));

        Vector<String> v2= new Vector<>();

        v2.add("hello");
        v2.add("world");
        v2.add("java");

        System.out.println(v2.capacity());

        Enumeration e=v2.elements();
        System.out.println("get one by one object from collection using enumeration");
        while(e.hasMoreElements()){
           String obj= (String) e.nextElement();
            System.out.println(obj);
        }

        System.out.println("get one by one object from collection using iterator");

        Iterator itr=v2.iterator();

        while(itr.hasNext()){
            String obj=(String)itr.next();
            System.out.println(obj);
        }

        System.out.println("using java8");
        v2.stream().forEach((h)-> System.out.println(h));

        System.out.println("using for each");

        for(String s:v2){
            System.out.println(s);
        }

        List l= new Vector();

    }
}
