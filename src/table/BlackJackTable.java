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
public class BlackJackTable {

    Deck deck;
    private Scanner scan = new Scanner(System.in);

    public BlackJackTable(Deck deck) {
        this.deck = deck;
    }

    public BlackJackTable() {
        deck = new Deck();
        deck.shuffleList();
    }

    private Card hit(GameAction player) {
        Card cardToHand = deck.removeLastCard();
        player.addToPlayerHand(cardToHand);
        System.out.print(player.showValueOfHand());
        player.viewCards();
        return cardToHand;
    }

    private void stand(GameAction player){

    }

    private void insurance(GameAction player){

    }

    private void split(GameAction player){

    }

    private void doubleDown(GameAction player){

    }

    public void startGame(GameAction player) {
        String choice = "";
        boolean stop = false;
        do {
            choice = scan.nextLine();
            choice = choice.toLowerCase();
            switch (choice){
                case "hit":
                    hit(player);
                    break;
                case "stand":
            //        stand(player);
                    break;
                case "insurance":
            //        insurance(player);
                    break;
                case "split":
           //         split(player);
                    break;
                case "double down":
                    //         doubleDown(player);
                    break;
                default:
                    stop = true;
                    break;
            }
        } while(!stop);
    }
}




//    public void playerAction(Player player) {
//        String choice = "";
//        choice = scan.nextLine();
//        choice = choice.toLowerCase();
//        while (player.getValueOfHand() < 17) {
//            if (choice.equals("hit")) {
//                hit(player);
//
//            } else {
//                return;
//            }
//        }
//    }