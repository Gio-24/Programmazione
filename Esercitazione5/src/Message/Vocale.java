package Message;

public class Vocale extends Messaggio
{
  private int durata;

  public Vocale(Contatto contatto, Orario orario, int durata)
  {
    super(contatto, orario);
    this.durata = durata;
  }

  public int getDurata() 
  {
    return durata;
  }

  @Override
  public Object clone() throws CloneNotSupportedException 
  {
    Contatto contattoCopy = super.clonaMittente();
    Orario orarioCopy = super.clonaIstante();
    return new Vocale(contattoCopy, orarioCopy, durata);  
  }

  @Override
  public String toString() 
  {
    return super.toString() + "| " + durata + " |";
  }
}
