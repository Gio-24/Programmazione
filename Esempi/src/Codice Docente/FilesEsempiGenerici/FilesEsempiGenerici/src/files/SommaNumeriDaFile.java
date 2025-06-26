
/**
 * Questo programma legge una sequenza di numeri interi da un file di testo chiamato "numeri.txt",
 * situato nella cartella "origine_destinazione", e calcola la somma totale.
 *
 * Il file può contenere numeri separati da spazi, tabulazioni o andare a capo dopo ciascun numero.
 * Il programma utilizza la classe Scanner per leggere i numeri e sommarli uno alla volta.
 *
 * Se il file non viene trovato, viene stampato un messaggio di errore sulla console.
 * L'uso del costrutto try-with-resources garantisce la chiusura automatica del file.
 */

 package files;
 
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;
 
 public class SommaNumeriDaFile {
     public static void main(String[] args) {
         String nomeFile = "origine_destinazione/numeri.txt";
         int somma = 0;
 
         try (Scanner scanner = new Scanner(new File(nomeFile))) {
             // Legge i numeri interi uno alla volta finché ce ne sono
             while (scanner.hasNextInt()) {
                 int numero = scanner.nextInt();
                 somma += numero;
             }
             System.out.println("La somma dei numeri nel file è: " + somma);
         } catch (FileNotFoundException e) {
             System.err.println("File non trovato: " + e.getMessage());
         }
     }
 }
 
