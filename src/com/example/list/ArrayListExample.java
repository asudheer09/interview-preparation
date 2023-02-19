package com.example.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List list= new ArrayList();
        list.add(123); //index 0
        list.add(123.456); //index 1
        list.add("hello"); //index 2
        list.add('c');  // index 3
        list.add(true);

        System.out.println(list);

        // to check whether particular object is present or not
       if(list.contains('a')){
           System.out.println("element is present");
       }

       //list.remove(4); here we are passing index
        list.remove("hello");

        System.out.println(list.isEmpty());
        // to check list is empty or not
       if(!list.isEmpty()){
           System.out.println("list is not empty");
       }

       System.out.println(list);

       // to check the size of the list
        System.out.println(list.size());

    }
}
