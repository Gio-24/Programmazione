public class Cerchio 
{
   private double x; //coordinata x del cerchio
   private double y; //coordinata x del cerchio
   private double raggio; //raggio del cerchio

   //costruttore
   public Cerchio(double val)
   {
        this.x = 0;
        this.y = 0;
        this.raggio = val;
   }

   //metodi setter
   public void set_x(double val) {this.x = val;}
   public void set_y(double val) {this.y = val;}
   public void set_raggio(double val) {this.raggio = val;}

   //metodi getter
   public double get_x() {return this.x;}
   public double get_y() {return this.y;}
   public double get_raggio() {return this.raggio;}

   //metodi
   public double area()
   {
        return Math.PI*this.raggio*this.raggio; //in alternativa si può usare il metodo pow della classe Math
   }

   public double perimetro()
   {
        return 2*Math.PI*this.raggio;
   }
}
