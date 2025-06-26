package packagestensionegenerici;

public class Coppia<T, U> {
    private T primo;
    private U secondo;

    public Coppia(T primo, U secondo) {
        this.primo = primo;
        this.secondo = secondo;
    }
    public T getPrimo() {
        return primo;
    }
    public U getSecondo() {
        return secondo;
    }
    @Override
    public String toString() {
        return "(" + primo + ", " + secondo + ")";
    }
}

