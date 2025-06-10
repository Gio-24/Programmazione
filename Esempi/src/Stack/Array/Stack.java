/**
 * Questa classe simula una pila (stack) per la gestione della cronologia di navigazione web.
 * Ogni elemento della pila è un oggetto di tipo PaginaWeb, che rappresenta una pagina visitata.
 * 
 * Le operazioni disponibili sono:
 * - push: aggiunge una nuova pagina alla cronologia (navigazione in avanti);
 * - pop: rimuove l'ultima pagina visitata (funzionalità "indietro");
 * - top: restituisce la pagina attualmente visualizzata;
 * - isEmpty/isFull: verificano lo stato della pila;
 * - printPila: stampa la cronologia dalla più recente alla meno recente;
 * - inList: verifica se una determinata pagina è presente nella pila (utile ad esempio per controllare
 *   se una pagina è già stata visitata).
 * 
 * La pila è implementata tramite un array a dimensione fissa.
 */
package Stack.Array;

public class Stack 
{
  private int head;
  private int max;
  private WebPage[] stack;

  public Stack(int len)
  {
    this.stack = new WebPage[len]; // crea un array di dimensione len
    this.head = 0;
  }

  public void push(WebPage p)
  {
    if(!isFull()) 
    {
      stack[head] = p;
      head++;
    }
  }

  public WebPage pop()
  {
    if(!isEmpty())
    {
      head--;
      WebPage p = stack[head];
      return p;
    }
    else
    {
      return null;
    }
  }

  public WebPage top()
  {
    return stack[head - 1];
  }

  public boolean isEmpty()
  {
    return head == 0;
  }

  public boolean isFull()
  {
    return head == max;
  }

  public void printStack()
  {
    for(WebPage param : stack)
    {
      param.toString();
      System.out.println();
    }
  }

  public boolean inStack(WebPage p)
  {
    boolean found = false;
    int i = 0;

    while(i < head && !found) 
    {
      if(stack[i].equals(p)) 
      {
        found = true;
      } 
      else 
      {
        i++;
      }
    }

    return found;
  }
}
