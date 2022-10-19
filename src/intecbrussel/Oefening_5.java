package intecbrussel;

import java.util.Random;
import java.util.Scanner;

public class Oefening_5 {
    public static void main(String[] args) {
        //1 - Maak een programma dat matrixes vermenigvuldigd.
        // Laat de user eerst kiezen hoeveel rijen en kolommende matrixes moeten bestaan.
        Scanner scan = new Scanner(System.in);
        int rijen = 0, kolommen = 0, temp = 0, f = 0;

        System.out.println("Voer het aantal rijen in van de matrix die u wilt maken: ");
        rijen = scan.nextInt();
        System.out.println("\nVoer het aantal kolommen in van de matrix die u wilt maken.: ");
        kolommen = scan.nextInt();
        int[][] myMatrix = new int[rijen][kolommen];

        //2 - laat de users elke plaats invullen of gebruik een random generator

        Random r = new Random();

        for (int i = 0; i < rijen; i++) {
            for (int j = 0; j < kolommen; j++) {
                myMatrix[i][j] = r.nextInt(20);
                System.out.print(myMatrix[i][j] + "\t");
            }

            System.out.print("\n");
        }

        //3- toon de 2 matrices naast elkaar

        System.out.println("Voer het aantal rijen in van de 2. matrix die u wilt maken: ");
        rijen = scan.nextInt();
        System.out.println("\nVoer het aantal kolommen in van de 2. matrix die u wilt maken.: ");
        kolommen = scan.nextInt();
        int[][] myMatrix2 = new int[rijen][kolommen];


        System.out.println("*****matris1 en ** matris2********");

        for (int i = 0; i < rijen; i++) {
            for (int j = 0; j < kolommen; j++) {
                System.out.print(myMatrix[i][j] + "\t");
                System.out.print(myMatrix2[i][j] + "\t");
            }
            System.out.println();
        }
        // 4 - toon het resultaat van de vermenigvuldiging
        System.out.println("toon het resultaat van de vermenigvuldiging:");
        int vermenigvuldiging[][] = new int[rijen][kolommen];
        for (int i = 0; i < rijen; i++) {
            for (int j = 0; j < kolommen; j++) {
                vermenigvuldiging[i][j] = myMatrix[i][j] * myMatrix2[i][j];
                System.out.print(vermenigvuldiging[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

