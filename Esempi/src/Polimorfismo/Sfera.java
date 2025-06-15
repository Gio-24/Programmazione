package Polimorfismo;

import static java.lang.Math.PI;

public class Sfera extends Figura3D 
{
  private double raggio;

  public Sfera(double r) 
  {
    super(); 
    raggio = r;
  }

  @Override
  public double superficie() 
  {
    return 4 * PI * raggio * raggio;
  }

  @Override
  public double volume() 
  {
    return (4 / 3) * PI * raggio * raggio * raggio;
  }

  @Override
  public void disegna() 
  {
    System.out.println("disegno una sfera");
  }
}
