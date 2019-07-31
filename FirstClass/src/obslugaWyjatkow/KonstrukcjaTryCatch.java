package obslugaWyjatkow;

public class KonstrukcjaTryCatch {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (ArithmeticException ex) { // Jeżeli chcemy łapać ogólnie wyjątki piszem typ Exception
            System.out.println("Wyjątek: " + ex.toString() + " został złapany i obsłużony.");
        }
        catch (NullPointerException ex) {
            // Obsługa drugiego wyjątku
        } finally { // Jeżeli nie złapiemy wyjątku możemy zmusić program do wykonania jakiś operacji na koniec przed przerwaniem działania
            System.out.println("Operacje na koniec"); // Zawsze się wykonują - czy jest błąd czy nie
        }

        System.out.println("Dalsze operacje");
    }
}
