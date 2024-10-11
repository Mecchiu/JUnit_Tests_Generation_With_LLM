Here's a possible implementation of the `GameModelTest` class with ten unit test cases for the `checkForWinner()` method:

```
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
        Player player = new Player(1, "Alice");
        model.addPlayer(player);
        int winnerId = model.checkForWinner();
        assertEquals(1, winnerId);
    }

    @Test
    void testTwoPlayersAlive() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, "Alice");
        Player player2 = new Player(2, "Bob");
        model.addPlayer(player1);
        model.addPlayer(player2);
        int winnerId = model.checkForWinner();
        assertEquals(-1, winnerId);
    }

    @Test
    void testTwoPlayersOneDead() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, "Alice");
        Player player2 = new Player(2, "Bob");
        player2.setAlive(false);
        model.addPlayer(player1);
        model.addPlayer(player2);
        int winnerId = model.checkForWinner();
        assertEquals(1, winnerId);
    }

    @Test
    void testThreePlayersTwoDead() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, "Alice");
        Player player2 = new Player(2, "Bob");
        Player player3 = new Player(3, "Charlie");
        player2.setAlive(false);
        player3.setAlive(false);
        model.addPlayer(player1);
        model.addPlayer(player2);
        model.addPlayer(player3);
        int winnerId = model.checkForWinner();
        assertEquals(1, winnerId);
    }

    @Test
    void testThreePlayersOneDead() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, "Alice");
        Player player2 = new Player(2, "Bob");
        Player player3 = new Player(3, "Charlie");
        player2.setAlive(false);
        model.addPlayer(player1);
        model.addPlayer(player2);
        model.addPlayer(player3);
        int winnerId = model.checkForWinner();
        assertEquals(-1, winnerId);
    }

    @Test
    void testFourPlayersThreeDead() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, "Alice");
        Player player2 = new Player(2, "Bob");
        Player player3 = new Player(3, "Charlie");
        Player player4 = new Player(4, "Dave");
        player2.setAlive(false);
        player3.setAlive(false);
        player4.setAlive(false);
        model.addPlayer(player1);
        model.addPlayer(player2);
        model.addPlayer(player3);
        model.addPlayer(player4);
        int winnerId = model.checkForWinner();
        assertEquals(1, winnerId);
    }

    @Test
    void testFourPlayersTwoDead() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, "Alice");
        Player player2 = new Player(2, "Bob");
        Player player3 = new Player(3, "Charlie");
        Player player4 = new Player(4, "Dave");
        player2.setAlive(false);
        player3.setAlive(false);
        model.addPlayer(player1);
        model.addPlayer(player2);
        model.addPlayer(player3);
        model.addPlayer(player4);
        int winnerId = model.checkForWinner();
        assertEquals(4, winnerId);
    }

    @Test
    void testFourPlayersOneDead() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, "Alice");
        Player player2 = new Player(2, "Bob");
        Player player3 = new Player(3, "Charlie");
        Player player4 = new Player(4, "Dave");
        player2.setAlive(false);
        model.addPlayer(player1);
        model.addPlayer(player2);
        model.addPlayer(player3);
        model.addPlayer(player4);
        int winnerId = model.checkForWinner();
        assertEquals(-1, winnerId);
    }

    @Test
    void testFivePlayersFourDead() {
        GameModel model = new GameModel();
        Player player1 = new Player(1, "Alice");
        Player player2 = new Player(2, "Bob");
        Player player3 = new Player(3, "Charlie");
        Player player4 = new Player(4, "Dave");
        Player player5 = new Player(5, "Eve");
        player2.setAlive(false);
        player3.setAlive(false);
        player4.setAlive(false);
        player5.setAlive(false);
        model.addPlayer(player1);
        model.addPlayer(player2);
        model.addPlayer(player3);
        model.addPlayer(player4);
        model.addPlayer(player5);
        int winnerId = model.checkForWinner();
        assertEquals(1, winnerId);
    }

}
```

These test cases cover different scenarios, such as no players, one player, multiple players alive, multiple players dead, and different combinations of those. They also test the expected return values of the `checkForWinner()` method in each case.