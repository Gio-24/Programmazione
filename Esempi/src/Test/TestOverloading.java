package Test;
/*
riferimenti lucidi: unità 6, unità 7

import static permette di importare la costante Math.PI per poterla richiamare solo
attraverso PI, in modo da facilitare la scrittura
*/
import static java.lang.Math.PI;

public class TestOverloading 
{
    public static void main(String[] args)
    {
        System.out.println("------=== Overloading ===------\n");
        System.out.println("metodo: int Quadrato(3) = "+ Quadrato(3));
        System.out.println("metodo: int Quadrato("+ PI +") = "+ Quadrato(PI));
    }

    public static int Quadrato(int intNum)
    {
        return intNum*intNum;
    }

    /*
    overloading della funzione int Quadrat. In questo caso usiamo il 
    meccanismo per cambiare il tipo del metodo lasciando invariata la
    sua implementazione, in altri casi protrebbe essere utile per cambiare
    anche l'implementazione del metodo (ad esempio i costruttori).

    i metodi che usufruiscono dell'overloading devono essere distinguibili dal
    compilatore per tipo del metodo e tipo, numero ed ordine dei parametri.

    N.B. il nome dei parametri non influisce sull'overloading ma può essere utile
    differenziare i vari metodi
    */
    public static double Quadrato(double doubleNum)
    {
        return doubleNum*doubleNum;
    }
}
