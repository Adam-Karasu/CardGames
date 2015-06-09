package people;

import cards.Card;
import cards.Deck;
import cards.Hand;

/**
 * Created by Murad on 28/05/2015.q
 *
 * Dealer takes care of any manipulation of the deck that has been handed to it.
 *
 * The responsibility of this class is to manipulate a deck
 */
public class Dealer implements GameAction {

    private boolean houseBust = false;

    private Hand hand;


    public Dealer() {

        hand = new Hand();
    }



    /**
     * cycle through this dealers deck and print cards not currently in players hand, and cards that have
     * not been discarded
     * Only cards that are available to be dealt are shown
     */
    public void viewCardsInHand(){
        hand.getCardsInHand();

    }

    @Override
    public void addToPlayerHand(Card card){
        hand.addCardToHand(card);
    }
}
