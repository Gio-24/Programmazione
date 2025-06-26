package confronto;

import java.util.Arrays;

public class TestUsoConfrontoInArrays {
    public static void main(String[] args) {
        Persona elenco [] = new Persona[4];
        elenco[0] = new Persona (35, "Rossi", "Fabio");
        elenco[1] = new Persona (20, "Verde", "Nunzio");
        elenco[2] = new Persona (33, "Annunziata", "Mario");
        elenco[3] = new Persona (33, "Esposito", "Gennaro");
        
        Arrays.sort(elenco);
        System.out.println("elenco ordinato per ordinamento naturale");
        for (Persona e : elenco) {
            System.out.println(e);
        }
        
        //Ordinamento per Cognome
        Arrays.sort(elenco, new ComparaPerCognome());
        System.out.println("elenco ordinato per cognome");
        for (Persona e : elenco) {
            System.out.println(e);
        }
    }
}
