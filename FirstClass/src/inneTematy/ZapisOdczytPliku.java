package inneTematy;

import java.io.*;
import java.util.Scanner;

public class ZapisOdczytPliku {

    public static void main(String[] args) throws IOException {

        // Zapis danych do pliku

        File file = new File("src/inneTematy/Plik.txt"); // Tworzenie obiektu file razem ze ścieżką
        FileOutputStream fileOutputStream = new FileOutputStream(file); // Tworzenie strumienia wyjściowego - przesłanie danych z programu do pliku (bajty)
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream); // Tłumaczenie znaków na bajty
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter); // Wysyłanie znaków do tłumacza
        try {
            bufferedWriter.write("To jest przykładowe zapisywanie danych do pliku.");
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Wystąpił błąd IO " + ex.toString());
        }

        // Zapis danych do już istniejącego pliku
        FileWriter fileWriter = new FileWriter(file, true);
        bufferedWriter = new BufferedWriter(fileWriter); // Wysyłanie znaków do tłumacza
        try {
            bufferedWriter.write("\nTo jest nowy tekst.");
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Wystąpił błąd IO " + ex.toString());
        }

        // Odczyt danych z pliku

        FileInputStream fileInputStream = new FileInputStream(file); // Tworzenie strumienia wejściowego
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); // Tłumaczenie bajtów na znaki
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // Odczyt damych z tłumacza

        try {
            String line = bufferedReader.readLine();
            bufferedReader.close();

            System.out.println(line);

        } catch (IOException ex) {
            System.out.println("Wystąpił błąd IO " + ex.toString());
        }

        // Pobieranie danych z pliku za pomocą Scanner
        Scanner scanner = new Scanner(file);
        String s = scanner.nextLine();
    }
}
