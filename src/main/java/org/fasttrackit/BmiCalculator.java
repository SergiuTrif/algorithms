package org.fasttrackit;

import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Your height in m:");
        double height = keyboard.nextDouble();

        System.out.print("Your weight in kg:");
        int weight = keyboard.nextInt();

        System.out.print(" Your BMI is " + weight/(height*height));
    }
}
