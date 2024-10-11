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
* It contains one unit test case for the {@link JTextPaneDestination#autoPositionCaret()} method.
*/
class JTextPaneDestinationTest {
		@javax.annotation.ParametersAreNonnullByDefault
    class JTestCase {
        public void testAutoPositionCaret() {
            if (log.isLoggable(Level.CONFIG)) {
              log.logp(Level.CONFIG, "gmh.follow.io.JTextPaneDestinationTest", "testAutoPositionCaret", "testAutoPositionCaret");
            }
            assertTrue("no auto-position caret", JTextPaneDestinationTest.this.autoPositionCaret());
        }
    }
	@javax.annotation.ParametersAreNonnullByDefault
    class UTestCase {
        public void testNull() {
            if (log.isLoggable(Level.CONFIG)) {
              log.logp(Level.CONFIG, "gmh.follow.io.JTextPaneDestinationTest", "testNull", "testNull");
            }
            assertFalse("not a valid JTextPaneDestination", JTextPaneDestinationTest.this.toString().toLowerCase().equals("invalid jtvn"));
        }
    }
}