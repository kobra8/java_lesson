package inneTematy;

public class Wyliczenia {

//    public static final int BATMAN = 0;
//    public static final int SUPERMAN = 1;
//    public static final int WONDER_WOMAN = 2;
    // Powyższe stałe zostały zastąpione typem wyliczeniowym, czyli enum

    public static void main(String[] args) {

        Superbohater superbohater = Superbohater.SUPERMAN;

        switch (superbohater) {
            case BATMAN:
                System.out.println("Moc " + superbohater.getNazwaDop() +" to: " + superbohater.getMoc());
                break;
            case SUPERMAN:
                System.out.println("Moc " + superbohater.getNazwaDop() +" to: " + superbohater.getMoc());
                break;
            case WONDER_WOMAN:
                System.out.println("Moc " + superbohater.getNazwaDop() +" to: " + superbohater.getMoc());
                break;
                default:
                    break;
        }


    }
}
