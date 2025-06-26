/**
 *
 * @author domenico
 */
public class Mappa extends Documento implements Drawable {
    
    private int scala;

    public Mappa(int scala, String nomefile, String contenuto) {
        super(nomefile, contenuto);
        this.scala = scala;
    }

    public int getScala() {
        return scala;
    }

    public void setScala(int scala) {
        this.scala = scala;
    }
    
    
    @Override
    public void draw(){System.out.println("disegno la mappa");}
    
}
