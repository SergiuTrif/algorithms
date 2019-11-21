package org.fasttrackit;

import java.util.Scanner;

public class ADumbCalculator {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("What is your first number? ");
        double number1 = number.nextDouble();

        System.out.print("What is your second number? ");
        double number2 = number.nextDouble();

        System.out.print("What is your third number?");
        double number3 = number.nextDouble();

        System.out.println((number1+number2+number3)/2);

    }
}
