package Message;

public class Testo extends Messaggio
{
  private String contenuto;

  public Testo(Contatto contatto, Orario orario, String testo)
  {
    super(contatto, orario);
    this.contenuto = testo;
  }

  public String getContenuto()
  {
    return contenuto;
  }
  
  @Override
  public Object clone() throws CloneNotSupportedException 
  {
    Contatto contattoCopy = super.clonaMittente();
    Orario orarioCopy = super.clonaIstante();
    return new Testo(contattoCopy, orarioCopy, contenuto);  
  }

  @Override
  public String toString() 
  {
    return super.toString() + "| " + contenuto + " |";
  }
}
