// riferimenti lucidi: unità 12
package Test;

/*
metodi object -> superclasse da cui ereditano tutti gli oggetti
 - getClass -> restituisce il nome della classe
*/
public class TestObject 
{
  public static void main(String[] args) 
  {
    // Creazione di alcuni Integer per i test
    Integer int1 = 100;
    Integer int2 = 100;
    Integer int3 = 100;
    Integer int4 = 200;
    Integer int5 = null;

    // Test del metodo toString()
    System.out.println("=== Test toString() ===");
    System.out.println("int1.toString(): " + int1.toString());
    System.out.println("int4.toString(): " + int4.toString());
    System.out.println();

    // Test del metodo equals()
    System.out.println("---===| Test equals() |===---");
    System.out.println("int1.equals(int2): " + int1.equals(int2)); // true (stesso valore)
    System.out.println("int1.equals(int3): " + int1.equals(int3)); // true (stesso valore)
    System.out.println("int1.equals(int4): " + int1.equals(int4)); // false (valore diverso)
    System.out.println("int1.equals(int5): " + (int5 != null && int1.equals(int5))); // false (int5 è null)
    System.out.println();

    // Test del metodo hashCode()
    System.out.println("---===| Test hashCode() |===---");
    System.out.println("int1.hashCode(): " + int1.hashCode());
    System.out.println("int2.hashCode(): " + int2.hashCode());
    System.out.println("int3.hashCode(): " + int3.hashCode());
    System.out.println("int4.hashCode(): " + int4.hashCode());
    System.out.println("Uguali per int1, int2, int3? " + (int1.hashCode() == int2.hashCode() && int2.hashCode() == int3.hashCode()));
    System.out.println();

    // Test del metodo getClass()
    System.out.println("---===| Test getClass() |===---");
    System.out.println("int1.getClass(): " + int1.getClass());
    System.out.println("int4.getClass(): " + int4.getClass());
    System.out.println("int1.getClass() == int4.getClass(): " + (int1.getClass() == int4.getClass()));
    System.out.println();

    // Test dell'operatore instanceof
    System.out.println("---===| Test instanceof |===---");
    System.out.println("int1 instanceof Integer: " + (int1 instanceof Integer));
    System.out.println("int1 instanceof Number: " + (int1 instanceof Number));
    System.out.println("int1 instanceof Object: " + (int1 instanceof Object));
    System.out.println("int5 instanceof Integer: " + (int5 instanceof Integer));
  }
}
