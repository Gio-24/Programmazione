package esempiocollections;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
    int eta;
    String Cognome;
    String Nome;

    public Persona(int eta, String Cognome, String Nome) {
        this.eta = eta;
        this.Cognome = Cognome;
        this.Nome = Nome;
    }

    @Override
    public int hashCode() {
        // Utilizzo di Objects.hash per creare un hashCode coerente con equals
        return Objects.hash(eta, Cognome, Nome);
    }

    public String getNome() {
        return Nome;
    }

    public String getCognome() {
        return Cognome;
    }

    @Override
    public int compareTo(Persona P) {
        // Confronto per eta
        return Integer.compare(this.eta, P.eta);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.eta != other.eta) {
            return false;
        }
        if (!Objects.equals(this.Cognome, other.Cognome)) {
            return false;
        }
        return Objects.equals(this.Nome, other.Nome);
    }

    @Override
    public String toString() {
        return "Persona{" + "eta=" + eta + ", Cognome=" + Cognome + ", Nome=" + Nome + '}';
    }
}


