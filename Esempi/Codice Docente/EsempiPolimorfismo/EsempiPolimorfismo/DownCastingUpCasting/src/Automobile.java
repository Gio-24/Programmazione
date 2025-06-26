/**
 *
 * @author Domenico
 */
public class Automobile extends Veicolo {
    
       String modello;
       int numporte;

    public Automobile(String modello, int numporte, String s, boolean m) {
        super(s,m);
        this.modello = modello;
        this.numporte = numporte;
    }

    public Automobile() {
        this("***",0,"***",false);
    }

    @Override
    public String toString() {
        return super.toString() + ' ' + modello + ' '+ numporte;
    }
       
       
    
}
