package interfejsy;

public class Aplikacja {

    public static void main(String[] args) {

        Robot robot = new Robot(1454);
        robot.uruchom();

        Czlowiek czlowiek = new Czlowiek("Alan");
        czlowiek.oddychaj();

        Informacje[] informacje = new Informacje[] {robot, czlowiek};

        for (Informacje i: informacje) {
            i.pokazInformacje();
        }

        ProcesyKognitywne[] procesyKognitywne = new ProcesyKognitywne[] {robot, czlowiek};

        for (ProcesyKognitywne i: procesyKognitywne) {
            i.mysl();
        }

        Informacje infoRobot = new Robot(999);
        infoRobot.pokazInformacje();

        int stalaInterfejsu = Informacje.X;
    }

    public static void testInteerfejsu(Informacje info) {
        info.pokazInformacje();
    }
}
