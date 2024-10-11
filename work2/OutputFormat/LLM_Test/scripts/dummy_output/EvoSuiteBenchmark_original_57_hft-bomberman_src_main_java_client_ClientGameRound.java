package client;
java
class ClientGameRoundTest {

    @Test
    void testGetGameObjectById_WhenGameObjectExists_ExpectGameObject() {
        // Arrange
        ClientGameRound clientGameRound = new ClientGameRound(new ClientGameSession(), new GameCanvas());
        Player player = new Player();
        clientGameRound.addPlayer(1, player);

        // Act
        GameObject gameObject = clientGameRound.getGameObjectById(1);

        // Assert
        assertEquals(player, gameObject);
    }

    @Test
    void testGetGameObjectById_WhenGameObjectDoesNotExist_ExpectNull() {
        // Arrange
        ClientGameRound clientGameRound = new ClientGameRound(new ClientGameSession(), new GameCanvas());

        // Act
        GameObject gameObject = clientGameRound.getGameObjectById(1);

        // Assert
        assertNull(gameObject);
    }

    @Test
    void testGetGameObjectById_WhenMultipleGameObjectsExist_ExpectCorrectGameObject() {
        // Arrange
        ClientGameRound clientGameRound = new ClientGameRound(new ClientGameSession(), new GameCanvas());
        Player player1 = new Player();
        Player player2 = new Player();
        clientGameRound.addPlayer(1, player1);
        clientGameRound.addPlayer(2, player2);

        // Act
        GameObject gameObject1 = clientGameRound.getGameObjectById(1);
        GameObject gameObject2 = clientGameRound.getGameObjectById(2);

        // Assert
        assertEquals(player1, gameObject1);
        assertEquals(player2, gameObject2);
    }

    // Add more test cases as needed
}
