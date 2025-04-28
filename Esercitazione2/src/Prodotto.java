public class Prodotto 
{
    protected int quantita = 0;
    protected float costoBase = 0.0f;
    private String nomeProdotto = "*****";
    private StringBuilder codice = new StringBuilder("A000");

    //costruttore senza argomenti -> non fa nulla dato che la variabili d'istanza hanno già un valore di default
    public Prodotto() 
    {} 

    //costruttore con argomenti
    public Prodotto(int quantita, float costoBase, String nomeProdotto, String codice)
    {
        this.quantita = quantita;
        this.costoBase = costoBase;
        this.nomeProdotto = nomeProdotto;
        this.codice = new StringBuilder(codice);
    }

    //costruttore di copia
    public Prodotto(Prodotto p)
    {
        this.quantita = p.quantita;
        this.costoBase = p.costoBase;
        this.nomeProdotto = p.nomeProdotto;
        this.codice = p.codice;
    }

    //metodi get e set dell'attributo codice
    public StringBuilder getCodice() 
    {
        return this.codice;
    }

    public void setCodice(StringBuilder codice) 
    {
        this.codice = codice;
    }

    @Override
    public String toString()
    {
        return "Quantità: " + this.quantita + 
               " | Costo Base: " + this.costoBase + 
               " | Nome Prodotto: " + this.nomeProdotto + 
               " | Codice: " + this.codice;
    }

    /*
    metodo equals che esegue il confronto esclusivamente dello stato

    implementare
     - controllo sulla classe
     - controllo stesso oggetto
    */
    public boolean equals(Prodotto p)
    {
        if (p == null || this.getClass() != p.getClass())
            return false; // oggetto con valore nullo o di classe diversa
        if (this == p)
            return true; // stesso oggetto

        //stesso stato ma oggetti diversi
        return this.quantita == p.quantita
            && Double.compare(this.costoBase, p.costoBase) == 0
            && this.nomeProdotto.equals(p.nomeProdotto)
            && this.codice.toString().equals(p.codice.toString());
    }
    
    /*
    IMPLEMENTAZIONE AVANZATA CON OVERRIDE DEL METODO EQUALS
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
            return true; // stesso oggetto
        if (obj == null || getClass() != obj.getClass()) 
            return false; // oggetto nullo o classe diversa

        Prodotto p = (Prodotto) obj; // cast a Prodotto

        return this.quantita == p.quantita
            && Double.compare(this.costoBase, p.costoBase) == 0
            && this.nomeProdotto.equals(p.nomeProdotto)
            && this.codice.toString().equals(p.codice.toString()); // confronto contenuto StringBuilder
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(quantita, costoBase, nomeProdotto, codice.toString());
    }

    public boolean equals(Prodotto p)
    {
        return this.equals((Object) p);    
    }
    */

    public float calcolaCosto()
    {
        return this.costoBase * this.quantita;
    }

    /*
    Il metodo checkCodice verifica che il formato del codice sia corretto. Nello specifico il 
    metodo verifica che 
     - la lunghezza effettiva sia maggiore di 2 caratteri
     - che il primo carattere sia una lettera maiuscola dell’alfabeto inglese
     - che tutti gli altri caratteri successivi siano cifre.
    */
    public boolean checkCodice() 
    {
        if (this.codice.length() <= 2) 
            return false;
        if (!Character.isLetter(this.codice.charAt(0)) || !Character.isUpperCase(this.codice.charAt(0))) 
            return false;
        
        for (int i = 1; i < this.codice.length(); i++) 
        {
            if (!Character.isDigit(this.codice.charAt(i))) 
                return false;
        }

        return true;
    }
}
