package inneTematy;

import java.util.Scanner;

public class OdczytDanych {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double waga;
        double wzrost;
        double bmi;

        System.out.println("Podaj swoją wagę w kg:");
        waga = input.nextDouble();

        System.out.println("Podaj swój wzrost w cm:");
        wzrost = input.nextDouble();

        bmi = waga / Math.pow((wzrost/100), 2);

        System.out.printf("Twoje BMI tp: %.2f \n\n", bmi); // Formatowane dane wyjściowe

        System.out.println("< 18.5 - niedowaga");
        System.out.println("18.5 - 24.99 - waga prawidłowa");
        System.out.println(">= 25 - nadwaga");
    }
}
