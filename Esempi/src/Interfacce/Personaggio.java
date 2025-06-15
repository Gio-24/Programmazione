// riferimenti lucidi: unità 15
package Interfacce;
/*
un'interfaccia è simile ad una classe astratta in quanto non fornisce l'implementazione dei metodi.
quindi definiscono solo dei metodi abstract.

N.B. in generale nelle versioni più recenti di java la differenza principale tra una classe astratta 
ed un'interfaccia consiste nella necessità di ereditarietà multipla, oltre ad altre differenze.
*/
public interface Personaggio 
{
  public abstract double move();
  // public abstract double colpisci();
}
