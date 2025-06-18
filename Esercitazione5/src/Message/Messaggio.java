package Message;

public abstract class Messaggio implements Cloneable, Comparable<Messaggio>
{
  private Contatto mittente;
  private Orario istante;

  public Messaggio(Contatto contatto, Orario orario)
  {
    this.mittente = contatto;
    this.istante = orario;
  }

  public Orario getIstante() {
    return istante;
  }

  public Contatto getMittente() {
    return mittente;
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

  // Metodi ausiliari per clonare i componenti, rispettando il contenimento
  protected Orario clonaIstante() throws CloneNotSupportedException 
  {
    return (Orario) istante.clone();
  }

  protected Contatto clonaMittente() throws CloneNotSupportedException 
  {
    return (Contatto) mittente.clone();
  }

  @Override
  public abstract Object clone() throws CloneNotSupportedException;

  @Override
  public String toString()
  {
    return mittente.toString() + istante.toString();
  }
}
