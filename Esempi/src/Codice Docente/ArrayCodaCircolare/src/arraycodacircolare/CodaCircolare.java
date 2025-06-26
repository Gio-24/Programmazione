package arraycodacircolare;

/*
 * Domenico
 * 
 * Questa classe simula una coda circolare per la gestione di richieste di servizio.
 * Gli elementi vengono gestiti in modalità FIFO (First-In First-Out): le richieste 
 * inserite per prime sono anche le prime a essere rimosse.
 * La struttura è utile per scenari come code di attesa, helpdesk, gestione turni o eventi.
 */

public class CodaCircolare {

    private int testa; // Indice della testa della coda (prossimo elemento da estrarre)
    private int coda;  // Indice della coda della coda (prossima posizione libera per inserimento)
    private int nelem; // Numero di elementi attualmente nella coda
    private int max;   // Capacità massima della coda
    private RichiestaServizio[] C; // Array circolare che memorizza le richieste

    // Costruttore: inizializza la coda con dimensione fissata
    public CodaCircolare(int dim) {
        max = dim;
        nelem = 0;
        testa = coda = 0;
        C = new RichiestaServizio[max];
    }

    // Inserisce una nuova richiesta in coda (append in posizione coda)
    public void append(RichiestaServizio r) {
        C[coda] = r;
        coda = (coda + 1) % max; // avanza in modo circolare
        nelem++;
    }

    // Estrae la richiesta più vecchia dalla testa della coda
    public RichiestaServizio pop() {
        RichiestaServizio r = C[testa];
        testa = (testa + 1) % max; // avanza in modo circolare
        nelem--;
        return r;
    }

    // Verifica se la coda è vuota
    public boolean isEmpty() {
        return nelem == 0;
    }

    // Verifica se la coda ha raggiunto la capacità massima
    public boolean isFull() {
        return nelem == max;
    }

    // Stampa a video tutte le richieste attualmente presenti in coda (in ordine FIFO)
    public void printCoda() {
        for (int i = 0; i < nelem; i++) {
            System.out.println(C[(testa + i) % max]);
        }
    }

    // Verifica se una specifica richiesta di servizio è presente nella coda.
    // Utilizza il metodo equals della classe RichiestaServizio per confrontare gli oggetti.
    
    public boolean inList(RichiestaServizio richiesta) {
        boolean trovato = false;
        int i = 0;
        while (i < nelem && !trovato) {
            if (C[(testa + i) % max].equals(richiesta)) {
                trovato = true;
            }
            i++;
        }
        return trovato;
    }
}


