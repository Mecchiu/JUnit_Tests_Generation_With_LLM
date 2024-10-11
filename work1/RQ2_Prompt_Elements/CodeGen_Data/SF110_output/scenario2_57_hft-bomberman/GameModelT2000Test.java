// GameModelTest.java
package common;

import java.awt.Point;
import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;
import java.util.Map.Entry;
import messages.round.RoundTimeOverMsg;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameModel}.
* It contains one unit test case for the {@link GameModel#checkForWinner()} method.
*/
class GameModelTest {

    private static Logger log = Logger.getLogger(GameModelTest.class);
//
//    @Test
//    public void testOneCase() {
//
//        GameModel game1 = new GameModel();
//        assertEquals("", game1.checkForWinner());
//
//        // add some players
//        Player player1 = new Player();
//        // Player 1
//        game1.addPlayer(player1);
//
//        // add some time over
//        // Player 1
//        RoundTimeOverMsg msg1 = player1.setRoundTime(600);
//        log.debug(msg1.getMessage());
//        assertFalse("player 1 is still alive", player1.isAlive());
//
//
//        // add some time over
//        // Player 2
//        Player player2 = new Player();
//
//        msg1 = player2.setRoundTime(600);
//        assertFalse("player 2's roundtime is already running", player2.roundTime > 0);
//
//        game1.addPlayer(player2);
//
//        // Player 3
//        GameModel game2 = new GameModel();
//        Collection<Player> players = game2.getPlayers();
//        assertTrue("all remaining players have died",!players.isEmpty());
//        assertTrue("all remaining players have died", players.isEmpty());
//
//        // Player 1
//        // add two more players to game
//        // Player 2
//        Player notPlayer1 = new Player();
//        notPlayer1.setId(1);
//        // Player 2
//        Player notPlayer2 = new Player();
//        // Player 3
//        Player notPlayer3 = new Player();
//
//        notPlayer1.setRoundTime(600);
//        notPlayer2.setRoundTime(600);
//        notPlayer3.setRoundTime(600);
//
//        players = game2.getPlayers();
//        GameModel game3 = new GameModel();
//
//        game3.addPlayer(notPlayer1);
//
//        game3.addPlayer(notPlayer2);
//
//
//
//        assertFalse("all player's kills are still alive", players.isEmpty());
//        assertTrue("all remaining players not have died",!players.isEmpty());
//        assertTrue("all remaining players have died",!players.isEmpty());
//
//        assertEquals("Player 1", players.iterator().next().getName());
//        assertEquals("Player 2", players.iterator().next().getName());
//        assertEquals("3", players.iterator().next().getName());
//
//    }
//
//    @Test
//    public void testManyPlayers() {
//
//        GameModel game1 = new GameModel();
//        Player player1 = new Player();
//        game1.addPlayer(player1);
//        assertTrue("1 is killed by the bomb", player1.isAlive());
//
//        // add some game to game1
//        RoundTimeOverMsg round1 = new RoundTimeOverMsg();
//        game1.setRoundTime(round1, 600);
//        round1.setMessage("Game over!");
//        game1.setRoundTime(round1, 300);
//        assertEquals("round time not set correctly", 600, game1.getRoundTime().getTime());
//
//
//    }
//
//    @Test
//    public void testInformativeNotKilledByFirstPlayer() {
//        GameModel game1 = new GameModel();
//        Player player1 = new Player();
//        assertFalse("first player is alive", player1.isAlive());
//
//        // add some game to game1
//        RoundTimeOverMsg round1 = new RoundTimeOverMsg();
//        game1.setRoundTime(round1, 600);
//        round1.setMessage("Game over!");
//        game1.setRoundTime(round1, 300);
//        log.debug(round1.getMessage());
//    }
//
//    @Test
//    public void testInformativeKilledByFirstPlayer() {
//        GameModel game1 = new GameModel();
//        Player player1 = new Player();
//        assertTrue("first player is killed by the bomb", player1.isAlive());
//
//        // add some game to game1
//        RoundTimeOverMsg round1 = new RoundTimeOverMsg();
//        game1.setRoundTime(round1, 600);
//        log.debug(round1.getMessage());
//        game1.setRoundTime(round1, 300);
//        // Players 2, only killed by the bomb
//        log.debug("players 1 and 2 killed.");
//        assertNotEquals("players 2 and 1 not killed by the bomb", player1, game1.getPlayers().iterator().next());
//    }
//    @Test
//    public void testInformativeKilledBySecondPlayer() {
//        GameModel game1 = new GameModel();
//        Player player1 = new Player();
//        assertTrue("first player is killed by the bomb", player1.isAlive());
//
//        // add some game to game1
//        RoundTimeOverMsg round1 = new RoundTimeOverMsg();
//        game1.setRoundTime(round1, 1500);
//        log.debug(round1.getMessage());
//        game1.setRoundTime(round1, 1);
//        // Players 7, only killed the bomb
//        log.debug("players 7 and 7 killed.");
//        assertNotEquals("players 7 and 2 not killed by the bomb", player1, game1.getPlayers().iterator().next());
//    }
//    @Test
//    public void testInformativeKilledByThirdPlayer() {
//        GameModel game1 = new GameModel();
//        Player player2 = new Player();
//        player2.setRoundTime(600);
//        assertNotEquals("first player killed by bomb 2", player2, game1.getPlayers().iterator().next());
//    }
//    @Test
//    public void testInformativeMovedBeforeAnotherPlayer() {
//        GameModel game1 = new GameModel();
//        Player player1 = new Player();
//        // player1 is killed by the bomb but player2 is no longer alive
//        // Player2 died but player1 is alive now
//        assertFalse("first player is alive", player1.isAlive());
//        player1.setId(1);
//        log.debug("Player 1 has been moved, but player 2 is still alive.");
//        player1.setRoundTime(600);
//        assertNotEquals("Player 1 is not alive after move of Player2", player1, game1.getPlayers().iterator