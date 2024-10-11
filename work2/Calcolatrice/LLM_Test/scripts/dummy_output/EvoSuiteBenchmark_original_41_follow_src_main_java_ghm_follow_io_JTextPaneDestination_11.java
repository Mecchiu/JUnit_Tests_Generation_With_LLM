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
		Logger log = Logger.getLogger(JTextPaneDestinationTest.class.getName());
		String text;

	/**
	 * Unit test cases.
	 *
	 * @throws RuntimeException
	 *             when something is wrong
	*/
	@Test
	public void test_01() {
		// Prepare
		JTextPane jTextPane = new JTextPane();
		jTextPane.setEditable(false);
		jTextPane.setFocusable(false);

		// Call method under test
		try {
			jTextPane.setAutoPositionCaret(true);
		} catch (IllegalStateException e) {
			// ignore
		} catch (BadLocationException e) {
			fail(e.getMessage());
		}

		// Verify
		assertFalse(jTextPane.isAutoPositionCaret());
	}

	/**
	 * Test methods.
	 */
	@Test
	public void test_02() {
		// Prepare
		JTextPane jTextPane = new JTextPane();
		jTextPane.setEditable(false);
		jTextPane.setFocusable(false);

		// Call method under test
		jTextPane.setAutoPositionCaret(true);

		// Verify
		assertTrue(jTextPane.isAutoPositionCaret());
	}

	/**
	 * Test methods.
	 */
	@Test
	public void test_03() {
		// Prepare
		JTextPane jTextPane = new JTextPane();
		jTextPane.setEditable(false);
		jTextPane.setFocusable(false);

		// Call method under test
		jTextPane.setAutoPositionCaret(false);

		// Verify
		assertTrue(!jTextPane.isAutoPositionCaret());
	}
}