package klasyOrazMetody;

public class Fabrykaprostokatow {

    public static void main(String[] args) {

        Prostokat prostokatNr1 = new Prostokat(10, 5);
        Prostokat prostokatNr2 = new Prostokat(4, 2);
        Prostokat prostokatNr3 = new Prostokat( 5,3, "Nowy prostokąt");

        prostokatNr2.setA(20);
        prostokatNr1.setB(15);

        System.out.println(prostokatNr3.getNazwaProstokata() + " Bok a: " + prostokatNr3.getA() + " Bok b: " + prostokatNr3.getB());

        prostokatNr1.test();
        prostokatNr1.test("Korzystam z metody test (przeciążanie)");

        int poleProstokata = prostokatNr3.test(prostokatNr3.getA(), prostokatNr3.getB());

        System.out.println(poleProstokata);
    }
}
