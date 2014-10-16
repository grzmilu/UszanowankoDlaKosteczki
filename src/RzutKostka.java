

import java.util.Random;

public class RzutKostka 
{
    public static void main(String[] args) 
    {
        
        Random r = new Random();
       // PlayerPC p1= new PlayerPC();
        Player p1 = new PlayerHuman();
        Boolean guess=true;
        int master_throw,gracz_guess;
        
 
        while(guess)
        {
            
            master_throw=r.nextInt(6)+1;
            
            System.out.println("Rzut mistrza: "+master_throw);
            int player_guess=p1.guess();
            System.out.println("Zgadniecie gracza: "+player_guess);
            if(master_throw==player_guess)
             {
                guess=false;
                System.out.println("Gracz odgadł");
             }else System.out.println("Pudło\n");
          
            
        }
        
        
        
        
      
    }
}
