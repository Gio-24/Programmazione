package Parcheggio;
/* coda gestita con politiche FIFO
 * metodi:
 *  - 
 */

import java.io.Serializable;
import java.util.NoSuchElementException;

public class Coda<T> implements Serializable
{
  class Nodo<T> implements Serializable
  {
    private T data; // elemento generico
    private Nodo<T> next; // riferimento all'elemento successivo

    public Nodo(T d)
    {
      this.data = d;
      this.next = null;
    }
  }

  private Nodo<T> head; // riferimento al primo elemento della lista
  private Nodo<T> tail; // riferimento all'ultimo elemento della lista
  private int max = 5; // numero massimo di elementi ammessi nella lista
  private int size; // numero corrente di elementi nella lista

  // crea una lista vuota
  public Coda()
  {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  // ritorna il numero corrente di elementi presenti nella coda
  public int getSize()
  {
    return size;
  }

  // controlla se la lista è vuota
  public boolean isEmpty()
  {
    return size == 0 && head == null;
  }

  // controlla se la lista è piena
  public boolean isFull()
  {
    return size >= max;
  }

  // aggiunge un elemento in coda alla lista
  public void append(T val) throws IllegalStateException // enqueue
  {
    if(isFull()) // controlla se la coda è piena
    {
      throw new IllegalStateException("Errore! La coda d'attesa è piena.");
    }
    // crea un nuovo nodo generico
    Nodo<T> newNodo = new Nodo<>(val); 
    if(isEmpty()) // controlla se la coda è vuota
    {
      head = newNodo; // push
      tail = newNodo; // aggiorna la coda
    }
    else
    {
      tail.next = newNodo; // lo aggiunge come successivo della coda attuale
      tail = newNodo; // aggiorna il valore della coda
    }
    size++; // incrementa la size della coda
  }

  // rimuove l'elemento in testa alla coda
  public T pop()
  {
    if(isEmpty()) // controlla se la coda è vuota
    {
      throw new NoSuchElementException("Errore! La coda è vuota.");
    }
    T tmp = head.data; // salva l'elemento in testa alla lista
    head = head.next; // aggiorna la testa con il suo elemento successivo
    size--; // decrementa la size della lista
    if(isEmpty()) // controlla se la lista si è svuotata dopo il pop
    {
      tail = null; // aggiorna il valore della coda
    }
    return tmp; // ritorna il valore salvato
  }

  // ritorna il valore in testa alla coda senza rimuoverlo dalla lista
  public T peek() throws NoSuchElementException
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      throw new NoSuchElementException("Errore! La coda è vuota.");
    }
    T tmp = head.data; // salva l'elemento generico in testa alla lista
    return tmp; // ritorna l'elemento salvato
  }

  public void stampa()
  {
    if(!isEmpty())
    {
      Nodo tmp = head;
      int counter = 0;
      // stampa gli elementi della coda
      while(tmp != null)  
      {
        System.out.println(tmp.data.toString());
        counter++;
        tmp = tmp.next;
      }
      // stampa i posti liberi
      for(int i = counter; i < max; i++)
      {
        System.out.println("| - || - || - |");
      }
    }
    else
    {
      System.out.println("La coda è vuota");
    }
  }
}
