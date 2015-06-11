package people;

import cards.Card;
import cards.Hand;

/**
 * Created by Murad on 28/05/2015.
 */

/**
 * TODO viewCards and showValueOfHand rolled into one toString method
 */
public class Player implements GameAction {


    private boolean bust = false;
    private Hand hand;

    public void setLost() {
        bust = true;
    }

    public Player() {

        hand = new Hand();
        hand.setUpHand();
    }


    public void viewCards() {
        hand.getCardsInHand();
    }

    public int getValueOfHand() {
        return  hand.getHandValue();
    }

    public String showValueOfHand() {
        return "Player Hand: " + hand.getHandValue() + "\n";
    }


    @Override
    public void addToPlayerHand(Card card) {
        hand.addCardToHand(card);
    }
}
