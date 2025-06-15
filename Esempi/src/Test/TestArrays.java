package Test;
/*
riferimenti lucidi: unità 8, unità 9

esempi dei metodi static della classe Arrays
*/

import java.util.Arrays;

public class TestArrays
{
    public static void main(String[] args) 
    {
        //---===| CONFRONTO |===---//
        int[] primoArrayDiInteri = {3, 9, 11, 9, 77};
        int[] secondoArrayDiInteri = {3, 9, 11, 9, 18};

        //confrontiamo i due Array
        boolean verifica = Arrays.equals(primoArrayDiInteri, secondoArrayDiInteri);
        if (verifica) 
            System.out.println("I due array sono uguali");
        else
            System.out.println("I due array sono diversi");
        
        //---===| ORDINAMENTO |===---//
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        //ordiniamo il vettore doubleArray
        Arrays.sort(doubleArray);

        for (double value : doubleArray) {
        System.out.printf("%.1f ", value);
        }

        //---===| RICERCA BINARIA |===---//
        int[] arrayDiInteri = {3, 9, 11, 9, 77};
        //cerchiamo il valore 9 in arrayDiInteri
        int valore = 9;

        int posizione = Arrays.binarySearch(arrayDiInteri, valore);
        if (posizione >= 0)
            System.out.printf("Valore %d trovato in posizione %d%n",valore, posizione);

        //---===| COPIA |===---//
        //copiamo arrayDiInteri in nuovoArray
        int[] nuovoArray = new int[arrayDiInteri.length];
        System.arraycopy(arrayDiInteri,0, nuovoArray, 0, arrayDiInteri.length);
        displayArray(arrayDiInteri, "arrayDiInteri");
        displayArray(nuovoArray, "nuovoArray");
        
    }

    // visualizza valori in ogni array
    public static void displayArray(int[] array, String description) 
    {
    System.out.printf("%n%s: ", description);
    for (int value : array)
        System.out.printf("%d ", value);
    }
}
