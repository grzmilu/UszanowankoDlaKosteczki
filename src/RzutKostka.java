

import Players.Player;
import Players.PlayerHuman;
import Players.PlayerPC;
import java.util.Random;

public class RzutKostka 
{
    public static void main(String[] args) 
    {
        
        
     
      /* try {    
        p1.setName("");
        System.out.println("Imię zmienione na: " + p1.getName());
        } catch(IllegalArgumentException e){  System.out.println("Błąd! " + e.getMessage());}
        //rodzina klas wyjątków
        * 
        */
        
       // PlayerPC p1= new PlayerPC();
        //Player p1 = new PlayerHuman();
        Player p1 = new PlayerPC("Nom 1");
        Player p2 = new PlayerPC("Nom 2");
        
        Game game = new Game();
       
 
     game.addPlayer(p1);        
     game.addPlayer(p2);
     
     game.start();
       
        
      
    
        
        
        
        
      
    }
}
