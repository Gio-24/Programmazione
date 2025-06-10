package API_Interface;

import java.util.Comparator;

public class ComparaPerNome implements Comparator <Persona> 
{
  /*
  compara prende due parametri e riutilizza il compareTo, per le stringhe 
  confronto lessicografico
  */
  @Override
  public int compare(Persona a, Persona b)
  {
    String nome_1 = a.getNome();
    String nome_2 = b.getNome();
    return (nome_1.compareTo(nome_2));
  }
}
