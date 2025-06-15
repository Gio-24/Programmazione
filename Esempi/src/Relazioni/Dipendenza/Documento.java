/*
la classe Documento usa temporaneamente la classe Stampante per usare il metodo inviaAllaStampante.
*/
package Relazioni.Dipendenza;

public class Documento 
{
  void inviaAllaStampa(Stampante s) 
  {
    s.stampa("Stampando documento...");
  }
}