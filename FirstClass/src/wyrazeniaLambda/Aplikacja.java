package wyrazeniaLambda;

public class Aplikacja {

    public static void main(String[] args) {

        Czlowiek czlowiek = (w, t) -> System.out.println("Człowiek myśli...");
        czlowiek.mysl(200, "Test2");

        Korporacja korporacja = new Korporacja();
        // Rozwiązanie oparte o klasę anonimową
        korporacja.zarzadzaj(new Czlowiek() {
            @Override
            public void mysl(int w, String t) {
                System.out.println("Człowiek myśli...");
                System.out.println(w + " " + t);
            }
        });

        // Rozwiązanie z Wyrażeniem lambda - może być użyte dla interfejsu definiującego tylko jedną metodę
        korporacja.zarzadzaj((w, t )-> {
            System.out.println("Człowiek myśli...");
            System.out.println(w + " " + t);
        });

    }
}

class Korporacja {
    public void zarzadzaj(Czlowiek cz) {
        System.out.println("Zarządzanie zasobami aktyne");
        cz.mysl(100, "Test");
    }
}

interface Czlowiek {
    void mysl(int wartosc, String tekst);
}
