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
	 * Test for the auto position "caret" position that will move the caret to the beginning
	 * of the text area.
	 *
	 * @since 1.8.0
	 */
	@Test
	public void testAutoPositionCaret() {
		Logger.getLogger(JTextPaneDestination.class.getName()).log(Level.FINE, "/", null);
		JTextPaneDestination.autoPositionCaret(true);
		assertTrue("Failed to find auto position with caret, in case of this test case auto-position-caret should be true", true);
	}

	/**
	 * Test for the auto position "caret" position that will move the caret to the end
	 * of the text area.
	 *
	 * @since 1.8.0
	 */
	@Test
	public void testAutoPositionCaret2() {
		Logger.getLogger(JTextPaneDestination.class.getName()).log(Level.FINE, "/", null);
		JTextPaneDestination.autoPositionCaret(true, false);
		assertTrue("Failed to find auto position with caret, in case of this test case auto-position-caret should be false", false);
	}
	
	
	@Test
	public void testAutoPositionWithoutCaret(){
		Logger.getLogger(JTextPaneDestination.class.getName()).log(Level.FINE, "/", null);
		JTextPane jTextPane = new JTextPane();
		JTextPaneDestination destination = new JTextPaneDestination(jTextPane, false);
		assertTrue("Failed to autoposition without a caret",!destination.autoPositionCaret());
		
		destination.print("A");
		destination.print("B");
		destination.print("C");
		assertTrue("Failed to test auto-position with all characters as output, in case where auto-position-caret of text areas were true", jTextPane.getText().length() == 1);
		destination.clear("");
		destination.print("D");
		assertTrue("Failed to test auto-position without a caret", jTextPane.getText().length() == 1);
	}
	
	
	/**
	 * Test for the auto position 'caret' position that will not move the caret to the beginning
	 * of the text area or if it will move it outside of its bounds when auto-position-caret
	 * of text areas is true.
	 */
	@Test
	public void testAutoPositionNoMovement(){
		Logger.getLogger(JTextPaneDestination.class.getName()).log(Level.FINE, "/", null);
		JTextPane jTextPane = new JTextPane();
		JTextPaneDestination destination = new JTextPaneDestination(jTextPane, true);
		assertTrue("Failed to autoposition no movement",!destination.autoPositionCaret());
		jTextPane.setEditable(false);
		jTextPane.setBackground(java.awt.Color.red);
		jTextPane.setCaretPosition(14);
		assertEquals("Failed to select from the text area", 14, jTextPane.getCaretPosition());
		destination.print("E");
		assertEquals("Failed to select from the text area", 15, jTextPane.getCaretPosition());
		assertFalse("Failed to return true as we did not move caret", jTextPane.getText().length() == 0);
		destination.clear("> ");
		destination.print("F");
		assertEquals("Failed to select from the text area", 1, jTextPane.getCaretPosition());
		assertNegative("Failed to select from the text area", jTextPane.getCaretPosition());
	}

	/**
	 * @since 1.0.0
	 */
	@Test
	public void testCaretNotSet(){
		Logger.getLogger(JTextPaneDestination.class.getName()).log(Level.FINE, "/", null);
		JTextPane jTextPane = initializeJTextPaneWithCaretPosition(-1);
		
		assertTrue("Failed to auto-position with caret if destination doesnt have a location", destination.autoPositionCaret());
		destination.print("foo");
		assertFalse("Failed to auto-position with caret if destination is at end of text area if auto-position coterminates text", jTextPane.getText().length() == 0);
		destination.clear("");
		destination.print("");
		assertFalse("Failed to auto-position with caret if destination is at end of text area if auto-position coterminates text", jTextPane.getText().length() == 0);
		destination.clear("");
		
		assertFalse("Failed to auto-position in case of failure", jTextPane.getText().length() == 0);
	}
	
}