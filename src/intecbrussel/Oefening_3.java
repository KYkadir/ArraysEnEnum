package intecbrussel;

import java.util.Arrays;
import java.util.Random;

public class Oefening_3 {
    //Maak een array aan en vul deze met 6 random getallen tussen 1 en 23.
    // Bereken hiervan:

    public static void main(String[] args) {


        int myArrLength = 6;
        int myArr[] = new int[myArrLength];

        Random random = new Random();

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(23);
        }
        System.out.println("My Array : " + Arrays.toString(myArr));

        // de som van de 6 getallen
        som(myArr);

        //het gemiddelde van de 6 getallen
        gemiddelde(myArr);

        //Vermenigvuldig de getallen
        vermenigvuldig(myArr);


    }

    public static void som(int myArr[]) {
        int totaal = 0;

        for (int i = 0; i < myArr.length; i++) {

            totaal = totaal + myArr[i];
        }
        System.out.println("de som van de 6 getallen : " + totaal);
    }

    public static void gemiddelde(int myArr[]) {
        int totaal = 0;

        for (int i = 0; i < myArr.length; i++) {

            totaal = totaal + myArr[i];

            if (i == myArr.length - 1) {
                double gemiddelde;
                gemiddelde = gemiddelde = totaal / myArr.length;
                System.out.println("Het gemiddelde van de 6 getallen= " + gemiddelde);
            }
        }
    }

    public static void vermenigvuldig(int myArr[]) {
        int totaal = 1;

        for (int i = 0; i < myArr.length; i++) {

            totaal = totaal * myArr[i];
        }
        System.out.println("Vermenigvuldig de getallen : " + totaal);
    }

}
