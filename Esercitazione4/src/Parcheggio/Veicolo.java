package Parcheggio;
import java.io.Serializable;
import java.util.Objects;

public abstract class Veicolo implements Serializable
{
  protected String targa; // attributo identificativo del veicolo 
  protected int ingresso; // orario di ingresso 
  protected int uscita; // orario di uscita

  public Veicolo(String targa)
  {
    this.targa = targa;
    this.ingresso = 0;
    this.ingresso = 0;
  }

  public int getIngresso() 
  {
    return ingresso;
  }

  public int getUscita()
  {
    return uscita;
  }

  public void setIngresso(int ingresso) 
  {
    this.ingresso = ingresso;
  }

  public void setUscita(int uscita) 
  {
    this.uscita = uscita;
  }

  @Override
  public String toString()
  {
    return "|Targa Veicolo : " + targa + " || Orario Ingresso: " + ingresso + " || Orario Uscita: " + uscita + " |";
  }

  // confronta se due oggetti sono ugali, esegue il confronto solo sull'attributo traga
  @Override
  public boolean equals(Object obj)
  {
    if(this == obj) // coontrolla se i riferimenti sono uguali
    {
      return true;
    }
    // controlla se il riferimento è null o appartiene ad una classe diversa
    if(obj == null || this.getClass() != obj.getClass())
    {
      return false;
    }
    Veicolo other = (Veicolo) obj; // down cast da obj a Veicolo 
    return this.targa == other.targa; // ritorna il confronto tra lo stato
  }

  // calcola il codice hash
  @Override
  public int hashCode()
  {
    return Objects.hash(targa);
  }

  // implementato dalle sottoclassi
  public abstract int calcolaPrezzo();
}
