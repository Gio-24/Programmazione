package List.LinkedList;

public class List 
{
  class Node
  {
    private Integer data;
    private Node next;

    public Node(Integer n)
    {
      this.data = n;
      this.next = null;
    }
  }

  private Node head;
  private Node tail;
  private int size;

  // costruttore che crea una lista vuota
  public List()
  {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  // controlla se la lista è vuota
  public boolean isEmpty()
  {
    return size == 0 || head == null;
  }
 
  public int getSize()
  {
    return size;
  }

  // aggiunge un elemento in testa alla lista
  public void push(Integer val)
  {
    Node n = new Node(val);
    // collega il nuovo nodo alla lista facendogli puntare la testa corrente
    n.next = head;
    // aggiorna il valore della testa facendola puntare al nuovo nodo
    head = n;
    //incrementa la size della lista
    size++;
  }

  // aggiunge un elemento in coda alla lista
  public void append(Integer val) // enqueue
  {
    Node n = new Node(val);
    // assegna il nuovo nodo al succesivo della coda attuale
    tail.next = n;
    // aggiorna il valore della coda con il nuovo nodo
    tail = n;
    // incrementa la size della lista
    size++;
  }

  // aggiunge un valore in una posizione Interna alla lista
  public void insertAt(int index, Integer val)
  {
    if(index >= 0 && index <= size) // controlla se index è inetrno alla lista
    {
      if(isEmpty()) // controlla se la lista è vuota
      {
        push(val); // se la lista è vuota si può usare un push o append
      }
      else
      {
        Node newNode = new Node(val); // crea il nuovo nodo
        Node current = head; // crea un nodo per scorrere la lista
        // scorre fino all'elemento precedente ad index, partendo da head
        for(int i = 0; i < index - 1; i++) 
        {
          current = current.next;
        }
        // assegna come successivo del nuovo nodo l'attuale index
        newNode.next = current.next;
        // assegna come successivo di index-1 il nuovo nodo rendendolo in nuovo index
        current.next = newNode;
        // incrementa la size della lista
        size++;
      }
    }
  }

  // rimuove l'elemento in testa alla lista
  public Integer pop()
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      return null; // oppure lancia un'eccezione
    }
    // salva in tmp il valore in testa
    Integer tmp = head.data;
    // aggiorna il valore della testa con il valore successivo della corrente
    head = head.next;
    // decrementa la size della lista
    size--;
    return tmp;
  }

  // rimuove l'elemento in coda alla lista
  public Integer removeLast() // popBack o deleteTail
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      return null; // oppure lancia un'eccezione
    }
    // salva in tmp il valore in testa
    Integer tmp = tail.data;
    // nodo per scorrere la lista
    Node current = head;
    // scorre la lista fino a raggiungere il valore precedente a tail
    while(current.next != tail) // in alternativa si usa un for con size -1
    {
      current = current.next; // se next non è tail passa al prossimo
    }
    // aggiorna il valore della testa con il valore successivo della corrente
    tail = current;
    // decrementa la size della lista
    size--;
    return tmp;
  }

  // rimuove l'elemento alla posizione 
  public Integer removeAt(int index)
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      return null;
    }
    if(index >= 0 && index <= size) // controlla se index è interno alla lista
    {
      return null; // oppure throw new...
    }
    // nodo corrente per scorrere la lista partendo dalla testa
    Node current = head;
    // ciclo che scorre la lista fino all'elemento precedente ad index
    for(int i = 0; i < index - 1; i++)
    {
      current = current.next; // passa al prossimo elemento
    }
    // nodo tmporaneo da rimuovere 
    Node tmp = current.next;
    // l'elemento successivo al index-1 diventa index+1 (salta index)
    current.next = tmp.next;
    // decrementa la size della lista
    size--;
    return tmp.data;
  }

  // ritorna il valore in testa alla lista senza rimuoverlo
  public Integer peek() // top
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      return null;
    }
    Integer n = head.data; // evita il privacy leak
    return n; // ritorna il valore puntato dalla testa
  }

  // ritorna il valore in coda alla lista senza rimuoverlo
  public Integer peekLast() // topBack
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      return null;
    }
    Integer n = head.data; // evita il privacy leak
    return n; // ritorna il valore puntato dalla coda
  }

  // rimuove un elemento senza ritornare il valore
  public void delete(Integer val)
  {
    if(!isEmpty())
    {
      if(tail.data.equals(val)) // controlla se è ugale alla coda
      {
        removeLast();
      }
      else if(head.data.equals(val)) // controlla se è uguale alla testa
      {
        pop();
      }
      else
      {
        // nodo corrente per scorrere la lista partendo dalla testa
        // parte da head.next visto che è già stato fatto il controllo per la coda
        Node current = head.next; 
        // ciclo che scorre la lista fino all'elemento precedente ad index
        while(current.data != null && !current.data.equals(val))
        {
          current = current.next; // passa al prossimo elemento
        }
        // assegna al successivo del valore corrente il successivo del successivo
        current.next = current.next.next;
        // decrementa la size della lista
        size--;
      }
    }
  }

  // ritorna il valore in coda alla lista senza rimuoverlo
  public Integer peekAt(int index)
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      return null;
    }
    if(index >= 0 && index <= size) // controlla se index è interno alla lista
    {
      return null; // oppure throw new...
    }
    // nodo corrente per scorrere la lista partendo dalla testa
    Node current = head;
    // ciclo che scorre la lista
    for(int i = 0; i < index; i++)
    {
      current = current.next; // passa al prossimo elemento
    }

    return current.data;
  }

  //controlla se un elemento è presente nella lista
  public boolean inList(Integer val)
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      return false; // se è vuota ritorna false
    }
    else
    {
      Node tmp = head;
      boolean found = false;
      // scorre la lista finchè non viene trovato o termina la lista
      while(tmp != null && !found)
      {
        if(tmp.data.equals(val)) // confronto con equals
        {
          found = true;
        }
        else 
        {
          tmp = tmp.next; // passa al prossimo elemento della lista
        }
      }
      return found;
    }
  }

  // controlla se un elemento è presente in una lista ordinata
  public boolean inSortedList(Integer val)
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      return false;  
    }
    else
    {
      Node tmp = head; // crea un nodo che punta alla testa
      boolean found = false; 
      
      // scorre la lista (ordinata) finchè: 
      //  - non raggiunge la fine della lista
      //  - l'elemento non viene trovato
      //  - gli elementi della non superano il valore dell'elemento da cercare
      while(tmp != null && !found && tmp.data.compareTo(val) <= 0)
      {
        if(tmp.data.equals(val)) // controlla se l'elemento corrente è uguale a val
        {
          found = true;
        }
        else 
        {
          tmp = tmp.next; // passa al prossimo elemento
        }
      }
      return found;
    }
  }

  // controlla se la lista è ordinata in modo crescente
  public boolean isSorted()
  {
    boolean sorted = true;
    Node tmp = head;

    if(isEmpty()) // head == null
    {
      return true;
    }
    else if(tmp.next == null) // controlla se la lista ha un solo elemento
    {
      return true;
    }
    else if(tmp.next.next == null) // controlla se la lista ha solo due elementi
    {
      //verifica che il primo elemento sia minore o uguale del secondo
      return tmp.data.compareTo(tmp.next.data) <= 0; 
    }
    // scorre la lista finchè:
    //  - rimane ordinata
    //  - non l'elemento successivo non è null
    while(sorted && tmp.next != null) 
    {
      // confronta l'elemento corrente con quello successivo se è maggiore non è ordinata
      if(tmp.data.compareTo(tmp.next.data) > 0) 
      {
        sorted = false;
      }
      else
      {
        tmp = tmp.next; // passa all'elemento successivo
      }
    }
    return sorted;
  }

  // stampa la lista
  public void printList()
  {
    if(!isEmpty()) // controlla che la lista non sia vuota
    {
      Node tmp = head; // crea un nuovo nodo che punta alla testa

      while(tmp != null) //scorre la lista fino alla fine
      {
        System.out.print(tmp.data + "\t");
        tmp = tmp.next; // passa all'elemento successivo
      }
    }
  }
}
