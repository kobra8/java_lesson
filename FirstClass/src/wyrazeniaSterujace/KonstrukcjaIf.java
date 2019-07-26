package wyrazeniaSterujace;

public class KonstrukcjaIf {

    public static void main(String[] args) {

        double a = 5;
        double b = 0;
        double c;

        if (b != 0 && a != 0) { // Opertator koniunkcji ze skracaniem && - jeżeli po lewej warunek jest spełniony to po prawej już nie sprawdza
            c = a / b;
        } else {
            System.out.println("Nie mozna dzilić przez 0");
        }
        // Zapis skróciny dla pojedynczej lini kodu insrukckji
        if (true) c = a / b;
        else System.out.println("False");

    }
}
