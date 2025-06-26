/**
 *
 * @author domenico
 */
public class Quadrato extends Figura {
    
    private double lato;
    
    public Quadrato(double l) {lato=l;}
    @Override
    public double perimetro() {return lato*4;}
    @Override
    public double area() {return lato*lato;}
    @Override
    public void draw()  {System.out.println("quadrato");}
}
