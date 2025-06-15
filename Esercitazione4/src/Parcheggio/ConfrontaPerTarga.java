package Parcheggio;

import java.util.Comparator;

public class ConfrontaPerTarga implements Comparator<Veicolo>
{
  @Override
  public int compare(Veicolo v1, Veicolo v2)
  {
    return v1.targa.compareTo(v2.targa);
  }
}
