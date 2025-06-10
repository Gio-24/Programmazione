package Ereditarieta;

public class Impiegato extends Persona
{
  private String azienda;
  private int anzianita;

  public Impiegato() 
  { 
    super(); 
    azienda = "***"; 
    anzianita = 0;
  }

  public Impiegato(String n, String c, int e, String s, String a, int an)
  { 
    super(n, c, e, s); 
    this.azienda = a; 
    this.anzianita = an;
  }
  public void set_anzianita(int a) 
  {
    this.anzianita = a;
  }
    
  public void set_azienda(String a) 
  {
    this.azienda = a;
  }
    
  public String get_azienda() 
  {
    return azienda;
  }

  public int get_anzianita() 
  {
    return anzianita;
  }

  public String toString() 
  {
    return super.toString() + ' ' + this.azienda + ' ' + this.anzianita;
  }
}
