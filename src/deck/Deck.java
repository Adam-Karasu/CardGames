package deck;

import cards.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Murad on 27/05/2015.
 *
 * Deck is only responsible for creating its self.
 */
public class Deck {

    List<Card> cardDeck;

    public Deck() {
        cardDeck = new ArrayList<>();
        createDeck();
    }

    private List<Card> createDeck() {
        for (int i = 0; i < Card.Suit.values().length; i++) {
            for (int j = 0; j < Card.Rank.values().length; j++) {
                cardDeck.add(new Card(Card.Rank.values()[j], Card.Suit.values()[i]));
            }
        }
        return cardDeck;
    }

    public List<Card> getCurrentDeck() {
        return cardDeck;
    }
}


//    public static void main(String[] args) {
//        cardDeck = new ArrayList<>();
//        createDeck();
//        for(Card item : cardDeck){
//            System.out.println(item.getValue() + " " + item.getSuit() + " " + item.getValue().getValue() + " " + item.getValue().getAltRank());
//        }
//    }

