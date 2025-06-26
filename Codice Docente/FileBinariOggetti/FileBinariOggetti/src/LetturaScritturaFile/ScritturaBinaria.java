package LetturaScritturaFile;

import impiegato.Impiegato;
import persona.Persona;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ScritturaBinaria {
    public static void main(String[] args) {
        Persona[] elenco = new Persona[4];
        elenco[0] = new Persona("Mario", "Rossi", 35);
        elenco[1] = new Impiegato("Luca", "Bianchi", 30, "IBM", 3);
        elenco[2] = new Persona("Anna", "Esposito", 15);
        elenco[3] = new Impiegato("John", "Smith", 15, "Harrods", 10);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Files/Persone.bin"))) {
            out.writeObject(elenco);
            System.out.println("Scrittura binaria completata con successo!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
