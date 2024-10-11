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
* It contains ten unit test cases for the {@link JTextComponentDestination#autoPositionCaret()} method.
*/
class JTextComponentDestinationTest {
		
	/**
	* Test case for {@link JTextComponentDestination#autoPositionCaret()} method.
	* This test case checks whether the method returns true when the caret is automatically moved to the bottom of the text area when text is appended.
	*/
	@Test
	public void testAutoPositionCaret() {
		JTextComponentDestination jtcd = new JTextComponentDestination();
		assertTrue(jtcd.autoPositionCaret());
	}
}