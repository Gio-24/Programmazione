/*
  riferimenti lucidi: unità 11 (ereditarietà), unità 13 (polimorfismo)
*/
package Ereditarieta;
/*
  versione classe Persona
   - costruttore e metodo chi sei
   - 
*/
public class Persona 
{
  /*
  visibilità riguardo l'ereditarietà
   - public -> visibile alle sottoclassi e alle classi esterne
   - protected -> visibile solo alle sottoclassi (viene ereditato)
   - private -> non è visibile al di fuori della classe
  */
  protected int eta;
  protected String nome;
  protected String cognome;
  protected String sesso;

  public Persona() // costruttore di default
  {
    this.nome = "***";
    this.cognome = "***";
    this.eta = 0;
    this.sesso = "***";
  }

  public Persona(String n, String c, int e, String s) 
  {
    this.nome = n;
    this.cognome = c;
    this.eta = e;
    this.sesso = s;
  }

  public void set_nome(String n) 
  {
    this.nome = n;
  }

  public void set_cognome(String c) 
  {
    this.cognome = c;
  }

  public void set_eta(int e) 
  {
    this.eta = e;
  }

  public void set_sesso(String s)
  {
    this.sesso = s;
  }

  public String get_nome() 
  {
    return this.nome;
  }

  public String get_cognome() 
  {
    return this.cognome;
  }

  public int get_eta() 
  {
    return this.eta;
  }

  public String get_sesso()
  {
    return this.sesso;
  }

  public String toString()
  {
    return this.nome + ' ' + this.cognome + ' ' + this.eta;
  }

  public void ChiSei()
  {
    System.out.println("Sono una persona di nome " + this.nome + this.cognome + ", sesso: " + this.sesso + ", eta: " + this.eta); 
  }
}
