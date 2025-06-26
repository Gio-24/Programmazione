/**
 * Questo programma dimostra come reindirizzare temporaneamente l'output standard (System.out)
 * da console a un file di testo. In particolare:
 *
 * - Il programma chiede all'utente di inserire righe di testo da tastiera.
 * - Tutte le righe inserite vengono scritte nel file "output.txt" invece che sulla console.
 * - Il reindirizzamento avviene tramite System.setOut(), che viene impostato su un PrintStream
 *   associato al file.
 * - Al termine dell'inserimento (quando l'utente digita "fine"), l'output standard viene ripristinato
 *   alla console, e viene visualizzato un messaggio di conferma.
 *
 * Questo meccanismo può essere utile per registrare output generato da programmi interattivi,
 * per logging, o per simulazioni e test automatizzati.
 */

package files;

import java.io.*;
import java.util.Scanner;

public class Redirezione_out {
    
    public static void main(String[] args) throws FileNotFoundException {
        String nomeFile = "origine_destinazione/output.txt";

        // Salva lo stream originale di System.out
        PrintStream consoleOutput = System.out;

        // Crea un nuovo PrintStream che scrive su un file
        PrintStream fileOutput = new PrintStream(new FileOutputStream(nomeFile));

        // Redirige System.out verso il file
        System.setOut(fileOutput);

        Scanner scanner = new Scanner(System.in);
        consoleOutput.println("Inserisci delle righe di testo (digita 'fine' per terminare):");

        String linea;
        while (!(linea = scanner.nextLine()).equalsIgnoreCase("fine")) {
            System.out.println(linea);  // Scrive su file
        }

        scanner.close();
        fileOutput.close();

        // Ripristina System.out verso la console
        System.setOut(consoleOutput);
        System.out.println("L'output è stato scritto su " + nomeFile);
    }
}