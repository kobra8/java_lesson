package inneTematy;

import java.util.ArrayList;
import java.util.Random;

public class Strumienie {

    public static void main(String[] args) {

        // Utworzenie setu danych
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random randomGenerator = new Random();
        for (int i = 0; i < 100; i++) {
            arrayList.add(randomGenerator.nextInt());
        }

        // 1. Tradycyjne podejście
        long start = System.currentTimeMillis();

        int result = 0;
        for (int i: arrayList) {
            result += isPrime(i);
        }

        long end = System.currentTimeMillis() - start;

        System.out.println("From 100 numbers result, " + result + " are prime");
        System.out.println("Execution time in ms: " + end);

        // 2. Strumień sekwencyjny
        System.out.println("==================================");
        start = System.currentTimeMillis();

        result = arrayList.stream().map(Strumienie::isPrime).reduce(Integer::sum).get();

        end = System.currentTimeMillis() - start;

        System.out.println("From 100 numbers result, " + result + " are prime");
        System.out.println("Execution time in ms: " + end);

        // 2. Strumień równoległy
        System.out.println("==================================");
        start = System.currentTimeMillis();

        result = arrayList.parallelStream().map(Strumienie::isPrime).reduce(Integer::sum).get();

        end = System.currentTimeMillis() - start;

        System.out.println("From 100 numbers result, " + result + " are prime");
        System.out.println("Execution time in ms: " + end);
    }

    public static int isPrime(int n) {
        n = Math.abs(n);
        for (int i = 2; i < n; i++) if (n % i == 0 ) return 0;
        return 1;
    }
}
