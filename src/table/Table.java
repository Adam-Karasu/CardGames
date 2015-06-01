package table;

import people.Dealer;
import people.Player;
import people.PlayerAction;

import java.util.List;

/**
 * Created by Murad on 01/06/2015.
 */
public class Table implements HouseAction{

    Dealer dealer;
    List<PlayerAction> players;

    public Table(Dealer dealer) {
        this.dealer = dealer;
    }

    @Override
    public void addPlayer(PlayerAction player) {
        players.add(player);
        for(PlayerAction item: players){
        }
    }
}
