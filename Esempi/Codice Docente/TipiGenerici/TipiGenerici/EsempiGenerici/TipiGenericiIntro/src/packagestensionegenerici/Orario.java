package packagestensionegenerici;

public class Orario extends Coppia<Integer, Integer> {
    public Orario(Integer ore, Integer minuti) {
        super(ore, minuti);
    }

    public int getOre() {
        return getPrimo();
    }

    public int getMinuti() {
        return getSecondo();
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", getOre(), getMinuti());
    }
}
