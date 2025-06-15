package Polimorfismo;

/*
una classe astratta non richiede necessariamente l'implementazione dei metodi
definiti -> sai che una classe erediterà questi metodi
*/
public abstract class Figura 
{
  private String colore_forma;
  private String colore_contorno;

  public Figura() 
  {
    this.colore_forma = "nessuno";
    this.colore_contorno = "nessuno";
  }
  
  public void set_coloref(String cf)
  {
    this.colore_forma = cf; 
  }

  public void set_colorec(String cc)
  {
    this.colore_contorno=cc; 
  }

  public String get_coloref()
  {
    return colore_forma;
  }

  public String get_colorec()
  {
    return colore_contorno;
  }

  public abstract void disegna();
}
