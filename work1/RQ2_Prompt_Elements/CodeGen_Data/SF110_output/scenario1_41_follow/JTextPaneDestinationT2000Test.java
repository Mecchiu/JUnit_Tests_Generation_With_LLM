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

	private static final Logger logger = Logger.getLogger("test");

    @SuppressWarnings("unused")
	private static final int AUTO_POSITION_CANCELLATION = 0;

    private JTextPaneDestination textPaneDestination;
	
    /**
 * Constructor of {@link JTextPaneDestination}.
 * @throws IllegalArgumentException if {@link #autoPositionCaret} is not set.
 */
	
    public JTextPaneDestinationTest(Boolean autoPositionCancellation)
        throws IllegalArgumentException {
		logger.log(Level.INFO, "Test of " + JTextPaneDestination.class.getName() + " set to " + Boolean.toString(autoPositionCancellation));
		assertTrue("The class " + JTextPaneDestination.class.getName() + " must be set to Boolean.TRUE", autoPositionCancellation);
		textPaneDestination = new JTextPaneDestination();		
    }

	  /**
	 * This method tests the set and get autoPositionCaret method.
	 */
    @Test
    public void testAutoWriteToTarget() {
        //Test setAutoPositionCaret
        textPaneDestination.autoPositionCaret = false;
        String newText = "Test text";
        try { new TextPaneWriter(); }
        catch (IOException e) {
            if (logger.isLoggable(Level.INFO)) logger.log(Level.INFO, "Caught exception in " + new TextPaneWriter().getClass().getName() + ": " + e.getMessage());
        }
        assertEquals(newText, textPaneDestination.autoPositionCaretStr.toString());
        textPaneDestination.autoPositionCaretStr = "some random str";
        assertEquals(newText, textPaneDestination.autoPositionCaretStr.toString());
        //Test getAutoPositionCaret
        textPaneDestination.autoPositionCaret = true;
        assertEquals(newText, textPaneDestination.autoPositionCaretStr.toString());
    }

    /**
	 * This method tests the auto position cursor for output.
	 */
    @Test
    public void testCursorPositionAutoWrite() {
		textPaneDestination.autoPositionCaretStr = "Test text";
		try { new TextPaneWriter(); }
		catch (IOException e) {
			if (logger.isLoggable(Level.INFO)) logger.log(Level.INFO, "Caught exception in " + new TextPaneWriter().getClass().getName() + ": " + e.getMessage());
		}
		textPaneDestination.cursorPosition = 2;
        //Test setAutoPositionCaret
		textPaneDestination.autoWrite = false;
		try { new TextPaneWriter(); }
        catch (IOException e) {
            if (logger.isLoggable(Level.INFO)) logger.log(Level.INFO, "Caught exception in " + new TextPaneWriter().getClass().getName() + ": " + e.getMessage());
        }
		assertFalse("The cursorPosition should have been set to -1", textPaneDestination.cursorPosition == -1);
		assertEquals("The cursorPosition should have been saved as -1", textPaneDestination.cursorPosition, -1);
        //Test getAutoWrite
		textPaneDestination.autoWrite = true;
        assertEquals("The write flag should be set to TRUE", textPaneDestination.autoWrite, true);
		textPaneDestination.autoWrite = false;
        assertFalse("The return value should have been saved to 0", textPaneDestination.autoWrite);
        textPaneDestination.autoWrite = true;
        assertEquals("The write flag should be set to TRUE", textPaneDestination.autoWrite, true);
	}
	
	 /**
	 * This method tests the auto position cursor for input.
	 */
    @Test
    public void testCursorPositionInput() {
		textPaneDestination.autoPositionCaretStr = "Test text";
		try { new TextPaneWriter(); }
        catch (IOException e) {
            if (logger.isLoggable(Level.INFO)) logger.log(Level.INFO, "Caught exception in " + new TextPaneWriter().getClass().getName() + ": " + e.getMessage());
        }
		//Test setAutoWrite
		textPaneDestination.autoWrite = false;
		try { new TextPaneWriter(); }
        catch (IOException e) {
            if (logger.isLoggable(Level.INFO)) logger.log(Level.INFO, "Caught exception in " + new TextPaneWriter().getClass().getName() + ": " + e.getMessage());
        }
		//Test setAutoPositionCaret
		textPaneDestination.autoPositionCaret = true;
		textPaneDestination.autoWrite = false;

		textPaneDestination.autoPositionCaretStr = "some random str";
		assertEquals("The autoPosition cursor position should have been saved as 2", textPaneDestination.cursorPosition, 2);
		textPaneDestination.writeToTarget();
		textPaneDestination.autoPositionCaretStr = "the last 5 str";
		//Test getAutoWrite
		textPaneDestination.autoWrite = true;
		textPaneDestination.autoPositionCaret = true;
		textPaneDestination.writeToTarget();
		assertEquals("The autoWrite flag should be set to True", textPaneDestination.autoWrite, true);
		textPaneDestination.autoWrite = false;
        assertFalse("The Writeflag should have been set to FALSE", textPaneDestination.autoWrite);
        textPaneDestination.autoWrite = true;
        assertTrue("The Writeflag should have been set to True", textPaneDestination.autoWrite);
        textPaneDestination.autoWrite = false;
        assertFalse("The Return value should have been set to FALSE", textPaneDestination.autoWrite);
    }
}
