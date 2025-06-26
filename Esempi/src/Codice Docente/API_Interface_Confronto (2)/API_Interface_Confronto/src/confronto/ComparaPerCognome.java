package confronto;

import java.util.Comparator;

public class ComparaPerCognome implements Comparator<Persona> {
    
    @Override
    public int compare (Persona a, Persona b){
        String cognome_1 = a.getCognome();
        String cognome_2 = b.getCognome();
        return (cognome_1.compareTo(cognome_2));
    }
}
