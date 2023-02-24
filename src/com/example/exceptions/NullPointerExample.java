package com.example.exceptions;

import com.example.hashmap.Employee;

public class NullPointerExample {
    public static void main(String[] args) {
        String s=null;
        try{
            System.out.println(s.length());
        }catch (Exception e){
            e.printStackTrace();
        }

        Employee e=null;
        System.out.println(e.toString());

    }
}
