public class ZombiesVSAliens
{
    public static void main(String[] args) 
    {
        // Inizializzazione del campo 5x5
        Campo campo = new Campo(5);
        
        // Creazione degli eserciti
        Alien alien1 = new Alien(0, 0);
        Alien alien2 = new Alien(1, 0);

        Zombie zombie1 = new Zombie(0, 1);
        Zombie zombie2 = new Zombie(2, 1);
        
        // Posizionamento iniziale
        campo.placePersonaggio(alien1.getX(), alien1.getY(), alien1);
        campo.placePersonaggio(alien2.getX(), alien2.getY(), alien2);
        campo.placePersonaggio(zombie1.getX(), zombie1.getY(), zombie1);
        campo.placePersonaggio(zombie2.getX(), zombie2.getY(), zombie2);
        
        // sequenza di mosse specificata nella traccia
        Personaggio[] sequenzaMosse = new Personaggio[8];
        sequenzaMosse[0] = alien1;
        sequenzaMosse[1] = zombie1;
        sequenzaMosse[2] = alien1;
        sequenzaMosse[3] = alien2;
        sequenzaMosse[4] = zombie2;
        sequenzaMosse[5] = zombie1;
        sequenzaMosse[6] = alien1;
        sequenzaMosse[7] = alien1;
        
        System.out.println("---=== INIZIO SIMULAZIONE ===---\n\nSequenza mosse: ");

        // stampa della sequenza di mosse
        System.out.println("alien1, zombie1, alien1, alien2, zombie2, zombie1, alien1, alien1");

        // stampa dello stato iniziale della matrice
        System.out.println("\nStato iniziale del campo:");
        printBoardState(campo);
        
        // ciclo for per l'esecuzione delle mosse
        for(int i = 0; i < sequenzaMosse.length; i++) 
        {
            if(!campo.gameover()) // controlla se la simulazione non è finita
            {
                Personaggio tmp = sequenzaMosse[i]; // assegna a tmp il riferimento al personaggio che si deve muovere
                String army = (tmp instanceof Alien) ? "Alien" : "Zombie";

                System.out.print("\n\n---" + (i + 1) + "° Turno---\n");

                if(tmp.vivo) // controlla se la pedina è ancora viva
                {
                    System.out.println("muove l'esercito " + army + " dalla posizione (" + tmp.getX() +", "+ tmp.getY() +")");
                    tmp.move(campo);
                }
                else
                    System.out.println("l'esercito " + army + " salta il turno... la pedina è stata mangiata");

                //System.out.println("\nStato attuale del campo:");
                printBoardState(campo);

                System.out.println("Alien rimasti: " + Alien.get_AlienCount());
                System.out.println("Zombie rimasti: " + Zombie.get_ZombieCount());
            }
            
        }
        
        // Se arriviamo qui, la sequenza è terminata senza vincitori
        System.out.print("\n---=== FINE SIMULAZIONE ===---\n\nEsito simulazione: ");

        if (Alien.get_AlienCount() == Zombie.get_ZombieCount()) 
        {
            System.out.println("I due eserciti hanno pareggiato");
        } 
        else if (Alien.get_AlienCount() > Zombie.get_ZombieCount()) 
        {
            System.out.println("ha vinto l'esercito degli Alieni");
        } 
        else 
        {
            System.out.println("ha vinto l'esercito degli Zombie");
        }
    }

    private static void printBoardState(Campo campo)
    {
        System.out.println();

        Personaggio[][] grid = campo.getGrid();

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

        System.out.println();
    }
}