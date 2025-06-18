package Message;

public class Contatto implements Comparable<Contatto>
{
  private String nome;
  private String numero;

  public Contatto(String nome, String numero)
  {
    this.nome = nome;
    this.numero = numero;
  }

  @Override
  public boolean equals(Object obj)
  {
    if(this == obj)
    {
      return true;
    }
    if(obj == null || this.getClass() != obj.getClass())
    {
      return false;
    }
    Contatto other = (Contatto) obj;
    return this.nome.equals(other.nome) && this.numero.equals(other.numero);
  }

  // confronto eseguito solo sul numero di telefono
  @Override
  public int compareTo(Contatto other) 
  {
    return this.numero.compareTo(other.numero);
  }

  @Override
  protected Object clone() throws CloneNotSupportedException 
  {
    return super.clone();
  }

  @Override
  public String toString()
  {
    return "| Nome: " + nome + " || Numero: " + numero + " |";
  }
}
