// Here's an example implementation of the ClientPlayerTest class with ten unit test cases for the canBowlBombs() method:

package client;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientPlayerTest {

    @Test
    void testCanBowlBombsReturnsTrue() {
        ClientPlayer player = new ClientPlayer();
        assertTrue(player.canBowlBombs());
    }

    @Test
    void testCanBowlBombsReturnsFalse() {
        ClientPlayer player = new ClientPlayer();
        player.setBombs(0);
        assertFalse(player.canBowlBombs());
    }

    @Test
    void testCanBowlBombsReturnsFalseWhenDead() {
        ClientPlayer player = new ClientPlayer();
        player.setDead(true);
        assertFalse(player.canBowlBombs());
    }

    @Test
    void testCanBowlBombsReturnsFalseWhenPaused() {
        ClientPlayer player = new ClientPlayer();
        player.setPaused(true);
        assertFalse(player.canBowlBombs());
    }

    @Test
    void testCanBowlBombsReturnsFalseWhenStunned() {
        ClientPlayer player = new ClientPlayer();
        player.setStunned(true);
        assertFalse(player.canBowlBombs());
    }

    @Test
    void testCanBowlBombsReturnsFalseWhenFrozen() {
        ClientPlayer player = new ClientPlayer();
        player.setFrozen(true);
        assertFalse(player.canBowlBombs());
    }

    @Test
    void testCanBowlBombsReturnsFalseWhenInvisible() {
        ClientPlayer player = new ClientPlayer();
        player.setInvisible(true);
        assertFalse(player.canBowlBombs());
    }

    @Test
    void testCanBowlBombsReturnsFalseWhenInvincible() {
        ClientPlayer player = new ClientPlayer();
        player.setInvincible(true);
        assertFalse(player.canBowlBombs());
    }

    @Test
    void testCanBowlBombsReturnsFalseWhenSick() {
        ClientPlayer player = new ClientPlayer();
        player.setSick(true);
        assertFalse(player.canBowlBombs());
    }

    @Test
    void testCanBowlBombsReturnsFalseWhenWebbed() {
        ClientPlayer player = new ClientPlayer();
        player.setWebbed(true);
        assertFalse(player.canBowlBombs());
    }
}