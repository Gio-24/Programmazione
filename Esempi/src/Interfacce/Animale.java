package Interfacce;
/*
nelle prime versioni le interfacce potevano solo dichiarare metodi abstract e attributi final
dove tutto è implicitamente public

successivamente è stata aggiunta la possibilità di dichiarare metodi con visibilità private, default e
static
*/
public interface Animale extends Personaggio
{
  public int DANNO_BASE_ANIMALE = 10;
  public int MOVIMENTO_BASE_ANIMALE = 5;
  public abstract void verso();
  public abstract double move();
}
