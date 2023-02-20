package com.example.customexception;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class VoterTest {
    public static void main(String[] args) throws InValidVoterException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter age ");
        int age=scanner.nextInt();

        if(age<18){
            throw new InValidVoterException("user is not allowed to vote");
        }
    }
}
