

/**
 *
 * @author domenico
 */
public class Cilindro extends Cerchio {
    
    private double altezza;
    
    public Cilindro(double altezza, double x, double y, double r) {
        super(x, y, r);
        this.altezza = altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getAltezza() {
        return altezza;
    }
    
    //area totale: area laterale + area basi
    @Override
    public double area() {return 2*Math.PI*raggio*altezza + 2*super.area();}
    @Override
    public double volume() {return Math.PI*raggio*raggio*altezza;}
    @Override
    public void draw()  {System.out.println("cilindro");}
    

}
