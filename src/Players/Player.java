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
        else {
 //jeśli nazwa nie jest poprawna, rzucamy wyjątek IllegalArgumentException z odpowiednim komunikatem
        throw new IllegalArgumentException("Imię nie może być puste!");
      }
    }
    
    
    public String getName()
    {
    return name;
    }
    
    public abstract int guess();
    
}
