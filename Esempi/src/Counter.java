/*
riferimenti lucidi: unità 5

sviluppo della classe Counter in 4 versioni
 1. attributi di istanza e metodi per gestire il contatore
 2. metodi costruttori
 3. metodi setter e getter
 4. metodi di controllo
*/
public class Counter 
{
    // variabili di istanza
    private long value; //valore corrente
    private long max; //valore massimo

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
    }

    public Counter(long number)
    {
        this.value = 0;
        this.max = number;
    }
    /*
    C è passato per riferimento -> copia di un indirizzo
    N.B. un riferimento è una varibile che contiene un indirizzo, quindi simile ad un 
    puntatore ma differisce da quest'ultimo perchè non si può "interagire con l'indirizzo"
    quindi non si può modificare e non dispone di una artmetica
    */
    public Counter(Counter C) 
    {
        /*
        this serve per distinguere l'oggetto corrente rispetto ad un altro oggetto
        */
        this.value = C.value;
        this.max = C.max;
    }

    //setter
    public void setMax(long m)
    {
        this.max = m;
    }

    /*
    in questo caso non c'è un metodo setter per value perchè comporterebbe una
    criticità per il contatore dato che da la possibilità di modificare il valore
    corrente 

    getter
    */
    public long getValue()
    {
        return this.value;
    }

    public long getMax()
    {
        return this.max;
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

    //metodi di gestione
    public boolean ovf() //verifica che il contatore non superi il valore max
    {
        return (this.value + 1) >= this.max;
    }
    
    public boolean unf() //verifica che il contatore non assuma valori negativi
    {
        return this.value < 0;
    }
}
