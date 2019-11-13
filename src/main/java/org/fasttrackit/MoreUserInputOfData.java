package org.fasttrackit;

import java.util.Scanner;

public class MoreUserInputOfData {

    public static void main (String[] args) {

        Scanner keybord = new Scanner(System.in);

        System.out.println ("Please enter the following information so I can sell it for a profit!");



        System.out.print("First name: ");
        String firstName = keybord.next();

        System.out.print ("Second name: ");
        String secondName = keybord.next();

        System.out.print ("Grade (9-12): ");
        int grade = keybord.nextInt();

        System.out.print ("Student ID: ");
        int studentId = keybord.nextInt();

        System.out.print ("Login: ");
        String login = keybord.next();

        System.out.print ("GPA (0.0-4.0): ");
        double gpa = keybord.nextDouble();


        System.out.println("Your information: ");
        System.out.println("     Login " + login);
        System.out.println("     ID " + studentId);
        System.out.println("     Name " + firstName + ", " + secondName);
        System.out.println("     GPA " + gpa);
        System.out.println("     Grade " + grade);


    }
}
