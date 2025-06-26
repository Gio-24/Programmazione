package packageintrowildcard;

public class Coppia <T> {
    private T a, b;
    public Coppia (T a, T b) {
        this.a = a;
        this.b = b;
    }
    
    public T getPrimo() {return a;}
    public T getSecondo() {return b;}

    public void setPrimo(T nuovo) { this.a = nuovo; }
    public void setSecondo(T nuovo) { this.b = nuovo; }
    
}
