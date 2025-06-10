package Interfacce;

/*
nelle versioni recenti di java le interfacce posso fornire dei metodi default
che permettono di fare un implementazione concreta del metodo
*/
public interface Umano extends Personaggio
{
  public int DANNO_BASE_UMANO = 5;
  public int MOVIMENTO_BASE_UMANO = 15;

  public abstract void parla();
  public abstract double move();
}
