package people;

import cards.Card;

/**
 * Created by Murad on 01/06/2015.
 */

//
public interface GameAction {

    int handValue = 0;
    void addToPlayerHand(Card card);
}
