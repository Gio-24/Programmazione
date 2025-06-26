/**
 *
 * @author domenico
 */
public class EsempioAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1=4;
        int n2=2;
        //Figura F = new Figura(); ERRORE!!!
        //Figura2D D1 = new Figura2D(); ERRORE!!!
        //Figura3D D2 = new Figura3D(); ERRORE!!!
        Figura figure[] = new Figura[n1]; //OK
        Figura2D figure2d[] = new Figura2D[n2];
        Figura3D figure3d[] = new Figura3D[n2];
        
        Quadrato Q1 = new Quadrato(4.0);
        Quadrato Q2 = new Quadrato(4.0);
        Sfera S1 = new Sfera(2.5);
        Sfera S2 = new Sfera(5.7);
        figure[0] = Q1;
        figure[1] = S1;
        figure[2] = Q2;
        figure[3] = S2;
        
        figure2d[0] = Q1;
        figure2d[1] = Q2;
        
        figure3d[0] = S1;
        figure3d[1] = S2;
    
        for(int i=0; i<n1; i++)
           figure[i].disegna();
        for(int i=0; i<n2; i++)
           System.out.println(figure2d[i].perimetro());
        for(int i=0; i<n2; i++)
           System.out.println(figure3d[i].volume());        
    }
}
