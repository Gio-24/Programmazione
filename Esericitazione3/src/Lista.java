public class Lista 
{
  public class Nodo 
  {
    private Vulnerability data;
    private Nodo next;

    public Nodo(Vulnerability v)
    {
      this.data = v;
      this.next = null;
    }
  }

  Nodo testa;

  public Lista()
  {
    this.testa = null;
  }

  public boolean isEmpty()
  {
    return testa == null;
  }

  // aggiunge un elemento in testa alla lista
  public void push(Vulnerability v)
  {
    Nodo newNodo = new Nodo(v); // crea un nuovo nodo
    if(isEmpty()) // controlla se la lista è vuota
    {
      testa = newNodo; // assegna a testa il nuovo nodo
    }
    else
    {
      newNodo.next = testa; // assegna al successivo di nuovo nodo la testa corrente
      testa = newNodo; // aggiorna la testa con nuovo nodo
    }
  }

  // rimuove l'elemento in testa alla lista
  public Vulnerability pop()
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      return null; // ritorna null
    }
    Vulnerability tmp = testa.data; // salva l'elemento corrente della testa
    testa = testa.next; // aggiorna la testa con l'elemento successivo
    return tmp;
  }

  // ritorna l'elemento in testa alla lista senza rimuoverlo
  public Vulnerability peek()
  {
    if(isEmpty()) // controlla se la lista è vuota
    {
      return null; // ritorna null
    }
    Vulnerability tmp = testa.data;
    return tmp;
  }

  // restituisce il numero di vulnerabilità SW e il numero di vulnerabilità HW che sono exploitable.
  public String numberExploitable()
  {
    if(isEmpty())
    {
      return null;
    }
    Nodo current = testa;
    int HWCounter = 0;
    int SWCounter = 0;
    // ciclo che scorre la lista fino alla fine
    while(current != null)
    {
      // controlla l'elemento attuale è exploitable
      if(current.data.checkExploitable()) 
      {
        if(current.data instanceof HWVulnerability) // controlla se l'elemento è HW
        {
          HWCounter++;
        }
        if(current.data instanceof SWVulnerability) // controlla se l'elemento è SW
        {
          SWCounter++;
        }
      }
      current = current.next; // passa al prossimo elemento della lista
    }
    return "Vulnerabilità Exploitable: SW = " + SWCounter + ", HW = " + HWCounter + ", Totali = " + (HWCounter + SWCounter);
  }

  // rimuove dalla lista tutte le vulnerabilità che non sono exploitable. 
  // Di fatto dopo l’esecuzione del metodo, nella lista devono essere presenti 
  // solo vulnerabilità exploitable
  public void removeNotExploitable()
  {
    if(!isEmpty()) // controlla se la lista è vuota
    {
      Nodo current = testa; // nodo per scorrere la lista che parte da testa

      if(!current.data.checkExploitable()) // controlla se la testa non è exploitable
      {
        pop(); // esegue il pop
      }

      while(current.next != null) // scorre la lista fino alla fine
      {
        if(!current.next.data.checkExploitable()) // controlla se non è exploitable
        {
          // assegna all'elemente successivo l'elemento ancora successivo
          current.next = current.next.next; 
        }
        else
        {
          current = current.next; // passa al prossimo elemento
        }
      }
    }
  }

  public void printLista()
  {
    if(isEmpty())
    {
      System.out.println("la lista è vuota");
    }
    else
    {
      Nodo current = testa;

      while(current != null)
      {
        if(current.data instanceof SWVulnerability)
        {
          SWVulnerability sw = (SWVulnerability) current.data;
          System.out.println(sw.toString()); 
        }
        else if(current.data instanceof HWVulnerability)
        {
          HWVulnerability hw = (HWVulnerability) current.data;
          System.out.println(hw.toString());
        }
        else
        {
          System.out.println(current.data.toString());
        }
        current = current.next;
      }
    }
  }
}
