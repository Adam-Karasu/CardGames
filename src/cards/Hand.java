package cards;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Murad on 02/06/2015.
 */
public class Hand {

    private List<Card> hand;
    private int handValue;

    public void setUpHand(){
        hand = new ArrayList<>();
    }

    public Hand() {

    }

    public int getHandValue() {
        return handValue;
    }

    public boolean isAce(Card card){
        if(card.getRank() == Card.Rank.ACE){
            return true;
        } else {
            return false;
        }
    }

    public void addCardToHand(Card card){

        if(isAce(card) && handValue > 10){
            handValue += card.getRank().getAltRank();
        } else {
            handValue += card.getRank().getValue();
        }
        hand.add(card);
    }

    public String checkHandValue(){
    String result = "";
        for(Card item : hand){
          result += item.toString() + " ";
        }
        return result;
    }

    public void getCardsInHand(){
        for (Card item : hand){
            System.out.println(item.toString());
        }
    }
}
