package intecbrussel;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Oefening_4 {
    public static void main(String[] args) {
        //Bepaal 1 random getal en probeer het te raden. Sla al je gokken op in een array
        Scanner scan=new Scanner(System.in);
        Random random=new Random();

        int randomNumber = random.nextInt(10);
        System.out.println("Please guess a number");
        int guess = scan.nextInt();
        int guesses = 0;
        int[] arrayOfGuesses = {guess};
        while (guess != randomNumber) {
            System.out.println("Wrong, please guess again");
            guess = scan.nextInt();
            guesses++;
            arrayOfGuesses = Arrays.copyOf(arrayOfGuesses,guesses+1);
            arrayOfGuesses[guesses]=guess;
        }
        System.out.println("Congratulations, you have won");
        System.out.println(Arrays.toString(arrayOfGuesses));

    }
}
