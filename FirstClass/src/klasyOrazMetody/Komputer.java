package klasyOrazMetody;

public class Komputer {

    private int uzytkownik;

    public class KartaSieciowa { // Klasa wewnętrzna - widoczna tylko dla klasy Komputer
        public void ustanowPolaczenie(){
            System.out.println("Użytkownik nr " + uzytkownik + " ustanowił połączenie.");
        }

    }

    public Komputer(int uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public void uruchom () {
        UPS ups = new UPS();
        ups.naladuj();

        System.out.println("Witaj użytkowniku nr " + uzytkownik);

        KartaSieciowa kartaSieciowa = new KartaSieciowa();
        kartaSieciowa.ustanowPolaczenie();
    }

    public KartaSieciowa utworzKarteSieciowa() {
        KartaSieciowa kartaSieciowa = new KartaSieciowa();
        return kartaSieciowa;
    }
}

class UPS { // Nie może być tu public bo w 1 pliku może być tylko 1 klasa nadrzędna
    public void naladuj() {
        System.out.println("UPS jest naładowany");
    }
}