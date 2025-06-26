package linkedlist;

public class Persona implements Comparable<Persona> {
    private String nome;
    private int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    @Override
    public String toString() {
        return nome + " (" + eta + " anni)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona other = (Persona) obj;
        return eta == other.eta && nome.equals(other.nome);
    }

    @Override
    public int compareTo(Persona other) {
        return Integer.compare(this.eta, other.eta);  // ordinamento per età crescente
    }
}

