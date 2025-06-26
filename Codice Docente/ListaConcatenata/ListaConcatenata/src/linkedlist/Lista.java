package linkedlist;

public class Lista {

    class Nodo {
        private Persona data;  //informazione
        private Nodo next;     //riferimento al prossimo nodo nella lista

        Nodo(Persona elem) {
            data = elem;
            next = null;
        }
    }

    Nodo testa;

    Lista() {
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
        if (empty()) push(e);
        else {
            Nodo temp = testa;
            Nodo q = new Nodo(e);
            while (temp.next != null) temp = temp.next;
            temp.next = q;
        }
    }

    //precondizione: la lista è ordinata in senso crescente
    public void inserisci(Persona e) {
        if (empty() || testa.data.compareTo(e) >= 0) push(e);
        else {
            Nodo temp = testa;
            Nodo q = new Nodo(e);
            while (temp.next != null && temp.next.data.compareTo(e) < 0)
                temp = temp.next;
            q.next = temp.next;
            temp.next = q;
        }
    }

    // precondizione: la posizione è >= 0
    /*
     * Comportamento:
     * Se pos <= 0 o la lista è vuota, l’elemento viene inserito in testa.
     * Se pos è maggiore della lunghezza della lista, l’elemento viene inserito in coda.
     * Altrimenti, l’elemento viene inserito dopo il nodo in posizione pos - 1.
     */
    public void inserisciInPosizione(Persona e, int pos) {
        if (pos <= 0 || empty()) {
            push(e);  // Inserimento in testa se posizione <= 0 o lista vuota
        } else {
            Nodo temp = testa;
            int i = 0;
            while (temp.next != null && i < pos - 1) {
                temp = temp.next;
                i++;
            }
            Nodo q = new Nodo(e);
            q.next = temp.next;
            temp.next = q;
        }
    }

    //precondizione: la lista non è vuota
    public Persona pop() {
        Persona e = testa.data;
        testa = testa.next;
        return e;
    }

    //precondizione: la lista non è vuota
    public Persona top() {
        Persona e = testa.data;
        return e;
    }

    //precondizione: la lista non è vuota
    public Persona pop_back() {
        if (testa.next == null) return pop();
        else {
            Nodo temp = testa;
            while (temp.next.next != null) temp = temp.next;
            Persona e = temp.next.data;
            temp.next = null;
            return e;
        }
    }

    //precondizione: la lista non è vuota
    public Persona top_back() {
        if (testa.next == null) return top();
        else {
            Nodo temp = testa;
            while (temp.next.next != null) temp = temp.next;
            Persona e = temp.next.data;
            return e;
        }
    }

    //precondizione: la lista non è vuota l'elemento è presente e viene eliminata
    // la sua prima occorrenza
    public void elimina(Persona e) {
        if (testa.data.equals(e)) {
            testa = testa.next;
        } else {
            Nodo temp = testa;
            while (!temp.next.data.equals(e)) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public boolean inLista(Persona e) {
        boolean trovato = false;
        Nodo temp = testa;
        while (temp != null && !trovato)
            if (temp.data.equals(e))
                trovato = true;
            else temp = temp.next;
        return trovato;
    }

    //precondizione: la lista è ordinata in senso crescente
    public boolean inListaOrdinata(Persona e) {
        boolean trovato = false;
        Nodo temp = testa;
        while (temp != null && !trovato && temp.data.compareTo(e) <= 0) {
            if (temp.data.equals(e))
                trovato = true;
            else
                temp = temp.next;
        }
        return trovato;
    }

    public boolean isOrdered() {
        boolean ordinato = true;
        Nodo temp = testa;

        if (temp == null) return true;

        if (temp.next == null) return true;

        if (temp.next.next == null) {
            return temp.data.compareTo(temp.next.data) <= 0;
        }

        while (ordinato && temp.next != null) {
            if (temp.data.compareTo(temp.next.data) > 0) {
                ordinato = false;
            } else {
                temp = temp.next;
            }
        }
        return ordinato;
    }

    //precondizione: la lista non è vuota
    public void stampa() {
        Nodo temp = testa;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
