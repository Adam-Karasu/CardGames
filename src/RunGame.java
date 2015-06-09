
import cards.Deck;
import people.Dealer;
import people.Player;
import table.Table;

/**
 * Created by Murad on 28/05/2015.
 */

//TODO - add Singleton pattern

public class RunGame {
    Deck deck;
    Dealer dealer;
    Table table;
    Player player;


    public static void main(String[] args) {
        new RunGame();
    }

    public RunGame() {
        deck = new Deck();//method in called in Deck constructor to create a deck
        table = new Table(deck);
        dealer = new Dealer();
        player = new Player();
        deck.shuffleList();

        table.hit(player);
        table.hit(player);
        table.hit(player);
        System.out.print(player.showValueOfHand());




      // dealer.viewCardsInHand();
        player.viewCards();
    }
}
