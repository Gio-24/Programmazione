/**
 * Questo programma reindirizza temporaneamente l'input standard (System.in)
 * da tastiera a un file di testo specificato. In questo modo, consente di simulare
 * l'inserimento da tastiera leggendo i dati da un file.
 * 
 * Il contenuto del file viene letto riga per riga tramite un BufferedReader
 * e stampato su console con un prefisso "Input: ".
 * 
 * Al termine della lettura, l'input standard viene ripristinato alla console
 * e tutte le risorse vengono chiuse correttamente.
 *
 * Questo approccio è utile, ad esempio, per testare applicazioni che leggono
 * da System.in senza dover intervenire sulla logica del programma principale.
 */

package files;
import java.io.*;
public class Redirezione_in {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String nomeFile = "origine_destinazione/dati.txt";
        InputStream inputStream = new FileInputStream(nomeFile);
        
        // Salva l'attuale System.in in modo da poterlo ripristinare successivamente
        InputStream consoleStream = System.in;

        System.setIn(inputStream); // Imposta il nuovo InputStream come input standard

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String linea;
        while ((linea = reader.readLine()) != null) {
            System.out.println("Input: " + linea);
        }
        // Ripristiniamo l'output di System.in sulla console
        System.setIn(consoleStream);

        reader.close();
        inputStream.close(); // Chiude l'InputStream quando non serve più
    } 
}
