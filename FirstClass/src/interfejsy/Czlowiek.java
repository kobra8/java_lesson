package interfejsy;

public class Czlowiek implements Informacje, ProcesyKognitywne {
    private String imie;

    public Czlowiek(String imie) {
        this.imie = imie;
    }

    public void oddychaj() {
        System.out.println(imie + " zacząl oddychać.");
    }

    @Override
    public void pokazInformacje() {
        System.out.println("Imię człowieka to: " + imie);
    }

    @Override
    public void mysl() {
        System.out.println(imie + " teraz myśli");
    }
}
