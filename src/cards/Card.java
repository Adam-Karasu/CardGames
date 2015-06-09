package cards;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by Murad on 27/05/2015.
 * <p>
 * Provides the cards needed for a standard 52 cards deck, but does NOT
 * create the deck
 */
public class Card {

    public enum Suit {
        CLUB(0), SPADE(1), DIAMOND(2), HEART(3);
        int value;

        Suit(int value) {
            this.value = value;
        }
    }

    private Rank rank;
    private Suit suit;

    public Rank getRank() {
        return rank;
    }


    public Suit getSuit() {
        return suit;
    }

    public enum Rank {
        ACE(11, 1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JOKER(11), QUEEN(12), KING(13);
        int value;
        int altRank;

        Rank(int value) {
            this.value = value;
        }

        Rank(int value, int altRank) {
            this.value = value;
            this.altRank = altRank;
        }

        public int getValue() {
            return value;
        }

        public int getAltRank() {
            return altRank;
        }
    }

    public Card(Rank rank, Suit suit) {

        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder();
        value.append(this.getRank() + " ");
        value.append(this.getSuit()  + " ");
        value.append(this.getRank().getValue());
        return value.toString();
    }

    public void shuffle(){

    }
}
