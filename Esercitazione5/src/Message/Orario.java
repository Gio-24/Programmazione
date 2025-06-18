package Message;

public class Orario implements Comparable<Orario>
{
  private int ora;
  private int min;

  public Orario(int ora, int min)
  {
    this.ora = ora;
    this.min = min;
  }

  public int getOra() 
  {
    return ora;
  }

  public int getMin() 
  {
    return min;
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

    Orario other = (Orario) obj; 
    return this.ora == other.ora && this.min == other.min;
  }

  // criterio di confronto
  // - confronto tra le ore se queste sono diverse
  // - condornto tra i minuti se le ore sono uguali
  @Override
  public int compareTo(Orario other)
  {
    if(this.ora != other.ora)
    {
      Integer.compare(this.ora, other.ora);
    }
    return Integer.compare(this.min, other.min);
  }

  @Override
  protected Object clone() throws CloneNotSupportedException 
  {
    return super.clone();
  }

  @Override
  public String toString()
  {
    return "| Orario: " + ora + ":" + min + " |";
  }
}
