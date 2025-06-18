package Containers.Report;

import java.util.ArrayList;

public class List 
{
  class Nodo
  {
    Report data;
    Nodo next;

    Nodo(Report data)
    {
      this.data = data;
      this.next = null;
    }
  }

  Nodo testa;

  //crea una lista vuota
  public List()
  {
    this.testa = null;
  }

  // controlla se la lista è vuota
  public boolean isEmpty()
  {
    return testa == null;
  }

  // controlla se un elemento è presente nella lista
  public boolean inList(Report elem)
  {
    if(isEmpty())
    {
      throw new IllegalStateException("Errore! Lista vuota.");
    }
    boolean found = false;
    Nodo current = testa;
    while(current != null && !found)
    {
      if(current.data.equals(elem))
      {
        found = true;
      }
      current = current.next;
    }
    return found;
  }

  // aggiunge un elemento in testa
  public void push(Report elem)
  {
    if(isEmpty())
    {
      testa.data = elem;
    }
    else
    {
      Nodo newNodo = new Nodo(elem);
      newNodo.next = testa;
      testa = newNodo;
    }
  }

  // ritorna ed elimina l'elemento in testa alla lista
  public Report pop() throws IllegalStateException
  {
    if(isEmpty())
    {
      throw new IllegalStateException("Errore! Lista vuota.");
    }
    Report tmp = testa.data;
    testa = testa.next;
    return tmp;
  }

  // rimuove l'elemento richiesto
  public void delete(Report elem) throws IllegalStateException, IllegalArgumentException
  {
    if(isEmpty())
    {
      throw new IllegalStateException("Errore! Lista vuota.");
    }
    else if(!inList(elem))
    {
      throw new IllegalArgumentException("Errore! Elemento non presente nella lista.");
    }

    if(testa.data.equals(elem))
    {
      pop();
    }
    else
    {
      Nodo current = testa;
      while(current.next.data.equals(elem))
      {
        current = current.next;
      }
      current.next = current.next.next;
    }
  }

  public ArrayList<Report> caricaArrayList()
  {
    ArrayList<Report> arrayList = new ArrayList<>();
    Nodo current = testa;
    while(current != null)
    {
      arrayList.add(current.data);
      current = current.next;
    }

    return arrayList;
  }

  // carica da un ArrayList ad una List
  public List(ArrayList list)
  {
    for(int i = list.size(); i > )
  }
}
