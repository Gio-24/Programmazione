/**
 * Questo programma legge un file di testo riga per riga utilizzando la classe Scanner.
 * 
 * In particolare:
 * - Il file "dati.txt" viene aperto e letto, assumendo che si trovi nella cartella "origine_destinazione".
 * - Per ogni riga letta, il programma stampa il contenuto preceduto dalla stringa "Input: ".
 * - Se il file non viene trovato, viene stampato un messaggio di errore sulla console.
 *
 * L'uso del costrutto try-with-resources garantisce la chiusura automatica dello Scanner
 * e quindi del file, evitando possibili problemi di gestione delle risorse.
 */

package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeggiConScanner {
    public static void main(String[] args) {
        String nomeFile = "origine_destinazione/dati.txt";
        try (Scanner scanner = new Scanner(new File(nomeFile))) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println("Input: " + linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File non trovato: " + e.getMessage());
        }
    }
}
