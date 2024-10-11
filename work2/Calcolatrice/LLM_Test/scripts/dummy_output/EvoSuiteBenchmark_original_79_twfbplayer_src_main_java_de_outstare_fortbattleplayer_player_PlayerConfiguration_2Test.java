package de.outstare.fortbattleplayer.player;
java
class PlayerConfiguration_2Test {
    
    @Test
    void testShowShootlineReturnsTrueWhenSetTrue() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        playerConfiguration.setShowShootline(true);
        assertTrue(playerConfiguration.showShootline());
    }

    @Test
    void testShowShootlineReturnsFalseWhenSetFalse() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        playerConfiguration.setShowShootline(false);
        assertFalse(playerConfiguration.showShootline());
    }

    @Test
    void testShowShootlineReturnsFalseByDefault() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        assertFalse(playerConfiguration.showShootline());
    }

    @Test
    void testShowShootlineReturnsTrueAfterSettingTrue() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        playerConfiguration.setShowShootline(false);
        playerConfiguration.setShowShootline(true);
        assertTrue(playerConfiguration.showShootline());
    }

    @Test
    void testShowShootlineReturnsFalseAfterSettingFalse() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        playerConfiguration.setShowShootline(true);
        playerConfiguration.setShowShootline(false);
        assertFalse(playerConfiguration.showShootline());
    }

    @Test
    void testShowShootlineReturnsTrueAfterMultipleSetTrueCalls() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        playerConfiguration.setShowShootline(true);
        playerConfiguration.setShowShootline(true);
        assertTrue(playerConfiguration.showShootline());
    }

    @Test
    void testShowShootlineReturnsFalseAfterMultipleSetFalseCalls() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        playerConfiguration.setShowShootline(false);
        playerConfiguration.setShowShootline(false);
        assertFalse(playerConfiguration.showShootline());
    }

    @Test
    void testShowShootlineReturnsTrueAfterMixedSetCalls() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        playerConfiguration.setShowShootline(true);
        playerConfiguration.setShowShootline(false);
        assertTrue(playerConfiguration.showShootline());
    }

    @Test
    void testShowShootlineReturnsFalseAfterMixedSetCalls() {
        PlayerConfiguration playerConfiguration = new PlayerConfiguration();
        playerConfiguration.setShowShootline(false);
        playerConfiguration.setShowShootline(true);
        assertFalse(playerConfiguration.showShootline());
    }
}
