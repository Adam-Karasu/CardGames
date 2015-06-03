package table;

import people.Dealer;
import people.Player;

import java.util.List;

/**
 * Created by Murad on 01/06/2015.
 */

//TODO Add functionality to allow more than one player to bet against the dealer

//TODO - add Pub/Sub pattern. House holds Customer Subscribers, players are notified of their upcoming turn

public class Table implements HouseAction{

    Dealer dealer;
    List<Player> players;

    public Table(Dealer dealer) {
        this.dealer = dealer;
    }

    @Override
    public void addPlayer(Player player) {
        players.add(player);
    
    }
}
