package table;

import cards.Card;
import cards.Deck;
import people.Dealer;
import people.GameAction;
import people.Player;


/**
 * Created by Murad on 01/06/2015.
 */

//TODO Add functionality to allow more than one player to bet against the dealer

//TODO - add Pub/Sub pattern. House holds Player Subscribers, gameActions are notified of their upcoming turn


/**
 * Table only knows about the interface that players use, this way new types of players can
 * always be added later
 *
 *
 */
public class Table {

    Deck deck;

    public Table( Deck deck) {

        this.deck = deck;
    }

    public void shuffleDeck(){
        deck.shuffleList();
    }
    public Card hit(GameAction player){
        Card cardToHand = deck.removeLastCard();
        player.addToPlayerHand(cardToHand);

        return cardToHand;

    }
}
