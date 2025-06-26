/**
 *
 * @author domenico
 */

public class Quadrato extends Figura2D{
    private double lato;
    public Quadrato(double l) {
        super(); 
        lato=l;
    }
    @Override
    public double area() {
        return lato*lato;
    }
    @Override
    public double perimetro() {
        return lato*4;
    }
    @Override
    public void disegna() {
        System.out.println("disegno un quadrato");
    }    
}
