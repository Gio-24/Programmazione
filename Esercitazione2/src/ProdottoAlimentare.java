public class ProdottoAlimentare extends Prodotto implements Expirable
{
    private boolean scontato = false;
    private StringBuilder provenienza = new StringBuilder("*****");
    private Data scadenza = new Data();
    
    //costruttore di default
    public ProdottoAlimentare() 
    {
        super();
    }

    //costruttore con parametri
    public ProdottoAlimentare(boolean scontato, String provenienza, int quantita, float costoBase, String nomeProdotto, String codice, int d, int m, int y)
    {
        super(quantita, costoBase, nomeProdotto, codice);
        this.scontato = scontato;
        this.provenienza = new StringBuilder(provenienza);
        this.scadenza = new Data(d, m, y);
    }

    //costruttore di copia
    public ProdottoAlimentare(ProdottoAlimentare pA)
    {
        super(pA);
        this.scontato = pA.scontato;
        this.provenienza = pA.provenienza;
        this.scadenza = pA.scadenza;
    }

    //metodi get e set di provenienza
    public StringBuilder getProvenienza()
    {
        return this.provenienza;
    }

    public void setProvenienza(StringBuilder provenienza)
    {
        this.provenienza = provenienza;
    }

    @Override
    public boolean isExpired()
    {
        return this.scadenza.isBeforeToday();
    }

    @Override
    public String toString()
    {
        return super.toString() + " | Scontato: " + this.scontato + " | Provenienza: " + this.provenienza + " | Scadenza: " + this.scadenza.toString();
    }

    public boolean equals(ProdottoAlimentare pA)
    {
        if(pA == null || this.getClass() != pA.getClass())
            return false; // oggetto con valore nullo o di classe diversa
        if(this == pA)
            return true; // stesso oggetto

        //stesso stato ma oggetti diversi
        return super.equals(pA)
            && this.scontato == pA.scontato 
            && this.provenienza.toString().equals(pA.provenienza.toString())
            && this.scadenza.equals(pA.scadenza);
    }

    @Override
    public float calcolaCosto()
    {
        if(this.scontato)
            return super.calcolaCosto() / 2;
        else
            return super.calcolaCosto();
    }
}
