package esempiopreliminare;

public class EsempioFinally {
    public static void main(String[] args) {
        String[] array = {"10", "abc", null, "20"};
        for (String str : array) {
            try {
                // Prova a convertire la stringa in un numero intero
                int numero = Integer.parseInt(str);
                System.out.println("Numero convertito: " + numero);
            } catch (NumberFormatException e) {
                // Gestisce l'eccezione se la stringa non può essere convertita in un numero intero
                System.out.println("Errore: la stringa non può essere convertita in un numero intero: " + str);
            } catch (NullPointerException e) {
                // Gestisce l'eccezione se la stringa è null
                System.out.println("Errore: la stringa è null.");
            } finally {
                // Questo blocco viene eseguito sempre
                System.out.println("Blocco finally eseguito.");
            }
        }
    }
}
