/**
 *
 * @author Domenico
 */
public class Veicolo {
    
    String marca;
    boolean motore;
    
    public Veicolo(String s, boolean m){marca=s; motore=m;}
    public Veicolo(){this("***", false);}

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return marca+' '+motore;
    }

   
    
    
    
    
}
