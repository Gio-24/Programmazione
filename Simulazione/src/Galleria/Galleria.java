package Galleria;

public class Galleria 
{
  public static void main(String[] args) 
  {
    try
    {
      //--------------------------
      //---===| Test Image |===---
      //--------------------------
      Image i1 = new Image("image", 'h', true, 25, 25);
      System.out.println("Stampa Image:\n" + i1.toString());
      i1.resize(20);
      System.out.println("Stampa dopo resize:\n" + i1.toString());
      i1.equals(i1);

      //--------------------------
      //---===| Test Video |===---
      //--------------------------
      Video v1 = new Video("video", 'm', true, 30);
      System.out.println("Stampa Image:\n" + v1.toString());
      v1.resize(0);
      System.out.println("Stampa dopo resize:\n" + v1.toString());
    } 
    catch (IllegalArgumentException e) 
    {
      System.err.println(e.getMessage());
    }
  }
}
