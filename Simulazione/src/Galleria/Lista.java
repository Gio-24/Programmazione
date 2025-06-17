package Galleria;

public class Lista 
{
  class Nodo
  {
    private Multimedia data;
    private Nodo next;

    Nodo(Multimedia elem)
    {
      this.data = elem;
      this.next = null;
    }
  }

  Nodo testa; // riferimento al primo elemento della lista

  public Lista()
  {
    this.testa = null;
  }

  public boolean isEmpty()
  {
    return testa == null;
  }

  // inserisce un elemento in testa alla lista
  public void push(Multimedia elem)
  {
    Nodo newNodo = new Nodo(elem); // crea un nuovo nodo con elem
    // l'elemento successivo al nuovo nodo fa riferimento alla testa attuale
    newNodo.next = testa;
    // aggiorna il valore della testa per far riferimento al nuovo nodo
    testa = newNodo;
  }

  public Multimedia pop() throws IllegalStateException
  {
    if(isEmpty())
    {
      throw new IllegalStateException("Errore! La gealleria è vuota.");
    }
    Multimedia tmp = testa.data;
    testa = testa.next;
    return tmp;
  }

  // verifica se un elemento è presente nella lista
  public boolean inList(Multimedia elem)
  {
    boolean found = false;
    Nodo current = testa;
    while(current != null || !found)
    {
      if(current.data.equals(elem))
      {
        found = true;
      }
      current = current.next;
    }
    return found;
  }

  // rimuove un elemento dalla lista
  public void remove(Multimedia elem)
  {
    // controlla se l'elemento è in testa
    if(testa.data.equals(elem))
    {
      pop(); // lo rimuove tramite pop
    }
    Nodo current = testa; // crea un nodo che fa riferimento all testa
    // scorre la lista finchè non trova l'elemento uguale
    while(current.next.data.equals(elem))
    {
      current = current.next; // passa al prossimo elemento
    }
    // current.next è uguale a elem
    current.next = current.next.next; // quindi lo si fa puntare al successivo 
  }

  // scorre la lista ed applica una resize del 50% per ogni elemento video con qualità alta
  public void saveSpace() throws IllegalStateException
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      throw new IllegalStateException("Errore! La galleria è vuota.");
    }
    Nodo current = testa;
    while(current != null) 
    {
      if(current.data instanceof Video && current.data.checkQuality() )
      {
        current.data.resize(50);
      }
      current = current.next;
    }
  }

  public void print()
  {
    if(isEmpty())
    {
      System.out.println("La galleria è vuota.");
    }
    Nodo current = testa;
    while(current != null) 
    {
      System.out.println(current.data.toString());
      current = current.next;
    }
  }
}
