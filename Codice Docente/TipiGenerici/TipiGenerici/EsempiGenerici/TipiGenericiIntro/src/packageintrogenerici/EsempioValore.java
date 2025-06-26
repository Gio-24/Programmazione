package packageintrogenerici;

/**
 *
 * @author domenico
 */
public class EsempioValore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Valore<Integer> i = new Valore<>(42);
        Valore<String> s = new Valore<>("Napoli");
        Valore<Double> d = new Valore<>(77.11);
        
        System.out.println(i.get()+":"+i.getType());
        System.out.println(s.get()+":"+s.getType());
        System.out.println(d.get()+":"+d.getType());
    }
}
