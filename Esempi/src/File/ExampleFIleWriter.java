package File;

import java.io.*;
import java.util.Scanner;

public class ExampleFIleWriter 
{
  public static void main(String[] args) 
  {
    try(FileWriter outputFile = new FileWriter("src/doc/data.txt")) 
    {
      outputFile.write("Prima riga del file data\n");
    } 
    catch(IOException e) 
    {
      System.err.println("Errore nella scrittura: " + e.getMessage());
    }

    try(Scanner scanner = new Scanner(new File("src/doc/data.txt"))) 
    {
      System.out.println("Contenuto del file:");

      while (scanner.hasNextLine()) 
      {
        String line = scanner.nextLine();
        System.out.println(line);
      }
    } 
    catch(FileNotFoundException e)
    {
      System.err.println("Errore file non trovato: " + e.getMessage());
    }
    /*catch(IOException e) 
    {
      System.err.println("Errore nella lettura: " + e.getMessage());
    }*/
  }
}
