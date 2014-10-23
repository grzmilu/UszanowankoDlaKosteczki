package Players;

import java.util.Random;

public class PlayerPC extends Player
{
    
    public PlayerPC()
    {
    }
    
    public PlayerPC(String name)
    {
        super(name);
    }
    
    
    
    
    
    @Override
    public int guess()
    {
        Random r = new Random();
        return(r.nextInt(5));
    }
}

