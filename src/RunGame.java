
import people.Dealer;
import people.Player;
import table.BlackJackTable;

/**
 * Created by Murad on 28/05/2015.
 */

//TODO - add Singleton pattern

public class RunGame {

    Dealer dealer;
    BlackJackTable blackJackTable;
    Player player;


    public static void main(String[] args) {
        new RunGame();
    }

    public RunGame() {

        blackJackTable = new BlackJackTable();
        dealer = new Dealer();
        player = new Player();

        blackJackTable.startGame(player);


    }
}


