package org.fasttrackit;

import java.util.Scanner;

public class AskingQuestions {

    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);
        int age;
        String heightInMeters;
        String heightInInches;
        double weight;

        System.out.print (" How old are you? ");
        age = keyboard.nextInt();

        System.out.print ("How many feet tall are you?");
        heightInMeters = keyboard.next();

        System.out.print("And how many inches?");
        heightInInches = keyboard.next();

        System.out.print ("How much do you weigh? ");
        weight = keyboard.nextDouble();

        System.out.print ("So you're " + age + " old, " + heightInMeters + "'" + heightInInches + " tall and " + weight + " heavy." );

    }
}
