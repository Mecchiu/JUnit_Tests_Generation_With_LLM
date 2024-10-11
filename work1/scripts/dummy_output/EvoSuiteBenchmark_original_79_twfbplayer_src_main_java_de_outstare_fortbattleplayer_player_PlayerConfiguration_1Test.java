package de.outstare.fortbattleplayer.player;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerConfiguration_1Test {

    @Test
    void testShowMoveTargets_WhenShowMoveTargetsIsTrue_ReturnsTrue() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        playerConfiguration.setShowMoveTargets(true);
        assertTrue(playerConfiguration.showMoveTargets());
    }

    @Test
    void testShowMoveTargets_WhenShowMoveTargetsIsFalse_ReturnsFalse() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        playerConfiguration.setShowMoveTargets(false);
        assertFalse(playerConfiguration.showMoveTargets());
    }

    @Test
    void testShowMoveTargets_WhenShowMoveTargetsIsTrueAfterSettingFalse_ReturnsTrue() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        playerConfiguration.setShowMoveTargets(false);
        playerConfiguration.setShowMoveTargets(true);
        assertTrue(playerConfiguration.showMoveTargets());
    }

    @Test
    void testShowMoveTargets_WhenShowMoveTargetsIsFalseAfterSettingTrue_ReturnsFalse() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        playerConfiguration.setShowMoveTargets(true);
        playerConfiguration.setShowMoveTargets(false);
        assertFalse(playerConfiguration.showMoveTargets());
    }

    @Test
    void testShowMoveTargets_WhenShowMoveTargetsIsTrueAfterMultipleSettings_ReturnsTrue() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        playerConfiguration.setShowMoveTargets(false);
        playerConfiguration.setShowMoveTargets(true);
        playerConfiguration.setShowMoveTargets(false);
        playerConfiguration.setShowMoveTargets(true);
        assertTrue(playerConfiguration.showMoveTargets());
    }

    @Test
    void testShowMoveTargets_WhenShowMoveTargetsIsFalseAfterMultipleSettings_ReturnsFalse() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        playerConfiguration.setShowMoveTargets(true);
        playerConfiguration.setShowMoveTargets(false);
        playerConfiguration.setShowMoveTargets(true);
        playerConfiguration.setShowMoveTargets(false);
        assertFalse(playerConfiguration.showMoveTargets());
    }

    @Test
    void testShowMoveTargets_WhenShowMoveTargetsIsTrueInitially_ReturnsTrue() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        assertTrue(playerConfiguration.showMoveTargets());
    }

    @Test
    void testShowMoveTargets_WhenShowMoveTargetsIsFalseInitially_ReturnsFalse() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        assertFalse(playerConfiguration.showMoveTargets());
    }

    @Test
    void testShowMoveTargets_WhenShowMoveTargetsIsTrueAfterAddingListener_ReturnsTrue() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        PlayerConfigurationListener listener = new PlayerConfigurationListener() {
            @Override
            public void changedShowMoveTarget(boolean showMoveTarget) {
                // do nothing
            }
        };
        playerConfiguration.addListener(listener);
        playerConfiguration.setShowMoveTargets(true);
        assertTrue(playerConfiguration.showMoveTargets());
    }

    @Test
    void testShowMoveTargets_WhenShowMoveTargetsIsFalseAfterAddingListener_ReturnsFalse() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        PlayerConfigurationListener listener = new PlayerConfigurationListener() {
            @Override
            public void changedShowMoveTarget(boolean showMoveTarget) {
                // do nothing
            }
        };
        playerConfiguration.addListener(listener);
        playerConfiguration.setShowMoveTargets(false);
        assertFalse(playerConfiguration.showMoveTargets());
    }
}
