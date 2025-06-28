package Queue.Array;

public class TestCodaCircolare 
{
  public static void main(String[] args)
  {
    // creazione della coda
    CodaCircolare coda = new CodaCircolare(5);
    
    // carica n elementi nella lista è stampa lo stato intermedio
    for(int i = 0; i < 5; i++)
    {
      coda.append((int)Math.round(Math.random() * 100));
      coda.print(); // stampa dello stato a partire
      System.out.println();
    }

    // rimuove due elementi dalla lista
    for(int i = 0; i < 2; i++)
    {
      System.out.println("Elemento eliminato dalla lista " + coda.pop());
      coda.print();
    }
  }
}
