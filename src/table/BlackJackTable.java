package table;

import cards.Card;
import cards.Deck;
import people.Dealer;
import people.GameAction;
import people.Player;

import java.util.Scanner;


/**
 * Created by Murad on 01/06/2015.
 */

//TODO Add functionality to allow more than one player to bet against the dealer

//TODO - add Pub/Sub pattern. House holds Player Subscribers, gameActions are notified of their upcoming turn


/**
 * BlackJackTable only knows about the interface that players use, this way new types of players can
 * always be added later
 */
public class BlackJackTable extends BlackJackAlgorithm {

    Deck deck;
    private Scanner scan = new Scanner(System.in);

    public BlackJackTable(Deck deck) {

        this.deck = deck;
    }

    public BlackJackTable() {
        deck = new Deck();
        deck.shuffleList();
    }

    public void shuffleDeck() {
        deck.shuffleList();
    }


    public Card hit(GameAction player) {
        Card cardToHand = deck.removeLastCard();
        player.addToPlayerHand(cardToHand);

        return cardToHand;

    }

    public void playerAction2(Player player) {
        String choice = "";
        while (true) {
            choice = scan.nextLine();
            choice = choice.toLowerCase();
            if (choice.equals("hit")) {
                hit(player);
                System.out.print(player.showValueOfHand());
                player.viewCards();
            } else {
                break;
            }
        }
    }

    public void playerAction(Player player) {
        String choice = "";
        choice = scan.nextLine();
        choice = choice.toLowerCase();
        while (player.getValueOfHand() < 17) {
            if (choice.equals("hit")) {
                hit(player);

            } else {
                return;
            }
        }
    }

    public void play(Player player) {
        while (player.getValueOfHand() < 17) {
            hit(player);
        }
    }



    @Override
    protected void start() {
        System.out.println("do you want to hit?");
    }

    @Override
    protected boolean requestAnotherHit() {
        String choice = "";
        choice = scan.nextLine();
        choice = choice.toLowerCase();
        if (choice.equals("hit")) {
            return true;
        }
        return false;
    }


    protected void makePlay() {

    }

    @Override
    protected void end() {
        System.out.println("end");
    }
}

