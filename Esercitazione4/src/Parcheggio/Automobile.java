package Parcheggio;
public class Automobile extends Veicolo
{
  public Automobile(String targa)
  {
    super(targa);
  }

  public int calcolaPrezzo()
  {
    return (this.uscita - this.ingresso + 1) * 4;
  }

  @Override
  public String toString()
  {
    return super.toString();
  }
}
