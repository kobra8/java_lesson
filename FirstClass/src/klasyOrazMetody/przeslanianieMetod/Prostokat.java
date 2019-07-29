package klasyOrazMetody.przeslanianieMetod;

public class Prostokat extends Figura {
    private double a;
    private double b;

    public Prostokat(double a, double b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    // Przesłanianie metody

    public void obliczPolePowierzchni(){
        System.out.println(a * b);
    }
}
