/**
 * Author: Domenico
 * 
 * Questa classe simula una pila (stack) per la gestione della cronologia di navigazione web.
 * Ogni elemento della pila è un oggetto di tipo PaginaWeb, che rappresenta una pagina visitata.
 * 
 * Le operazioni disponibili sono:
 * - push: aggiunge una nuova pagina alla cronologia (navigazione in avanti);
 * - pop: rimuove l'ultima pagina visitata (funzionalità "indietro");
 * - top: restituisce la pagina attualmente visualizzata;
 * - isEmpty/isFull: verificano lo stato della pila;
 * - printPila: stampa la cronologia dalla più recente alla meno recente;
 * - inList: verifica se una determinata pagina è presente nella pila (utile ad esempio per controllare
 *   se una pagina è già stata visitata).
 * 
 * La pila è implementata tramite un array a dimensione fissa.
 */

package arraypila;

public class Pila {
    private int testa;
    private int max;
    private PaginaWeb[] P;

    public Pila(int dim) {
        max = dim;
        testa = 0;
        P = new PaginaWeb[max];
    }

    // Aggiunge un elemento in cima alla pila (simula la visita di una nuova pagina)
    public void push(PaginaWeb e) {
        P[testa] = e;
        testa++;
    }

    // Rimuove e restituisce l'elemento in cima alla pila (simula il tasto "indietro")
    public PaginaWeb pop() {
        testa--;
        PaginaWeb e = P[testa];
        return e;
    }

    // Restituisce l'elemento in cima alla pila (pagina corrente)
    public PaginaWeb top() {
        return P[testa - 1];
    }

    // Verifica se la pila è vuota
    public boolean isEmpty() {
        return testa == 0;
    }

    // Verifica se la pila è piena
    public boolean isFull() {
        return testa == max;
    }

    // Stampa gli elementi della pila dal più recente al meno recente
    // Simula la stampa della cronologia
    public void printPila() {
        for (int i = testa - 1; i >= 0; i--) {
            System.out.println(P[i]);
        }
    }
    
   // Verifica se una determinata pagina è presente nella pila.
   // Il confronto tra le pagine avviene tramite il metodo equals della classe PaginaWeb.
    public boolean inList(PaginaWeb pagina) {
        boolean trovato = false;
        int i = 0;
    
        while (i < testa && !trovato) {
            if (P[i].equals(pagina)) {
                trovato = true;
            } else {
                i++;
            }
        }
    
        return trovato;
    }
    
}

