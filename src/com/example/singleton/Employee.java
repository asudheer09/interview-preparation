package com.example.singleton;

public class Employee {
    private static  Employee employee= new Employee();

    private Employee(){

    }

    public static Employee getEmployee(){
        if(employee==null){
            employee= new Employee();
        }
        return  employee;
    }
}
