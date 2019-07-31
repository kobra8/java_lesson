package typySparametryzowane;

public class AplikacjaTrzy {

    public static void main(String[] args) {

        Integer[] tablicaLiczb = {1, 2, 3, 4, 5};
        Character[] tablicaZnaków = {'A', 'B', 'C', 'D', 'E'};

        wyswietlElementyTablicy(tablicaLiczb);
        wyswietlElementyTablicy(tablicaZnaków);
    }

    public static <T> void wyswietlElementyTablicy(T[] tablica) {
        for (T element: tablica) {
            System.out.print(element);
        }
        System.out.println();
    }
}
