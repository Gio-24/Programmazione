package TipiGenerici;

public class TestGenerici 
{
  public static void main(String[] args) 
  {
    // Esempio 1: usare una classe generica
    Coppia <String, Integer> studente = new Coppia<>("Mario", 25);
    System.out.println("Studente: " + studente);

    // Esempio 2: estendere una classe generica
    Orario orario = new Orario(14, 30);
    System.out.println("Orario: " + orario.formatoOrario());

    // Esempio 3: metodo che usa '?'
    Coppia<Double, String> misura = new Coppia<>(3.14, "metri");
    Stampa.stampaCoppia(misura);
  }
}
