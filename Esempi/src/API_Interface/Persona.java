package API_Interface;

public class Persona implements Comparable <Persona>, Cloneable
{
  int eta;
  String Cognome;
  String Nome;

  public Persona(int eta, String Cognome, String Nome) 
  {
    this.eta = eta;
    this.Cognome = Cognome;
    this.Nome = Nome;
  }

  public String getNome() 
  {
    return Nome;
  }

  public String getCognome() 
  {
    return Cognome;
  }

  /*
  restituisce un valore >, = o < di zero in base all'ordinamento naturale dell'
  oggetto. scelto in maniera arbitraria, in questo caso l'età.

  N.B. per le stringhe confronto lessicografico
  */
  @Override
  public int compareTo (Persona P) 
  {
    return (this.eta - P.eta);
  }

  /*
  best practice -> evita clone a favore dei costruttori di copia o factory 
  methods (dedicati)

  N.B. la differenza tra shallow e deep copy svanisce in caso di assenza di 
  riferimenti
  */
  @Override
  public Object clone() throws CloneNotSupportedException 
  {
    /* 
    shallow copy -> copia dei valori primitivi e dei riferimenti, i due oggetti
    condividono il rifermineto. le modifiche si possono propagano tra gli 
    oggetti. 
    */
    Persona p = (Persona) super.clone(); // copia bit-per-bit

    /*
    deep copy -> copia dei valori primitivi e dello stato ma usando nuovi 
    riferimenti, le modifiche fatte ad un oggetto non influenzano le 
    copie.
    */ 
    p.Cognome = new String(this.Cognome);
    p.Nome = new String(this.Nome);
    return p;
  }

  @Override
  public String toString() 
  {
    return "Persona{" + "eta: " + eta + ", Cognome:" + Cognome + ", Nome: " + Nome + '}';
  }
}



