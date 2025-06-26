/**
 *
 * @author domenico
 */
public class Tartaruga implements Animale {
    
    @Override
    public void verso(){
        System.out.println(".. tartaruga");
    }
    
    @Override
    public double muovi(){
        return 0.1;
    }
    
    @Override
    public double colpisci(){
        return 0.1;
    }
}
