package com.example.exceptions;

public class ArithmeticExceptionTest {
    public static void main(String[] args) {
        int a=10,b=0;
        try{
            int c= a/b;
        }catch(ArithmeticException e){
            System.out.println("AE");
            e.printStackTrace();
        }catch(NumberFormatException e){
            System.out.println("NFE");
            e.printStackTrace();
        }catch (Exception e1){
            System.out.println("Exception occurred");
            e1.printStackTrace();
        }

    }
}
