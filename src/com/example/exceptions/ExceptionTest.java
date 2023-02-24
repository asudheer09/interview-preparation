package com.example.exceptions;

public class ExceptionTest {
        public static void main(String[] args) {

            try {
                someMethod();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    public static void someMethod() throws InterruptedException {
        Thread.sleep(2000);
    }
}
