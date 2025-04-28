public class Campo 
{
    //relazione di composizione con la classe personaggio
    private Personaggio[][] grid;

    //costruttore
    public Campo(int size)
    {
        grid = new Personaggio[size][size];
    }

    //metodo get di grid
    public Personaggio[][] getGrid()
    {
        return this.grid;
    }

    /*
    metodo che posizione un Personaggio nella posizione (x, y). Controlla prima se 
    nella posione è presente una pedina avversaria e successivamente posiziona il personaggio
    e ne aggiorna le cordinate
    */
    public void placePersonaggio(int x, int y, Personaggio personaggio)
    {
        //controlla sulla posizione (x, y)
        Personaggio occupante = grid[x][y];

        if(!(occupante.getClass() == personaggio.getClass())) //se le classi sono diverse 
        {
            if(occupante != null) // se nella casella è presente una pedina 
            {
                occupante.die(); //viene catturata
            }

            //assegna il riferimento alla posizione (x, y)
            grid[x][y] = personaggio;
        
            //aggiorna le coordinate del personaggio
            personaggio.setX(x);
            personaggio.setY(y);
        }
    }

    /*
    metodo che rimuove il riferimento di un personaggio dalla posizione (x, y)
    */
    public void removePersonaggio(int x, int y)
    {
        grid[x][y] = null;
    }

    /*
    metodo che controlla se la posizione è interna al campo
    */
    public boolean isValidPosition(int x, int y)
    {
        return (x >= 0 && x < grid.length) && (y >= 0 && y < grid.length); 
        // dato che è una matrice quadrata possiamo usare grid.length entrambe le volte
    }

    /*
    NOTE DI SVILUPPO
    la condizione di gameover si verifica quando
     - tutte le pedine di una parte o dell'altra muoiono (vittoria)
       quindi effetua il controllo sull'attributo counter delle classi personaggio
     - termina la sequenza di mosse (patta)
    */
    public boolean gameover()
    {
        return Zombie.get_ZombieCount() > 0 && Alien.get_AlienCount() > 0;
        /*
        essendo la sequenza di mosse prestabilita non è necessario effettuare il controllo sul numero di mosse ma solo
        sul numero di pedine ancora in gioco per ogni esercito 
        */
    }

    /*
    metodo che restituisce il valore corrente della cella di coordinate (x, y)
    */
    public Personaggio whois(int x, int y)
    {
        return grid[x][y];
    }
}
