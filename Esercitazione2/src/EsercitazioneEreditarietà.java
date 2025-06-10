public class EsercitazioneEreditarietà 
{
    public static void main(String[] args) 
    {
        // Test della classe Prodotto
        System.out.println("---=== TEST CLASSE PRODOTTO ===---");

        // test dei costruttori
        Prodotto p1 = new Prodotto(2, 10.0f, "Pasta", "A123");
        Prodotto p2 = new Prodotto(p1);
        Prodotto p3 = new Prodotto(1, 5.0f, "Riso", "B546");

        // test metodo toString
        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        System.out.println("p3: " + p3.toString() + "\n");

        // test del metodo equals
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true (stessi valori)
        System.out.println("p1.equals(p3): " + p1.equals(p3) + "\n"); // false (valori diversi)

        // test del metodo calcolaCosto
        System.out.println("Costo p1: " + p1.calcolaCosto()); // 20.0 (2 * 10.0)
        System.out.println("Costo p3: " + p3.calcolaCosto() + "\n"); // 5.0 (1 * 5.0)

        // Test della classe ProdottoAlimentare
        System.out.println("\n---=== TEST CLASSE PRODOTTO ALIMENTARE ===---");
        ProdottoAlimentare pa1 = new ProdottoAlimentare(true, "Italia", 3, 8.0f, "Olio", "C789", 20, 7, 2026);
        ProdottoAlimentare pa2 = new ProdottoAlimentare(pa1);
        ProdottoAlimentare pa3 = new ProdottoAlimentare(false, "Spagna", 2, 12.0f, "Vino", "D012", 22, 9, 2026);

        // test metodo isExpired
        System.out.println("pa1: " + pa1.isExpired());
        System.out.println("pa1: " + pa3.isExpired() + "\n");
        
        // test metodo toString
        System.out.println("pa1: " + pa1.toString());
        System.out.println("pa3: " + pa3.toString() + "\n");

        // test del metodo equals
        System.out.println("pa1.equals(pa2): " + pa1.equals(pa2)); // true (stessi valori)
        System.out.println("pa1.equals(pa3): " + pa1.equals(pa3)); // false (valori diversi)
        System.out.println("pa1.equals(p1): " + pa1.equals(p1) + "\n");  // false (classi diverse)

        //test del metodo calcolaCosto
        System.out.println("Costo pa1 (scontato): " + pa1.calcolaCosto()); // 12.0 (3 * 8.0 / 2)
        System.out.println("Costo pa3 (non scontato): " + pa3.calcolaCosto() + "\n"); // 24.0 (2 * 12.0)
    }
}
