package typySparametryzowane;

import java.util.ArrayList;

public class AplikacjaPiec {

    public static void main(String[] args) {

        ArrayList<Maszyna> arrayList = new ArrayList<>();

        arrayList.add(new Maszyna());

        wyswietlElement(0, arrayList);
    }

    // Argument wieloznaczny - ? tzw. wildcard
    public static void wyswietlElement(int index, ArrayList<? super Robot> arrayList) { // Dolna granica parametryzacji - do obiektu ze słowem kluczowym super
        Object element = arrayList.get(index);

        System.out.println("Element: " + element);
        System.out.println("typ elementu: " + element.getClass().getName());
    }

    // Przykład jako metoda generyczna
    public static <T extends Maszyna> void wyswietlElementOld(int index, ArrayList<T> arrayList) { // Tutaj nie ma dolnej granicy - wszystkie obiekty dziedziczące po Maszyna są akceptowane
        T element = arrayList.get(index);

        System.out.println("Element: " + element);
        System.out.println("typ elementu: " + element.getClass().getName());
    }
}

class Maszyna {

}

class Robot extends Maszyna {

}
