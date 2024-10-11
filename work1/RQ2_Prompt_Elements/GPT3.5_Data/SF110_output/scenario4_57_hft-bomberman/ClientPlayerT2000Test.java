// Test case for ClientPlayer.canBowlBombs() method
class ClientPlayerTest {

    private Logger logger = Logger.getLogger(ClientPlayerTest.class);

    /**
     * Test case for when the player can bowl bombs.
     */
    @Test
    void testCanBowlBombsTrue() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.setBowlBombs();
        assertTrue(player.canBowlBombs());
    }

    /**
     * Test case for when the player cannot bowl bombs.
     */
    @Test
    void testCanBowlBombsFalse() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.resetBowlBombs();
        assertFalse(player.canBowlBombs());
    }

    /**
     * Test case for when the player can bowl bombs and then cannot bowl bombs.
     */
    @Test
    void testCanBowlBombsTrueToFalse() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.setBowlBombs();
        player.resetBowlBombs();
        assertFalse(player.canBowlBombs());
    }

    /**
     * Test case for when the player cannot bowl bombs and then can bowl bombs.
     */
    @Test
    void testCanBowlBombsFalseToTrue() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.resetBowlBombs();
        player.setBowlBombs();
        assertTrue(player.canBowlBombs());
    }

    /**
     * Test case for when the player cannot bowl bombs and then cannot bowl bombs again.
     */
    @Test
    void testCanBowlBombsFalseToFalse() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.resetBowlBombs();
        player.resetBowlBombs();
        assertFalse(player.canBowlBombs());
    }

    /**
     * Test case for when the player can bowl bombs and then can bowl bombs again.
     */
    @Test
    void testCanBowlBombsTrueToTrue() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.setBowlBombs();
        player.setBowlBombs();
        assertTrue(player.canBowlBombs());
    }

    /**
     * Test case for when the player can bowl bombs and then increase max bombs.
     */
    @Test
    void testCanBowlBombsTrueIncreaseMaxBombs() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.setBowlBombs();
        player.increaseMaxBombs();
        assertTrue(player.canBowlBombs());
    }

    /**
     * Test case for when the player cannot bowl bombs and then increase max bombs.
     */
    @Test
    void testCanBowlBombsFalseIncreaseMaxBombs() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.resetBowlBombs();
        player.increaseMaxBombs();
        assertFalse(player.canBowlBombs());
    }

    /**
     * Test case for when the player can bowl bombs and then increase bomb diameter.
     */
    @Test
    void testCanBowlBombsTrueIncreaseBombDiameter() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.setBowlBombs();
        player.increaseBombDiameter();
        assertTrue(player.canBowlBombs());
    }

    /**
     * Test case for when the player cannot bowl bombs and then increase bomb diameter.
     */
    @Test
    void testCanBowlBombsFalseIncreaseBombDiameter() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.resetBowlBombs();
        player.increaseBombDiameter();
        assertFalse(player.canBowlBombs());
    }
}