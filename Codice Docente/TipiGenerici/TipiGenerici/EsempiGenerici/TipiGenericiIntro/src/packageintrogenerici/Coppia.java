package packageintrogenerici;

/**
 *
 * @author domenico
 */
public class Coppia <T> {
    private T a, b;
    public Coppia (T a, T b) {
        this.a = a;
        this.b = b;
    }
    
    public T getPrimo() {return a;}
    public T getSecondo() {return b;}
    
}

