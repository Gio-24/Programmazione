package File;

import java.io.*;

public class ExampleFileReader 
{
  public static void main(String[] args) 
  {
    FileReader inputFile;
    String fileName = "src/doc/HelloWorld.txt";

    try 
    {
      inputFile = new FileReader(fileName);
      int charCodePoint;

      while((charCodePoint = inputFile.read()) != -1) 
      {
        System.out.print((char)charCodePoint);
      }

      inputFile.close();
    }
    catch(FileNotFoundException e) 
    {
      System.err.println(e.getMessage() + ": File non trovato o inesistente.");
    }
    catch(IOException e)
    {
      System.err.println(e.getMessage() + ": Chiusura del file fallita.");
    }
  }
}
