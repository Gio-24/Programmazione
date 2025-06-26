package arraycodacircolare;

public class RichiestaServizio {
    private String utente;
    private String descrizione;

    public RichiestaServizio(String utente, String descrizione) {
        this.utente = utente;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return utente + " - " + descrizione;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof RichiestaServizio)) return false;
        RichiestaServizio other = (RichiestaServizio) obj;
        return utente.equals(other.utente) && descrizione.equals(other.descrizione);
    }
}

