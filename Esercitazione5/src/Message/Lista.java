package Message;

import java.util.NoSuchElementException;

// gestita con politiche FIFO
public class Lista
{
  class Nodo
  {
    Messaggio data;
    Nodo next;

    Nodo(Messaggio data)
    {
      this.data = data;
      this.next = null;
    }
  }

  Nodo testa;
  
  // metodo che crea una lista vuota
  public Lista()
  {
    this.testa = null;
  }

  // metodo che controlla se la lista è vuota
  public boolean isEmpty()
  {
    return testa == null; // controlla se la testa è vuota
  }

  // metod che aggiunge un elemento in coda
  public void append(Messaggio m)
  {
    Nodo newNodo = new Nodo(m); // crea un nuovo nodo
    Nodo current = testa; // crea un nuovo nodo che punta alla testa
    // scorre la lista fino all'ultimo elemento
    while(current != null)
    {
      current = current.next;
    }
    // uscito dal ciclo current è l'elemento successivo all'ultimo
    current = newNodo;
  }

  // metodo che ritorna il valore in testa alla lista senza rimuoverlo
  public Messaggio peek() throws NoSuchElementException
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      throw new NoSuchElementException("Errore! La lista è vuota.");
    }
    Messaggio tmp = testa.data;
    return tmp;
  }

  public Messaggio pop() throws NoSuchElementException
  {
    if(isEmpty())
    {
      throw new NoSuchElementException("Errore! La lista è vuota.");
    }
    // salva il valore della testa
    Nodo tmp = testa;
    // aggiorna il valore della testa con il suo successivo
    testa = testa.next;
    return tmp.data;
  }

  public void ricercaTesti(String daCercare) 
  {
    Nodo current = testa;
    while(current != null) 
    {
      if
      Messaggio msg = current.data.getMessage().getContenuto();
      if (msg instanceof Testo) 
      {
        Testo testo = (Testo) msg;
        if (testo.getContenuto().contains(daCercare))
        {
          System.out.println(testo.getContenuto());
        }
      }
      current = current.getNext();
    }
}
}
