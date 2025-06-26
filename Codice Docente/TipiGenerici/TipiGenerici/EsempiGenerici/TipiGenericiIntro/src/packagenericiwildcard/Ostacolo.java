package packagenericiwildcard;

/**
 *
 * @author domenico
 * @param <T>
 */
public class Ostacolo<T> {
    private final T tipologia;
    
    public Ostacolo(T t){
            tipologia=t;
    }
    public T getTipoOstacolo() {
            return tipologia;
    }
}