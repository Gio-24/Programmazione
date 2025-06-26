package esempioclonazione;

public class TestClonazione {

    public static void main(String[] args) {
        Persona p1 = new Persona (30, "Rossi", "Mario");
        try {
            Persona p = (Persona) p1.clone();
            System.out.println(p.toString());
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
