package packageintrowildcard;

public class EsempioCoppiaWildCard {
    public static void main(String[] args) {
        Coppia<?> c = new Coppia<>("uno", "due");
        System.out.println(c.getPrimo());  // ✅ posso leggere (ma non so il tipo esatto)
        //c.setPrimo("tre");        // ❌ ERRORE: tipo sconosciuto
    }
}
