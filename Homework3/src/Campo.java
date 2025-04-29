public class Campo 
{
    /* 
    realizza la relazione di composizione tra Campo e Personaggio
    */
    private Personaggio[][] grid; // matrice di tipo Personaggio

    //costruttore
    public Campo(int size)
    {
        grid = new Personaggio[size][size]; // matrice quadrata
    }

    //metodo get di grid
    public Personaggio[][] getGrid()
    {
        return this.grid;
    }

    /*
    assegna all'elemento, specificato dalla posizione (x, y) un riferimento a personaggio. effettua un controllo
    per verificare che la posizione indicata sia valida, tramite il metodo isValidPosition
    */
    public void placePersonaggio(int x, int y, Personaggio personaggio)
    {
        if(isValidPosition(x, y))
            grid[x][y] = personaggio;
    }

    /*
    assegna all'elemento, specificato dalla posizione (x, y), null. effettua un controlloper verificare che la 
    posizione indicata sia valida, tramite il metodo isValidPosition
    */
    public void removePersonaggio(int x, int y)
    {
        if(isValidPosition(x, y))
            grid[x][y] = null;
    }

    /*
    controlla che la posizione (x, y) sia compresa tra le righe e le colonne 
    */
    public boolean isValidPosition(int x, int y)
    {
        return (x >= 0 && x < grid.length) && (y >= 0 && y < grid.length); // dato che è una matrice quadrata possiamo usare grid.length entrambe le volte
    }

    /*
    verifica se uno degli eserciti ha terminato le pedine
    */
    public boolean gameover()
    {
        /*
        essendo la sequenza di mosse prestabilita non è necessario effettuare il controllo sul numero di mosse ma solo
        sul numero di pedine ancora in gioco per ogni esercito 
        */
        return !(Zombie.get_ZombieCount() > 0 && Alien.get_AlienCount() > 0); 
    }

    /*
    metodo che restituisce il valore corrente della cella di coordinate (x, y)
    */
    public Personaggio whois(int x, int y)
    {
        if(isValidPosition(x, y))
            return grid[x][y];
        else
            return null;
    }
}
