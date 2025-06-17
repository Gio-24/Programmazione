package Message;

public class Messaggio implements Cloneable, Comparable<Messaggio>
{
  private Contatto mittente;
  private Orario istante;

  public Messaggio(Contatto contatto, Orario orario)
  {
    this.mittente = contatto;
    this.istante = orario;
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
    Messaggio other = (Messaggio) obj;
    return this.mittente.equals(other.mittente) && this.istante.equals(other.istante);
  }

  @Override
  public int compareTo(Messaggio other)
  {
    // confronto dei mittenti
    int tmp = this.mittente.compareTo(other.mittente);
    // se i mittenti sono diversi ritorna il loro confronto
    if(tmp != 0)
    {
      return tmp;
    }
    // altrimenti ritorna il confronto tra gli istanti
    return this.istante.compareTo(other.istante);
  }

  // shallow copy
  @Override
  protected Object clone() throws CloneNotSupportedException
  {
    return (Messaggio) super.clone();
  }

  @Override
  public String toString()
  {
    return mittente.toString() + istante.toString();
  }
}
