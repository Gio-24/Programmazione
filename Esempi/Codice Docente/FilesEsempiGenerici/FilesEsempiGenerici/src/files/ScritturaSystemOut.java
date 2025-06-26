
package files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author domenico
 */
public class ScritturaSystemOut {

    public static void main(String[] args) {
        // Definiamo il nome del file
        String fileName = "origine_destinazione/output.txt";
        
        try {
            // Creiamo un nuovo PrintStream per il file
            FileOutputStream f=  new FileOutputStream(fileName);
            PrintStream fileStream = new PrintStream(f);
            
            // Salviamo l'attuale System.out in modo da poterlo ripristinare successivamente
            PrintStream consoleStream = System.out;
            
            // Reindirizziamo l'output di System.out su fileStream
            System.setOut(fileStream);
            
            // Ora tutto ciò che viene stampato su System.out verrà scritto direttamente sul file
            
            // Esempio di scrittura
            System.out.println("Questo è un esempio di scrittura su file utilizzando System.out.");
            
            // Ripristiniamo l'output di System.out sulla console
            System.setOut(consoleStream);
            
            System.out.println("Scrittura completata con successo!");
        } catch (IOException e) {
            // Gestione delle eccezioni in caso di errori di I/O
            System.out.println("Si è verificato un errore durante la scrittura nel file: " + e.getMessage());
        }
    }
    
}
