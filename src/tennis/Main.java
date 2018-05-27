package tennis;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        Player p1 = new Player("Federer");
        Player p2 = new Player("Nadal");

        players.add(p1);
        players.add(p2);

        Game rolandGarros = new Game(p1, p2);

        while(rolandGarros.getCurrentStatus().equals("Ongoing")){
            int luckyPlayer = Math.random() < 0.5 ? 0 : 1;
            rolandGarros.scorePoint(players.get(luckyPlayer));
            System.out.println(rolandGarros.toString() + "\n");
        }
    }
}
