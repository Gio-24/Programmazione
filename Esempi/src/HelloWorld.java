/*
riferimenti lucidi: unità 1

il comando class permette di creare una classe
 - HelloWorld rappresenta il nome della classe (si utilizza la convenzione camel case)
 - public è un modificatore di visibilità in questo caso indica che la classe è visibile
   goblalmente (?)
*/
public class HelloWorld 
{
    /*
    main rappresenta il un metodo della classe HelloWorld
     - public rappresenta, come già detto, la visibilità del metodo all'esterno della classe
     - static è un modificatore che specifica che il metodo non necessità di oggetti per l'esecuzione (di classe ?)
       N.B. UN METODO STATIC PUO' INVOCARE SOLO ALTRI METODI STATIC
     - main rappresenta il nome del metodo (punto d'accesso)
       N.B. UNA CLASSE PER ESSERE ESEGUITA (DIRETTAMENTE) HA BISOGNO DI UN PUNTO D'ACCESSO
     - (String[] args) rappresenta gli argomenti del metodo, in questo caso il main prende 
       in input un array di stringhe
    */
    public static void main(String[] args) throws Exception //interfaccia del metodo 
    { //corpo del metodo
        /*
        il metodo println dell'oggetto System.out permette di stampare a video
        una stringa e va automaticamente a capo. Permette di concatenare valori
        ed altre stringhe tramite l'operatore "+".
        */ 
        System.out.println("Hello World!"); 
    }
}
/*
Per eseguire un programma dal prompt dei comandi bisogna fare:
 - utilizzare i comandi dir ed cd per spostarsi nella cartella dove si trova l'eseguibile (.java)
 - utilizzare il comando javac per compilare il file sorgente in bytecode (.class)
   N.B. l'estensione del file sorgente può essere omesso
 - utilizzare il camndo java per invocare la JVM ed eseguire il bytecode
   N.B. non va indicata l'estensione (.class) 
*/
