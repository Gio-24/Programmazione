package Parcheggio;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.NoSuchElementException;

public class Utente implements Serializable
{
  public static void main(String[] args) throws IOException 
  {
    //----------------------------
    //---===|Test Motociclo|===---
    //----------------------------
    // costruttore
    Motociclo m1 = new Motociclo("MO070OM");
    Motociclo m2 = new Motociclo("BO084BB");
    // metodo toString
    System.out.println("Metodo toString:\n" + m1.toString() + "\n" + m2.toString());
    //-----------------------------
    //---===|Test Automobile|===---
    //-----------------------------
    Automobile a1 = new Automobile("EZ789TE");
    Automobile a2 = new Automobile("HW888CW");
    // metodo toString
    System.out.println("Metodo toString:\n" + a1.toString() + "\n" + a2.toString());
    //-----------------------
    //---===|Test Coda|===---
    //-----------------------
    // crea coda vuota
    Coda prova = new Coda<Veicolo>();
    // predicati
    System.out.println("Test predicati coda dopo la creazione(vuota)");
    if(prova.isEmpty())
    {
      System.out.println("la coda è vuota");
    }
    if(!prova.isFull())
    {
      System.out.println("la coda non è piena");
    }
    // append
    System.out.println("Test metodo append:");
    try 
    {
      prova.append(m1);
      prova.append(m2);
      prova.append(a1);
      prova.append(a2);
      prova.append(m1);
    }
    catch(IllegalStateException e) 
    {
      System.err.println(e.getMessage());
    }
    System.out.println("coda dopo append:");
    prova.stampa();
    System.out.println("Test metodo peek:");
    // peek
    try 
    {
      System.out.println(prova.peek().toString());
    }
    catch(NoSuchElementException e) 
    {
      System.err.println(e.getMessage());
    }
    System.out.println("coda dopo peek:");
    prova.stampa();
    System.out.println("Test metodo pop:");
    // pop
    try 
    {
      System.out.println(prova.pop().toString());
    }
    catch(NoSuchElementException e) 
    {
      System.err.println(e.getMessage());
    }
    System.out.println("coda dopo pop:");
    prova.stampa();
    //-----------------------------
    //---===|Test Parcheggio|===---
    //-----------------------------
    // Test costruttore
    Parcheggio p = new Parcheggio<Veicolo>(2,2);
    // test accetta tramite inserisci in coda
    inserisciInCoda(p, a1);
    try
    {
      p.accetta(a2);
      p.faiEntrare(4);
      p.parcheggia(a2);
    }
    catch(ParcheggioException e)
    {
      System.err.println(e.getMessage());
    }
    
    inserisciInCoda(p, m1);
    inserisciInCoda(p, m2);
    // test faientrareeparcheggia
    faiEntrareEParcheggia(p, 3);
    //faiEntrareEParcheggia(p, 4);
    faiEntrareEParcheggia(p, 5);
    faiEntrareEParcheggia(p, 6);
    // test stampa
    System.out.println("Stato interno dopo inserimento");
    p.stampaStatoInterno();
    // test uscita, rimozione e ricerca
    p.uscita(a2, 6);
    System.out.println("Stato interno dopo una rimozione");
    p.stampaStatoInterno();
    //-----------------------
    //---===|Test File|===---
    //-----------------------
    Utente.salvaSuFileBinario(p);
    Parcheggio carica = caricaDaFileBinario("src/Files/data.dat");
    carica.stampaStatoInterno();

  }

  // salva lo stato del parcheggio in file binario
  // N.B. ogni salvataggio sovrascrive il file
  public static void salvaSuFileBinario(Parcheggio p) throws IOException
  {
    try(ObjectOutputStream objOutStrm = new ObjectOutputStream(new FileOutputStream("src/Files/data.dat")))
    {
      objOutStrm.writeObject(p);
    }
    catch(IOException e)
    {
      System.err.println(e.getMessage());
    }
  }

  // carica l'oggetto da un file binario
  public static Parcheggio caricaDaFileBinario(String nomeFile)
  {
    try(ObjectInputStream objInStrm = new ObjectInputStream(new FileInputStream(nomeFile)))
    {
      return (Parcheggio) objInStrm.readObject();
    }
    catch(IOException e)
    {
      System.err.println(e.getMessage());
      return null;
    }
    catch(ClassNotFoundException e)
    {
      System.err.println(e.getMessage());
      return null;
    }
  }

  // prova a inserire un veicolo nella coda di attesa
  public static void inserisciInCoda(Parcheggio p, Veicolo v)
  {
    try 
    {
      p.accetta(v); 
    } 
    catch(ParcheggioException e)
    {
      System.err.println(e.getMessage());
    }
  }

  // esegue l’ingresso del primo veicolo in coda e lo parcheggia
  public static void faiEntrareEParcheggia(Parcheggio p, int oraIngresso)
  {
    try
    {
      Veicolo tmp = p.faiEntrare(oraIngresso);
      p.parcheggia(tmp);
    }
    catch(ParcheggioException e)
    {
      System.err.println(e.getMessage());
    }
  }
}
