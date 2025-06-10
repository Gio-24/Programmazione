package TipiGenerici;

public class Orario extends Coppia <Integer, Integer> 
{
  public Orario(Integer ore, Integer minuti) 
  {
    super(ore, minuti);
  }

  public String formatoOrario() 
  {
    return String.format("%02d:%02d", getPrimo(), getSecondo());
  }
}

// Metodo con parametro generico usando il carattere jolly '?'
class Stampa 
{
  public static void stampaCoppia(Coppia<?, ?> c) 
  {
    System.out.println("Contenuto della coppia: " + c.toString());
  }
}
