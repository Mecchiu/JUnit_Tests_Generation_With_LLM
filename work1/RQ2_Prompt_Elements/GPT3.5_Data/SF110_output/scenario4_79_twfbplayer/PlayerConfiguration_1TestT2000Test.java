// PlayerConfiguration_1Test.java
package de.outstare.fortbattleplayer.player;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test class of {@link PlayerConfiguration}.
 * It contains ten unit test cases for the {@link PlayerConfiguration#showMoveTargets()} method.
 */
class PlayerConfiguration_1Test {

    @Test
    void testShowMoveTargets_DefaultValue() {
        final PlayerConfiguration config = new PlayerConfiguration();
        assertEquals(config.showMoveTargets(), Configuration.SHOW_MOVETARGETS);
    }

    @Test
    void testShowMoveTargets_SetTrue() {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(true);
        assertEquals(config.showMoveTargets(), true);
    }

    @Test
    void testShowMoveTargets_SetFalse() {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(false);
        assertEquals(config.showMoveTargets(), false);
    }

    @Test
    void testShowMoveTargets_SetTrueAndFalse() {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(true);
        config.setShowMoveTargets(false);
        assertEquals(config.showMoveTargets(), false);
    }

    @Test
    void testShowMoveTargets_SetFalseAndTrue() {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(false);
        config.setShowMoveTargets(true);
        assertEquals(config.showMoveTargets(), true);
    }

    @Test
    void testShowMoveTargets_SetTrueTwice() {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(true);
        config.setShowMoveTargets(true);
        assertEquals(config.showMoveTargets(), true);
    }

    @Test
    void testShowMoveTargets_SetFalseTwice() {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.setShowMoveTargets(false);
        config.setShowMoveTargets(false);
        assertEquals(config.showMoveTargets(), false);
    }

    @Test
    void testShowMoveTargets_SetTrueAndAddListener() {
        final PlayerConfiguration config = new PlayerConfiguration();
        final Set<PlayerConfigurationListener> listeners = new HashSet<>();
        listeners.add(new PlayerConfigurationListener() {
            @Override
            public void configurationChanged(final PlayerConfiguration config) {
                assertEquals(config.showMoveTargets(), true);
            }
        });
        config.addListener(listeners.iterator().next());
        config.setShowMoveTargets(true);
    }

    @Test
    void testShowMoveTargets_SetFalseAndAddListener() {
        final PlayerConfiguration config = new PlayerConfiguration();
        final Set<PlayerConfigurationListener> listeners = new HashSet<>();
        listeners.add(new PlayerConfigurationListener() {
            @Override
            public void configurationChanged(final PlayerConfiguration config) {
                assertEquals(config.showMoveTargets(), false);
            }
        });
        config.addListener(listeners.iterator().next());
        config.setShowMoveTargets(false);
    }

    @Test
    void testShowMoveTargets_SetTrueAndRemoveListener() {
        final PlayerConfiguration config = new PlayerConfiguration();
        final PlayerConfigurationListener listener = new PlayerConfigurationListener() {
            @Override
            public void configurationChanged(final PlayerConfiguration config) {
                assertEquals(config.showMoveTargets(), true);
            }
        };
        config.addListener(listener);
        config.setShowMoveTargets(true);
        config.removeListener(listener);
        config.setShowMoveTargets(false);
    }
}