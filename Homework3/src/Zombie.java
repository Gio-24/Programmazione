public class Zombie extends Personaggio
{
    private static int ZombieCount = 0; // conta il numero di oggetti istanziati di questa classe (static -> globale a livello della classe)

    //costruttore 
    public Zombie(int x, int y)
    {
        super(x, y); // invoca il costruttore della superclasse Personaggio
        ZombieCount++; // incrementa il class counter
    }

    @Override
    protected void die()
    {
        super.die(); // utilizza il metodo die della classe super per impostare l'attributo vivo a false
        ZombieCount--; // decrementa il class counter
    }
    
    //metodo get di ZombieCount
    public static int get_ZombieCount()
    {
        return ZombieCount;
    }

    /*
    movimento Zombie -> x + 1, y (si muovoni lungo le colonne, dall'alto verso il basso)

    controlli da effettuare prima di muovere
     - il personaggio è ancora vivo?
     - la posizione in cui vuole muoversi è valida?
     - la posizione in cui vuole muoversi è già occupata da un altra pedina o è vuota?
     - è una pedina avversaria?
    */
    @Override
    public void move(Campo campo)
    {
        if(this.vivo) // controlla se il personaggio è ancora vivo
        {
            // nuove coordinate
            int newX = this.getX() + 1;
            int newY = this.getY();

            if(campo.isValidPosition(newX, newY)) // controlla se le nuove coordinate sono valide
            {
                Personaggio p = campo.whois(newX, newY);

                if(p != null && this.getClass() != p.getClass()) // controlla se c'è un personaggio e se è un avversario
                {
                    ((Alien)p).die(); // cast da Personaggio ad Alien per richiamare il metodo die sovrascitto
                    
                    campo.removePersonaggio(this.getX(), this.getY()); // rimuove il personaggio dalla posizione corrente
                    campo.placePersonaggio(newX, newY, this); // posizione il personaggio nella nuova posizione 

                    // aggiorna cordinate
                    this.setX(newX);
                    this.setY(newY);
                }
                else if(p == null) // se non c'è un personaggio può spostare
                {
                    campo.removePersonaggio(this.getX(), this.getY()); // rimuove il personaggio dalla posizione corrente
                    campo.placePersonaggio(newX, newY, this); // posizione il personaggio nella nuova posizione

                    // aggiorna cordinate
                    this.setX(newX);
                    this.setY(newY);
                }
            }
        }
    }
}
