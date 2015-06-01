package people;

import cards.Card;
import deck.Deck;
import table.HouseAction;

import java.util.*;

/**
 * Created by Murad on 28/05/2015.q
 *
 * Dealer takes care of any manipulation of the deck that has been handed to it.
 *
 * The responsibility of this class is to manipulate a deck
 */
public class Dealer {

    private Deck deck = new Deck();

    /**
     * assigns this dealer with a deck of cards
     * @param deck
     */
    public void assignDealerADeck(Deck deck) {
        this.deck = deck;
    }

    /**
     * Removes the last dealt card from top of deck deck
     */
    private void removeTopCard() {
        getDeck().remove(getDeck().size() - 1);
    }


    public void dealTopCard() {
        Card card = getDeck().get(getDeck().size() - 1);
        removeTopCard();
        System.out.printf("%s %s %s \n", card.getRank(), card.getSuit(), card.getRank().getValue());
    }

    /**
     * cycle through this dealers deck and print cards not currently in players hand, and cards that have
     * not been discarded
     * Only cards that are available to be dealt are shown
     */
    public void deal() {
        int count = 0;
        for (Card item : deck.getCurrentDeck()) {
            count++;
            System.out.printf("%s %s %s %s \n", item.getRank(), item.getSuit(), item.getRank().getValue(), item.getRank().getAltRank());
        }
        System.out.println(count);
    }

    private List<Card> getDeck() {
        return deck.getCurrentDeck();
    }
    public void shuffleList() {
        Collections.shuffle(deck.getCurrentDeck());
    }
}
