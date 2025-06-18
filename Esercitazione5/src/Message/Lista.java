package Message;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Lista
{
  class Nodo
  {
    Messaggio data;
    Nodo next; // riferimento all'elemento successivo

    Nodo(Messaggio data) // costruttore 
    {
      this.data = data;
      this.next = null;
    }
  }

  Nodo testa; // riferimento al primo elemento della lista
  
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

  // inserisce un elemento nella lista, tenendo conto dell'orario del messaggio
  public void sortedInsert(Messaggio elem)
  {
    Nodo newNodo = new Nodo(elem); // crea il nuovo nodo
    // se la lista è vuota o l'orario e minore della testa aggiunge in testa
    if(isEmpty() || newNodo.data.getIstante().compareTo(testa.data.getIstante()) < 0)
    {
      newNodo.next = testa; // assegna come successivo la testa attuale
      testa = newNodo; // aggiorna il valore della testa
    }
    else
    {
      Nodo current = testa; // crea un nodo per scorrere la lista che parte dalla testa
      // scorre la lista finchè non arriva alla fine o non trova un elemento maggiore
      while(current.next != null && newNodo.data.compareTo(current.next.data) < 0)
      {
        current = current.next; // passa all'elemento successivo
      }
      // assegna come successivo del nuovo nodo il successivo di current
      newNodo.next = current.next;
      // aggiorna il successivo di current con il nuovo nodo
      current.next = newNodo;
    }
  }

  // stampa lo stato della lista
  @Override
  public String toString() 
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      return "La lista è vuota.";
    }
    else
    {
      StringBuilder sb = new StringBuilder(); // crea uno string builder a grandezza varibile
      Nodo current = testa; // crea un nodo per scorrere la lista partendo dall testa
      while(current != null) // scorre tutta la lista
      {
        sb.append(current.data.toString() + "\n"); // append del toString dell'elem corrente
        current = current.next; // passa al prossimo elemento
      }
      return sb.toString(); // ritorna lo string bulder toStirng
    }  
  }

  // ricerca una stringa all'interno della lista dei messaggi di testo
  public void ricercaTesto(String elem)
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      System.out.println("La lista è vuota");
    }
    else
    {
      Nodo current = testa; // crea un nuovo nodo per scorrere la lista partendo dalla testa
      while(current != null) // scorre tutta la lista
      {
        if(current.data instanceof Testo) // controlla se l'elemento corrente è di classe Testo
        {
          Testo tmp = (Testo) current.data; // downcast a Testo (sicura dopo il controllo)
          if(tmp.getContenuto().contains(elem)) // controlla se la stringa è presente tramite contains
          {
            System.out.println(tmp.toString()); // stampa con il toString
          }
        }
        current = current.next; // passa al prossimo elemento
      }
    }
  }

  // ritorna un arraylist contenente i contatti che hanno mandato un vocale di durata pari a max
  public ArrayList<Vocale> contattiMaxVocali() throws NessunVocaleException
  {
    if(isEmpty()) // controlla se la lista è vuota (consegue che non ha nessun vocale)
    {
      throw new NessunVocaleException("Errore! Nel gruppo non è presente nessun messaggio vocale.");
    }
    else
    {
      Nodo current = testa; // crea un nodo che punta alla testa per scorrere la lista
      int max = 0; // valore della durata massima
      int num = 0; // numero di vocali presenti nella lista
      while(current != null) // scorre la lista
      {
        if(current.data instanceof Vocale) // controlla se l'elemento corrente è un vocale
        {
          num++; // incrementa il numero di vocali
          Vocale tmp = (Vocale) current.data; // down cast (sicuro dopo il controllo)
          if(max < tmp.getDurata()) // controlla se la durata corrente è maggiore di max
          {
            max = tmp.getDurata(); // aggiorna il valore di max
          }
        }
        current = current.next; // passa al prossimo elemento
      }
      if(num == 0) // controlla se nessun vocale è presente nella lista
      {
        throw new NessunVocaleException("Errore! Nel gruppo non è presente nessun messaggio vocale.");
      }
        ArrayList<Vocale> vocMax = new ArrayList<>(num); // crea un container
        while(current != null) // scorre la lista alla ricerca del massimo
        {
          if(current.data instanceof Vocale) // controlla se l'elemento corrente è un vocale
          {
            Vocale tmp = (Vocale) current.data; // down cast (sicuro dopo il controllo)
            if(tmp.getDurata() == max)  // controlla se la durata del vocale è uguale a quella max
            {
              vocMax.add(tmp.getMittente()); // aggiunge il riferimento al contatto nel container
            }
          }
          current = current.next; // passa al prossimo elemento
        }
        return vocMax; // ritorna il riferimento al container
    }
  }

  // metodo che clona la lista all'interno
  public ArrayList<Messaggio> esportaChat() throws CloneNotSupportedException, NoSuchElementException
  {
    if(isEmpty())
    {
      throw new NoSuchElementException("Errore! Nessun elemento presente nella lista.");
    }
    else
    {
      ArrayList<Messaggio> copy = new ArrayList<>();
      Nodo current = testa;
      while(current != null)
      {
        copy.add((Messaggio) current.data.clone());
      }
      return copy;
    }
  }
}
