/**
 *
 * @author Domenico
 */
public class Esempiocasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Comportamento tradizionale
        //Veicolo v=new Veicolo("BYKE",false);
        //Automobile a=new Automobile("PANDA", 5, "FIAT", true);
        
        //System.out.println(v);
        //System.out.println(a);
        
        
        //UPCASTING
        /*
        Si “forza” una classe ad essere una sua superclasse. 
        Può essere esplicito, inserendo la superclasse tra parentesi tonde, 
        o implicito.
        */
         
        /*Veicolo vUpC1 = new Automobile("Q3", 5, "AUDI", true);
        System.out.println(vUpC1);
        
        Veicolo vUpC3 = vUpC1;
        System.out.println(vUpC3);
        
        Automobile a=new Automobile("PANDA", 5, "FIAT", true);
        Veicolo vUpC2 = a;
        //Analogo Veicolo vUpC2 = (Veicolo) a;
        System.out.println(vUpC2);*/
        
        //DOWNCASTING
        /*
        casting da una classe a una sottoclasse. E’ possibile solo se l’oggetto, 
        a run-time, è veramente un oggetto della sottoclasse. 
        Questo controllo è eseguito solo run-time, e viene lanciata, 
        in caso di esito negativo, una ClassCastException.
        */
        //Veicolo v1 = new Automobile("Q3", 5, "AUDI", true);
        //Veicolo vDc = (Automobile) v1;
        //System.out.println(vDc);
        
        //Test1
        //Veicolo v=new Veicolo("BYKE",false);
        //Automobile a1;
        //a1=v;
        
        //Test2
        //Veicolo v=new Veicolo("BYKE",false);
        //Veicolo v2 = (Automobile) v;  
        
        //Test3
        // dà errore di compilazione
        //
        
        //Automobile a1 = new Veicolo("Q3", true);
    }
    
}
