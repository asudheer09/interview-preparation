package com.example.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EmployeeHashMapTest {
    public static void main(String[] args) {
        Employee emp1= new Employee("abc",1322);
        Employee emp2= new Employee("def",1344);
        Employee emp3= new Employee("def",1344);//duplicate
        Map<Employee,String> map= new HashMap<>();
        map.put(emp1,"emp1");
        map.put(emp2,"emp2");
        map.put(emp3,"emp3");
        System.out.println(map.size());

        HashSet hashSet= new HashSet();
        hashSet.add("hello");
        hashSet.add(134);

    }
}
