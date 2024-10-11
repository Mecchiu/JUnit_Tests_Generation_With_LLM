// Here's an implementation of the JTextPaneDestination class with the autoPositionCaret method:

// JTextPaneDestination.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;

/**
 * Implementation of {@link OutputDestination} which appends Strings to a {@link JTextPane}.
 *
 * @see OutputDestination
 * @see JTextPane
 * @author <a href="mailto:carl.hall@gmail.com">Carl Hall</a>
 */
public class JTextPaneDestination implements OutputDestination {

    private JTextPane textPane;
    private boolean autoPositionCaret;

    /**
     * Constructor for JTextPaneDestination.
     * @param textPane the JTextPane to append Strings to
     * @param autoPositionCaret whether caret will be automatically moved to the bottom of the text area when text is appended
     */
    public JTextPaneDestination(JTextPane textPane, boolean autoPositionCaret) {
        this.textPane = textPane;
        this.autoPositionCaret = autoPositionCaret;
    }

    /**
     * Appends a String to the JTextPane.
     * @param text the String to append
     */
    @Override
    public void append(String text) {
        try {
            textPane.getDocument().insertString(textPane.getDocument().getLength(), text, null);
            if (autoPositionCaret) {
                textPane.setCaretPosition(textPane.getDocument().getLength());
            }
        } catch (BadLocationException ex) {
            Logger.getLogger(JTextPaneDestination.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return whether caret will be automatically moved to the bottom of the text area when text is
     *         appended
     */
    public boolean autoPositionCaret() {
        return autoPositionCaret;
    }
}

// And here's an implementation of the JTextPaneDestinationTest class with ten unit tests for the autoPositionCaret method:

// JTextPaneDestinationTest.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JTextPaneDestination}.
* It contains ten unit test cases for the {@link JTextPaneDestination#autoPositionCaret()} method.
*/
class JTextPaneDestinationTest {

    @Test
    void testAutoPositionCaretTrue() {
        JTextPane textPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(textPane, true);
        assertTrue(destination.autoPositionCaret());
    }

    @Test
    void testAutoPositionCaretFalse() {
        JTextPane textPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(textPane, false);
        assertFalse(destination.autoPositionCaret());
    }

    @Test
    void testAutoPositionCaretDefault() {
        JTextPane textPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(textPane, true);
        destination = new JTextPaneDestination(textPane);
        assertTrue(destination.autoPositionCaret());
    }

    @Test
    void testAutoPositionCaretSetter() {
        JTextPane textPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(textPane, true);
        destination.setAutoPositionCaret(false);
        assertFalse(destination.autoPositionCaret());
    }

    @Test
    void testAppendAutoPositionCaretTrue() {
        JTextPane textPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(textPane, true);
        destination.append("test");
        assertEquals(textPane.getDocument().getLength(), 4);
        assertEquals(textPane.getCaretPosition(), 4);
    }

    @Test
    void testAppendAutoPositionCaretFalse() {
        JTextPane textPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(textPane, false);
        destination.append("test");
        assertEquals(textPane.getDocument().getLength(), 4);
        assertEquals(textPane.getCaretPosition(), 0);
    }

    @Test
    void testAppendAutoPositionCaretDefault() {
        JTextPane textPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(textPane);
        destination.append("test");
        assertEquals(textPane.getDocument().getLength(), 4);
        assertEquals(textPane.getCaretPosition(), 4);
    }

    @Test
    void testAppendAutoPositionCaretSetter() {
        JTextPane textPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(textPane, true);
        destination.setAutoPositionCaret(false);
        destination.append("test");
        assertEquals(textPane.getDocument().getLength(), 4);
        assertEquals(textPane.getCaretPosition(), 0);
    }

    @Test
    void testAppendNull() {
        JTextPane textPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(textPane, true);
        destination.append(null);
        assertEquals(textPane.getDocument().getLength(), 0);
    }

    @Test
    void testAppendEmptyString() {
        JTextPane textPane = new JTextPane();
        JTextPaneDestination destination = new JTextPaneDestination(textPane, true);
        destination.append("");
        assertEquals(textPane.getDocument().getLength(), 0);
    }
}