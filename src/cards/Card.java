package cards;

/**
 * Created by Murad on 27/05/2015.
 */
public class Card {

    public enum Suit {
        CLUB(0), SPADE(1), DIAMOND(2), HEART(3);
        int value;

        private Suit(int value) {
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
        ACE(1, 10), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JOKER(11), QUEEN(12), KING(13);
        int rank;
        int altRank;

        private Rank(int rank) {
            this.rank = rank;
        }
        private Rank(int rank, int altRank) {
            this.rank = rank;
            this.altRank = altRank;
        }
        public int getValue(){
            return rank;
        }

        public int getAltRank() {
            return altRank;
        }
    }

    public Card(Rank rank, Suit suit) {

        this.rank = rank;
        this.suit = suit;
    }

    public static void main(String[] args) {
        Card spade = new Card(Rank.EIGHT, Suit.SPADE);

        System.out.println(spade.getSuit() + " " + spade.getRank());
    }
}
