package deck;

import cards.Card;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Murad on 27/05/2015.
 */
public class Deck {

    List<Card> cardDeck;

    public Deck() {
        cardDeck = new ArrayList<>();
    }

    public List<Card> createDeck() {
        for (int i = 0; i < Card.Suit.values().length; i++) {
            for (int j = 0; j < Card.Rank.values().length; j++) {
                cardDeck.add(new Card(Card.Rank.values()[j], Card.Suit.values()[i]));
            }
        }
        return cardDeck;
    }

    public List<Card> getCardDeck() {
        return cardDeck;
    }

    public void removeTopCard() {
        cardDeck.remove(cardDeck.size() - 1);
    }

    public void getTopCard() {
        Card card = cardDeck.get(cardDeck.size() - 1);
        System.out.printf("%s %s %s \n", card.getRank(), card.getSuit(), card.getRank().getRank());

    }


    public void showDeck(){
        for(Card item : cardDeck) {
            System.out.printf("%s %s %s %s \n", item.getRank() , item.getSuit() , item.getRank().getRank() , item.getRank().getAltRank());
        }
    }

}


//    public static void main(String[] args) {
//        cardDeck = new ArrayList<>();
//        createDeck();
//        for(Card item : cardDeck){
//            System.out.println(item.getRank() + " " + item.getSuit() + " " + item.getRank().getRank() + " " + item.getRank().getAltRank());
//        }
//    }

