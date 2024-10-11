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
		
	/**
	 * Test to get the current position and set it to a new position.
	 * 
	 * @throws IOException
	 *             when I/O error occur
	 */
	@Test
    void testPosition() throws IOException {
		JTextPane jTextPane = new JTextPane();
		jTextPane.setText("Test");
		try {
			jTextPane.positionCaret(10);
			fail("position Caret should have failed");
		} catch (BadLocationException ex) {
			log.log(Level.SEVERE, "test-case-1: " + ex.getMessage());
		}
	}
	
	/**
	 * Test to clear the text of the original text.
	 * 
	 * @throws IOException
	 *             when I/O error occur
	 */
	@Test
    void testClear() throws IOException {
		JTextPane jTextPane = new JTextPane();
		jTextPane.setText("Test");
		jTextPane.setCaretVisible(false);
		jTextPane.clear();
    }

}