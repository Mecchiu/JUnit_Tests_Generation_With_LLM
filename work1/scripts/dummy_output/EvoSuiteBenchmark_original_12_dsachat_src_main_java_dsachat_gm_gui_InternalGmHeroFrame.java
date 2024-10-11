package dsachat.gm.gui;
java
class InternalGmHeroFrameTest {

    @Test
    void testSilentReturnsFalse() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame(null, new Vector<>(), "Test Frame");
        assertFalse(frame.silent());
    }

    @Test
    void testSilentReturnsFalseAfterInitialization() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame(null, new Vector<>(), "Test Frame");
        assertFalse(frame.silent());
    }

    @Test
    void testSilentReturnsFalseAfterUpdate() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame(null, new Vector<>(), "Test Frame");
        frame.updateHero(new Vector<>());
        assertFalse(frame.silent());
    }

    @Test
    void testSilentReturnsFalseAfterValueChange() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame(null, new Vector<>(), "Test Frame");
        frame.valueChanged(null);
        assertFalse(frame.silent());
    }

    @Test
    void testSilentReturnsFalseAfterButtonEnable() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame(null, new Vector<>(), "Test Frame");
        frame.enableButton();
        assertFalse(frame.silent());
    }

    @Test
    void testSilentReturnsFalseAfterUserUpdate() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame(null, new Vector<>(), "Test Frame");
        frame.updateUsers(new String[]{"User1", "User2"});
        assertFalse(frame.silent());
    }

    @Test
    void testSilentReturnsFalseAfterReceiverSelection() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame(null, new Vector<>(), "Test Frame");
        frame.getReceiver();
        assertFalse(frame.silent());
    }

    @Test
    void testSilentReturnsFalseAfterModSelection() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame(null, new Vector<>(), "Test Frame");
        frame.getMod();
        assertFalse(frame.silent());
    }

    @Test
    void testSilentReturnsFalseAfterAttackSelection() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame(null, new Vector<>(), "Test Frame");
        frame.isAttack();
        assertFalse(frame.silent());
    }

    @Test
    void testSilentReturnsFalseAfterDataRetrieval() {
        InternalGmHeroFrame frame = new InternalGmHeroFrame(null, new Vector<>(), "Test Frame");
        frame.getData();
        assertFalse(frame.silent());
    }
}
