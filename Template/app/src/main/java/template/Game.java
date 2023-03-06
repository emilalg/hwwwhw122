package template;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Game extends Template{

    /*
    * Noppa peli
    * Isoin luku voittaa :D
    * */

    private int playcount = 0;
    private HashMap<Integer, Integer> playerlist;

    @Override
    void initializeGame() {
        playerlist = new HashMap<>();
    }

    @Override
    void makePlay(int player) {
        playerlist.put(player, ThreadLocalRandom.current().nextInt(1, 7));
        playcount++;
    }

    @Override
    boolean endOfGame() {
        if (playcount == playersCount){
            return true;
        }
        return false;
    }

    @Override
    void printWinner() {
        Map.Entry<Integer, Integer> winner = null;
        for (Map.Entry<Integer, Integer> player : playerlist.entrySet()){
            if (winner == null || winner.getValue()<player.getValue()){
                winner = player;
            }
        }
        System.out.println("Winning player is: " + (winner.getKey()+1) + " with the dice value of " + winner.getValue());
    }
}
