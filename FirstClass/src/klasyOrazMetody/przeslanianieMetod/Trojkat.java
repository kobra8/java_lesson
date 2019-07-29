package klasyOrazMetody.przeslanianieMetod;

public class Trojkat extends Figura {

    private double a;
    private double h;

    public Trojkat(double a, double h) {
        super(a, h);
        this.a = a;
        this.h = h;
    }

    // Przesłanianie metody

    public void obliczPolePowierzchni() {
        System.out.println((a * h) / 2);
    }

}
