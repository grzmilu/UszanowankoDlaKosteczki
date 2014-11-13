
import Players.Player;
import Players.PlayerHuman;
import Players.PlayerPC;
import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class Game {

    private Player player;
    private List<Player> players = new ArrayList<>();
    private int amount = 0;

    void start() {
        boolean guess = true;
        int master_throw, gracz_guess;
        Random r = new Random();


        while (guess) {
            for (Player player : players) {

                master_throw = r.nextInt(6) + 1;
                int player_guess = player.guess();

                System.out.println("Rzut mistrza: " + master_throw);
                System.out.println("Zgadniecie gracza " + player.getName() + " " + player_guess);
                if (master_throw == player_guess) {
                    guess = false;
                    System.out.println("Gracz odgadł");
                } else {
                    System.out.println("Pudło\n");
                }



            }
        }






    }

    void removePlayer(String name) {
        
         Player removal;
         for (Player playertemp1 : players) {
                if (playertemp1.getName().equals(name) == true) {       
                    players.remove(playertemp1);
                } //iterator
            }
        
    }

    void addPlayer(Player player) {

        String name = player.getName();

        if (player != null) {
            for (Player playertemp2 : players) {
                if (playertemp2.getName().equals(name) == true) {
                    amount++;
                    player.setName(name + amount);

                }
            }
            //this.player = player;
            players.add(player);
            //  for (Player p : players) {
            //   System.out.println(players);

        } else {
            throw new IllegalArgumentException("Gracz null");
        }

    }
    //ArrayList (kolekcje) obiekt, klasy, dodanie elementu,
    // List<Player> players = new ArrayList<>();
}
