package LetturaScritturaFile;

import impiegato.Impiegato;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import persona.Persona;

/**
 *
 * @author domenico
 */
public class Scrittura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 =new Persona("Mario", "Rossi", 35);
        Impiegato i1 =new Impiegato("luca", "Bianchi", 30, "IBM", 3);
        Persona p2 =new Persona("Anna", "Esposito", 15);
        Impiegato i2 =new Impiegato("John", "Smith", 15, "Harrods", 10);
        
      
        Persona Elenco[] = new Persona[4];
        Elenco[0]=p1;
        Elenco[1]=i1;
        Elenco[2]=p2;
        Elenco[3]=i2;
        
        //salviamo su file
        try{
            PrintStream fileStream = new PrintStream(new FileOutputStream("Files/PersoneScrittura.txt"));
            PrintStream consoleStream = System.out;
            System.setOut(fileStream);
            //Scriviamo i valori garantendo lo stesso formato del file .txt
            //Scriviamo prima di tutto il numero di elementi
            System.out.println(Elenco.length);
            //ora scriviamo sul file in base al tipo di elemento
            for (Persona p : Elenco) {
                System.out.println(p.toString());
            }
            
            // Ripristiniamo l'output di System.out sulla console
            System.out.close();
            System.setOut(consoleStream);
            
            System.out.println("Scrittura completata con successo!");
        } catch (IOException e) {
            
        }
    }
    
}
