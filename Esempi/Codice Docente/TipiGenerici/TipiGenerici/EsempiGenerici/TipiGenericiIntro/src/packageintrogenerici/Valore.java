package packageintrogenerici;

/**
 *
 * @author domenico
 */
public class Valore <T> {
    private final T val;
    public Valore(T val) {this.val=val;}
    public T get() {return val;}
    @Override
    public String toString() { return ""+val;}
    public String getType() {return val.getClass().getName();
    }
}

