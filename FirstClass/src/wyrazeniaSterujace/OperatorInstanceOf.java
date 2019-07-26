package wyrazeniaSterujace;

public class OperatorInstanceOf {
    public static void main(String[] args) {
        int x = 10;
        float y = 10.0f;
        checkNumber(x);

    }

    private static void checkNumber(Number number) {
        if (number instanceof  Integer) {
            System.out.println("Zmienna typu Integer");
        } else if (number instanceof Double) {
            System.out.println("Zmienna typu Double");
        } else {
            System.out.println("Zmienna innego typur");
        }
    }
}
