package com.example.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Employee employee1= Employee.getEmployee();
        Employee employee2= Employee.getEmployee();
        Employee employee3= Employee.getEmployee();
        Employee employee4= Employee.getEmployee();

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee3.hashCode());
        System.out.println(employee4.hashCode());
    }
}
