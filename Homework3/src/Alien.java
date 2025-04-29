public class Alien extends Personaggio
{
    private static int AlienCount = 0; // conta il numero di oggetti istanziati di questa classe (static -> globale a livello della classe)

    //costruttore
    public Alien(int x, int y)
    {
        super(x, y); // invoca il costruttore della superclasse Personaggio
        AlienCount++; // incrementa il class counter
    }

    @Override
    protected void die()
    {        
        super.die();//utilizza il metodo die della classe super per impostare l'attributo vivo a false
        AlienCount--;// decrementa AlienCount
    }

    //metodo get di AlienCount
    public static int get_AlienCount()
    {
        return AlienCount;
    }

    /*
    movimento Alien -> x + 1, y + 1 (si muovo in diagonale, dall'alto verso il basso)

    controlli da effettuare prima di muovere
     - il personaggio è ancora vivo?
     - la posizione in cui vuole muoversi è valida?
     - la posizione in cui vuole muoversi è già occupata da un altra pedina o è vuota?
     - è una pedina avversaria?
    */
    @Override
    public void move(Campo campo)
    {
        if(this.vivo) // controlla se il personaggio è vivo
        {
            // nuove coordinate
            int newX = this.getX() + 1;
            int newY = this.getY() + 1;

            if(campo.isValidPosition(newX, newY)) // controlla se le nuove coordinate sono valide
            {
                Personaggio p = campo.whois(newX, newY); // ritorna il riferimento all'occupante della posizione in cui si vuole muovere

                if(p != null && this.getClass() != p.getClass()) // controlla se c'è un personaggio e se è un avversario
                {
                    ((Zombie)p).die(); // cast da Personaggio a Zombie per richiamare il metodo die sovrascritto

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
