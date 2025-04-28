/*
riferimenti lucidi: unità 4

il comando import permette di includere delle librerie/package/classi -> corrisponde all'include di C

gerarchia
 - libreria -> una collezione di package
 - package -> una contenitore di classi correlate di classi (contiene dei file .java)

graficamente
libreria 
    └── package 
            └── classe

*/ 
import java.util.Scanner; // in questo caso importiamo solo la classe Scanner dell package java.util

public class SommaNumeri // classe somma numeri
{
    public static void main(String[] args) // punto d'accesso
    {
        int risultato = SommaDueNumeri(); // assegna il valore di ritorno del metodo SommaDueNumeri alla variabile risultato
        /*
        metodo printf della classe System.out con lo stesso comportamento di printf in C
         - System -> classe contenuta nel package java.lang
         - out -> è un campo static della classe System di tipo PrintStream
         N.B. i metodi vengono chiamati sul oggetto PrintStram 
        */
        System.out.printf("La somma dei due numeri è %d%n", risultato);
    }

    /*
    è un metodo static quindi
     - può invocare solo altri metodi static
     - può essere invocato senza la presenza di un oggetto (non dipende da dati di oggetti)
    */
    public static int SommaDueNumeri()
    {
        /*
        crea un oggetto scanner che legge input da tastiera
         - new Scanner(...) -> costruttore della classe Scanner
         - System.in -> stream di input standard 
        N.B. in è un campo static della classe System di tipo InputStream (simile a System.out ma di tipo diverso e lo stesso vale per System.err)
        */
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Inserisci il primo numero: ");

        /*
        legge byte inseriti da tastiera e in questo caso cerca dei valori corrispondenti a tipi int (da tradurre)
        */
        int numero1 = scanner.nextInt();

        System.out.printf("Inserisci il secondo numero: ");
        int numero2 = scanner.nextInt();

        /*
        chiusura dello Scanner scanner
        N.B. questaa istruzione interrompe uno scanner specifico ma termina l'input stream da tastiera quindi conviene eseguire il comando solo alla fine del programma e non nei metodi
        */
        scanner.close();

        return numero1 + numero2;
    }
}
