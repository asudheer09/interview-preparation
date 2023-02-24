package com.example.hashandequalcontract;

import java.util.Objects;

class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class EqualsAndHashContract {
    public static void main(String[] args) {

        Student student= new Student(1,"sudheer");
        Student student1= new Student(1,"sudheer");

        String s1="hello";
        String s2="hello";

        System.out.println(s1.equals(s2)); //true

        System.out.println(student.equals(student1)); //false

        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());



    }
}
