package obslugaWyjatkow;

import java.io.IOException;

public class ThrowOrazThrows {

    public static void main(String[] args) {

        try {
            dzielenieDwochLiczb(5, 0);
        } catch (ArithmeticException ex) {
            System.out.println("Wyjątek \"" + ex.toString() + "\" został złapany i obsłużony.");
        } catch (IOException ex) {
            System.out.println("Błąd wejścia - wyjścia");
        } catch (Exception ex) { // Exception na końcu
            System.out.println("Dodatkowa obsługa wyjątków");
        }
    }

    public static double dzielenieDwochLiczb (double a, double b) throws IOException { // throws dla wyjątków weryfikowanych - trzeba zgłosić jakie mogą wystąpić
        if (b == 0) {
            throw new IOException("Dzielenie przez zero.");
        } else {
            return a / b;
        }
    }
}

// Wyjątki dzielą się na weryfikowane i nieweryfikowane
// Nieweryfikowanych nie trzeba zgłaszać - dziedziczą po RuntimeException i Error