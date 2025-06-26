package eccezioniconcettibase;

public class Stackunwinding {
    public static void main(String[] args) {
        funzione1();
    }
    
    public static void funzione1() {
        funzione2();
    }
  
    public static void funzione2() {
        funzione3();
    }
  
    public static void funzione3() {
       throw new IllegalArgumentException("Errore!");
    }
}
