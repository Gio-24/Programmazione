package Basics;
/*
riferimenti lucidi: unità 6
*/
import java.util.Scanner;

public class CalcoloFattoriale 
{
    public static void main(String[] args) 
    {
        int n;
        double ris;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Inserisci un numero intero positivo: ");
        n = input.nextInt();

        if (n < 0) 
            System.out.print("il fattoriale non e' definito per numeri interi negativi!");
        else 
        {
            ris = Fattoriale(n); // passaggio per copia della variabile num
            System.out.print("il fattoriale e': " + ris); // concatenzazione tra il literals e ris, viene invocato implicitamente il metodo toString
        }

        input.close();
    }

    public static double Fattoriale(int num)
    {
        double fatt = 1;

        if (num == 0 || num == 1) 
            fatt = 1;
        else 
        {
            for (int i = 1; i <= num; i++)
                fatt *= i;
        }

        return fatt;
    }
}