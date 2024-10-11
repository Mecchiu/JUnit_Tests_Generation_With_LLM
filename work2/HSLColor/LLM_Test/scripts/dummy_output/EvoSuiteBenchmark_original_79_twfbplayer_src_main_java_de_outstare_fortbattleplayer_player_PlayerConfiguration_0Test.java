package de.outstare.fortbattleplayer.player;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerConfiguration_0Test {

    @Test
    void testCopyReturnsNewInstance() {
        PlayerConfiguration original = new PlayerConfiguration();
        PlayerConfiguration copy = null;
        try {
            copy = original.copy();
        } catch (CloneNotSupportedException e) {
            fail("CloneNotSupportedException should not be thrown");
        }
        assertNotSame(original, copy);
    }

    @Test
    void testCopyHasSameValues() {
        PlayerConfiguration original = new PlayerConfiguration();
        original.ROUND_DELAY = 100;
        original.PLAYER_DELAY = 200;
        original.ACTION_DELAY = 300;

        PlayerConfiguration copy = null;
        try {
            copy = original.copy();
        } catch (CloneNotSupportedException e) {
            fail("CloneNotSupportedException should not be thrown");
        }

        assertEquals(original.ROUND_DELAY, copy.ROUND_DELAY);
        assertEquals(original.PLAYER_DELAY, copy.PLAYER_DELAY);
        assertEquals(original.ACTION_DELAY, copy.ACTION_DELAY);
    }

    @Test
    void testCopyIsIndependent() {
        PlayerConfiguration original = new PlayerConfiguration();
        PlayerConfiguration copy = null;
        try {
            copy = original.copy();
        } catch (CloneNotSupportedException e) {
            fail("CloneNotSupportedException should not be thrown");
        }

        original.ROUND_DELAY = 100;
        original.PLAYER_DELAY = 200;
        original.ACTION_DELAY = 300;

        assertNotEquals(original.ROUND_DELAY, copy.ROUND_DELAY);
        assertNotEquals(original.PLAYER_DELAY, copy.PLAYER_DELAY);
        assertNotEquals(original.ACTION_DELAY, copy.ACTION_DELAY);
    }

    @Test
    void testCopyIsShallowCopy() {
        PlayerConfiguration original = new PlayerConfiguration();
        PlayerConfiguration copy = null;
        try {
            copy = original.copy();
        } catch (CloneNotSupportedException e) {
            fail("CloneNotSupportedException should not be thrown");
        }

        original.SHOW_MOVETARGETS = true;
        original.SHOW_SHOOTLINE = true;

        assertFalse(copy.showMoveTargets());
        assertFalse(copy.showShootline());
    }

    @Test
    void testCopyListenerListIsNotCopied() {
        PlayerConfiguration original = new PlayerConfiguration();
        PlayerConfiguration copy = null;
        try {
            copy = original.copy();
        } catch (CloneNotSupportedException e) {
            fail("CloneNotSupportedException should not be thrown");
        }

        original.addListener(listener -> {});
        assertEquals(1, original.listeners.size());
        assertEquals(0, copy.listeners.size());
    }

    @Test
    void testCopyStateIsNotCopied() {
        PlayerConfiguration original = new PlayerConfiguration();
        original.setState(PlayerState.PLAY);

        PlayerConfiguration copy = null;
        try {
            copy = original.copy();
        } catch (CloneNotSupportedException e) {
            fail("CloneNotSupportedException should not be thrown");
        }

        assertFalse(copy.isPlaying());
    }

    @Test
    void testCopyLockIsNotCopied() {
        PlayerConfiguration original = new PlayerConfiguration();
        Lock originalLock = original.playLock;

        PlayerConfiguration copy = null;
        try {
            copy = original.copy();
        } catch (CloneNotSupportedException e) {
            fail("CloneNotSupportedException should not be thrown");
        }

        assertNotSame(originalLock, copy.playLock);
    }

    @Test
    void testCopyConfigurationValuesAreCopied() {
        PlayerConfiguration original = new PlayerConfiguration();
        original.ROUND_DELAY = 100;
        original.PLAYER_DELAY = 200;
        original.ACTION_DELAY = 300;

        PlayerConfiguration copy = null;
        try {
            copy = original.copy();
        } catch (CloneNotSupportedException e) {
            fail("CloneNotSupportedException should not be thrown");
        }

        assertEquals(original.ROUND_DELAY, copy.ROUND_DELAY);
        assertEquals(original.PLAYER_DELAY, copy.PLAYER_DELAY);
        assertEquals(original.ACTION_DELAY, copy.ACTION_DELAY);
    }

    @Test
    void testCopyShowMoveTargetsIsCopied() {
        PlayerConfiguration original = new PlayerConfiguration();
        original.setShowMoveTargets(true);

        PlayerConfiguration copy = null;
        try {
            copy = original.copy();
        } catch (CloneNotSupportedException e) {
            fail("CloneNotSupportedException should not be thrown");
        }

        assertTrue(copy.showMoveTargets());
    }

    @Test
    void testCopyShowShootlineIsCopied() {
        PlayerConfiguration original = new PlayerConfiguration();
        original.setShowShootline(true);

        PlayerConfiguration copy = null;
        try {
            copy = original.copy();
        } catch (CloneNotSupportedException e) {
            fail("CloneNotSupportedException should not be thrown");
        }

        assertTrue(copy.showShootline());
    }
}
