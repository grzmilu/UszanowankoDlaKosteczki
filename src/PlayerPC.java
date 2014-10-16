import java.util.Random;

public class PlayerPC extends Player
{
    
    @Override
    public int guess()
    {
        Random r = new Random();
        return(r.nextInt(5));
    }
}

