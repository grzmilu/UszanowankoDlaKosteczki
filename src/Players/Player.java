package Players;


public abstract class Player 
{
    
    private String name;
    
    public Player()
    {
        this.name = "Anonek";
        
    }
    
  
    public Player(String name)           
    {
        this.name=name;
    }
    
    public void setName(String name) // odnosi sie do najblizszego name
    {
        if(name!=null && !name.isEmpty())this.name = name; //this then obiekt
        else { throw new IllegalArgumentException();}
    }
    
    public String getName()
    {
    return name;
    }
    
    public abstract int guess();
    
}
