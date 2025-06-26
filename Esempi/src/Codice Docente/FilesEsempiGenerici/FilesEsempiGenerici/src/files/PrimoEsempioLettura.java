package files;

import java.io.*;

public class PrimoEsempioLettura {
    public static void main(String[] args) {
        FileReader filein;
        String s = "origine_destinazione/numeri.txt";
        try {
            filein = new FileReader(s);
            int cifra;
            while ((cifra = filein.read()) != -1) {
                System.out.print((char) cifra);
            }
            filein.close();
        } catch (FileNotFoundException e) {
            System.out.println("Errore nella lettura del file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Errore nella chiusura del file: " + e.getMessage());
        }
    }
}
