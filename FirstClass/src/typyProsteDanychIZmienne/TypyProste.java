package typyProsteDanychIZmienne;

public class TypyProste {

    public static void main(String[] args) {

        int x = 10; // typ prosty
        Integer y = 10; // Obiekt

        // Test wydajności typów prosty i obiektów
        // Zapisz czas na początku
        long start = System.currentTimeMillis();

        // Odliczaj od 0 do 10^9 i dodawaj do siebie wartości
        long sum = 0L;
        for (long i = 0; i <= 1000000000; i++) {
            sum += i;
        }
        System.out.println("Suma wynosi: " + sum);

        // Zapisz czas na końcu
        long stop = System.currentTimeMillis();

        //Wyświetl czas wykonanania
        System.out.println("Czas wykonania w ms: " + (stop - start));
    }
}
