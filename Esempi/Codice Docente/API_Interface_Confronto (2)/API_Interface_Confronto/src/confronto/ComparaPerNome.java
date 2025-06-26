package confronto;

import java.util.Comparator;

public class ComparaPerNome implements Comparator<Persona> {
    
    @Override
    public int compare (Persona a, Persona b){
        String nome_1 = a.getNome();
        String nome_2 = b.getNome();
        return (nome_1.compareTo(nome_2));
    }
}
