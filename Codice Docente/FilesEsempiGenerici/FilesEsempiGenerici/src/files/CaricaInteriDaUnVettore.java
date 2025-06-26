package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author domenico
 */
public class CaricaInteriDaUnVettore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //lettura da file di un vettore di interi
    //il programma si aspetta di leggere in prima posizione
    //quanti interi dovrà leggere
    int v[]=new int[10];
    int i;
    FileReader f;
    BufferedReader b;
    String s;
    try {
        f=new FileReader("origine_destinazione/numeri.txt");
        b=new BufferedReader(f);
        s=b.readLine();
        int n=Integer.parseInt(s);
        // lettura array da file
        for(i=0; i<n; i++) {
          s=b.readLine();
          v[i]=Integer.parseInt(s);
        }
        System.out.println("Il vettore caricato da file è:");
        for(i=0; i<n;i++){
            System.out.println(v[i]);
        }
        f.close();       
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
