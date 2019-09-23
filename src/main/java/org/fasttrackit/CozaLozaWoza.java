package org.fasttrackit;

public class CozaLozaWoza {


    public void printCozaLozaWoza (int start, int stop){

        for (int i = start; i <= stop; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("CozaLoza");
            }
            if (i % 3 == 0) {
                System.out.println("Coza ");
            } else if (i % 5 == 0) {
                System.out.println("Loza ");
            } else if (i % 7 == 0) {
                System.out.println("Woza ");
            }
            else  {
                System.out.println(i + " ");
            }

            if (i % 11 == 0){
                System.out.println();
            }
        }


    }

    public static void main(String[] args) {

        CozaLozaWoza cozaLozaWoza = new CozaLozaWoza();
        cozaLozaWoza.printCozaLozaWoza(1, 110 );


    }
}
