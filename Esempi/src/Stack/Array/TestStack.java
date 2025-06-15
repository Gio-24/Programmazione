package Stack.Array;

public class TestStack 
{
  public static void main(String[] args) 
  {
    Stack stack = new Stack(4);  // stack di capacità 4

    // Inserimento diretto
    stack.push(new WebPage("https://www.google.com", "Google"));
    stack.push(new WebPage("https://www.unina.it", "Federico II"));

    // Creazione esterna e inserimento
    WebPage paginaExtra = new WebPage("https://www.tuttonapoli.net/", "TuttoNapoli");
    stack.push(paginaExtra);

    // Inserimento aggiuntivo
    stack.push(new WebPage("https://sscnapoli.it/", "SSC Napoli"));

    // Prova a inserire oltre il limite
    if (stack.isFull()) 
    {
      System.out.println("stack piena. Impossibile aggiungere altre pagine.");
    }

    // Visualizza la pagina in cima
    System.out.println("\nTop: " + stack.top());

    // Rimuove una pagina (simula 'indietro' nel browser)
    WebPage rimossa = stack.pop();
    System.out.println("Pop: " + rimossa);

    // Aggiunge una nuova pagina dopo il pop
    stack.push(new WebPage("https://stackoverflow.com", "StackOverflow"));

    // Verifica presenza nella stack
    WebPage daCercare = new WebPage("https://www.tuttonapoli.net/", "TuttoNapoli");
    boolean presente = stack.inStack(daCercare);
    System.out.println("\nLa pagina \"" + daCercare + "\" è presente nella stack? " + presente);

    WebPage nonPresente = new WebPage("https://nonesiste.com", "Non Esiste");
    boolean assente = stack.inStack(nonPresente);
    System.out.println("La pagina \"" + nonPresente + "\" è presente nella stack? " + assente);

    // Stampa cronologia residua
    System.out.println("\nCronologia di navigazione residua:");
    stack.printStack(); 
}
}
