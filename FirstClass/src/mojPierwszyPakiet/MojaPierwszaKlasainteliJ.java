package mojPierwszyPakiet;

public class MojaPierwszaKlasainteliJ {

    public static void main(String[] args) {
        float x = 2.1f;
        int y = 2;
        String name = ""+y;

        System.out.println(name);
        System.out.println(name.getClass());
    }

    private void metoda() {

        int x = 7;

        System.out.println(x);
    }
}

// Nazwy pakietów: camelCase
// Nazwa klasy: WielkaLitera - powinna być rzeczownikiem np. (Animal, Arraylist, VeryBigPlanet)
// Interfejsy: WielkaLitera - powinna być przymiotnikiem np. (Runnable, OperateCar)
// Metody: camelCase -  czasowniki np. (calculateValue, printLn)
// Zmienne: camelCase
// Stałe: WIELKIE_LITERY
