// Main_3Test.java
package visu.handball.moves;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Main}.
 * It contains ten unit test cases for the {@link Main#getSaveAction()} method.
 */
class Main_3Test {

    /**
     * Test case to check if the returned object is not null.
     */
    @Test
    void testGetSaveActionNotNull() {
        assertNotNull(Main.getSaveAction());
    }

    /**
     * Test case to check if the returned object is an instance of SaveAction.
     */
    @Test
    void testGetSaveActionInstance() {
        assertTrue(Main.getSaveAction() instanceof SaveAction);
    }

    /**
     * Test case to check if the returned object is always the same instance.
     */
    @Test
    void testGetSaveActionSameInstance() {
        SaveAction saveAction1 = Main.getSaveAction();
        SaveAction saveAction2 = Main.getSaveAction();
        assertSame(saveAction1, saveAction2);
    }

    /**
     * Test case to check if the returned object has the correct name.
     */
    @Test
    void testGetSaveActionName() {
        assertEquals("Speichern", Main.getSaveAction().getValue("Name"));
    }

    /**
     * Test case to check if the returned object has the correct description.
     */
    @Test
    void testGetSaveActionDescription() {
        assertEquals("Speichert die aktuelle Bewegung in einer Datei", Main.getSaveAction().getValue("ShortDescription"));
    }

    /**
     * Test case to check if the returned object has the correct mnemonic key.
     */
    @Test
    void testGetSaveActionMnemonic() {
        assertEquals('S', Main.getSaveAction().getValue("MnemonicKey"));
    }

    /**
     * Test case to check if the returned object has the correct accelerator key.
     */
    @Test
    void testGetSaveActionAccelerator() {
        assertEquals("control S", Main.getSaveAction().getValue("AcceleratorKey").toString());
    }

    /**
     * Test case to check if the returned object has the correct icon.
     */
    @Test
    void testGetSaveActionIcon() {
        assertNotNull(Main.getSaveAction().getValue("SmallIcon"));
    }

    /**
     * Test case to check if the returned object has the correct enabled state.
     */
    @Test
    void testGetSaveActionEnabled() {
        assertTrue(Main.getSaveAction().isEnabled());
    }

    /**
     * Test case to check if the returned object has the correct tooltip text.
     */
    @Test
    void testGetSaveActionTooltip() {
        assertEquals("Speichert die aktuelle Bewegung in einer Datei", Main.getSaveAction().getValue("TooltipText"));
    }
}