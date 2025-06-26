/**
 *
 * @author domenico
 */
public class MainInterfacce {

    public static void main(String[] args) {
        // Figura F = new Figura(); errore! Non si possono istanziare le interfacce
        Figura F[] = new Figura[4];
        Quadrato Q=new Quadrato(5);
        Punto P=new Punto(0.0,0.0);
        Cerchio C= new Cerchio(0.2,0.5,1.0);
        Cilindro Cil = new Cilindro(0.2,0.5,1.0,3.0);
        F[0]=Q;
        F[1]=P;
        F[2]=C;
        F[3]=Cil;
        
        for(Figura f: F) {
           f.draw();
           System.out.printf("perimentro: %f, area: %f, volume: %f \n", f.perimetro(), f.area(), f.volume());
        
        }
        
        //******************************
        
        Mappa sentiero = new Mappa(500, "Sentiero degli dei", "Immagine");
        
        sentiero.draw();
        System.out.println("Scala 1:" + sentiero.getScala());
        
    }
    
}
