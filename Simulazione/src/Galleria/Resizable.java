package Galleria;

// metodi implementati nella classe Multimedia
public interface Resizable 
{
  // riduce in percentuale il numero di pixel o frame di un derivato di multimedia
  public abstract void resize(int percentage);
  // controlla se un oggetto multimedia è di qualità high o superiore
  public abstract boolean checkQuality();
}
