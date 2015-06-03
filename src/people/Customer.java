package people;

import cards.Card;
import cards.Hand;

/**
 * Created by Murad on 28/05/2015.
 */
public class Customer extends Person implements Player {

public void setFreeToPlay(){
    freeToPlay  = true;
}

    private Hand hand;
    public Customer(Hand hand) {
     this.hand = hand;
    }
    public void hit(){

    }

    @Override
    public void viewCardsInHand() {
//        for(Card item :  hand){
//            System.out.println(item.toString());
//        }
    }
}
