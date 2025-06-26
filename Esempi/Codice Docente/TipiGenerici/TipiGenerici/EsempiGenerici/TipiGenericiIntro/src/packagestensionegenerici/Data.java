package packagestensionegenerici;

public class Data extends Coppia<Integer, Coppia<Integer, Integer>> {

    public Data(Integer giorno, Integer mese, Integer anno) {
        super(giorno, new Coppia<>(mese, anno));
    }

    public int getGiorno() {
        return getPrimo();
    }

    public int getMese() {
        return getSecondo().getPrimo();
    }

    public int getAnno() {
        return getSecondo().getSecondo();
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", getGiorno(), getMese(), getAnno());
    }
}

