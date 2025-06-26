package miaeccezione;

// Classe personalizzata per definire un'eccezione specifica
class MiaEccezione extends Exception {
    // Costruttore della classe 'MiaEccezione' che accetta un messaggio di errore
    public MiaEccezione(String message) {
        super(message);
    }
}
