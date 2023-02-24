package com.example.customexception;

public class InValidVoterException extends Exception{
    public InValidVoterException(String message){
        super(message);
    }
}
