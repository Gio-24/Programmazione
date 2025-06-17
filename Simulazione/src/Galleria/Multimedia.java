package Galleria;

public abstract class Multimedia implements Resizable
{
  private String fileName;
  private char resolution;
  private boolean raw;

  // costruttore
  public Multimedia(String name, char res, boolean raw)
  {
    this.fileName = name;
    this.resolution = res;
    this.raw = raw;
  }

  public String getFileName() 
  {
    return fileName;
  }

  public char getResolution() 
  {
    return resolution;
  }

  // stampa
  @Override
  public String toString()
  {
    return "| File Name: " + fileName + " || Resolution: " + resolution + " || Raw Type: "+ raw + " |";
  }

  // controlla se due oggetti multimedia sono uguali attraverso i riferimenti e lo stato
  @Override
  public boolean equals(Object obj)
  {
    // controlla se i riferimenti sono uguali
    if(this == obj)
    {
      return true;
    }
    // controlla se obj è null o di una classe diversa
    if(obj == null || this.getClass() != obj.getClass())
    {
      return false;
    }
    //confronto dello stato
    Multimedia other = (Multimedia) obj; // down cast sicuro dopo il secondo controllo
    return this.fileName.equals(other.fileName); // confronto con il metodo equals di String
  }

  @Override
  public boolean checkQuality()
  {
    // controlla se raw è true e controlla se resolution corrisponde con e o h
    return raw && (Character.compare(resolution, 'h') == 0 || Character.compare(resolution, 'e') == 0);
  }
}
