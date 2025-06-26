/**
 *
 * @author domenico
 */
public class Punto extends Figura{
    
       private double X;
       private double Y;
       
       public Punto(double x, double y)  {X=x;Y=y;}
       public double getX() {return X;}
       public double getY() {return Y;}
       public void setX(double X) {this.X = X;}
       public void setY(double Y) {this.Y = Y;}
       
       @Override
       public void draw()  {System.out.println("punto");}
       
}
