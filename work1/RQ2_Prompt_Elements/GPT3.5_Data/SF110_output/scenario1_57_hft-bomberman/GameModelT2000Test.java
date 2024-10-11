// Here's an example implementation of the GameModelTest class with ten unit test cases for the checkForWinner() method:

package common;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameModelTest {

    @Test
    void testNoPlayers() {
        GameModel model = new GameModel();
        int winnerId = model.checkForWinner();
        assertEquals(0, winnerId);
    }

    @Test
    void testOnePlayer() {
        GameModel model = new GameModel();
        Player player = new Player(1, new Point(0, 0));
        model.addPlayer(player);
        int winnerId = model.checkForWinner();
        assertEquals(1, winnerId);
    }

    @Test
    void testTwoPlayers() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, new Point(0, 0));
        Player player2 = new Player(2, new Point(1, 1));
        model.addPlayer(player1);
        model.addPlayer(player2);
        int winnerId = model.checkForWinner();
        assertEquals(-1, winnerId);
    }

    @Test
    void testThreePlayers() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, new Point(0, 0));
        Player player2 = new Player(2, new Point(1, 1));
        Player player3 = new Player(3, new Point(2, 2));
        model.addPlayer(player1);
        model.addPlayer(player2);
        model.addPlayer(player3);
        int winnerId = model.checkForWinner();
        assertEquals(-1, winnerId);
    }

    @Test
    void testTwoPlayersOneDead() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, new Point(0, 0));
        Player player2 = new Player(2, new Point(1, 1));
        player2.setDead(true);
        model.addPlayer(player1);
        model.addPlayer(player2);
        int winnerId = model.checkForWinner();
        assertEquals(1, winnerId);
    }

    @Test
    void testThreePlayersOneDead() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, new Point(0, 0));
        Player player2 = new Player(2, new Point(1, 1));
        Player player3 = new Player(3, new Point(2, 2));
        player2.setDead(true);
        model.addPlayer(player1);
        model.addPlayer(player2);
        model.addPlayer(player3);
        int winnerId = model.checkForWinner();
        assertEquals(-1, winnerId);
    }

    @Test
    void testThreePlayersTwoDead() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, new Point(0, 0));
        Player player2 = new Player(2, new Point(1, 1));
        Player player3 = new Player(3, new Point(2, 2));
        player2.setDead(true);
        player3.setDead(true);
        model.addPlayer(player1);
        model.addPlayer(player2);
        model.addPlayer(player3);
        int winnerId = model.checkForWinner();
        assertEquals(1, winnerId);
    }

    @Test
    void testFourPlayers() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, new Point(0, 0));
        Player player2 = new Player(2, new Point(1, 1));
        Player player3 = new Player(3, new Point(2, 2));
        Player player4 = new Player(4, new Point(3, 3));
        model.addPlayer(player1);
        model.addPlayer(player2);
        model.addPlayer(player3);
        model.addPlayer(player4);
        int winnerId = model.checkForWinner();
        assertEquals(-1, winnerId);
    }

    @Test
    void testFourPlayersOneDead() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, new Point(0, 0));
        Player player2 = new Player(2, new Point(1, 1));
        Player player3 = new Player(3, new Point(2, 2));
        Player player4 = new Player(4, new Point(3, 3));
        player2.setDead(true);
        model.addPlayer(player1);
        model.addPlayer(player2);
        model.addPlayer(player3);
        model.addPlayer(player4);
        int winnerId = model.checkForWinner();
        assertEquals(-1, winnerId);
    }

    @Test
    void testFourPlayersTwoDead() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, new Point(0, 0));
        Player player2 = new Player(2, new Point(1, 1));
        Player player3 = new Player(3, new Point(2, 2));
        Player player4 = new Player(4, new Point(3, 3));
        player2.setDead(true);
        player3.setDead(true);
        model.addPlayer(player1);
        model.addPlayer(player2);
        model.addPlayer(player3);
        model.addPlayer(player4);
        int winnerId = model.checkForWinner();
        assertEquals(1, winnerId);
    }
}