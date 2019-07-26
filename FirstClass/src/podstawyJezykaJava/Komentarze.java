package podstawyJezykaJava;

/**
 * Komentarz dokumentujący
 */

public class Komentarze {

    int x;
    int y;

    /**
     * To jest konstruktor klasy Komentarze.
     * @param x
     * @param y
     */

    public Komentarze(int x, int y ) {
        this.x = x;
        this.y = y;
    }

    /**
     * To jest metoda main.
     * @param args
     */
    public static void main(String[] args) {

        // Komentarz jednowierszowy

        /*

        Komentarz wielowierszowy

         */
    }

    /**
     *  To jest metoda mnożąca przez siebie dwie wartości
     * @param x Parametr nr 1
     * @param y Parametr nr 2
     * @return Iloczyn x * y
     */
    private int pomnoz(int x, int y) {
        return  x * y;
    }


}
