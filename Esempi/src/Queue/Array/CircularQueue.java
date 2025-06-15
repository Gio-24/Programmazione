package Queue.Array;

public class CircularQueue 
{

  private int head; // Indice della head della queue (prossimo elemento da estrarre)
  private int tail;  // Indice della tail della queue (prossima posizione libera per inserimento)
  private int nelem; // Numero di elementi attualmente nella tail
  private int max;   // Capacità massima della tail
  private ServiceRequest[] C; // Array circolare che memorizza le richieste

  // Costruttore: inizializza la tail con dimensione fissata
  public CircularQueue(int dim) 
  {
    max = dim;
    nelem = 0;
    head = tail = 0;
    C = new ServiceRequest[max];
  }

  // Inserisce una nuova richiesta in tail (append in posizione tail)
  public void enqueue(ServiceRequest r) 
  {
    if(!isFull())
    {
      C[tail] = r;
      tail = (tail + 1) % max; // avanza in modo circolare
      nelem++;
    }
  }

  // Estrae la richiesta più vecchia dalla head della tail
  public ServiceRequest dequeue() 
  {
    if(isEmpty())
    {
      return null;
    }

    ServiceRequest r = C[head];
    head = (head + 1) % max; // avanza in modo circolare
    nelem--;
    return r;
  }

  // Verifica se la tail è vuota
  public boolean isEmpty() 
  {
    return nelem == 0;
  }

  // Verifica se la tail ha raggiunto la capacità massima
  public boolean isFull() 
  {
    return nelem == max;
  }

  // Stampa a video tutte le richieste attualmente presenti nella queue (in ordine FIFO)
  public void printQueue() 
  {
    for (int i = 0; i < nelem; i++) 
    {
      System.out.println(C[(head + i) % max]);
    }
  }

  // Verifica se una specifica richiesta di servizio è presente nella tail.
  // Utilizza il metodo equals della classe ServiceRequest per confrontare gli oggetti.
  
  public boolean inList(ServiceRequest richiesta) 
  {
    boolean trovato = false;
    int i = 0;

    while (i < nelem && !trovato) 
    {
      if (C[(head + i) % max].equals(richiesta)) 
      {
        trovato = true;
      }

      i++;
    }

    return trovato;
  }
}
