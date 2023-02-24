package com.example.exceptions;

public class ArrayIndexOutOfBoundExample {
    public static void main(String[] args) {
      /*  int[] numbers= new int[-10]; //should not be negative
        int[] numbers1= new int[10];
        System.out.println(numbers1[10]);//AIOOBE
        */
        String s="134s";
        int a=  Integer.parseInt(s); //NumberFormatException
        System.out.println(a);

    }
}
