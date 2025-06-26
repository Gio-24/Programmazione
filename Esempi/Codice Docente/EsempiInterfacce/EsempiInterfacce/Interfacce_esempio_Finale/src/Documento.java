/**
 *
 * @author domenico
 */
public class Documento {
    
    private String nomefile;
    private String contenuto;

    public Documento(String nomefile, String contenuto) {
        this.nomefile = new String(nomefile);
        this.contenuto = new String(contenuto);
    }

    public String getNomefile() {
        return nomefile;
    }

    public String getContenuto() {
        return contenuto;
    }
    
    
    
}
