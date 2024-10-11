// PlayerConfiguration_0Test.java
package de.outstare.fortbattleplayer.player;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test class of {@link PlayerConfiguration}.
 * It contains ten unit test cases for the {@link PlayerConfiguration#copy()} method.
 */
class PlayerConfiguration_0Test {

    @Test
    void testCopy() throws CloneNotSupportedException {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.PLAYER_DELAY = 100;
        config.ROUND_DELAY = 200;
        config.ACTION_DELAY = 300;
        config.setShowMoveTargets(true);
        config.setShowShootline(true);

        final PlayerConfiguration copy = config.copy();

        assertEquals(config.PLAYER_DELAY, copy.PLAYER_DELAY);
        assertEquals(config.ROUND_DELAY, copy.ROUND_DELAY);
        assertEquals(config.ACTION_DELAY, copy.ACTION_DELAY);
        assertEquals(config.showMoveTargets(), copy.showMoveTargets());
        assertEquals(config.showShootline(), copy.showShootline());
    }

    @Test
    void testCopyWithListeners() throws CloneNotSupportedException {
        final PlayerConfiguration config = new PlayerConfiguration();
        final Set<PlayerConfigurationListener> listeners = new HashSet<>();
        listeners.add(new PlayerConfigurationListener() {
            @Override
            public void onPlayerConfigurationChanged(final PlayerConfiguration config) {
                // do nothing
            }
        });
        config.listeners.addAll(listeners);

        final PlayerConfiguration copy = config.copy();

        assertEquals(config.listeners, copy.listeners);
    }

    @Test
    void testCopyWithLock() throws CloneNotSupportedException {
        final PlayerConfiguration config = new PlayerConfiguration();
        final Lock lock = new ReentrantLock();
        config.playLock.lock();
        final Lock copyLock = config.playLock;

        final PlayerConfiguration copy = config.copy();

        assertEquals(copyLock, copy.playLock);
    }

    @Test
    void testCopyWithState() throws CloneNotSupportedException {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setState(PlayerState.PLAY);
        final PlayerState copyState = config.state;

        final PlayerConfiguration copy = config.copy();

        assertEquals(copyState, copy.state);
    }

    @Test
    void testCopyWithNoDelay() throws CloneNotSupportedException {
        final PlayerConfiguration config = PlayerConfiguration.NO_DELAY;

        final PlayerConfiguration copy = config.copy();

        assertEquals(config.PLAYER_DELAY, copy.PLAYER_DELAY);
        assertEquals(config.ROUND_DELAY, copy.ROUND_DELAY);
        assertEquals(config.ACTION_DELAY, copy.ACTION_DELAY);
        assertEquals(config.showMoveTargets(), copy.showMoveTargets());
        assertEquals(config.showShootline(), copy.showShootline());
    }

    @Test
    void testCopyWithPlaying() throws CloneNotSupportedException {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setState(PlayerState.PLAY);

        final PlayerConfiguration copy = config.copy();

        assertEquals(config.isPlaying(), copy.isPlaying());
    }

    @Test
    void testCopyWithPaused() throws CloneNotSupportedException {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setState(PlayerState.PAUSE);

        final PlayerConfiguration copy = config.copy();

        assertEquals(config.isPaused(), copy.isPaused());
    }

    @Test
    void testCopyWithStopped() throws CloneNotSupportedException {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setState(PlayerState.STOP);

        final PlayerConfiguration copy = config.copy();

        assertEquals(config.isStopped(), copy.isStopped());
    }

    @Test
    void testCopyWithShowMoveTargets() throws CloneNotSupportedException {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(true);
        final boolean copyShowMoveTargets = config.showMoveTargets();

        final PlayerConfiguration copy = config.copy();

        assertEquals(copyShowMoveTargets, copy.showMoveTargets());
    }

    @Test
    void testCopyWithShowShootline() throws CloneNotSupportedException {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setShowShootline(true);
        final boolean copyShowShootline = config.showShootline();

        final PlayerConfiguration copy = config.copy();

        assertEquals(copyShowShootline, copy.showShootline());
    }
}