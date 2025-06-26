package eccezioniconcettibase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author domenico
 */

public class Eccezioni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire due numeri interi: ");
        try {
            int x = input.nextInt();
            int y = input.nextInt();
            int ris = DivisionePerZero(x,y);
            System.out.println("Risultato della divisione intera " + x + "/" + y + ":" + ris);
            input.close();
        }
        catch(InputMismatchException e){
            System.err.printf("Eccezione: %s%n", e);
            System.err.println("Non hai inserito due INTERI...");
        }
        catch(ArithmeticException e){
            System.err.printf("Eccezione: %s%n", e);
            System.err.println("Divisione per zero!");
        }

        catch(Exception e){
            System.err.printf("Eccezione generica: %s%n", e);
        }        
      }
      public static int DivisionePerZero(int a, int b){
             return a/b;
      }
}
