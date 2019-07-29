package klasyAbstrakcyjne;

 public abstract class Maszyna {

    private int nrSeryjny;

    public void przypiszNumerSeryjny(int nrSeryjny) {
        this.nrSeryjny = nrSeryjny;
    }

    public int pobierzNumerSeryjny() {
        return this.nrSeryjny;
    }

    public abstract void uruchom();
}
