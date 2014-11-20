package Players;

import java.util.Scanner;

public class PlayerHuman extends Player {

    Scanner scan = new Scanner(System.in);

    public PlayerHuman() {
    }

    public PlayerHuman(String name) {
        super(name);
    }

    @Override
    public int guess() {
        System.out.println("Podaj liczbę: ");

        return scan.nextInt();

    }
}
