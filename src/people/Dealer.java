package people;

import cards.Card;
import cards.Deck;
import cards.Hand;

import java.util.*;

/**
 * Created by Murad on 28/05/2015.q
 *
 * Dealer takes care of any manipulation of the deck that has been handed to it.
 *
 * The responsibility of this class is to manipulate a deck
 */
public class Dealer implements Player {

    private boolean houseBust = false;
    private Deck deck = new Deck();
    private Hand hand;

    public Dealer(Deck deck) {

        hand = new Hand();
    }

    /**
     * assigns this dealer with a deck of cards
     * @param deck
     */
    public void assignDealerADeck(Deck deck) {
        this.deck = deck;
    }

    /**
     * Removes the last dealt card from bottom of deck and adds to dealer hand
     */
    public void hit() {
        Card cardToHand = deck.removeLastCard();
        hand.addCardToHand(cardToHand);
    }




    /**
     * cycle through this dealers deck and print cards not currently in players hand, and cards that have
     * not been discarded
     * Only cards that are available to be dealt are shown
     */
    public void viewCardsInHand(){
        hand.getCardsInHand();

    }
}
