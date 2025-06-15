/*
riferimenti lucidi: unità 11
*/
package Ereditarieta;

public class TestPersona
{
  public static void main(String[] args) 
  {
    // test costruttori
    Persona p = new Persona("Simede","Petrabrizio", 40, "Mαschio");
    Studente s = new Studente(p.nome, p.cognome, p.sesso, p.eta, 6, 202020, "informatica");
    
    // test metodi
    p.ChiSei();
    s.ChiSei();
  }
}
