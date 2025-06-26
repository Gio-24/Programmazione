package confronto;

public class TestCompareToTipiBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Integer i = 9;
        Double d = 7.7;
        String s = "Case";
        
        System.out.println(i.compareTo(3));
        System.out.println(i.compareTo(9));
        System.out.println(i.compareTo(13));
        
        
        System.out.println(d.compareTo(11.5));
        
        System.out.println(s.compareTo("Casa"));
        System.out.println(s.compareTo("Case"));
        System.out.println(s.compareTo("case"));
    }
}
