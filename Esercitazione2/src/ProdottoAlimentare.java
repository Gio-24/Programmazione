public class ProdottoAlimentare extends Prodotto
{
    private boolean scontato = false;
    private StringBuilder provenienza = new StringBuilder("*****");
    
    //costruttore di default
    public ProdottoAlimentare() 
    {
        super();
    }

    //costruttore con parametri
    public ProdottoAlimentare(boolean scontato, String provenienza, int quantita, float costoBase, String nomeProdotto, String codice)
    {
        super(quantita, costoBase, nomeProdotto, codice);
        this.scontato = scontato;
        this.provenienza = new StringBuilder(provenienza);
    }

    //costruttore di copia
    public ProdottoAlimentare(ProdottoAlimentare pA)
    {
        super(pA);
        this.scontato = pA.scontato;
        this.provenienza = pA.provenienza;
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
    public String toString()
    {
        return super.toString() + " | Scontato: " + this.scontato + " | Provenienza: " + this.provenienza;
    }

    public boolean equals(ProdottoAlimentare pA)
    {
        

        if (pA == null || this.getClass() != pA.getClass())
            return false; // oggetto con valore nullo o di classe diversa
        if (this == pA)
            return true; // stesso oggetto

        //stesso stato ma oggetti diversi
        return super.equals(pA)
            && this.scontato == pA.scontato 
            && this.provenienza.toString().equals(pA.provenienza.toString());

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
