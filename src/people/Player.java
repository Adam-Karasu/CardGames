package people;

import cards.Card;
import cards.Hand;

/**
 * Created by Murad on 28/05/2015.
 */
public class Player implements GameAction {



    private Hand hand;

    public Player() {
        hand = new Hand();
        hand.setUpHand();
    }


  public void viewCards() {
    hand.getCardsInHand();
    }
    public String showValueOfHand(){
       return "Value of Player Hand: " + hand.getHandValue() + "\n";
    }


    @Override
    public void addToPlayerHand(Card card){
        hand.addCardToHand(card);
    }
}
