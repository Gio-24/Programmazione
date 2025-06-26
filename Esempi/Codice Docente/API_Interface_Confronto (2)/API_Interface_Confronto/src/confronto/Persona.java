package confronto;

public class Persona implements Comparable<Persona> {
    int eta;
    String Cognome;
    String Nome;

    public Persona(int eta, String Cognome, String Nome) {
        this.eta = eta;
        this.Cognome = Cognome;
        this.Nome = Nome;
        
    }

    public String getNome() {
        return Nome;
    }

    public String getCognome() {
        return Cognome;
    }
    
    @Override
    public int compareTo (Persona P) {
        return (this.eta - P.eta);
    }
    
    @Override
    public String toString() {
        return "Persona{" + "eta=" + eta + ", Cognome=" + Cognome + ", Nome=" + Nome + '}';
    }
}

