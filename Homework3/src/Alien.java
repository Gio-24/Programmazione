public class Alien extends Personaggio
{
    //variabile globale a livello di classe
    private static int AlienCount = 0;

    public Alien(int x, int y)
    {
        //invoca il costruttore della superclasse Personaggio
        super(x, y);
        
        //dopo la creazione del nuovo zombie incrementa il valore di ZombieCount
        AlienCount++;
    }

    //metodo get di AlienCount
    public static int get_AlienCount()
    {
        return AlienCount;
    }

    /*
    metodo move
    */
    @Override
    public void move(Campo campo)
    {
        int newX = this.getX() + 1;
        int newY = this.getY() + 1;

        if(this.vivo && campo.isValidPosition(newX, newY))
        {
            Personaggio occupante = campo.whois(newX, newY);

            if(occupante == null || this.getClass() != occupante.getClass()) //verifica se la 
            {
                campo.removePersonaggio(this.getX(), this.getY()); //rimuovi il personaggio alla posizione attuale

                campo.placePersonaggio(newX, newY, this); //inserisci il personaggio alla nuova posizione
            }
        }
    }
}
