package intecbrussel;

import java.util.Scanner;

public class Oefening_2 {
    public static void main(String[] args) {

        //Schrijf een programma om het hoogste getal in de array
        // te vinden en af te drukken.Hint : Sorteer de array

        Scanner scan = new Scanner(System.in);
        int maxNumber = 0;
        int[] myArr = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Voer het " + (i + 1) + ". element in de array in: ");
            myArr[i] = scan.nextInt();
        }

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > maxNumber) {
                maxNumber = myArr[i];
            }
        }
        System.out.println("maxNumber = " + maxNumber);

    }
}