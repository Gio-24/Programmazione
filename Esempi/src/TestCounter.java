/*
riferimenti lucidi: unità 5
*/
public class TestCounter 
{
    public static void main(String[] args) 
    {
        // creazione degli oggetti
        Counter b = new Counter();
        Counter c = new Counter(4);
        Counter d = new Counter(c); //copia di c
        
        // stampa dei valori correnti e massimi
        System.out.print("valore corrente del contatore b: " + b.getValue() + "\n");
        System.out.print("valore corrente del contatore c: " + c.getValue() + "\n");
        System.out.print("valore corrente del contatore d: " + d.getValue() + "\n");
        System.out.print("soglia corrente del contatore b: " + b.getMax() + "\n");
        System.out.print("soglia corrente del contatore c: " + c.getMax() + "\n");
        System.out.print("soglia corrente del contatore d: " + d.getMax() + "\n");
       
        // incrementi con verifica
        if(!c.ovf()) // negazione di ovf -> se non è in overflow allora incrementa 
        {
            c.increment(); //metodo chiamato sull'oggetto con la dot notation
            System.out.print("valore corrente del contatore c dopo l'incremento: " + c.getValue() + "\n");
        }
        else System.out.print("pre-condizione non verificata, impossibile incrementare c! \n");

        if(!c.unf()) //negazione della condizione -> decremnta se non è in underflow
        {
            c.decrement();
            System.out.print("valore corrente del contatore c dopo il decremento: " + c.getValue() + "\n");
        }
        else System.out.print("pre-condizione non verificata, impossibile decrementare c! \n");

        if(!c.unf())
        {
            c.decrement();
            System.out.print("valore corrente del contatore c dopo il decremento: " + c.getValue() + "\n");
        }
        else System.out.print("pre-condizione non verificata, impossibile decrementare c! \n");
       
        d.setMax(20);
        System.out.print("valore corrente della soglia massima di d: " + d.getMax() + "\n");
    }
       
}
