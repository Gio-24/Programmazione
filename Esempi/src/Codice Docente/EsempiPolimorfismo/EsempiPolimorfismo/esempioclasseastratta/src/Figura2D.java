/**
 *
 * @author domenico
 */
public abstract class Figura2D extends Figura {
    public Figura2D() {
        super();
    }
    public abstract double area();
    public abstract double perimetro();
    
    @Override
    public abstract void disegna();  

}
