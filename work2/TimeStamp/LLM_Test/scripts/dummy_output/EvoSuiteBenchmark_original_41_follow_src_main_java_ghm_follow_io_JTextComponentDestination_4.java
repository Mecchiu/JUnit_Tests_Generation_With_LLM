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
* It contains one unit test case for the {@link JTextComponentDestination#autoPositionCaret()} method.
*/
class JTextComponentDestinationTest {
		
	private static final Logger LOG = Logger.getLogger(JTextComponentDestinationTest.class.getName());

	/**
	 * A unit test for the "auto position caret" method call.
	 *
	 * @throws Exception
	*         unexpected behaviour from calls
	 */
	@Test
	void autoPositionCaretTest() throws Exception {
		JTextComponentDestination destination = new JTextComponentDestination(new JTextComponent(), true);
		assertEquals(false, destination.autoPositionCaret());
		assertEquals(true, destination.autoPositionCaret());
	}

	// TextComponent {
	/**
	 * A unit test of the "handlePrint" method.
	 *
	 * @throws IOException
	*         unexpected behaviour when reading
	 */
	@Test
	void handlePrint() throws IOException {
		// create a listener
		PrintListener listener = new PrintListener();
		// execute the listener
		destination.handlePrint("Hello");
		// check
		destination.checkForErrors();
		assertTrue(destination.getPrintedContents().length > 0);
	}

	// TextCaret {
	/**
	 * A unit test of the "clear" method.
	 *
	 * @throws BAD_ATTEMPT, BAD_OFFSET
	 *         failed
	 */
	@Test
	void clearTest() throws Exception {
		// create a listener
		clearListener = new ErrorListener();
		// execute the listener
		destination.handlePrint("Hello");
		// check
		assertTrue(clearListener.isPrinted());
	}

	// ErrorListener
	/**
	 * A unit test of the "handlePrint" method.
	 *
	 * @throws Exception
	 *         exception from calls
	 */
	@Test
	void handlePrintError() throws Exception {
		
		// create a listener
		clearListener = new ErrorListener();
		// execute the listener
		destination.handlePrint("No Goodbye");
		destination.checkForErrors();
		assertTrue(clearListener.isPrinted());
	}

	/**
	 * A unit test of the "checkForErrors" method.
	 *
	 * @throws Exception
	 *         exception from calls
	 */
	@Test
	void checkForErrorsTest1() throws Exception {
		assertEquals(0, JTextComponentDestination.checkForErrors().size());
	}

	/**
	 * A unit test of the "checkForErrors" method.
	 *
	 * @param message
     *            failure message
	 * @throws Exception
	 *         exception from calls
	 */
	@Test
	void checkForErrorsTest2(String message) throws Exception {
		String[][] messages = new String[][] {
				{"No Goodbye", null},
				{"Something really went wrong.", "Please see below"}
		};
		destination.checkForErrors(message);
		assertEquals(1, JTextComponentDestination.checkForErrors().size());
		Object firstElement, secondElement;
		firstElement = JTextComponentDestination.checkForErrors().iterator().next();
		secondElement = JTextComponentDestination.checkForErrors().remove(0);
		assertEquals("Something really went wrong.", message);
		assertEquals(firstElement, secondElement);
	}

	// PrintComponent {
	/**
	 * A unit test of the "getPrintedContents" method.
	 *
	 * @throws BadLocationException
	 *         exception from calls
	 */
	@Test
	void getPrintedContentsTest() throws BadLocationException {
		// create a listener
		clearListener = new ErrorListener();
		clearListener.checkForErrors();
		clearListener.reset();
		// execute the listener
		destination.handlePrint("Hello");
		// check
		assertTrue(clearListener.isPrinted());
		assertTrue(clearListener.isPrinted());
		destination.handlePrint("Bello");
		clearListener.reset();
		// check
		assertTrue(clearListener.isPrinted());
		clearListener.reset();
		assertTrue(clearListener.isPrinted());
		destination.handlePrint("Nope");
		// check
		assertTrue(clearListener.isPrinted());
		clearListener.reset();
		// test
	}

	// JTextComponent {
	/**
	 * A unit test of the "createNew" method.
	 *
	 * @throws BadLocationException
	 *         exception from calls
	 */
	@Test
	void createNewTest1() throws BadLocationException {
		// create a listener
		clearListener = new ErrorListener();
		clearListener.checkForErrors();
		clearListener.reset();
		// execute the listener
		JTextComponentDestination destination = new JTextComponentDestination(new JTextComponent(), false);
		destination.createNew();
		// check
		assertTrue(destination.getPrintedContents().length == 0);
		destination = new JTextComponentDestination(new JTextComponent(), true);
		destination.createNew();
		// check
		assertTrue(clearListener.isPrinted());
		// check(same reason)
	}

	// JTextComponent {
	/**
	 * A unit test of the "delete" method.
	 *
	 * @throws BadLocationException
	 *         exception from calls
	 */
	@Test
	void deleteTest() throws BadLocationException {
		// create a listener
		clearListener = new ErrorListener();
		clearListener.checkForErrors();
		clearListener.reset();
}
}