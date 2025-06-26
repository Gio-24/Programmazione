package arraycodacircolare;

public class TestCodaCircolare {
    public static void main(String[] args) {
        // Coda circolare di dimensione 3
        CodaCircolare coda = new CodaCircolare(3);
    
        // Aggiunta di richieste (creazione diretta)
        coda.append(new RichiestaServizio("Alice", "Richiesta di supporto tecnico"));
        coda.append(new RichiestaServizio("Bob", "Problema di accesso"));
    
        // Creazione e inserimento tramite riferimento
        RichiestaServizio richiestaCharlie = new RichiestaServizio("Charlie", "Assistenza software");
        coda.append(richiestaCharlie);
    
        // Tentativo di inserimento oltre la capacità
        if (coda.isFull()) {
            System.out.println("Coda piena. Non è possibile aggiungere nuove richieste.");
        }
    
        // Stampa stato corrente della coda
        System.out.println("\nContenuto attuale della coda:");
        coda.printCoda();
    
        // Verifica con richiesta presente
        boolean presente = coda.inList(richiestaCharlie);
        System.out.println("\nLa richiesta di Charlie è presente nella coda? " + presente);
    
        // Verifica con richiesta NON presente
        RichiestaServizio richiestaNonPresente = new RichiestaServizio("Eve", "Reset password");
        boolean nonPresente = coda.inList(richiestaNonPresente);
        System.out.println("La richiesta di Eve è presente nella coda? " + nonPresente);
    
        // Rimozione di un elemento
        RichiestaServizio estratta = coda.pop();
        System.out.println("\nRichiesta servita: " + estratta);
    
        // Inserimento di una nuova richiesta (riuso circolare dello spazio)
        coda.append(new RichiestaServizio("Diana", "Problema con aggiornamento"));
    
        // Stato finale
        System.out.println("\nContenuto aggiornato della coda:");
        coda.printCoda();
    }
}
