package Test;
/*
riferimenti lucidi: unità 7
*/
public class TestRiferimenti 
{
    public static void main(String[] args) 
    {
        String str1 = null, str2 = null; // inizializza due riferimenti String a null (non "puntano" a niente)

        /*
        invocazione del costruttore String

        sarebbe bene evitare la creazione di stringhe tramite il costruttore String
        dato che è meno efficiente e crea sia l'oggetto che il literals nello stringpool
        */
        str1 = new String("JAVA");
        str2 = new String("JAVA");

        /*
        confronta tra le stringhe
         - metodo equals -> che confronta lo stato delle stringa
           N.B. equals di default (non sovrascitto) confronta solo il riferimento
         - operatore == che permette di confrontare i riferimenti
           N.B. non fa il confronto dello stato

        al momento del confronto hanno stesso stato/valore ma due riferimenti diversi
        */
        System.out.println("Stesso valore ? " + str1.equals(str2));
        System.out.println("Stesso oggetto ? " + (str1 == str2) + " \n\n");

        /*
        l'operatore = esegue la copia del riferimento dell'oggetto
        N.B. non esegue la copia dello stato
        */
        str2 = str1;

        //al momento del confronto sono lo stesso oggetto (stesso stato e riferimento)
        System.out.println("Stesso valore ? " + str1.equals(str2));
        System.out.println("Stesso oggetto ? " + (str1 == str2) + "\n\n");

        //creazione di un literals -> contenuto solo nello stringpool
        str2 = "JAVA";

        //al momento del confronto hanno lo stato ma riferimento diverso ma è più efficiente rispetto al primo caso
        System.out.println("Stesso valore ? " + str1.equals(str2));
        System.out.println("Stesso oggetto ? " + (str1 == str2) + "\n\n");
    }
}
