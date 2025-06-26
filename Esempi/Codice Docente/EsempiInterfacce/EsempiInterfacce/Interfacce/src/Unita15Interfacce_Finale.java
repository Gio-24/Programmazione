/**
 *
 * @author domenico
 */
public class Unita15Interfacce_Finale {
    public static void main(String[] args) {
        //verifichiamo l'uso della variabile static pubblica
        System.out.println("Il danno base di un "
                + "personaggio Animale è: "
                + "" + Animale.DANNO_BASE_ANIMALE);
        
        Animale[] branco = new Animale[4];
        branco[0]= new Leopardo();
        branco[1]= new Tartaruga();
        branco[2]= new Mutante(); //Ammesso perché anche Animale
        branco[3]= new Leopardo();
        
        for (Animale animale : branco) {
            animale.verso();
            System.out.println("Mi muovo di "+animale.muovi());
        }
    }
    
}
