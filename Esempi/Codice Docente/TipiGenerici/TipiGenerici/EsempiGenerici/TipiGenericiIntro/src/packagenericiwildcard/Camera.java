package packagenericiwildcard;

/**
 *
 * @author domenico
 */
public class Camera {
    public void riconosciOstacolo(Ostacolo<?> ostacolo){
        System.out.println("Ho riconosciuto"+ostacolo.getTipoOstacolo());
    }

    public void riconoscimentoAvanzato (Ostacolo<?> ostacolo) {
        Object tipo = ostacolo.getTipoOstacolo();
        /*
         getTipoOstacolo() restituisce un valore di tipo generico T.
        Ma poiché stai usando Ostacolo<?>, il tipo effettivo è sconosciuto a compile-time.
        Java permette di assegnare qualunque oggetto a una variabile Object,
        questo è un upcasting implicito (cioè sicuro e automatico).
         */
        if (tipo instanceof Pedone) {
            System.out.println("Attenzione: ho rilevato un pedone. Rallento.");
        } else if (tipo instanceof Bici) {
            System.out.println("Attenzione: ho rilevato una bici. Cambio corsia.");
        } else {
            System.out.println("Ostacolo generico rilevato: " + tipo);
        }
    }
}