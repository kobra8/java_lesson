package typyProsteDanychIZmienne;

public class OpakowywanieTypowProstych {

    public static void main(String[] args) {

        int x = 10;
        Integer integer = x; // Automatyczne opakowywanie typów prostych obiektem

        int compare = integer.compareTo(15); // Metoda compare zwraca -1 (mniejsza), 0 (równe), 1 (wieksza);

        System.out.println(compare);

        int y = integer; // Automatyczne rozpakowanie z obiektu na typ prosty
    }
}
