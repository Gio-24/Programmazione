package linkedlist;

public class TestLista {

    public static void main(String[] args) {
        // Creazione lista
        Lista lista = new Lista();

        // Creazione persone
        Persona p1 = new Persona("Anna", 30);
        Persona p2 = new Persona("Luca", 25);
        Persona p3 = new Persona("Marco", 40);
        Persona p4 = new Persona("Giulia", 28);
        Persona p5 = new Persona("Anna", 30); // uguale a p1 (per test equals)

        // Inserimento ordinato
        lista.inserisci(p1);
        lista.inserisci(p2);
        lista.inserisci(p3);
        lista.inserisci(p4);

        System.out.println("Contenuto della lista (ordinata per età):");
        lista.stampa();

        // Test inLista su lista ordinata
        System.out.println("\nVerifica presenza (inListaOrdinata) di " + p5 + ":");
        System.out.println(lista.inListaOrdinata(p5)); // dovrebbe essere true

        // Test elimina
        System.out.println("\nEliminazione di " + p1);
        lista.elimina(p1);

        System.out.println("Contenuto della lista dopo eliminazione:");
        lista.stampa();

        // Test inserimento in posizione
        Persona p6 = new Persona("Enrico", 35);
        lista.inserisciInPosizione(p6, 1);  // inserisce dopo il primo nodo

        System.out.println("\nContenuto della lista dopo inserimento in posizione 1:");
        lista.stampa();

        // Test pop_back
        Persona rimossa = lista.pop_back();
        System.out.println("\nElemento rimosso da fondo lista: " + rimossa);
        System.out.println("Contenuto della lista finale:");
        lista.stampa();
    }
}

