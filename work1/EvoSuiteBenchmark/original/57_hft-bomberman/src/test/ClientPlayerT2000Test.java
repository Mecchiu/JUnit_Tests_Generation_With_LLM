```java
package client;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientPlayerTest {

    @Test
    void testCanBowlBombs_WhenBowlBombsIsTrue_ReturnsTrue() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.setBowlBombs();
        assertTrue(player.canBowlBombs());
    }

    @Test
    void testCanBowlBombs_WhenBowlBombsIsFalse_ReturnsFalse() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.resetBowlBombs();
        assertFalse(player.canBowlBombs());
    }

    @Test
    void testCanBowlBombs_WhenBowlBombsIsSetTwice_ReturnsTrue() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.setBowlBombs();
        player.resetBowlBombs();
        player.setBowlBombs();
        assertTrue(player.canBowlBombs());
    }

    @Test
    void testCanBowlBombs_WhenBowlBombsIsResetTwice_ReturnsFalse() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.resetBowlBombs();
        player.setBowlBombs();
        player.resetBowlBombs();
        assertFalse(player.canBowlBombs());
    }

    @Test
    void testCanBowlBombs_WhenBowlBombsIsInitiallyFalse_ReturnsFalse() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        assertFalse(player.canBowlBombs());
    }

    @Test
    void testCanBowlBombs_WhenBowlBombsIsInitiallyTrue_ReturnsTrue() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.setBowlBombs();
        assertTrue(player.canBowlBombs());
    }

    @Test
    void testCanBowlBombs_WhenBowlBombsIsToggled_ReturnsOppositeValue() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.setBowlBombs();
        boolean initial = player.canBowlBombs();
        player.resetBowlBombs();
        assertNotEquals(initial, player.canBowlBombs());
    }

    @Test
    void testCanBowlBombs_WhenBowlBombsIsToggledTwice_ReturnsInitialValue() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        player.setBowlBombs();
        boolean initial = player.canBowlBombs();
        player.resetBowlBombs();
        player.setBowlBombs();
        assertEquals(initial, player.canBowlBombs());
    }

    @Test
    void testCanBowlBombs_WhenBowlBombsIsToggledMultipleTimes_ReturnsCorrectValue() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 1);
        boolean expected = false;
        for (int i = 0; i < 5; i++) {
            player.setBowlBombs();
            expected = !expected;
            assertEquals(expected, player.canBowlBombs());
        }
    }
}
```
```