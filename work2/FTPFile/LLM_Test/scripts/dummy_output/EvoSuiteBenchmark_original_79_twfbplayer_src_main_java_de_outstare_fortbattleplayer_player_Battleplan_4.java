// BattleplanTest.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplan}.
* It contains one unit test case for the {@link Battleplan#numberOfRounds()} method.
*/
class BattleplanTest {
		private static final Logger LOG = Logger.getLogger(BattleplanTest.class.getName());
	//@TestsAll
	public final double score = 3;// Score of player; 0 for opponent, non-0 for both
	public final int step = 13;
	public final int round = 2; // round that the player played; 0 for opponent, non-0 for both
}

class Order {

    // BattleplanTest
	/**
	 * It has a score and a step
	 */
    public int turnScore;
    // Step 
	public int turnStep;
}

/**
 * A list of all players in the game. A player contains a score and a state of
 * the turn.
 */
class Players {

    private Players() { return; }

    public final SortedMap<Integer, Order> orders = new TreeMap<>(); // player's turn
    public final Map<Integer, Integer> idToPlayer = new Map<>(); // turns by player id
    @SuppressWarnings({"RedundantThrows"})
    public final Map<Integer, Integer> playerIdToTurn = new Map<>(); // turns by player id
    // to set
}

/**
 * @author daniel
 */
public class BattleplanTest3 {
    private BattleplanTest3() {
        LOG.info("BattleplanTest3()");
    }

    private static final PlayerId PLUGIN_ID = PlayerId.NONE;// Not needed currently
    public static void main(String[] args) {
        LOG.info("BattleplanTest3()");
        PLUGIN_ID.load();
        init();
    }

    /**
     * Runs once in each round of the game.
     */
    private void init() {
        LOG.info("initBattleplanTest3()");

        Players players = new Players();
        players.addPlayer(new Player(PLUGIN_ID, "John", 1), 10);
        players.addPlayer(new Player(PLUGIN_ID, "Jane", 2), 10);

        // The first turn
        final Order first = new Order();
        first.turnScore = 10;
        first.turnStep = 0;
        players.addTurn(first);

        for (final Player p : players.playerIdToTurn.values()) {
            players.addTurn(new Order());
        }
        players.sortTurns();
        LOG.info("players.getTurn().size()=" + players.getTurn().size());

        StringBuilder sb = new StringBuilder();
        for (final Player p : players.playerIdToTurn.values()) {
            sb.append(p.id).append("=").append("\nor");
        }
        LOG.info("players.getTurn().toString().length()=" + sb.toString().length());
    }


	/**
	* We want to ensure that the orders are deterministic.
	* This loop runs for every round. We use the getTurn() function of the Player and the PlayerId object
	*/
    public void ensureOrdersDeterministic() {
        LOG.info("ensureOrdersDeterministic()");

        long nRound = 0;// nRound: the number of rounds
        int step = 0; // step: the step of the round

        int n = 7; // n: n=7 => the number of rounds
        int stepStep = 7; // stepStep: step step=7 => step step=20
        stepStep = stepStep < 20? stepStep : stepStep / 2;

        Player p1 = null;
        Player p2 = null;
        Player p3 = null;

        Collection<PlayerId> players = new Collection<>();
        players.add(new PlayerId(PLUGIN_ID, "John"));
        players.add(new PlayerId(PLAYER_ID));
        players.add(new PlayerId(PLUGIN_ID, "Jane"));

}
}