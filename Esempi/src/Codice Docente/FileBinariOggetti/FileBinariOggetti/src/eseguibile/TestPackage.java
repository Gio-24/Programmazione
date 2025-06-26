package eseguibile;

/**
 *
 * @author domenico
 */
import persona.Persona;
import impiegato.Impiegato;

public class TestPackage {

    /*
    * Driver per il test della classe persona
    */
    public static void main(String[] args) {
        Persona p1 =new Persona("Mario", "Rossi", 35);
        Impiegato i1 =new Impiegato("luca", "Bianchi", 30, "IBM", 3);
        Persona p2 =new Persona("Anna", "Esposito", 15);
        Impiegato i2 =new Impiegato("John", "Smith", 15, "Harrods", 10);
        
      
        Persona Elenco[] = new Persona[4];
        Elenco[0]=p1;
        Elenco[1]=i1;
        Elenco[2]=p2;
        Elenco[3]=i2;

        stampa_oggetti(Elenco,4);
}
    
    public static void stampa_oggetti(Persona [] elenco,int n){
         for(int number=0; number<n; number++){
             System.out.println(elenco[number].toString());
             System.out.println(elenco[number].getClass().getName() + '\n');
          }
    }

    
}
