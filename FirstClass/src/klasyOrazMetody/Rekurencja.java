package klasyOrazMetody;

public class Rekurencja {
    public static void main(String[] args) {

        rekurencja(5);
        System.out.println(fibbonaci(4));
        System.out.println(fibonnaciRekursywnie(4));
    }

    public static void rekurencja(int n) {
        if (n > 0 ) {
            rekurencja(n - 1);
            System.out.println(n);
        }
    }

    public static int fibbonaci(int n) {
        final double PHI = (1 + Math.sqrt(5)) / 2;
        Double ntyWyraz = (Math.pow(PHI, n) - Math.pow((1 - PHI), n)) / Math.sqrt(5);
        return ntyWyraz.intValue(); // Int value to metoda która zwraca int z np. double
    }

    public static int fibonnaciRekursywnie(int n) {
        if(n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonnaciRekursywnie(n - 1) + fibonnaciRekursywnie(n - 2);
        }
    }
}
