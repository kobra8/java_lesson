package wyrazeniaSterujace;

public class PetleForOrazForEach {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0)
                System.out.println(i + " jest Parzysta");
            else
                System.out.println(i + " jest Nieparzysta");
        }

        for (int i = 0, j = 10; i <= j; i++, j--) {
            System.out.println("i = " + i + " j = " + j);
        }

        // Pętla forEach
        int[] tablica = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i: tablica) {
            System.out.println(i);
        }
    }
}
