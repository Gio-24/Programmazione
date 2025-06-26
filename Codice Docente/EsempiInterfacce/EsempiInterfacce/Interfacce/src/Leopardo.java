/**
 *
 * @author domenico
 */
public class Leopardo implements Animale {
    
    @Override
    public void verso() {
        System.out.println(".. leopardo");
    }
    @Override
    public double muovi() {
        return 1.0;
    }
    
     @Override
    public double colpisci(){
        return 0.1;
    }
}
