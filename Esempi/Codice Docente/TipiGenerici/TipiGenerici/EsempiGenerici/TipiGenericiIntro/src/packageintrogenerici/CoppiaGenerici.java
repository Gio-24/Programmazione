package packageintrogenerici;

/**
 *
 * @author domenico
 * @param <T>
 * @param <S>
 */
public class CoppiaGenerici <T, S> {
    
    private final T a;
    private final S b;
    
    public CoppiaGenerici (T a, S b) {
        this.a = a;
        this.b = b;
    }
    
    public T getPrimo() {return a;}
    public S getSecondo() {return b;}
    
}
