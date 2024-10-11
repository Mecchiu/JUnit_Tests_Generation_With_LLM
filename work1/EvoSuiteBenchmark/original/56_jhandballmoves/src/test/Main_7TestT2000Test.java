```java
package visu.handball.moves;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Main}.
 * It contains ten unit test cases for the {@link Main#getCloseAction()} method.
 */
class Main_7Test {

    @Test
    void testGetCloseActionNotNull() {
        assertNotNull(Main.getCloseAction());
    }

    @Test
    void testGetCloseActionSameInstance() {
        CloseAction closeAction1 = Main.getCloseAction();
        CloseAction closeAction2 = Main.getCloseAction();
        assertSame(closeAction1, closeAction2);
    }

    @Test
    void testGetCloseActionNotSameInstance() {
        CloseAction closeAction1 = Main.getCloseAction();
        CloseAction closeAction2 = new CloseAction(new HandballModel());
        assertNotSame(closeAction1, closeAction2);
    }

    @Test
    void testGetCloseActionType() {
        assertTrue(Main.getCloseAction() instanceof CloseAction);
    }

    @Test
    void testGetCloseActionEquality() {
        CloseAction closeAction1 = Main.getCloseAction();
        CloseAction closeAction2 = new CloseAction(new HandballModel());
        assertEquals(closeAction1, closeAction2);
    }

    @Test
    void testGetCloseActionNotEqual() {
        CloseAction closeAction1 = Main.getCloseAction();
        CloseAction closeAction2 = new CloseAction(new HandballModel());
        assertNotEquals(closeAction1, closeAction2);
    }

    @Test
    void testGetCloseActionHashCode() {
        CloseAction closeAction1 = Main.getCloseAction();
        CloseAction closeAction2 = new CloseAction(new HandballModel());
        assertEquals(closeAction1.hashCode(), closeAction2.hashCode());
    }

    @Test
    void testGetCloseActionToString() {
        assertNotNull(Main.getCloseAction().toString());
    }

    @Test
    void testGetCloseActionInvokeAction() {
        assertDoesNotThrow(() -> Main.getCloseAction().actionPerformed(null));
    }
}
```
