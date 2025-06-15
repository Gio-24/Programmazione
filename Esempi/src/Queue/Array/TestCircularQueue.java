package Queue.Array;

public class TestCircularQueue 
{
  public static void main(String[] args) 
  {
    // Coda circolare di dimensione 3
    CircularQueue coda = new CircularQueue(3);

    // Aggiunta di richieste (creazione diretta)
    coda.enqueue(new ServiceRequest("Alice", "Richiesta di supporto tecnico"));
    coda.enqueue(new ServiceRequest("Bob", "Problema di accesso"));

    // Creazione e inserimento tramite riferimento
    ServiceRequest richiestaCharlie = new ServiceRequest("Charlie", "Assistenza software");
    coda.enqueue(richiestaCharlie);

    // Tentativo di inserimento oltre la capacità
    if (coda.isFull()) {
      System.out.println("Coda piena. Non è possibile aggiungere nuove richieste.");
    }

    // Stampa stato corrente della coda
    System.out.println("\nContenuto attuale della coda:");
    coda.printQueue();

    // Verifica con richiesta presente
    boolean presente = coda.inList(richiestaCharlie);
    System.out.println("\nLa richiesta di Charlie è presente nella coda? " + presente);

    // Verifica con richiesta NON presente
    ServiceRequest richiestaNonPresente = new ServiceRequest("Eve", "Reset password");
    boolean nonPresente = coda.inList(richiestaNonPresente);
    System.out.println("La richiesta di Eve è presente nella coda? " + nonPresente);

    // Rimozione di un elemento
    ServiceRequest estratta = coda.dequeue();
    System.out.println("\nRichiesta servita: " + estratta);

    // Inserimento di una nuova richiesta (riuso circolare dello spazio)
    coda.enqueue(new ServiceRequest("Diana", "Problema con aggiornamento"));

    // Stato finale
    System.out.println("\nContenuto aggiornato della coda:");
    coda.printQueue();
  }
}
