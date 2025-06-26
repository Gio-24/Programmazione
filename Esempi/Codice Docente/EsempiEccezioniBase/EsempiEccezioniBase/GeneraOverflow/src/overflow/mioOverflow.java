package overflow;

public class mioOverflow {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        int y = 34;
        System.out.println(somma(x,y));
    }

    public static int somma(int x, int y){
        if ((x>0 && y>0 && x > Integer.MAX_VALUE-y) || 
        (x<0 && y<0 && x < Integer.MIN_VALUE-y))
            System.exit(0);
        return x+y;
    }

}
