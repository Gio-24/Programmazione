package Sorting;

public class SelectionSort 
{
  public static void main(String[] args) 
  {
    // creazione del vettore
    int[] array = {38, 27, 43, 3, 9, 82, 10};
    // stampa del vettore
    System.out.println("Array originale:");
    print(array);
    // selection sort
    selectionSort(array);
    // stampa del vettore ordinato
    System.out.println("Array ordinato:");
    print(array);  
  }

  // selection sort
  public static void selectionSort(int[] vct)
  {
    int tmp = 0;
    int minIndex = 0;
    // ciclo che scorre il vettore dal primo al penultimo elemento
    for(int i = 0; i < (vct.length - 1); i++)
    {
      minIndex = i;
      // ciclo che scorre il resto del vettore e cerca il valore minore
      for(int j = 1; j < vct.length; j++)
      {
        // controlla se min è maggiore dell'elemento corrente
        if(vct[j] < vct[minIndex])
        {
          minIndex = j;
        }
      }
      // scambio dei valori per aggiornare il min
      tmp = vct[i];
      vct[i] = vct[minIndex];
      vct[minIndex] = tmp;
    }
  }

  // stampa del vettore
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
