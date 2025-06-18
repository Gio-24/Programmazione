package Parcheggio;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Parcheggio <T extends Veicolo> implements Serializable
{
  private int MAXAUTO;
  private int MAXMOTO;
  private int numauto;
  private int nummoto;
  
  private Coda<Veicolo> codaIngresso; // realizza la relazione con la coda
  private Veicolo[] veicoliParcheggiati;

  // crea un parcheggio vuoto
  public Parcheggio(int a, int m)
  {
    this.MAXAUTO = a;
    this.MAXMOTO = m;
    this.numauto = a;
    this.nummoto = m;
    this.codaIngresso = new Coda<>();
    this.veicoliParcheggiati = new Veicolo[a + m];
  }

  public Parcheggio(Parcheggio p)
  {
    this.MAXAUTO = p.MAXAUTO;
    this.MAXMOTO = p.MAXMOTO;
    this.numauto = p.numauto;
    this.nummoto = p.nummoto;
    this.codaIngresso = p.codaIngresso;
    this.veicoliParcheggiati = p.veicoliParcheggiati;
  }

  public int getNumauto() 
  {
    return numauto;
  }

  public int getNummoto() 
  {
    return nummoto;
  }

  public Parcheggio(String nomeFile) throws IOException, ClassNotFoundException
  {
    try(ObjectInputStream objInStrm = new ObjectInputStream(new FileInputStream(nomeFile)))
    {
      Parcheggio p = new Parcheggio<>((Parcheggio) objInStrm.readObject());
      this.MAXAUTO = p.MAXAUTO;
      this.MAXMOTO = p.MAXMOTO;
      this.numauto = p.numauto;
      this.nummoto = p.nummoto;
      this.codaIngresso = p.codaIngresso;
      this.veicoliParcheggiati = p.veicoliParcheggiati;
    }
    catch(IOException e)
    {
      System.err.println(e.getMessage());
    }
    catch(ClassNotFoundException e)
    {
      System.err.println(e.getMessage());
    }
  }

  /*
  serve ad aggiungere un veicolo alla coda di attesa. Questo metodo deve essere 
  richiamato dalla classe utente e all’atto della chiamata il metodo solleva
  un’apposita eccezione se il parcheggio ha esaurito i posti interni per il tipo
  di veicolo che ha provato ad aggiungersi in coda oppure se la coda ha già 
  raggiunto il numero massimo di elementi.
  */
  public void accetta(Veicolo v) throws ParcheggioException
  {
    if(codaAttesaPiena()) // controlla se la coda è piena
    {
      throw new ParcheggioException("Errore! Al momento la coda d'attesa è piena");
    }
    else
    {
      if(postoDisponibile(v)) // controlla se ci sono posti disponibili
      {
        codaIngresso.append(v); // aggiunge il veicolo alla coda d'attesa
      }
      else
      {
        throw new ParcheggioException("Errore! Al momento non ci sono posti disponibili per " + v.getClass().getSimpleName());
      }
    }
  }
  
  /*
  preleva il primo veicolo dalla coda di attesa e setta l’orario di ingresso del 
  veicolo prelevato. Solleva un’eccezione se non ci sono posti disponibili per il
  tipo di veicolo
  */
  public Veicolo faiEntrare(int oraIngresso) throws ParcheggioException
  {
    if(codaIngresso.isEmpty()) // controlla se la coda è vuota
    {
      throw new ParcheggioException("Errore! Al momento non è presente nessun veicolo in attesa");
    }
    // controlla se è disponibile un posto per il primo elemento della coda
    if(postoDisponibile(codaIngresso.peek()))
    {
      Veicolo tmp = codaIngresso.pop(); // rimuove e salva il primo elemento della coda
      tmp.setIngresso(oraIngresso); // imposta l'orario di ingresso del veicolo prelevato
      return tmp; // ritorna il valore salvato
    }
    else // se non è disponibile nessun posto lancia un eccezione
    {
      throw new ParcheggioException("Errore! Al momento non ci sono posti disponibili per " + codaIngresso.peek().getClass().getSimpleName());
    }
  }

  /*
  aggiunge un veicolo nella prima posizione disponibile dell’elenco delle 
  vetture del parcheggio ed aggiorna il numero di posti disponibili
  */
  public void parcheggia(Veicolo v) throws ParcheggioException
  {
    if(postoDisponibile(v))
    {
      int counter = 0; // contatore ciclo
      // scorre il vettore finchè non trova un posto libero
      while(veicoliParcheggiati[counter] != null )
      {
        counter++; // passa al prossimo elemento
      }
      if(counter >= 0 && counter <= veicoliParcheggiati.length)
      {
        veicoliParcheggiati[counter] = v;
      }
      // aggiorna il numero di posti disponibili
      if(v instanceof Automobile)
      {
        numauto--;
      }
      if(v instanceof Motociclo)
      {
        nummoto--;
      }
    }
    else
    {
      throw new ParcheggioException("Errore! Al momento non ci sono posti dispobili per " + v.getClass().getSimpleName());
    }
  }

  // verifica la disponibilità di posti nel parcheggio per un tipo di veicolo
  public boolean postoDisponibile(Veicolo v)
  {
    if(v instanceof Automobile) // controlla se ci sono posti auto disponibili
    {
      return numauto > 0;
    }
    else if(v instanceof Motociclo ) // controlla se ci sono posti moto disponibili
    {
      return nummoto > 0;
    }
    else
    {
      return false;
    }
  }

  // scorre il vettore dei veicoli parcheggiati cercando un veicolo 
  private int cerca(Veicolo v)
  {
    ordinaVeicoliParcheggiati(new ConfrontaPerTarga());
    int counter = 0; // contatore ciclo
    // scorre il vettore finchè non trova il veicolo
    while(veicoliParcheggiati[counter] != null && !veicoliParcheggiati[counter].equals(v))
    {
      counter++; // passa al prossimo elemento
    }
    return counter;
  }

  // rimuove un elemento dal vettore di veicoli parcheggiati e aggiorna il valore
  // dei posti liberi disponibili
  private void rimuoviVeicolo(int pos)
  {
    Veicolo tmp = veicoliParcheggiati[pos];

    if(tmp != null)
    {
      veicoliParcheggiati[pos] = null; // rimuove l'elemento
      // aggiorna il numero di posti disponibili
      if(tmp instanceof Automobile)
      {
        numauto++;
      }
      else if(tmp instanceof Motociclo)
      {
        nummoto++;
      }
    }
  }

  /*
  rimuove un veicolo dall’insieme dei veicoli del parcheggio. Prima di rimuovere 
  il veicolo il parcheggio setta l’orario di uscita e calcola il prezzo da pagare 
  del veicolo. Il prezzo da pagare dipende dal tipo di veicolo ed è calcolato dal 
  metodo calcolaPrezzo. Il prezzo da pagare è calcolato come (uscita - ingresso+1)*2
  per i motocicli e (uscita - ingresso+1)*4 per le automobili.
  */
  public void uscita(Veicolo v, int oraUscita)
  {
    v.setUscita(oraUscita); // imposta l'ora d'uscita
    v.calcolaPrezzo(); // calcola il prezzo
    rimuoviVeicolo(cerca(v)); // rimuove il veicolo recuperando la posizione da cerca
  }

  // controlla se la coda è piena
  public boolean codaAttesaPiena()
  {
    return codaIngresso.isFull();
  }

  // stampa lo stato posti liberi
  @Override
  public String toString()
  {
    return "Posti disponibili:\nAuto: " + numauto + "\nMoto: " + nummoto;
  }

  // metodo che stampa l'array dei posti liberi come una matrice
  public void stampaStatoInterno()
  {
    // posti disponibili
    System.out.println(this.toString());
    // occupazione dei posti
    int counter = 1;
    for(int i = 0; i < veicoliParcheggiati.length; i++)
    {
      if(veicoliParcheggiati[i] != null)
      {
        if(veicoliParcheggiati[i].getClass() == Automobile.class)
        {
          System.out.print("| A |");
        }
        else//(veicoliParcheggiati[i] instanceof Automobile)
        {
          System.out.print("| M |");
        }
      }
      else if(veicoliParcheggiati[i] == null)
      {
        System.out.print("| - |");
      }
      if(counter % 2 == 0)
      {
        System.out.println();
      }
      counter++;
    }
    System.out.println();
    // stampa della coda
    codaIngresso.stampa();
  }

  // ordina i veicoli parcheggiati utilizzando un List 
  public void ordinaVeicoliParcheggiati(Comparator<Veicolo> c) 
  {
    // Copia gli elementi non null in una lista temporanea
    List<Veicolo> veicoliPresenti = new ArrayList<>();
    for(Veicolo v : veicoliParcheggiati)
    {
      if(v != null) 
      {
        veicoliPresenti.add(v);
      }
    }
    // Ordina la lista con il Comparator ricevuto
    veicoliPresenti.sort(c); // usa Collections.sort o List.sort
    // Re-inserisci nell'array ordinato
    int i = 0;
    for(Veicolo v : veicoliPresenti) 
    {
      veicoliParcheggiati[i++] = v;
    }
    // Imposta il resto dell'array a null (posti liberi in fondo)
    while (i < veicoliParcheggiati.length) 
    {
      veicoliParcheggiati[i++] = null;
    }
  }
}
