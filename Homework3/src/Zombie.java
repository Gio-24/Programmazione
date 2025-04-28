public class Zombie extends Personaggio
{
    //variabile globale della classe Zombie
    private static int ZombieCount = 0;

    //costruttore 
    public Zombie(int x, int y)
    {
        //invoca il costruttore della superclasse Personaggio
        super(x, y);
        
        //dopo la creazione del nuovo zombie incrementa il valore di ZombieCount
        ZombieCount++;
    }
    
    //metodo get di ZombieCount
    public static int get_ZombieCount()
    {
        return ZombieCount;
    }

    /*
    gli zombies si muovono di una casella in avanti alla volta
    
    metodo move
     - controlla se il personaggio è vivo e se la posizione in cui il personaggio si vuole muovere 
       è valida tramite il metodo isValidPosition
     - rimuove il personaggio dalla posizione corrente tramite il metodo removePersonaggio
     - controlla se nella 
    */
    @Override
    public void move(Campo campo)
    {
        //nuove coordinate 
        int newX = getX() + 1;
        int newY = getY();

        //verifica se il personaggio è vivo e si muove verso una posizione valida
        if(this.vivo && campo.isValidPosition(newX, newY))
        {
            Personaggio occupante = campo.whois(newX, newY);

            if(occupante == null || occupante.getClass() != this.getClass())
            {
                campo.removePersonaggio(this.getX(), this.getY());

                campo.placePersonaggio(newX, newY, this);                
            }
        }
    }
}
