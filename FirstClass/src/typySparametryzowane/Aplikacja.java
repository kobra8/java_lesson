package typySparametryzowane;

import java.util.ArrayList;

public class Aplikacja {

    public static void main(String[] args) {
        ArrayList arraylist_1 = new ArrayList();

        arraylist_1.add(1);
        arraylist_1.add(1.234);
        arraylist_1.add("Nietoperz");
        // Każdy element arry list jest typu object

        // Przy pobieraniu obiektu z tablicy musimy dokonac jawnego rzutowania z Object na String
        String zwierze = (String) arraylist_1.get(2);

        ArrayList<String> arrayList_2 = new ArrayList<>(); // W new nie trzeb apodawać typu w <>

        arrayList_2.add("Jeden");
        arrayList_2.add("Dwa");
        arrayList_2.add("Trzy");
    }
}
