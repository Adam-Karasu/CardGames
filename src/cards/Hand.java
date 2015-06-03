package cards;

import people.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Murad on 02/06/2015.
 */
public class Hand {

    private List<Card> hand;


    public Hand() {
        hand = new ArrayList<>();
    }

    public void addCardToHand(Card card){
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
