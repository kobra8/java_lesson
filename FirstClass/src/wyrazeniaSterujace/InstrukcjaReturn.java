package wyrazeniaSterujace;

public class InstrukcjaReturn {
    public static void main(String[] args) {

        System.out.println("Jeden");
        if (true) return;
        System.out.println("Dwa");
    }
    // Instrukcja return zwraca sterowanie do kodu który ją wywołał
}
