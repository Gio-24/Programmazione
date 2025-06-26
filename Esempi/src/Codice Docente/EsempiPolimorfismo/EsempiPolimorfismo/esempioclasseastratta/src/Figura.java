/**
 *
 * @author domenico
 */
public abstract class Figura {
    private String colore_forma;
    private String colore_contorno;
    
    public Figura() {
        colore_forma = "nessuno";
        colore_contorno = "nessuno";
    }

    public void set_coloref(String cf){colore_forma=cf; }
    public void set_colorec(String cc){colore_contorno=cc; }
    public String get_coloref(){return colore_forma;}
    public String get_colorec(){return colore_contorno;}
    public abstract void disegna();
}
