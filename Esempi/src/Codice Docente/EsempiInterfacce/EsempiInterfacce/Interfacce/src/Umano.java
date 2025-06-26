/**
 *
 * @author domenico
 */
public interface Umano extends Personaggio {
    //sono di default static final 
    //da inizializzare
    public int DANNO_BASE_UMANO=5;
    public int MOVIMENTO_BASE_UMANO=15;
   
    public abstract void parla();
}
