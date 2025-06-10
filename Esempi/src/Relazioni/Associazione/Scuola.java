/*
contiene un riferimento ad un altra classe

caridnalità
 - 1-1 -> entrambe le classi contengono un riferimento reciproco
 - 1-n -> una classe contiene una lista di riferimenti di un'altra
 - n-n -> entrambe le classi contengono liste di riferimenti dell'altra classe
*/
package Relazioni.Associazione;

import java.util.List;

public class Scuola 
{
  Rettore rettore; // associazione uno ad uno 
  List<Insegnante> insegnante; // associazione uno a molti
}

