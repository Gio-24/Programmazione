package overflow;

public class mioOverflowEccezione {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        int y = 34;
        
        System.out.println(somma(x,y));
        
        /*try {
            System.out.println(somma(x,y));
            }
            catch (IllegalArgumentException e) {
                  System.out.println("Overflow!");
            }
           System.out.println("non sono terminato!");*/    
    }

    public static int somma(int x, int y){
        if ((x>0 && y>0 && x > Integer.MAX_VALUE-y) || 
        (x<0 && y<0 && x < Integer.MIN_VALUE-y))
            throw new IllegalArgumentException("Overflow!"); 
        return x+y;
    }
}
