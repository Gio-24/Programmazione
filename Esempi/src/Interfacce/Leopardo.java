package Interfacce;
/*
le interfacce richiedono alle classi che le implementano di eseguire l'override
dei metodi abstract ereditati.

N.B. per le classi astratte che implementano delle interfacce possono dichiarare
a loro volta i metodi abstract
*/
public class Leopardo implements Animale 
{
  @Override
  public void verso() 
  {
    System.out.println(".. leopardo");
  }

  @Override
  public double move()
  {
    return 2.5 * MOVIMENTO_BASE_ANIMALE;
  }
}
