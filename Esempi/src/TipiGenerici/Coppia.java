package TipiGenerici;

// Classe generica con due tipi
public class Coppia<T, S> 
{
    private T primo;
    private S secondo;

    public Coppia(T primo, S secondo) 
    {
        this.primo = primo;
        this.secondo = secondo;
    }

    public T getPrimo() 
    {
        return primo;
    }

    public S getSecondo() 
    {
        return secondo;
    }

    @Override
    public String toString() 
    {
        return "(" + primo + ", " + secondo + ")";
    }
}

