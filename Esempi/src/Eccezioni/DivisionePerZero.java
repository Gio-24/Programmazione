package Eccezioni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionePerZero 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Inserire due numeri interi: ");
    /*
    ogni catch gestisce un certo tipo di errore -> le classi di errori essendo 
    degli oggetti posso ereditare e quindi essere più o meno specifici. questo 
    perchè una sottoclasse può prendere il posto della superclasse.
    per questo motivo, i blocchi catch vanno specificati dal più derivato a 
    quello più generico, in modo da gestire correttamente l'errore.
    */
    try 
    {
      int x = input.nextInt();
      int y = input.nextInt();

      int ris = divisione(x,y);

      System.out.println("Risultato della divisione intera " + x + "/" + y + ":" + ris);

      input.close();
    }
    catch(InputMismatchException e)
    {
      System.err.printf("Eccezione: %s%n", e);
      System.err.println("Non hai inserito due INTERI...");
    }
    catch(ArithmeticException e)
    {
      System.err.printf("Eccezione: %s%n", e);
      System.err.println("Divisione per zero!");
    }
    catch(Exception e)
    {
      System.err.printf("Eccezione generica: %s%n", e);
    }        
  }

  public static int divisione(int a, int b)
  {
    return a/b;
  }
}
