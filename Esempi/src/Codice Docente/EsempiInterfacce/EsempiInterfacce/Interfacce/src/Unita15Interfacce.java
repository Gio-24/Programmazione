/**
 *
 * @author domenico
 */
public class Unita15Interfacce {
    public static void main(String[] args) {
        Animale[] zoo = new Animale[4];
        zoo[0]= new Leopardo();
        zoo[1]= new Tartaruga();
        zoo[2]= new Tartaruga();
        zoo[3]= new Leopardo();
        for (Animale animale : zoo) {
            animale.verso();
            System.out.println("Mi muovo di "+animale.muovi());
        }
    }
}
