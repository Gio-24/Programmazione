package impiegato;

/**
 *
 * @author domenico
 */

import persona.Persona;

public class Impiegato extends Persona {
    private String azienda;
    private int anzianita;
    
    public Impiegato() { super();
      azienda="***"; anzianita=0;}
    public Impiegato(String n, String c, int e, String a, int an) 
    { super(n,c,e);
      azienda=a; anzianita=an;}
    public void set_anzianita(int a) {anzianita=a;}
    public void set_azienda(String a) {azienda=a;}
    public String get_azienda() {return azienda;}
    public int get_anzianita() {return anzianita;}
    @Override
    public String toString(){return super.toString() + ' ' + azienda + ' ' + anzianita;}
    
}
