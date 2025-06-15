package Queue;
/*
Queue (coda) -> FIFO
*/
public class Queue
{
  private static class Nodo
  {
    private int data;
    private Nodo next;

    //builder Nodo
    public Nodo(int val)
    {
      this.data = val;
      this.next = null;
    }
  }

  private Nodo head; // head pointer
  private Nodo tail; // tail pointer
  private int size; // queue size
  // private int maxSize; // max queue size

  // builder queue
  public Queue()
  {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public boolean isEmpty()
  {
    return size == 0;
  }

  // enqueue -> operazione di add alla posizione tail
  public void enqueue(int valore)
  {
    Nodo newNodo = new Nodo(valore); // crea un nuovo nodo

    if(this.isEmpty()) // controlla se la coda è vuota
    { 
      // se è vuota assegna il nuovo nodo a testa e coda
      this.head = newNodo;
      this.tail = newNodo;
    }
    else // altrimenti assegna il nuovo nodo al next di coda e poi assegna coda al nuovo nodo
    {
      this.tail.next = newNodo;
      this.tail = newNodo;
    }

    this.size++; // incrementa size 
  }

  // dequeue -> operazione di remove alla posizione head
  public int dequeue()
  {
    if(this.isEmpty()) // controlla se la coda è vuota
    {
      throw new IllegalStateException("Empty Queue"); // lancia l'eccezione
    }

    int val = this.head.data; // salva in val il valore in testa

    this.head = this.head.next; // aggiorna il valore della testa
    
    if(this.head == null) // controlla se dopo aver aggiornato la testa punta a null
    {
      this.tail = null; // se è vero punta fa puntare anche la coda a null
    } 
    
    this.size--; // aggiorna il valore di size

    return val;
  }
}