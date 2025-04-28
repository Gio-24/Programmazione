public class Personaggio 
{
    private int x;
    private int y;
    protected boolean vivo;

    //costruttore
    public Personaggio(int X, int Y)
    {
        this.x = X;
        this.y = Y;
        this.vivo = true;
    }

    //metodi get e set di x
    public int getX() 
    {
        return x;
    }

    public void setX(int x) 
    {
        this.x = x;
    }

    //metodi get e set di y
    public int getY() 
    {
        return this.y;
    }

    public void setY(int y) 
    {
        this.y = y;
    }

    /*
    
    */
    public void move(Campo campo)
    {
        
    }
    
    /*
    metodo che imposta a false l'attributo vivo del personaggio
    */
    protected void die()
    {
        this.vivo = false;
    }
    
}
