package wyrazeniaSterujace;

public class KonstrukcjaSwitch {
    public static void main(String[] args) {

        int a = 0;

        switch (a) {
            case 0:
                System.out.println();
                break;
            case 1:
                System.out.println();
                break;
                default:
                    System.out.println();
        }

        String b = "Kowalski";

        switch (a) {
            case 0:
                switch (b) {
                    case "Kowalski":
                        System.out.println(b);
                        break;
                        default:
                            // Coś
                }
                break;
                default:
                    // Coś
        }
    }
}
