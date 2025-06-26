package arraypila;

public class TestPila {
    public static void main(String[] args) {
        Pila pila = new Pila(4);  // pila di capacità 4

        // Inserimento diretto
        pila.push(new PaginaWeb("https://www.google.com", "Google"));
        pila.push(new PaginaWeb("https://www.unina.it", "Federico II"));

        // Creazione esterna e inserimento
        PaginaWeb paginaExtra = new PaginaWeb("https://www.tuttonapoli.net/", "TuttoNapoli");
        pila.push(paginaExtra);

        // Inserimento aggiuntivo
        pila.push(new PaginaWeb("https://sscnapoli.it/", "SSC Napoli"));

        // Prova a inserire oltre il limite
        if (pila.isFull()) {
            System.out.println("Pila piena. Impossibile aggiungere altre pagine.");
        }

        // Visualizza la pagina in cima
        System.out.println("\nTop: " + pila.top());

        // Rimuove una pagina (simula 'indietro' nel browser)
        PaginaWeb rimossa = pila.pop();
        System.out.println("Pop: " + rimossa);

        // Aggiunge una nuova pagina dopo il pop
        pila.push(new PaginaWeb("https://stackoverflow.com", "StackOverflow"));

        // Verifica presenza nella pila
        PaginaWeb daCercare = new PaginaWeb("https://www.tuttonapoli.net/", "TuttoNapoli");
        boolean presente = pila.inList(daCercare);
        System.out.println("\nLa pagina \"" + daCercare + "\" è presente nella pila? " + presente);

        PaginaWeb nonPresente = new PaginaWeb("https://nonesiste.com", "Non Esiste");
        boolean assente = pila.inList(nonPresente);
        System.out.println("La pagina \"" + nonPresente + "\" è presente nella pila? " + assente);

        // Stampa cronologia residua
        System.out.println("\nCronologia di navigazione residua:");
        pila.printPila();
    }
}
