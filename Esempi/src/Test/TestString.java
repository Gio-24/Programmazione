package Test;
/*
riderimenti lucidi: unità 9
*/
public class TestString 
{
  public static void main(String[] args) 
  {
    // Costruttori di String
    char[] array = {'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a'};

    String s1 = new String("Ciao"); // Crea una nuova stringa con contenuto "Ciao"
    String s2 = new String(); // Crea una stringa vuota
    String s3 = new String(s1); // Crea una copia dell'oggetto s1
    String s4 = new String(array); // Crea una stringa dai caratteri dell'array
    String s5 = new String(array, 6, 4); // Crea una sottostringa dall'indice 6 (incluso) lunga 4 caratteri

    System.out.println("s1: " + s1);
    System.out.println("s2 (vuota): " + s2);
    System.out.println("s3 (copia di s1): " + s3);
    System.out.println("s4 (da array): " + s4);
    System.out.println("s5 (da array con offset): " + s5);

    // Metodi di base di String
    String nome = "Diego";
    System.out.println("Lunghezza: " + nome.length()); // Restituisce il numero di caratteri della stringa
    System.out.println("Primo carattere: " + nome.charAt(0)); // Restituisce il carattere in posizione 0

    // Copia caratteri da posizione 1 a 3 della stringa in un array
    char[] dest = new char[3];
    nome.getChars(1, 4, dest, 0); // Copia i caratteri "i", "e", "g" in dest
    System.out.println("getChars result: " + new String(dest));

    // Confronto tra stringhe
    String a = new String("ciao");
    String b = "ciao";

    System.out.println("equals: " + a.equals(b)); // true - confronta contenuto
    System.out.println("==: " + (a == b)); // false - confronta riferimenti

    // Confronto ignorando maiuscole/minuscole
    System.out.println("equalsIgnoreCase: " + "Java".equalsIgnoreCase("java")); // true

    // compareTo: confronta lessicograficamente
    System.out.println("compareTo: " + "abc".compareTo("abd")); // valore negativo perché "abc" < "abd"

    // Concatenazione
    String nome1 = "Diego ";
    String cognome = "Maradona";
    String fullName = nome1.concat(cognome); // Unisce le due stringhe in una nuova
    System.out.println("Full name (concat): " + fullName);
    System.out.println("Usando +: " + (nome1 + cognome)); // Equivalente a concat()

    // Altri metodi String
    String frase = "  Ciao Mondo  ";
    System.out.println("toUpperCase: " + frase.toUpperCase()); // Trasforma in maiuscolo
    System.out.println("trim: '" + frase.trim() + "'"); // Rimuove spazi all'inizio/fine
    System.out.println("substring(2, 6): " + frase.substring(2, 6)); // Estrae sottostringa da indice 2 a 5
    System.out.println("replace: " + frase.replace("Mondo", "Java")); // Sostituisce "Mondo" con "Java"

    // StringBuilder: creazione
    StringBuilder sb1 = new StringBuilder(); // Crea un buffer vuoto (capacità iniziale 16)
    StringBuilder sb2 = new StringBuilder(10); // Buffer con capacità iniziale 10
    StringBuilder sb3 = new StringBuilder("Maradona"); // Buffer inizializzato con "Maradona"

    // Aggiunge stringa in fondo
    sb3.append(" è il migliore!");
    System.out.println("StringBuilder append: " + sb3);

    // Inserisce testo in una certa posizione
    sb3.insert(8, "Armando ");
    System.out.println("Insert: " + sb1);

    // Elimina i primi 6 caratteri (da indice 0 a 5 incluso)
    sb3.delete(0, 6);
    System.out.println("Delete: " + sb2);

    // Modifica il carattere all'indice 0
    sb3.setCharAt(0, 'X');
    System.out.println("setCharAt: " + sb3);

    // Inverte il contenuto del buffer
    sb3.reverse();
    System.out.println("reverse: " + sb3);

    // Sostituisce una parte del contenuto con un'altra stringa
    sb3.replace(0, 5, "GOAT"); // Sostituisce i primi 5 caratteri con "GOAT"
    System.out.println("replace: " + sb3);

    // StringBuilder: capacità e lunghezza
    StringBuilder sb4 = new StringBuilder("Diego Armando Maradona");

    // Stampa contenuto, lunghezza effettiva e capacità allocata
    System.out.println("length: " + sb4.length() + ", capacity: " + sb4.capacity());

    // Garantisce una capacità minima di 75 caratteri
    sb4.ensureCapacity(75);
    System.out.println("New capacity: " + sb4.capacity());

    // Imposta la lunghezza del buffer a 5 (tronca il resto)
    sb4.setLength(5);
    System.out.println("After setLength(5): " + sb4);

    // Conversione implicita in stringa tramite toString()
    System.out.println("StringBuilder as String: " + sb4.toString());
  }
}