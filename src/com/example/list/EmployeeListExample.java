package com.example.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeListExample {

    public static void main(String[] args) {
        Employee e1= new Employee(1,"abc");
        Employee e2= new Employee(22,"def");
        Employee e3= new Employee(33,"ghi");
        Employee e4= new Employee(44,"jkl");
        Employee e5= new Employee(55,"xyz");

        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);

      //  System.out.println(employeeList);

        // foreach using java5
       /* for(Employee employee:employeeList){
            System.out.println(employee);
        }*/

        Iterator it= employeeList.iterator();

        /*
        while(it.hasNext()){
          Employee employee= (Employee) it.next();
            System.out.println(employee);
        }*/

        //using java8

        employeeList.stream().forEach(System.out::println);

        employeeList.remove(e4);

        System.out.println("after remove");

        employeeList.stream().forEach((e)->System.out.println(e));

        System.out.println(employeeList.contains(e2));
        System.out.println(employeeList.contains(e5));
        System.out.println(employeeList.size());
        System.out.println(employeeList.isEmpty());


    }



}
