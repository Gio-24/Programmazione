package Stack;

public class Stack 
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

  private Nodo head; // puntatore alla testa dello stack
  private int size; // valore corrente degli elementi presenti nella lista

  public Stack() // inizializza lo stack
  {
    this.head = null;
    this.size = 0;
  }

  public boolean isEmpty() // controlla se lo stack è vuoto
  {
    return this.size == 0;
  }

  public void push(int val)
  {
    Nodo newNodo = new Nodo(val); // crea un nuovo nodo

    this.head.next = this.head; // assegna la testa come valore successivo alla testa
    this.head = newNodo; // assegna la testa al nuovo nodo

    this.size++; // incremnta size
  }

  public int pop()
  {
    if(isEmpty()) // controlla se lo stack è vuoto
    {
      throw new IllegalStateException("Stack vuoto");
    }
    
    int val = this.head.data; // prende il valore dalla testa

    this.head = this.head.next; // assegna la nuova testa alla valore successivo alla vecchia testa
    this.size--; // decrementa size

    return val;
  }

  public Nodo peek()
  {
    if(isEmpty()) // controlla se lo stack è vuoto
    {
      throw new IllegalStateException("Stack vuoto");
    }
    
    return this.head;
  }

  public int stackSize()
  {
    return size;
  }
}
