package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Murad on 27/05/2015.
 * <p>
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

    public void shuffleList() {
        Collections.shuffle(cardDeck);
    }

    public void showDeck( ) {
        for (Card item : cardDeck) {
            System.out.printf("%s \n", item.toString());
        }
    }

    public Card removeLastCard() {
        Card removedCard = cardDeck.remove(cardDeck.size() - 1);
        return removedCard;
    }
}

