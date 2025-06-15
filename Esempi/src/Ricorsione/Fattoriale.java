package Ricorsione;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
caratterizzazione:
 - funzione generatrice -> genera il valore del prossimo input
 - predicato d'arresto -> condizione che stabilisce quando fermarsi
 - funzione di trasformazione -> calcola il risultato parziale
 - funzione combinatrice -> unisce il risultato attuale con quello ricorsivo
*/
public class Fattoriale
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    int res;

    try
    {
      System.out.println("Inserisci il numero: ");
      int n = input.nextInt();
      input.close();

      if(n < 0)
        throw new IllegalArgumentException("Errore: il numero inserito non è un valore posito.");
      else
        res = fatt(n);
      System.out.println("!" + n + " = " + res);
    }
    catch(InputMismatchException e)
    {
      System.err.println("Errore: " + e);
      System.err.println("Il numero inserito non è un valore intero.");
    }
    catch(IllegalArgumentException e)
    {
      System.err.println("Errore: " + e);
      //System.err.println("Il numero inserito non è un valore intero positivo.");
    }
  }

  public static int fatt(int n)
  {
    if (n == 0 || n == 1) // predicato d'arresto
      return 1;
    else 
      return n * fatt(n - 1); // funzione combinatrice = funzione di trasformazione (n) * funzione generatrice (fatt(n - 1))
  }
}
