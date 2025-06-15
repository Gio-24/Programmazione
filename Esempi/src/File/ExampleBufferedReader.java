package File;

import java.io.*;

public class ExampleBufferedReader 
{
  public static void main(String[] args) 
  {
    try(BufferedReader br = new BufferedReader(new FileReader("src/doc/data.txt")))
    {
      String line;

      while ((line = br.readLine()) != null) 
        System.out.println(line);
    } 
    catch (IOException e) 
    {
      e.printStackTrace();
    }
  }
}
