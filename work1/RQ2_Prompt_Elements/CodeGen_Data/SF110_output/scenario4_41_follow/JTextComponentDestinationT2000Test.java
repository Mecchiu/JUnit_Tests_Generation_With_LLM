// JTextComponentDestinationTest.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JTextComponentDestination}.
* It contains one unit test case for the {@link JTextComponentDestination#autoPositionCaret()} method.
*/
class JTextComponentDestinationTest {

    @Test
    public void createInputPaneDestination() {
        try {
            final JTextComponentDestination destination = new JTextComponentDestination(new JTextComponent(
                "hello, world!"), false);
            assertNotNull(destination);
            destination.clear();
            destination.addFilteredView();
            destination.removeFilteredView();
            destination.clear();
            assertTrue(destination.isFiltered());
            destination.autoPositionCaret();
            assertFalse(destination.isFiltered());
        } catch (BadLocationException e) {
            this.error("BadLocationException", e);
        }
    }

    @Test
    public final void createOutputPaneDestination() {
           Object destination = null;
           try {
               JTextComponent destination = new JTextComponentDestination(new JTextComponent("hello, world!"));
               assertNotNull(destination);
               destination.clear();
               destination.addFilteredView();
               destination.removeFilteredView();
               destination.clear();
               assertFalse(destination.isFiltered());

               destination.setCaretPosition(1);
               destination.insertString(0, "hello, world!", 1);
               assertTrue(destination.isSelectionStart());
               destination.setSelectionStart(3);
               destination.insertString(3, "o", 3);
               assertTrue(destination.isSelectionStart());
               destination.setSelectionEnd(2);
               destination.insertString(2, "o", 2);
               assertTrue(destination.isSelectionStart());
               destination.setSelectionEnd(2);
               destination.insertString(6, "ow", 6);
               destination.insertString(7, "la", 7);
               try {
                   destination.insertString(1, "l", 1);
               } catch(BadLocationException e) {
               }
            assertTrue(destination.isSelectionStart());
            assertTrue(destination.isSelectionEnd());
            assertEquals("h", destination.getSelectedText());
            assertEquals(3, destination.getCaretPosition());
            assertEquals(2, destination.getSelectionEnd());

               assertEquals("hello, world!", destination.getText(3, 3));

            destination.setCaretPositionUnsafe(3);
              destination.insertString(3, "o", 4);
              assertTrue(destination.isSelectionStart());
        } catch (BadLocationException e) {
            this.error("BadLocationException", e);
        }
    }

    @Test
    public final void testError() {
        LOG.log(Level.SEVERE, "Test Error", new Throwable("Failed to create destination."));
        assertFalse(true);
    }
    @Test
    public final void testUnsupportedOperationException() {
        LOG.log(Level.WARNING, "Cannot convert to String");
        assertFalse(true);
    }
    @Test
    public final void testClosedBug() {
        LOG.log(Level.INFO, "JTextComponentDestinationTest.testClosedBug()");
        try {
            assertTrue("JTextComponent should be closed.", jTextPane.isDisposed());
        }
        catch (java.awt.InvalidAttemptException e) {
            this.error(e);
        }
    }
}
