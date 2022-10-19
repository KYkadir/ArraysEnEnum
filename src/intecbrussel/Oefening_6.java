package intecbrussel;

import java.util.Arrays;
import java.util.Random;

public class Oefening_6 {
    public static void main(String[] args) {
        //We gaan 23'en! We maken 4 arrays aan van elks 2 getallen tussen 1 en 23.
        // array0 is de dealer, array1 en array2 array3 zijn spelers
        // TIP:(array van arrays?) De array die meeste puntenbehaalt met zijn
        // combinatie en niet hoger dan 23 heeft, is de winnaar.
        // Er is een mogelijkheid dat er meerder winnaars zijn.
        Random random = new Random();
        int array0[] = new int[2];
        int array1[] = new int[2];
        int array2[] = new int[2];
        int array3[] = new int[2];

        for (int i = 0; i < array0.length; i++) {
            array0[i] = random.nextInt(10);
            System.out.print(array0[i] + "\t");
        }
        System.out.print("\n");

        int sum0 = 0;
        for( int sayi : array0) {
            sum0 = sum0+sayi;
        }
        System.out.println("Som van twee kaartwaarden voor arr0 ===>  "+sum0);

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10);
            System.out.print(array1[i] + "\t");
        }
        System.out.print("\n");

        int sum1 = 0;
        for( int sayi : array1) {
            sum1 = sum1+sayi;
        }
        System.out.println("Som van twee kaartwaarden voor player1 ===>  "+sum1);


        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(10);
            System.out.print(array2[i] + "\t");
        }
        System.out.print("\n");

        int sum2 = 0;
        for( int sayi : array2) {
            sum2 = sum2+sayi;
        }
        System.out.println("Som van twee kaartwaarden voor player2 ===>  "+sum2);

        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(23);
            System.out.print(array3[i] + "\t");
        }
        System.out.print("\n");

        int sum3 = 0;
        for( int sayi : array3) {
            sum3 = sum3+sayi;
        }
        System.out.println("Som van twee kaartwaarden voor player3 ===>  "+sum3);
        int[]myArr={sum0,sum1,sum2,sum3};
        for (int i = 0; i <myArr.length ; i++) {
            if (myArr[i]>23){myArr[i]=0;
                System.out.println("Waarden met kaartwaarden van in totaal meer dan 23 verloren");
            }else {}

        } System.out.println( "winnend totaal in kaartwaarden  "+Arrays.stream(myArr).max());





    }
}

