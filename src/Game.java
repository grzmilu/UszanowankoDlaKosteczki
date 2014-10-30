import Players.Player;
import Players.PlayerHuman;
import Players.PlayerPC;
import java.util.ArrayList;
import java.util.List;

import java.util.Random;


    
    
    
    
    
    
    
    
    
public class Game 
{
    
    
   private Player player;
   private List<Player> players = new ArrayList<>();
   
   
    
    void start ()
    {
        Boolean guess=true;
        int master_throw,gracz_guess;
        Random r = new Random();
        
       
        while(guess)
        {
             for (Player player : players){
            
            master_throw=r.nextInt(6)+1;
            int player_guess=player.guess();
            
            System.out.println("Rzut mistrza: "+master_throw);
            System.out.println("Zgadniecie gracza "+player.getName()+" "+player_guess);
                if(master_throw==player_guess)
                 {
                  guess=false;
                  System.out.println("Gracz odgadł");
                 }else System.out.println("Pudło\n");
          
           
            
        }
        }
      
        
 
        
       }
    
    

        
     

     void addPlayer(Player player)
     {
        if(player!=null){
            this.player= player;
            players.add(player);
          //  for (Player p : players) {
         //   System.out.println(players);
      
            }
        
        else {throw new IllegalArgumentException("Gracz null");}

     }
     
     //ArrayList (kolekcje) obiekt, klasy, dodanie elementu,
     // List<Player> players = new ArrayList<>();

  
}
