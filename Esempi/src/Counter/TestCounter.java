package Counter;
/*
riferimenti lucidi: unità 5, unità 8
*/

public class TestCounter 
{
    public static void main(String[] args) 
    {
        System.out.print("numero di oggetti contatore creati: " + Counter.get_objcount() + "\n");

        Counter b = new Counter();
        Counter c = new Counter(4);
        Counter d = new Counter(c);

        System.out.print("valore corrente del contatore b: " + b.get_value() + "\n");
        System.out.print("valore corrente del contatore c: " + c.get_value() + "\n");
        System.out.print("valore corrente del contatore d: " + d.get_value() + "\n");

        System.out.print("soglia corrente del contatore b: " + b.get_max() + "\n");
        System.out.print("soglia corrente del contatore c: " + c.get_max() + "\n");
        System.out.print("soglia corrente del contatore d: " + d.get_max() + "\n");

        if(!c.ovf()) 
        {
            c.increment();
            System.out.print("valore corrente del contatore c dopo l'incremento: " + c.get_value() + "\n"); 
        }
        else 
            System.out.print("pre-condizione non verificata, impossibile incrementare c! \n");

        if(!c.unf())
        {
            c.decrement();
            System.out.print("valore corrente del contatore c dopo il decremento: " + c.get_value() + "\n"); 
        }
        else 
            System.out.print("pre-condizione non verificata, impossibile decrementare c! \n");

        if(!c.unf())
        {
            c.decrement();
            System.out.print("valore corrente del contatore c dopo il decremento: " + c.get_value() + "\n"); 
        }
        else 
            System.out.print("pre-condizione non verificata, impossibile decrementare c! \n");

        System.out.print("valore corrente della soglia massima di d: " + d.get_max() + "\n");

        // test del metodo equal
        System.out.print("valore corrente della soglia massima di c: " + c.get_max() + "\n");

        if(c.equals(d)) 
            System.out.print("gli oggetti riferiti da c e d sono uguali \n");
        else 
            System.out.print("gli oggetti riferiti da c e d sono diversi \n");

        if(c==d) 
            System.out.print("c e d sono uguali, quindi puntano allo stesso oggetto \n");
        else 
            System.out.print("c e d sono diversi, quindi puntano a oggetti diversi \n");

        System.out.print("numero di oggetti contatore creati: " + Counter.get_objcount() + "\n");
    }      
}
