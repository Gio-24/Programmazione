package Parcheggio;

public class Motociclo extends Veicolo
{
  public Motociclo(String targa)
  {
    super(targa);
  }

  public int calcolaPrezzo()
  {
    return (this.uscita - this.ingresso + 1) * 2;
  }

  @Override
  public String toString()
  {
    return super.toString();
  }
}
