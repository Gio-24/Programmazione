package Parcheggio;

import java.util.Comparator;

public class ConfrontaPerIngresso implements Comparator<Veicolo>
{
  @Override
  public int compare(Veicolo v1, Veicolo v2)
  {
    return Integer.compare(v1.ingresso, v2.ingresso);
  }
}
