/**
 *
 * @author domenico
 */
public class Mutante implements Umano, Animale{ 
    @Override
    public void verso(){
        System.out.println("..mutante");
    }
    
    @Override
    public double muovi(){
        return 15*MOVIMENTO_BASE_UMANO;
    }
    
    @Override
    public double colpisci(){
        return 18*DANNO_BASE_ANIMALE;
    }
    
    @Override
    public void parla(){
        System.out.println("Sono un mutante");
    }
    
}
