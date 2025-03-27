
import java.util.Scanner;

public class TestCerchio 
{
    public static void main(String[] args) throws Exception 
    {
        Cerchio vct[] = new Cerchio[5]; //dichiarazione di un array di 5 oggetti Cerchio
        double tmp; //variabile temporanea per input da tastiera
        
        try (Scanner input = new Scanner(System.in)) {
            //ciclo che chiede in input il valore del raggio e crea il nuovo cerchio
            for(int i = 0; i < vct.length; i++)
            {
                System.out.printf("Inserisci il valore del raggio del %d° cerchio: ", i + 1);
                tmp = input.nextDouble();
                vct[i] = new Cerchio(tmp);
            }
            
            //ciclo che stampa il valore del perimetro per ogni elemento Cerchio del vettore
            for(int i = 0; i < vct.length; i++)
            {
                System.out.printf("Il perimetro del %d° cerchio è %.2f m%n", i+1, vct[i].perimetro());
            }
        }
    }
}
