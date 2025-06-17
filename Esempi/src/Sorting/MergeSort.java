package Sorting;

public class MergeSort 
{
  // Metodo principale per avviare l'ordinamento
  public static void mergeSort(int[] array) 
  {
    if (array == null || array.length <= 1) 
    {
      return; // Caso base: array già ordinato o vuoto
    }
    int[] temp = new int[array.length]; // Array temporaneo per il merge
    mergeSort(array, temp, 0, array.length - 1);
  }

  // Metodo ricorsivo per dividere l'array
  private static void mergeSort(int[] array, int[] temp, int left, int right) 
  {
    if (left < right) 
    {
      int mid = left + (right - left) / 2; // Trova il punto medio
      mergeSort(array, temp, left, mid);    // Ordina la metà sinistra
      mergeSort(array, temp, mid + 1, right); // Ordina la metà destra
      merge(array, temp, left, mid, right);   // Combina le due metà
    }
  }

  // Metodo per fondere (merge) due sottoarray ordinati
  private static void merge(int[] array, int[] temp, int left, int mid, int right) 
  {
    // Copia i dati nell'array temporaneo
    System.arraycopy(array, left, temp, left, right - left + 1);

    int i = left;    // Indice per la metà sinistra
    int j = mid + 1; // Indice per la metà destra
    int k = left;    // Indice per l'array risultante

    // Confronta gli elementi e inserisce il minore nell'array originale
    while (i <= mid && j <= right) 
    {
      if (temp[i] <= temp[j]) 
      {
        array[k++] = temp[i++];
      }
      else 
      {
        array[k++] = temp[j++];
      }
    }

      // Copia gli elementi rimanenti della metà sinistra (se presenti)
      while (i <= mid) 
      {
        array[k++] = temp[i++];
      }
      // La metà destra non necessita di copia: già al posto giusto
    }

    // Metodo di utilità per stampare l'array
    public static void printArray(int[] array) 
    {
      for (int num : array)
      {
        System.out.print(num + "\t");
      }
      System.out.println();
    }

    // Esempio di utilizzo
    public static void main(String[] args) 
    {
      int[] array = {38, 27, 43, 3, 9, 82, 10};
      System.out.println("Array originale:");
      printArray(array);

      mergeSort(array);

      System.out.println("Array ordinato:");
      printArray(array);
    }
}
