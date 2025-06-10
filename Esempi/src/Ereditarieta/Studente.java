/*
riferimenti lucidi: unità 11
*/
package Ereditarieta;

/*
La classe Studente estende la classe persona, questo significa che eredita i metodi
di Persona e gli aggiunge i propri metodi Studente.
Un riferimento Studente può prendere il posto di un riferimento Persona, ma non è
sempre vero il contrario.
*/
public class Studente extends Persona 
{
  protected int esami;
  protected int matricola;
  protected String facolta;

  /*
  costruttore sottoclasse
   - costruttore superclasse -> bisogna prima creare l'oggetto generico e poi quello specifico
     (favorisce il riutilizzo di codice)
   - costruttore sottoclasse 
  */
  public Studente(String nome, String cognome, String sesso, int eta, int esami, int matricola, String facolta) 
  {
    super(nome, cognome, eta, sesso); // costruttore superclasse
    this.esami = esami;
    this.matricola = matricola;
    this.facolta = new String(facolta);
  }

  @Override //opzionale
  public void ChiSei() 
  {
    super.ChiSei();
    System.out.println("In particolare sono uno studente iscritto alla facolta di " + facolta + ", matricola: " + matricola + ", esami: " + esami);
  }
}
