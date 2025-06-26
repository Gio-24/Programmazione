// lista gestita utilizzando dove possibile algoritmi ricorsivi
package Ricorsione;

public class List<S>
{
  // classe noto contenuta nella classe List
  public class Node<T> 
  {
    T data;
    Node next;

    public Node(T data) // costruttore della classe nodo
    {
      this.data = data;
      this.next = null;
    }

    Node head; // riferimento alla testa della lista

    // costruttore che crea una lista vuota
    public List()
    {
      this.data = null;
    }


  }
}
