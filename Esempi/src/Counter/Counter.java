package Counter;
/*
riferimenti lucidi: unità 5, unità 8

sviluppo della classe Counter in 5 versioni
 1. attributi di istanza e metodi per gestire il contatore
 2. metodi costruttori
 3. metodi setter e getter
 4. metodi di controllo
 5. metodi equals ed attributo objcount
*/
public class Counter 
{
    // variabili di istanza
    private long value; // valore corrente
    private final long max; // valore massimo (costante)
    private static long objcount; // contatore degli oggetti istanziati

    /*
    costruttori -> sono pubblici, non hanno un tipo ed hanno lo stesso nome della classe
     - senza argomenti -> valore predefinito
     - con argomenti -> valore dei parametri
     - di copia -> copia il riferimento di un altro oggetto già esistente
     N.B. il compilatore mette a disposizione un costruttore di default se non è stato definito nessun costruttore

     i costruttori sfruttano il meccanismo di overloading
    */
    public Counter()
    {
        this.value = 0;
        this.max = 10;
        Counter.objcount++;
    }

    public Counter(long number)
    {
        this.value = 0;
        this.max = number;
        Counter.objcount++;
    }
    /*
    C è passato per riferimento -> copia di un indirizzo
    N.B. un riferimento è una varibile che contiene un indirizzo, quindi simile ad un 
    puntatore ma differisce da quest'ultimo perchè non si può "interagire con l'indirizzo"
    quindi non si può modificare e non dispone di una artmetica
    */
    public Counter(Counter C) 
    {
        // this serve per distinguere l'oggetto corrente rispetto ad un altro oggetto
        this.value = C.value;
        this.max = C.max;
        Counter.objcount++;
    }

    /*
    in questo caso non c'è un metodo setter per value perchè comporterebbe una
    criticità per il contatore dato che da la possibilità di modificare il valore
    corrente 

    getter
    */
    public long get_value()
    {
        return this.value;
    }

    /*
    il metodo get di un attributo final (immutabile) può comportare un privacy leak
    ovvere utilizzando in modo scorretto il riferimento ritornato dal metodo si può 
    cambiare forzatamente il suo valore

    long tmp = C.max; // assegna a tmp lo stesso riferimento di C.max
    tmp = 10; // quindi C.max = 10
    */ 
    public long get_max()
    {
        return this.max;
    }

    public static long get_objcount()
    {
        return objcount;
    }

    // metodi di gestione per incrementare e decrementare un contatore
    public void increment()
    {
        value++;
    }

    public void decrement()
    {
        value--;
    }

    //metodi predicati
    public boolean ovf() //verifica che il contatore non superi il valore max
    {
        return (this.value + 1) >= this.max;
    }
    
    public boolean unf() //verifica che il contatore non assuma valori negativi
    {
        return this.value < 0;
    }

    public boolean equals(Counter C) // verifica se due contatori sono uguali
    {
        return ((max==C.max) && (value==C.value)); 
    }

    public boolean not_equal(Counter C) // verifica se due contatori non sono uguali
    {
        return !(equals(C));
    }
}
