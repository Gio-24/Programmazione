package esempioclonazione;

public class Persona implements Cloneable {
    int eta;
    StringBuilder Cognome;
    StringBuilder Nome;

    public Persona(int eta, String Cognome, String Nome) {
        this.eta = eta;
        this.Cognome = new StringBuilder(Cognome);
        this.Nome = new StringBuilder(Nome);
    }

    public String getNome() {
        return Nome.toString();
    }

    public String getCognome() {
        return Cognome.toString();
    }

    /*
    // Shallow copy (NON adatta per oggetti mutabili come StringBuilder)
    @Override
    public Object clone() throws CloneNotSupportedException {
        Persona p = (Persona) super.clone(); // clone "superficiale": copia i riferimenti
        return p;
    }
    */

    //Deep copy (necessaria per oggetti mutabili)
    @Override
    public Object clone() throws CloneNotSupportedException {
        Persona p = (Persona) super.clone(); // clone superficiale
        p.Cognome = new StringBuilder(this.Cognome.toString()); // deep copy del contenuto
        p.Nome = new StringBuilder(this.Nome.toString());
        return p;
    }

    @Override
    public String toString() {
        return "Persona{" + "eta=" + eta + ", Cognome=" + Cognome + ", Nome=" + Nome + '}';
    }
}

