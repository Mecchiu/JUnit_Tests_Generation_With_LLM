// Here's the source code for the JTextPaneDestinationTest class:

package ghm.follow.io;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JTextPaneDestination}.
 * It contains ten unit test cases for the {@link JTextPaneDestination#autoPositionCaret()} method.
 */
class JTextPaneDestinationTest {

    @Test
    void testAutoPositionCaretTrue() {
        JTextPane jTextPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(jTextPane, true);
        assertTrue(destination.autoPositionCaret());
    }

    @Test
    void testAutoPositionCaretFalse() {
        JTextPane jTextPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(jTextPane, false);
        assertFalse(destination.autoPositionCaret());
    }

    @Test
    void testSetAutoPositionCaretTrue() {
        JTextPane jTextPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(jTextPane, false);
        destination.setAutoPositionCaret(true);
        assertTrue(destination.autoPositionCaret());
    }

    @Test
    void testSetAutoPositionCaretFalse() {
        JTextPane jTextPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(jTextPane, true);
        destination.setAutoPositionCaret(false);
        assertFalse(destination.autoPositionCaret());
    }

    @Test
    void testPrintAutoPositionCaretTrue() {
        JTextPane jTextPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(jTextPane, true);
        destination.print("test");
        assertEquals("test\n", jTextPane.getText());
    }

    @Test
    void testPrintAutoPositionCaretFalse() {
        JTextPane jTextPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(jTextPane, false);
        destination.print("test");
        assertEquals("test", jTextPane.getText());
    }

    @Test
    void testPrintMultipleAutoPositionCaretTrue() {
        JTextPane jTextPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(jTextPane, true);
        destination.print("test1");
        destination.print("test2");
        assertEquals("test1\ntest2\n", jTextPane.getText());
    }

    @Test
    void testPrintMultipleAutoPositionCaretFalse() {
        JTextPane jTextPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(jTextPane, false);
        destination.print("test1");
        destination.print("test2");
        assertEquals("test1test2", jTextPane.getText());
    }

    @Test
    void testClearAutoPositionCaretTrue() {
        JTextPane jTextPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(jTextPane, true);
        destination.print("test");
        destination.clear();
        assertEquals("", jTextPane.getText());
    }

    @Test
    void testClearAutoPositionCaretFalse() {
        JTextPane jTextPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(jTextPane, false);
        destination.print("test");
        destination.clear();
        assertEquals("", jTextPane.getText());
    }
}