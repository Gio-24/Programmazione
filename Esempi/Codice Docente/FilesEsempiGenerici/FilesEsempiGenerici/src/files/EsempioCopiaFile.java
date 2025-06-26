package files;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author domenico
 */
public class EsempioCopiaFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileReader filein = new FileReader("origine_destinazione/dati.txt");
            FileWriter fileout = new FileWriter("origine_destinazione/copia.txt");
            
            int next = filein.read();
            while (next != -1) {
                fileout.write(next);
                next = filein.read();
            }
            filein.close();
            fileout.close();       
        } catch (IOException e) {
            System.out.println("Errore durante I/O: " + e.getMessage());
        }
        System.out.println();
        System.out.println("Copia Effettuata!");
    }
}
