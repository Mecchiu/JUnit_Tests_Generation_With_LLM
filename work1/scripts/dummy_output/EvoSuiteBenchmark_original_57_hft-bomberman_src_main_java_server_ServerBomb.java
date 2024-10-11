package server;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServerBombTest {

    @Test
    void testTickReturnsTrueWhenTickFramesIsZero() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.tickFrames = 0;
        assertTrue(bomb.tick());
    }

    @Test
    void testTickReturnsFalseWhenTickFramesIsNotZero() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.tickFrames = 5;
        assertFalse(bomb.tick());
    }

    @Test
    void testTickDecreasesTickFramesByOne() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.tickFrames = 3;
        bomb.tick();
        assertEquals(2, bomb.tickFrames);
    }

    @Test
    void testTickDoesNotGoBelowZero() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.tickFrames = 0;
        bomb.tick();
        assertEquals(0, bomb.tickFrames);
    }

    @Test
    void testTickReturnsTrueWhenTickFramesIsNegative() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.tickFrames = -1;
        assertTrue(bomb.tick());
    }

    @Test
    void testTickReturnsTrueWhenTickFramesIsNegativeAndNotZero() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.tickFrames = -5;
        assertTrue(bomb.tick());
    }

    @Test
    void testTickReturnsFalseWhenTickFramesIsPositive() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.tickFrames = 5;
        assertFalse(bomb.tick());
    }

    @Test
    void testTickReturnsFalseWhenTickFramesIsNegativeAndZero() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.tickFrames = -0;
        assertFalse(bomb.tick());
    }

    @Test
    void testTickReturnsFalseWhenTickFramesIsNegativeAndNotZero() {
        ServerBomb bomb = new ServerBomb(new Point(0, 0), null);
        bomb.tickFrames = -3;
        assertFalse(bomb.tick());
    }
}
