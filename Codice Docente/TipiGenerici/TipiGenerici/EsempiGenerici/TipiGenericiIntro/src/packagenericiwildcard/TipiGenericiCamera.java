package packagenericiwildcard;

/**
 * @author domenico
 */
public class TipiGenericiCamera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ostacolo<Pedone> ostacolo1 = new Ostacolo<>(new Pedone());
        Ostacolo<Bici> ostacolo2 = new Ostacolo<>(new Bici());
        Camera videoCamera = new Camera();
        videoCamera.riconosciOstacolo(ostacolo1);
        videoCamera.riconosciOstacolo(ostacolo2);
        videoCamera.riconoscimentoAvanzato(ostacolo1);
    }
    
}

