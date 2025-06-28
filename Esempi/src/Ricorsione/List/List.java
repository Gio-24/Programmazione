// lista gestita utilizzando dove possibile algoritmi ricorsivi
package Ricorsione.List;

public class List<S>
{
  // classe noto contenuta nella classe List
  public class Node<T> 
  {
    T data;
    Node<T> next;

    public Node(T data) // costruttore della classe nodo
    {
      this.data = data;
      this.next = null;
    }

    private Node(Node<T> n) // costruttore di copia
    {
      this.data = n.data;
      this.next = n.next;
    }
  }

  private Node<S> head; // riferimento alla testa della lista

  // costruttore che crea una lista vuota
  public List()
  {
    this.head = null;
  }

  // ritorna un riferimento alla lista
  // per evitare il privacy leak ritorna una copia della testa
  public Node<S> getHead() 
  {
    Node<S> tmp = new Node<S>(head);
    return tmp;
  }

  // metodo che cotrolla che se la lista è vuota
  public boolean isEmpty()
  {
    return head == null;
  }

  public void push(S elem)
  {
    Node<S> newNode = new Node<>(elem);

    if(isEmpty())
    {
      head = newNode; // assegna alla testa un riferimento al nuovo nodo
    }
    else
    {
      newNode.next = head; // assegna come successivo di nuovo nodo la testa
      head = newNode; // aggiorna il valore della testa
    }
  }

  // metodo che ritorna ed elimina il valore presente in testa
  public S pop() throws IllegalStateException
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      throw new IllegalStateException("Errore! La lista è vuota");
    }
    S elem = head.data; // assegna il valore della testa
    head = head.next; // aggiorna il valore della testa
    return elem; 
  }

  // metodo che ritorna il valore presente in testa senza eliminarlo
  public S peek() throws IllegalStateException
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      throw new IllegalStateException("Errore! La lista è vuota");
    }
    S elem = head.data; // assegna il valore della testa
    return elem; 
  }

  // metodo ricorsivo per la stampa degli elementi della lista
  public void print(Node<S> elem)
  {
    if(elem != null) // predicato d'arresto
    {
      // in questo caso println mette insieme il risultato totale con quello parziale (combinatrice)
      // mentre toString è la funzione che produce il risultato parziale (trasformazione)
      System.out.println(elem.data.toString());
      print(elem.next); // chiama la funzione 
    }
  }

  // metodo ricorsivo per verificare se un elemento è presente nella lista
  public boolean inList(Node<S> elem, S toFind)
  {
    if(elem == null) // predicato d'arresto
    {
      return false;
    }
    if(elem.data.equals(toFind)) // funzione trasformatrice
    {
      return true; // funzione combinatrice
    }
    return inList(elem.next, toFind); // fuzione generatrice
  }

  /* 
   * ToDo
   * - pop
   * - peek
   * - stampa (r)
   * - contains (r)
   */

}
