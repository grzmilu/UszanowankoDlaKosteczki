
import Players.Player;
import Players.PlayerHuman;
import Players.PlayerPC;
import java.util.Random;

public class RzutKostka {

    public static void main(String[] args) {



        /*
         * try { p1.setName(""); System.out.println("Imię zmienione na: " +
         * p1.getName()); } catch(IllegalArgumentException e){
         * System.out.println("Błąd! " + e.getMessage());} //rodzina klas
         * wyjątków
         *
         */

        // PlayerPC p1= new PlayerPC();
        //Player p1 = new PlayerHuman();
        Player p1 = new PlayerPC("Antoni");
        Player p2 = new PlayerPC("Antoni");
        Player p3 = new PlayerPC("Antoni");
        Player p4 = new PlayerPC("Antoni");
        Player p5 = new PlayerPC("Waldek");
        Player p6 = new PlayerPC("Antoni");



        Game game = new Game();


        game.addPlayer(p1);
        game.addPlayer(p2);
        game.addPlayer(p3);
        game.addPlayer(p4);
        game.addPlayer(p5);
        game.addPlayer(p6);

        game.removePlayer("Waldek");

        game.start();



        game.displayStats();





    }
}
