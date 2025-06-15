package Message;

public class Contatto
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

  @Override
  public String toString()
  {
    return "| Nome: " + nome + " || Numero: " + numero + " |";
  }
}
