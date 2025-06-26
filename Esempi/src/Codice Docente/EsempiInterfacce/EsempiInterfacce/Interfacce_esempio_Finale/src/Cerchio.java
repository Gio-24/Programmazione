
public class Cerchio  extends Punto {  //in quest'ordine
    protected double raggio;

    public Cerchio(double x, double y, double r) {super(x, y); raggio=r;}
    public void setRaggio(double raggio) {this.raggio = raggio;}

    public double getRaggio() {return raggio;}
    @Override
    public double perimetro() {return 2*Math.PI*raggio;}
    @Override
    public double area() {return Math.PI*raggio*raggio;}
    @Override
    public void draw() {System.out.println("cerchio");}
}
