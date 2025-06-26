package esempiocollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
/**
 *
 * @author domenico
 */
public class TestCollection {
    public static void main(String[] args) {
        // Creazione di un ArrayList di Persona
        ArrayList<Persona> elencoTelefonico = new ArrayList<>();
        elencoTelefonico.add(new Persona(35, "Rossi", "Fabio"));
        elencoTelefonico.add(new Persona(20, "Verde", "Nunzio"));
        elencoTelefonico.add(new Persona(33, "Annunziata", "Mario"));
        elencoTelefonico.add(new Persona(33, "Esposito", "Gennaro"));
        
        // Test: verifica se l'ArrayList contiene una persona specifica
        Persona p = new Persona(20, "Verde", "Nunzio");
        System.out.println("Elenco telefonico contiene Nunzio Verde: " + elencoTelefonico.contains(p));
        
        // Creazione di un LinkedList di Persona
        LinkedList<Persona> eT = new LinkedList<>();
        eT.add(new Persona(28, "Di Biase", "Alessandro"));
        eT.add(new Persona(22, "Mancini", "Giulia"));
        eT.add(new Persona(40, "Lombardi", "Luigi"));
        
        // Test: stampa i contenuti della LinkedList
        System.out.println("\nElenco in LinkedList:");
        for (Persona persona : eT) {
            System.out.println(persona);
        }

        // Uso di Iterator per l'ArrayList
        System.out.println("\nIterando sull'ArrayList usando Iterator:");
        Iterator<Persona> iterator = elencoTelefonico.iterator();
        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            System.out.println(persona);
        }

        // Uso di Iterator per la LinkedList
        System.out.println("\nIterando sulla LinkedList usando Iterator:");
        Iterator<Persona> iteratorLinkedList = eT.iterator();
        while (iteratorLinkedList.hasNext()) {
            Persona persona = iteratorLinkedList.next();
            System.out.println(persona);
        }

        // Rimuovere un elemento usando l'Iterator (sui LinkedList)
        iteratorLinkedList = eT.iterator();
        while (iteratorLinkedList.hasNext()) {
            Persona persona = iteratorLinkedList.next();
            if (persona.getNome().equals("Giulia")) {
                iteratorLinkedList.remove();  // Rimuove Giulia
            }
        }

        // Verifica rimozione dalla LinkedList
        System.out.println("\nElenco dopo rimozione di Giulia:");
        for (Persona persona : eT) {
            System.out.println(persona);
        }
    } 
}
