package packageintrogenerici;

/**
 *
 * @author domenico
 */
public class EsempioCoppiaGenerici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CoppiaGenerici<Integer,Double> cg = new CoppiaGenerici<> (4, 5.5);
        System.out.println(cg.getPrimo()+" - " +cg.getSecondo());
    }
    
}
