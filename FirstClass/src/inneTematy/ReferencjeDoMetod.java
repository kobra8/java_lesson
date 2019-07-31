package inneTematy;

public class ReferencjeDoMetod {

    public static void main(String[] args) {

        Klasa klasa = new Klasa();

//        Interfejs interfejs = new Interfejs() {
//            @Override
//            public Klasa wywolajMetode() {
//                return new Klasa();
//            }
//        };

        // Referencja do metody jest skróconym zapisem zamiast wyrażenia Lambda lub klasy anonimowej
        Interfejs interfejs = Klasa::new;
        interfejs.wywolajMetode();
    }
}

class Klasa {
    public void metoda() {
        System.out.println("To jest przykładowa metoda");
    }
}

interface Interfejs {
    Klasa wywolajMetode();
}
