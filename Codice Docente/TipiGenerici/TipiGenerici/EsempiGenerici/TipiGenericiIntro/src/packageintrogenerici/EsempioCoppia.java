package packageintrogenerici;

/**
 *
 * @author domenico
 */
public class EsempioCoppia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coppia<Integer> ci = new Coppia<>(10,20);
        Coppia<Double> cd = new Coppia<>(10.5,20.5);
        Coppia<String> cs = new Coppia<>("abc", "def");
        Coppia<Object> co = new Coppia<>("abc", 20);
        
        System.out.println(ci.getPrimo());
        System.out.println(cd.getSecondo());
        System.out.println(cs.getSecondo());
        System.out.println(co.getPrimo()+" : "+ co.getSecondo());
        
    }
    
}
