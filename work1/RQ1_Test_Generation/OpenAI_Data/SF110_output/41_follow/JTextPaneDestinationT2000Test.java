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

	private static final Logger log = Logger.getLogger(JTextPaneDestinationTest.class.getName());
	
	/**
	* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
	* It tests the case when the caret is automatically moved to the bottom of the text area when text is appended.
	*/
	@Test
	void testAutoPositionCaret() {
		JTextPane jTextPane = new JTextPane();
		JTextPaneDestination jTextPaneDestination = new JTextPaneDestination(jTextPane, true);
		jTextPaneDestination.print("test");
		try {
			assertEquals(jTextPane.getDocument().getLength(), jTextPane.getCaretPosition());
		} catch (BadLocationException e) {
			// just ignore, nothing we can do
			log.log(Level.SEVERE, "BadLocationException in JTextPaneDestinationTest", e);
		}
	}
	
	/**
	* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
	* It tests the case when the caret is not automatically moved to the bottom of the text area when text is appended.
	*/
	@Test
	void testNotAutoPositionCaret() {
		JTextPane jTextPane = new JTextPane();
		JTextPaneDestination jTextPaneDestination = new JTextPaneDestination(jTextPane, false);
		jTextPaneDestination.print("test");
		try {
			assertNotEquals(jTextPane.getDocument().getLength(), jTextPane.getCaretPosition());
		} catch (BadLocationException e) {
			// just ignore, nothing we can do
			log.log(Level.SEVERE, "BadLocationException in JTextPaneDestinationTest", e);
		}
	}
	
	/**
	* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
	* It tests the case when the caret is automatically moved to the bottom of the text area when text is appended.
	*/
	@Test
	void testAutoPositionCaret2() {
		JTextPane jTextPane = new JTextPane();
		JTextPaneDestination jTextPaneDestination = new JTextPaneDestination(jTextPane, true);
		jTextPaneDestination.print("test");
		try {
			assertEquals(jTextPane.getDocument().getLength(), jTextPane.getCaretPosition());
		} catch (BadLocationException e) {
			// just ignore, nothing we can do
			log.log(Level.SEVERE, "BadLocationException in JTextPaneDestinationTest", e);
		}
	}
	
	/**
	* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
	* It tests the case when the caret is not automatically moved to the bottom of the text area when text is appended.
	*/
	@Test
	void testNotAutoPositionCaret2() {
		JTextPane jTextPane = new JTextPane();
		JTextPaneDestination jTextPaneDestination = new JTextPaneDestination(jTextPane, false);
		jTextPaneDestination.print("test");
		try {
			assertNotEquals(jTextPane.getDocument().getLength(), jTextPane.getCaretPosition());
		} catch (BadLocationException e) {
			// just ignore, nothing we can do
			log.log(Level.SEVERE, "BadLocationException in JTextPaneDestinationTest", e);
		}
	}
	
	/**
	* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
	* It tests the case when the caret is automatically moved to the bottom of the text area when text is appended.
	*/
	@Test
	void testAutoPositionCaret3() {
		JTextPane jTextPane = new JTextPane();
		JTextPaneDestination jTextPaneDestination = new JTextPaneDestination(jTextPane, true);
		jTextPaneDestination.print("test");
		try {
			assertEquals(jTextPane.getDocument().getLength(), jTextPane.getCaretPosition());
		} catch (BadLocationException e) {
			// just ignore, nothing we can do
			log.log(Level.SEVERE, "BadLocationException in JTextPaneDestinationTest", e);
		}
	}
	
	/**
	* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
	* It tests the case when the caret is not automatically moved to the bottom of the text area when text is appended.
	*/
	@Test
	void testNotAutoPositionCaret3() {
		JTextPane jTextPane = new JTextPane();
		JTextPaneDestination jTextPaneDestination = new JTextPaneDestination(jTextPane, false);
		jTextPaneDestination.print("test");
		try {
			assertNotEquals(jTextPane.getDocument().getLength(), jTextPane.getCaretPosition());
		} catch (BadLocationException e) {
			// just ignore, nothing we can do
			log.log(Level.SEVERE, "BadLocationException in JTextPaneDestinationTest", e);
		}
	}
	
	/**
	* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
	* It tests the case when the caret is automatically moved to the bottom of the text area when text is appended.
	*/
	@Test
	void testAutoPositionCaret4() {
		JTextPane jTextPane = new JTextPane();
		JTextPaneDestination jTextPaneDestination = new JTextPaneDestination(jTextPane, true);
		jTextPaneDestination.print("test");
		try {
			assertEquals(jTextPane.getDocument().getLength(), jTextPane.getCaretPosition());
		} catch (BadLocationException e) {
			// just ignore, nothing we can do
			log.log(Level.SEVERE, "BadLocationException in JTextPaneDestinationTest", e);
		}
	}
	
	/**
	* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
	* It tests the case when the caret is not automatically moved to the bottom of the text area when text is appended.
	*/
	@Test
	void testNotAutoPositionCaret4() {
		JTextPane jTextPane = new JTextPane();
		JTextPaneDestination jTextPaneDestination = new JTextPaneDestination(jTextPane, false);
		jTextPaneDestination.print("test");
		try {
			assertNotEquals(jTextPane.getDocument().getLength(), jTextPane.getCaretPosition());
		} catch (BadLocationException e) {
			// just ignore, nothing we can do
			log.log(Level.SEVERE, "BadLocationException in JTextPaneDestinationTest", e);
		}
	}
	
	/**
	* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
	* It tests the case when the caret is automatically moved to the bottom of the text area when text is appended.
	*/
	@Test
	void testAutoPositionCaret5() {
		JTextPane jTextPane = new JTextPane();
		JTextPaneDestination jTextPaneDestination = new JTextPane