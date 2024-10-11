```java
package visu.handball.moves;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Main}.
 * It contains ten unit test cases for the {@link Main#getSaveAction()} method.
 */
class Main_5Test {

    @Test
    void testGetSaveActionNotNull() {
        assertNotNull(Main.getSaveAction());
    }

    @Test
    void testGetSaveActionInstance() {
        assertTrue(Main.getSaveAction() instanceof SaveAction);
    }

    @Test
    void testGetSaveActionSameInstance() {
        SaveAction saveAction1 = Main.getSaveAction();
        SaveAction saveAction2 = Main.getSaveAction();
        assertSame(saveAction1, saveAction2);
    }

    @Test
    void testGetSaveActionNotSameInstance() {
        SaveAction saveAction1 = Main.getSaveAction();
        SaveAction saveAction2 = new SaveAction(new HandballModel());
        assertNotSame(saveAction1, saveAction2);
    }

    @Test
    void testGetSaveActionEquals() {
        SaveAction saveAction1 = Main.getSaveAction();
        SaveAction saveAction2 = new SaveAction(new HandballModel());
        assertEquals(saveAction1, saveAction2);
    }

    @Test
    void testGetSaveActionNotEquals() {
        SaveAction saveAction1 = Main.getSaveAction();
        SaveAction saveAction2 = new SaveAction(new HandballModel());
        assertNotEquals(saveAction1, saveAction2);
    }

    @Test
    void testGetSaveActionNullAfterClose() {
        Main.getCloseAction().actionPerformed(null);
        assertNull(Main.getSaveAction());
    }

    @Test
    void testGetSaveActionNotNullAfterCloseAndOpen() {
        Main.getCloseAction().actionPerformed(null);
        Main.getOpenAction().actionPerformed(null);
        assertNotNull(Main.getSaveAction());
    }

    @Test
    void testGetSaveActionSameInstanceAfterCloseAndOpen() {
        Main.getCloseAction().actionPerformed(null);
        Main.getOpenAction().actionPerformed(null);
        SaveAction saveAction1 = Main.getSaveAction();
        SaveAction saveAction2 = Main.getSaveAction();
        assertSame(saveAction1, saveAction2);
    }

    @Test
    void testGetSaveActionEqualsAfterCloseAndOpen() {
        Main.getCloseAction().actionPerformed(null);
        Main.getOpenAction().actionPerformed(null);
        SaveAction saveAction1 = Main.getSaveAction();
        SaveAction saveAction2 = new SaveAction(new HandballModel());
        assertEquals(saveAction1, saveAction2);
    }
}
```
