package linkedlist;

public class ListaRicorsiva {

    class Nodo {
        private Persona data;  //informazione
        private Nodo next;     //riferimento al prossimo nodo nella lista

        Nodo(Persona elem) {
            data = elem;
            next = null;
        }
    }

    Nodo testa;

    public ListaRicorsiva() {
        testa = null;
    }

    //predicati
    public boolean empty() {
        return testa == null;
    }

    public boolean full() {
        return false;
    }

    //precondizione: la lista non è piena
    //inserimento in testa
    public void push(Persona e) {
        Nodo q = new Nodo(e);
        q.next = testa;
        testa = q;
    }

    //precondizione: la lista non è piena
    //inserimento in coda
    public void append(Persona e) {
        testa = append(testa, e);
    }

    private Nodo append(Nodo n, Persona e) {
        if (n == null)
            return new Nodo(e);
        n.next = append(n.next, e);
        return n;
    }

    //precondizione: la lista è ordinata in senso crescente
    public void inserisci(Persona e) {
        testa = inserisci(testa, e);
    }

    private Nodo inserisci(Nodo n, Persona e) {
        if (n == null || n.data.compareTo(e) >= 0) {
            Nodo nuovo = new Nodo(e);
            nuovo.next = n;
            return nuovo;
        }
        n.next = inserisci(n.next, e);
        return n;
    }

    // precondizione: la posizione è >= 0
    /*
     * Comportamento:
     * Se pos <= 0 o la lista è vuota, l’elemento viene inserito in testa.
     * Se pos è maggiore della lunghezza della lista, l’elemento viene inserito in coda.
     * Altrimenti, l’elemento viene inserito dopo il nodo in posizione pos - 1.
     */
    public void inserisciInPosizione(Persona e, int pos) {
        testa = inserisciInPosizione(testa, e, pos);
    }

    private Nodo inserisciInPosizione(Nodo n, Persona e, int pos) {
        if (pos <= 0 || n == null) {
            Nodo nuovo = new Nodo(e);
            nuovo.next = n;
            return nuovo;
        }
        n.next = inserisciInPosizione(n.next, e, pos - 1);
        return n;
    }

    //precondizione: la lista non è vuota
    public Persona pop() {
        Persona e = testa.data;
        testa = testa.next;
        return e;
    }

    //precondizione: la lista non è vuota
    public Persona top() {
        return testa.data;
    }

    //precondizione: la lista non è vuota
    public Persona pop_back() {
        if (testa.next == null) return pop();
        return popBack(testa);
    }

    private Persona popBack(Nodo n) {
        if (n.next.next == null) {
            Persona e = n.next.data;
            n.next = null;
            return e;
        }
        return popBack(n.next);
    }

    //precondizione: la lista non è vuota
    public Persona top_back() {
        if (testa.next == null) return top();
        return topBack(testa);
    }

    private Persona topBack(Nodo n) {
        if (n.next.next == null)
            return n.next.data;
        return topBack(n.next);
    }

    //precondizione: la lista non è vuota l'elemento è presente e viene eliminata
    // la sua prima occorrenza
    public void elimina(Persona e) {
        testa = elimina(testa, e);
    }

    private Nodo elimina(Nodo n, Persona e) {
        if (n == null) return null;
        if (n.data.equals(e)) return n.next;
        n.next = elimina(n.next, e);
        return n;
    }

    public boolean inLista(Persona e) {
        return inLista(testa, e);
    }

    private boolean inLista(Nodo n, Persona e) {
        if (n == null) return false;
        if (n.data.equals(e)) return true;
        return inLista(n.next, e);
    }

    //precondizione: la lista è ordinata in senso crescente
    public boolean inListaOrdinata(Persona e) {
        return inListaOrdinata(testa, e);
    }

    private boolean inListaOrdinata(Nodo n, Persona e) {
        if (n == null || n.data.compareTo(e) > 0) return false;
        if (n.data.equals(e)) return true;
        return inListaOrdinata(n.next, e);
    }

    public boolean isOrdered() {
        return isOrdered(testa);
    }

    private boolean isOrdered(Nodo n) {
        if (n == null || n.next == null) return true;
        if (n.data.compareTo(n.next.data) > 0) return false;
        return isOrdered(n.next);
    }

    //precondizione: la lista non è vuota
    public void stampa() {
        stampa(testa);
    }

    private void stampa(Nodo n) {
        if (n != null) {
            System.out.println(n.data);
            stampa(n.next);
        }
    }
}

