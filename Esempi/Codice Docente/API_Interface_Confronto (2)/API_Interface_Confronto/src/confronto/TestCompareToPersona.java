package confronto;

public class TestCompareToPersona {

    public static void main(String[] args) {
        Persona p1 = new Persona (30, "Rossi", "Mario");
        Persona p2 = new Persona (25, "Esposito", "Gennaro");
    
        System.out.println(p1.compareTo(p2));
        
        ComparaPerCognome cpc = new ComparaPerCognome();
        System.out.println(cpc.compare(p1, p2));
        
        ComparaPerNome cpn = new ComparaPerNome();
        System.out.println(cpn.compare(p1, p2));
    }
    
}
