package wyrazeniaSterujace;

public class PetleWhileOrazDoWhile {
    public static void main(String[] args) {

        int iterator = 1;

        while (iterator <= 10) {
            System.out.println(iterator);
            iterator ++;
        }

        do {
            System.out.println(iterator);
            iterator ++;
        } while (iterator <= 10);
    }


}
