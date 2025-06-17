package Sorting;

public class InsertionSort 
{
  public static void main(String[] args) 
  {
    // creazione del vettore
    int[] array = {38, 27, 43, 3, 9, 82, 10};
    // stampa del vettore
    System.out.println("Array originale:");
    print(array);
    // selection sort
    insertionSort(array);
    // stampa del vettore ordinato
    System.out.println("Array ordinato:");
    print(array);  
  }

  public static void insertionSort(int[] arr) 
  {
    int n = arr.length;

    for (int i = 1; i < n; i++) 
    {
      int key = arr[i]; // Elemento da inserire
      int j = i - 1;

      // Sposta gli elementi maggiori del key a destra
      while (j >= 0 && arr[j] > key) 
      {
        arr[j + 1] = arr[j];
        j--;
      }
      // Inserisce il key nella posizione corretta
      arr[j + 1] = key;
    }
  }

  public static void print(int[] vct)
  {
    System.out.println("Stato del vettore:");
    for(int val : vct)
    {
      System.out.print(val + "\t");
    }
    System.out.println();
  }
}
