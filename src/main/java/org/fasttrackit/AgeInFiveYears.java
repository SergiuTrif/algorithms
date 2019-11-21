package org.fasttrackit;

import java.util.Scanner;

public class AgeInFiveYears {

    public static void main (String[] args){

        int age1 = 5;

        Scanner keyboard = new Scanner(System.in);

        System.out.print ("Hello.  What is your name? ");
        String name = keyboard.nextLine();

        System.out.print ("Hi " + name + "!  How old are you? ");
        int age = keyboard.nextInt();

        System.out.println("Did you know that in five years you will be " + (age+age1) +  " years old?");
        System.out.println("And five years ago you were " + (age-age1) + "! Imagine that!");

    }
}
