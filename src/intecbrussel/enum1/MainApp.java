package intecbrussel.enum1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a vakantie plan: ");

        Landen landen = Landen.valueOf(scanner.nextLine().toUpperCase());

        Vakantie vakantie = new Vakantie();
        vakantie.planVakantie(landen);

    }
}
