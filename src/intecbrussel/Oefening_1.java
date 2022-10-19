package intecbrussel;

import java.util.Scanner;

public class Oefening_1 {
    //Schrijf een programma om de oneven nummers in een array te vinden en af te drukken.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int [] myArr = new int[10];
        int [] myArrOnEven = new int[10];

        for(int i = 0; i < 10; i++)
        {
            System.out.print("Voer het " + (i+1) + ". element in de array in: ");
            myArr[i] = scan.nextInt();
            if(myArr[i] % 2 == 1) {
                myArrOnEven[count] = myArr[i];
                count++;
            }
        }
        System.out.println("Oneven nummers\n");
        for(int i = 0; i < count; i++)
        {
            System.out.println("Oneven nummers = " + myArrOnEven[i]);
        }
    }
}
