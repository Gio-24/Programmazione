public class ZombiesVSAliens
{
    public static void main(String[] args) 
    {
        // Inizializzazione del campo 5x5
        Campo campo = new Campo(5);
        
        // Creazione degli eserciti (2 Alien e 2 Zombie)
        Alien alien1 = new Alien(0, 0);
        Alien alien2 = new Alien(0, 4);
        Zombie zombie1 = new Zombie(4, 0);
        Zombie zombie2 = new Zombie(4, 4);
        
        // Posizionamento iniziale
        campo.placePersonaggio(0, 0, alien1);
        campo.placePersonaggio(0, 4, alien2);
        campo.placePersonaggio(4, 0, zombie1);
        campo.placePersonaggio(4, 4, zombie2);
        
        // Sequenza di mosse come specificato nell'esempio (senza ArrayList)
        Personaggio[] sequenzaMosse = new Personaggio[8];
        sequenzaMosse[0] = alien1;
        sequenzaMosse[1] = zombie1;
        sequenzaMosse[2] = alien1;
        sequenzaMosse[3] = alien2;
        sequenzaMosse[4] = zombie2;
        sequenzaMosse[5] = zombie1;
        sequenzaMosse[6] = alien1;
        sequenzaMosse[7] = alien1;
        
        // Esecuzione della simulazione
        System.out.println("---=== INIZIO SIMULAZIONE ===---");

        System.out.println("Sequenza di mosse: ");

        for(Personaggio mossa : sequenzaMosse)
        {
            System.out.print(mossa.getClass().getSimpleName() + "\t");
        }

        printBoardState(campo);
        
        for(int i = 0; i < sequenzaMosse.length; i++) 
        {
            Personaggio p = sequenzaMosse[i];

            System.out.println("\nMossa " + (i + 1) + ": " + p.getClass().getSimpleName() + " a (" + p.getX() + "," + p.getY() + ")");
            
            p.move(campo);

            printBoardState(campo);
            
            // Verifica condizioni di vittoria
            campo.gameover();
        }
        
        // Se arriviamo qui, la sequenza è terminata senza vincitori
        System.out.println("\n---=== FINE SIMULAZIONE ===---");
        System.out.println("Alien rimasti: " + Alien.get_AlienCount());
        System.out.println("Zombie rimasti: " + Zombie.get_ZombieCount());
        
        if (Alien.get_AlienCount() == Zombie.get_ZombieCount()) 
        {
            System.out.println("PAREGGIO!");
        } 
        else if (Alien.get_AlienCount() > Zombie.get_ZombieCount()) 
        {
            System.out.println("VITTORIA DEGLI ALIEN!");
        } 
        else 
        {
            System.out.println("VITTORIA DEGLI ZOMBIE!");
        }
    }

    private static void printBoardState(Campo campo)
    {
        System.out.println("\nStato attuale del campo:");

        Personaggio[][] grid = campo.getGrid();
        /*
        for(int i = 0; i < grid.length; i++)
        {
        for (int j = 0; j < grid[i].length; j++)
        {
        Personaggio p = grid[i][j];
        if (p == null)
        {
        System.out.print(" - ");
        }
        else if (p instanceof Alien) 
        {
        System.out.print(" A ");
        }
        else if (p instanceof Zombie)
        {
        System.out.print(" Z "); 
        }
        }
        System.out.println();
    
         */
        for(Personaggio[] row : grid) 
        {
            for(Personaggio col : row) 
            {
                if (col == null)
                {
                    System.out.print(" - ");
                }
                else if (col instanceof Alien) 
                {
                    System.out.print(" A ");
                }
                else if (col instanceof Zombie) 
                {
                    System.out.print(" Z ");
                }
            }

            System.out.println();
        }
    }
}