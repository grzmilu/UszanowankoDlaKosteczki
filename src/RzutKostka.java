

import Players.Player;
import Players.PlayerHuman;
import Players.PlayerPC;
import java.util.Random;

public class RzutKostka 
{
    public static void main(String[] args) 
    {
        
        
        Random r = new Random();
       // PlayerPC p1= new PlayerPC();
        //Player p1 = new PlayerHuman();
        Player p1 = new PlayerPC();
        Boolean guess=true;
        int master_throw,gracz_guess;
        try{
            System.out.println("Imie zmienione na "+p1.getName());
        p1.setName("jan anna przybylska drugi");
        p1.setName(null);
        p1.setName("");
        }catch (Exception e){System.out.println("hehe");}
        //rodzina klas wyjątków
        while(guess)
        {
            
            master_throw=r.nextInt(6)+1;
            
            System.out.println("Rzut mistrza: "+master_throw);
            int player_guess=p1.guess();
            System.out.println("Zgadniecie gracza "+p1.getName()+" "+player_guess);
            if(master_throw==player_guess)
             {
                guess=false;
                System.out.println("Gracz odgadł");
             }else System.out.println("Pudło\n");
          
            
            
        }
        
        
        
        
      
    }
}
