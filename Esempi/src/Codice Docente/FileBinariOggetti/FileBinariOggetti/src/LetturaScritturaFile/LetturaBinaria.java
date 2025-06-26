/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LetturaScritturaFile;

import persona.Persona;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LetturaBinaria {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Files/Persone.bin"))) {
            Persona[] elenco = (Persona[]) in.readObject();

            for (Persona p : elenco) {
                System.out.println(p);
                System.out.println(p.getClass().getName() + "\n");
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
