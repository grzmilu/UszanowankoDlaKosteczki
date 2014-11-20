
import Players.Player;
import Players.PlayerHuman;
import Players.PlayerPC;
import java.util.*;

public class Game {

    private Player player;
    private List<Player> players_lst = new ArrayList<>();
    private int amount = 0;
    private Map<String, Integer> stats = new HashMap<>();

    void start() {
        boolean guess = true;
        int master_throw, gracz_guess;
        Random r = new Random();
        master_throw = r.nextInt(6) + 1;



        while (guess) {

            for (Player player : players_lst) {


                int player_guess = player.guess();

                System.out.println("Rzut mistrza: " + master_throw);
                System.out.println("Zgadniecie gracza " + player.getName() + " " + player_guess);
                if (master_throw == player_guess) {
                    guess = false;
                    System.out.println("Gracz odgadł");
                    stats.put(player.getName(), stats.get(player.getName()) + 1);
                } else {
                    System.out.println("Pudło\n");
                }



            }
        }






    }

    void removePlayer(String name) {


        Iterator itr = players_lst.iterator();
        while (itr.hasNext()) {
            Player temp1 = (Player) itr.next();
            if (temp1.getName().equals(name)) {
                itr.remove();
                stats.remove(temp1.getName());

            }
        }



    }

    void addPlayer(Player player) {

        String name = player.getName();

        if (player != null) {
            for (Player playertemp2 : players_lst) {
                if (playertemp2.getName().equals(name) == true) {
                    amount++;
                    player.setName(name + amount);

                }

            }
            //this.player = player;
            players_lst.add(player);
            stats.put(player.getName(), 0);
            //  for (Player p : players) {
            //   System.out.println(players);

        } else {
            throw new IllegalArgumentException("Gracz null");
        }

    }
    //ArrayList (kolekcje) obiekt, klasy, dodanie elementu,
    // List<Player> players = new ArrayList<>();

    void displayStats() {
        System.out.println("Podsumowanie:");

//       for (Player playertemp3 : players_lst) {
//          System.out.println(playertemp3.getName() + " wygrał " +" "+
//          stats.get(playertemp3.getName()) + "razy");
//       }

        for (String key : stats.keySet()) {
            System.out.println(key + " wygrał " + " " + stats.get(key) + "razy");
        }

//for (map.entry<stat.integer> stats : entry.set());


    }
}
