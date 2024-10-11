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
		
	private static final String PANE_TEXT;
	
	static {
		String TEST_CONTENT;
		try {
			TEST_CONTENT = JTextPaneDestinationTest.class.getClassLoader().getResourceAsStream("JTextPaneDestinationTest.txt").available();
		} catch (Exception ex) {
    		throw new RuntimeException(ex);
    	}

		PANE_TEXT = TEST_CONTENT.substring(0, TEST_CONTENT.length() - 1);
	}

	/**
	 * Construct constructor of JTextPaneDestinationTest.
	 * It tests whether the {@link JTextPaneDestination#autoPositionCaret()} method
	 * correctly returns true for JTextPaneDestination.getJTextPane().removeFilteredView().
	 */
	@Test
	void autoPositionCaret() {
	
		JTextPaneDestination jTextPaneDestination = null;

		try {
	
			jTextPaneDestination = new JTextPaneDestination(null, false);
		
			jTextPaneDestination.autoPositionCaret();
	
		} catch (Exception ex) {
			failed("Exception when trying to auto position caret for empty TextPane").addException(ex);
		} finally {
			if (jTextPaneDestination!= null) {
				jTextPaneDestination.setJTextPane(null);
			}
		}
	}

	/**
	 * Checks whether the {@code getJTextPane()} method correctly returns a {@link JTextPane}.
	 * It tests whether the {@link JTextPane} method correctly returns a {@link JTextPane} with
	 * a filtered view.
	 */
	private void failed(String msg) {
		JTextPane jTextPane = jTextPaneDestination.getJTextPane();

		assertNotNull("TextArea's jTextPane should not be null on success.", jTextPane);

		assertEquals(msg, "Unexpected result from jTextPane's getJTextPane().getJTextPane().addFilteredView().", jTextPane.getJTextPane().getJTextPane() instanceof JTextPane, true);

		assertEquals(jTextPane.getViewCount(), 0);
	}

	//---------------------------------------------------------------------------------
	// TestCase ---------------------------------------------------------------
	//---------------------------------------------------------------------------------
	/**
	 * Test of method autoPositionCaret().
	 * <p>
	 * The test class' behavior is undefined, because it is tested in specific implementations.
	 * </p>
	 */
	@Test
	public void testAutoPositionCaret() {
	
		fail("Not yet implemented");
	}
}