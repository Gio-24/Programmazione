package miaeccezione;

public class EccDerivata {
    public static void main(String[] args) {
        try {
            // Chiama il metodo 'metodo' che lancia un'eccezione di tipo 'MiaEccezione'
            metodo();
        } catch (MiaEccezione e) {
            // Cattura l'eccezione 'MiaEccezione' lanciata dal metodo
            // e stampa il messaggio dell'eccezione
            System.out.println("Eccezione catturata: " + e.getMessage());
        } finally {
            // Il blocco 'finally' viene sempre eseguito, indipendentemente
            // dal fatto che un'eccezione sia stata lanciata o meno
            System.out.println("Questo blocco viene sempre eseguito");
        }
    }

    // Metodo statico che lancia un'eccezione di tipo 'MiaEccezione'
    public static void metodo() throws MiaEccezione {
        // Lancia un'eccezione di tipo 'MiaEccezione' con un messaggio personalizzato
        throw new MiaEccezione("Errore personalizzato");
    }
}

