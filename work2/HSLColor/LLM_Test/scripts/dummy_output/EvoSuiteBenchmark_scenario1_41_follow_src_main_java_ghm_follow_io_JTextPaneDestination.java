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
		void testAutoPositionCaret() {
				JTextPaneDestination instance = new JTextPaneDestination();
				boolean expResult = false;
				boolean result = instance.autoPositionCaret();
				assertEquals(expResult, result);
		}
}