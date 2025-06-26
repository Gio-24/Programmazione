/**
 *
 * @author domenico
 */
public interface Animale extends Personaggio{
    //sono di default static final 
    //da inizializzare
    public int DANNO_BASE_ANIMALE=10;
    public int MOVIMENTO_BASE_ANIMALE=5;
    
    public abstract void verso();
    
    public default double corri(){
        return 100*MOVIMENTO_BASE_ANIMALE;
    }
}
