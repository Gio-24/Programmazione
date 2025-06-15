/*
forma di contenimento stretto, il ciclo di vita della classe Cuore è legato alla
classe Persona.
*/
package Relazioni.Composizione;

class Persona 
{
  private Cuore cuore = new Cuore(); // Composizione

  void vivi() 
  {
    cuore.batte();
  }
}
