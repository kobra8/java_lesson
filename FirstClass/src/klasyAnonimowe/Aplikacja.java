package klasyAnonimowe;

public class Aplikacja {

    public static void main(String[] args) {

        Komputer komputer = new Komputer() {
            @Override
            public void zaladujSystemOperacyjny() {
                System.out.println("Ładuję Ubuntu v14.04...");
            }
        };
        komputer.zaladujSystemOperacyjny();

        Czlowiek czlowiek = new Czlowiek() {
            @Override
            public void mysl() {
                System.out.println("Człowiek myśli...");
            }
        };
        czlowiek.mysl();
    }
}

class Komputer {

    public void zaladujSystemOperacyjny() {
        System.out.println("Ładuję Windows v10...");
    }
}

interface Czlowiek {
    void mysl();
}