package Message;

import java.util.ArrayList;

public class Gruppo 
{
  public static void main(String[] args) 
  {
    //--------------------------
    //---===| Test Lista |===---
    //--------------------------
    System.out.println("Crea nuova lista:");
    Lista lista = new Lista();
    System.out.println("Test predicati:\nIsEmpty(): " + lista.isEmpty());
    System.out.println("Inserimento ordinato di 3 elementi:");
    lista.sortedInsert(new Vocale(new Contatto("ABC", "123"), new Orario(3, 1), 5));
    System.out.println("Primo inserimento:\n" + lista.toString());
    lista.sortedInsert(new Vocale(new Contatto("DEF", "456"), new Orario(1, 2), 5));
    System.out.println("Secondo inserimento:\n" + lista.toString());
    lista.sortedInsert(new Testo(new Contatto("GHI", "789"), new Orario(2, 3), "Forza Napoli"));
    System.out.println("Terzo inserimento:\n" + lista.toString());
    System.out.println("Ricerca di \"Napoli\" all'interno del gruppo:");
    lista.ricercaTesto("Napoli");
    try
    {
      ArrayList<Contatto> contatti = lista.contattiMaxVocali();
      System.out.print("Elementi della lista: ");
      for(Contatto elem : contatti)
      {
        System.out.println(elem.toString());
      }
    }
    catch(NessunVocaleException e)
    {
      System.err.println(e.getMessage());
    }
    
  }
}
