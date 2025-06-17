package Galleria;

public class Video extends Multimedia
{
  private int numFrames;

  public Video(String name, char res, boolean raw, int num)
  {
    super(name, res, raw);
    this.numFrames = num;
  }

  public int getNumFrames() 
  {
    return numFrames;
  }

  @Override
  public void resize(int percentage) throws IllegalArgumentException
  {
    // controllo sul valore della percetuale (1-99)
    if(percentage <= 0 || percentage >= 100)
    {
      throw new IllegalArgumentException("Errore! Il valore della percentuale deve essere un valore compreso tra 1 e 99.");
    }
    // resize del numero di frame
    numFrames = numFrames - (percentage/100);
  }

  @Override
  public String toString() 
  {
    return super.toString() + "| Numero di Frame: " + numFrames + " |";  
  }
}
