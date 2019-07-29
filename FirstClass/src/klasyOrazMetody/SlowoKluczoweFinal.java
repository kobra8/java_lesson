package klasyOrazMetody;

final public class SlowoKluczoweFinal { // final w nazwie klasy oznacza, że nie może być dziedziczona

    final private  int STALA; // final w zmiennej - nie można zmieniać raz przypisanej wartości

    SlowoKluczoweFinal() {
        STALA = 10;
    }

    final public void test() { // final w metodzie oznacza, że metoda ta nie może być nadpisana przy dziedziczeniu
        final int STALA_NOWA = 10;
        System.out.println(STALA + STALA_NOWA);
    }
}
