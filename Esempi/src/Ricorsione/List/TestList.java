package Ricorsione.List;

public class TestList 
{
  public static void main(String[] args) 
  {
    // crea la lista di caratteri
    List<Character> chars = new List<>();

    // inserimenti e stampa
    System.out.println("primo inserimento e stampa dello stato:");
    chars.push('1');
    chars.print(chars.getHead());
    System.out.println("\nsecondo inserimento e stampa dello stato:");
    chars.push('2');
    chars.print(chars.getHead());
    System.out.println("\nterzo inserimento e stampa dello stato:");
    chars.push('3');
    chars.print(chars.getHead());

    // ricerca di un elemento
    System.out.println("controlla se nella lista è presente 4:");

    if(chars.inList(chars.getHead(), '4'))
    {
      System.out.println("trovato!");
    }
    chars.print(chars.getHead());

    System.out.println("controlla se nella lista è presente 1:");
    if(chars.inList(chars.getHead(), '1'))
    {
      System.out.println("trovato!");
    }
    chars.print(chars.getHead());
  }
}
