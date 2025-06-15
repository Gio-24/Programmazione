package Eccezioni;

public class Overflow 
{
  public static void main(String[] args) 
  {
    int x = Integer.MAX_VALUE;
    int y = 34;
    
    System.out.println(somma(x,y));
  }

  /*
  throw solleva un'eccezione, interrompe l'esecuzione ordinaria del programma ed 
  inizia a provare a risolverlo.

  stack unwiding -> quando una funzione genera un'eccezione, la cui responsabilità
  per la risoluzione è del chiamante. Se l'eccezione non viene gestita causa
  l'interruzione del programma.
  */
  public static int somma(int x, int y)
  {
    if ((x > 0 && y > 0 && x > Integer.MAX_VALUE - y) || (x < 0 && y < 0 && x < Integer.MIN_VALUE - y)) 
      throw new IllegalArgumentException("Overflow");
    return x + y;
  }
}
