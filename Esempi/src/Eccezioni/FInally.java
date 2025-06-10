package Eccezioni;

public class FInally 
{
  public static void main(String[] args) 
  {
    String[] array = {"10", "abc", null, "20"};

    for (String str : array) 
    {
      /*
      gerarchia blocchi:
       - try è quello che contiene la parte di codice che potrebbe generare l'errore
       - catch hanno il compito di gestire un classe di errori
       - finally viene eseguito ogni volta 
      */
      try 
      {
        // Prova a convertire la stringa in un numero intero
        int numero = Integer.parseInt(str);
        System.out.println("Numero convertito: " + numero);
      }
      catch(NumberFormatException e) 
      {
        // Gestisce l'eccezione se la stringa non può essere convertita in un numero intero
        System.out.println("Errore: la stringa non può essere convertita in un numero intero: " + str);
      } 
      catch(NullPointerException e) 
      {
        // Gestisce l'eccezione se la stringa è null
        System.out.println("Errore: la stringa è null.");
      } 
      finally 
      {
        // Questo blocco viene eseguito sempre
        System.out.println("Blocco finally eseguito.");
      }
    }
  }
}
