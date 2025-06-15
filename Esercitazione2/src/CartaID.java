// versione semplificata
public class CartaID implements Expirable 
{
    private String nomeIntestatario;
    private Data dataScadenza;

    public CartaID(String nome, Data dataScadenza) 
    {
        this.nomeIntestatario = nome;
        this.dataScadenza = dataScadenza;
    }

    @Override
    public boolean isExpired() 
    {
        return dataScadenza.isBeforeToday();
    }

    @Override
    public String toString() 
    {
        return "Carta d'identità di " + nomeIntestatario + ", scadenza: " + dataScadenza;
    }
}

/*
una versione più dettagliata potrebbe contenere:
 - Numero del documento (univoco)
 - Nome e cognome dell’intestatario
 - Data di nascita
 - Luogo di nascita
 - Nazionalità
 - Sesso
 - Data di rilascio
 - Data di scadenza
 - Autorità rilasciante 
 - Firma del titolare
 - Codice fiscale
 - Indirizzo di residenza
*/

