package klasyAbstrakcyjne;

public class Aplikacja {

    public static void main(String[] args) {

      //  Maszyna maszyna = new Maszyna(); // Klasa abstrakcyjna nie tworzy instancji

        Robot robot = new Robot();

        robot.przypiszNumerSeryjny(3145654);
        System.out.println(robot.pobierzNumerSeryjny());

        robot.uruchom();
    }
}
