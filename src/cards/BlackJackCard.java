package cards;

/**
 * Created by Murad on 28/05/2015.
 */
public class BlackJackCard extends Card {

    public BlackJackCard(Rank rank, Suit suit) {
        super(rank, suit);
    }

    public int getCardValue() {
        int card = super.getRank().getValue();
        if (card == 1) {
            return 11;
        } else if (card < 10) {
            return card;
        } else {
            return card;
        }
    }

    boolean isAce() {
        return super.getRank().getAltRank() == 1;
    }
}
