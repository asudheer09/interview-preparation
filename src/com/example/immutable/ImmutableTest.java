package com.example.immutable;

public class ImmutableTest {
    public static void main(String[] args) {
        Student student= new Student(123,"sudheer");

        System.out.println(student.getId());
        System.out.println(student.getName());

        //here there are no setter methods to modify the object,
        // if we want to modify we need to create new object.
    }
}
