package Interfacce;
/*
le interfacce in java consentono l'ereditarietà multipla -> una classe può
implementare interfacce diverse ma può estendere solo una classe.

esempio: public class A extends B implements C, D -> quindi la classe A eredita 
dalla classe B ed implementa le interfacce C e D.
*/
public class Mutante implements Umano, Animale
{
  @Override
  public void verso()
  {
    System.out.println("..mutante");
  }

  @Override
  public double move()
  {
    return 15*MOVIMENTO_BASE_UMANO;
  }

  @Override
  public void parla()
  {
    System.out.println("Sono un mutante");
  }

}
