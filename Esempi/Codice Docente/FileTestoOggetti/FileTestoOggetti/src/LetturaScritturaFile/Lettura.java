/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LetturaScritturaFile;

import impiegato.Impiegato;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import persona.Persona;

/**
 *
 * @author domenico
 */
public class Lettura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(Paths.get("Files/Persone.txt"));
            int numElementi = input.nextInt();
            Persona Elenco[] = new Persona[numElementi];
            
            System.out.println(numElementi);
            for(int i=0; i<numElementi; i++) {
                String className;
                className=input.next();
                if(className.equals("persona.Persona")){
                    Elenco[i]= new Persona(input.next(), input.next(), input.nextInt());
                } else {
                    Elenco[i] = new Impiegato(input.next(), input.next(), input.nextInt(), input.next(), input.nextInt());
                }
            }
            stampa_oggetti(Elenco, numElementi);
            input.close();
            
        } catch (IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
    }
    
    public static void stampa_oggetti(Persona [] elenco,int n){
         for(int number=0; number<n; number++){
             System.out.println(elenco[number].toString());
          }
    }
    
}
