package Galleria;

public class Image extends Multimedia
{
  private int xPixel;
  private int yPixel;

  public Image(String name, char res, boolean raw, int x, int y)
  {
    super(name, res, raw);
    this.xPixel = x;
    this.yPixel = y;
  }

  public int getxPixel() 
  {
    return xPixel;
  }

  public int getyPixel() 
  {
    return yPixel;
  }

  @Override
  public void resize(int percentage) throws IllegalArgumentException
  {
    // controllo sul valore della percetuale (1-99)
    if(percentage <= 0 || percentage >= 100)
    {
      throw new IllegalArgumentException("Errore! Il valore della percentuale deve essere un valore compreso tra 1 e 99.");
    }
    // resize del numero di pixel
    xPixel -= Math.floorDiv(percentage * xPixel,100);
    yPixel -= Math.ceilDiv(percentage * yPixel, 100);
  }

  @Override
  public String toString() 
  {
    return super.toString() + "| Numero di Pixel (x, y) : " + xPixel + ", " + yPixel + " |";  
  }
}
