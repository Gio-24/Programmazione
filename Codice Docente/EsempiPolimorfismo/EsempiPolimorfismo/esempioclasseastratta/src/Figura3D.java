/**
 *
 * @author domenico
 */
public abstract class Figura3D extends Figura {
    public Figura3D() {
        super();
    }
    public abstract double superficie();
    public abstract double volume();
    
    @Override
    public abstract void disegna();  

}
