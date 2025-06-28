package Queue.Array;

public class CodaCircolare
{
  private int testa; // indice del prossimo elemento da estrarre
  private int coda; // indice del primo posto disponibile
  private int max; // numero massimo di elemente
  private int size; // numero corrente di elementi
  private int[] vct;

  // crea una lista vuota
  public CodaCircolare(int max)
  {
    this.testa = this.coda = this.size = 0;
    this.max = max;
    this.vct = new int[max];
  }

  public int getTesta()
  {
    return testa;
  }

  public boolean isEmpty()
  {
    return testa == coda && size == 0;
  }

  public boolean isFull()
  {
    return size == max;
  }

  public void append(int elem) throws IllegalStateException
  {
    if(isFull())
    {
      throw new IllegalStateException("Errore! La lista è piena");
    }
    vct[coda] = elem; // aggiunge un nuovo valore in coda
    coda = (coda + 1) % max; // aggiorna il valore della coda
    size++;
  }

  public int pop() throws IllegalStateException
  {
    if(isEmpty())
    {
      throw new IllegalStateException("Errore! La lista è vuota");
    }
    int tmp = vct[testa];
    vct[testa] = 0;
    testa = (testa + 1) % max;
    size--;
    return tmp;
  }

  public int peek() throws IllegalStateException
  {
    if(isEmpty())
    {
      throw new IllegalStateException("Errore! La lista è vuota");
    }
    int tmp = vct[testa];
    return tmp;
  }

  public void print()
  {
    if(isEmpty())
    {
      System.out.println("La lista è vuota");
    }

    for(int i = 0; i < 5; i++)
    {
      System.out.print("[" + vct[i] +"]\t");
    }
    System.out.println();
  }
}