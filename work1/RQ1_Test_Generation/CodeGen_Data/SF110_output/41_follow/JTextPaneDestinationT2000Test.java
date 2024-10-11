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
		 * Make sure that the autoPositionCaret method returns the same state for the
		 * previous test run.
		 */
		@Test
		public void testAutoPositionCaret() {
			assertTrue(autoPositionCaret);
		}

		/**
		 * Make sure that the autoPositionCaret method returns the same state for the next test
		 * run.
		 */
		@Test
		public void testAutoPositionCaret2() {
			assertTrue(autoPositionCaret);
		}

	/**
	 * Constructor test using two JTextPanes.
	 */
		@Test
		public void testTwoJTextPanes() {
			JTextPane source1 = new JTextPane();
			JTextPane source2 = new JTextPane();
			JTextPaneDestination destination = new JTextPaneDestination(source1, false);

			assertTrue(destination.autoPositionCaret());

			// the method has no effect if autoPositionCaret() is not called.
			destination = new JTextPaneDestination(source2, false);
			assertTrue(destination.autoPositionCaret());
		}

	}
