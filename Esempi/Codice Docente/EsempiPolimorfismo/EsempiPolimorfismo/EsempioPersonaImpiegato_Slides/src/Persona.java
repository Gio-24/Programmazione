/**
 *
 * @author domenico
 */
public class Persona {
    private String nome;
    private String cognome;
    private int eta;
    
    public Persona() {nome="***"; cognome="***"; eta=0;}
    public Persona(String n, String c, int e) {nome=n; cognome=c; eta=e;}
    public void set_nome(String n) {nome=n;}
    public void set_cognome(String c) {cognome=c;}
    public void set_eta(int e) {eta=e;}
    public String get_nome() {return nome;}
    public String get_cognome() {return cognome;}
    public int get_eta() {return eta;}
    
    @Override
    public String toString(){return nome + ' ' + cognome + ' ' + eta;}

}
