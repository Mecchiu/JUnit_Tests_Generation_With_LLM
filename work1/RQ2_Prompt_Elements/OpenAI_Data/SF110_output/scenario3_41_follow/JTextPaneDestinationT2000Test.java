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

	/**
	 * Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
	 * It tests the method with the following inputs.
	 * <ul>
	 * <li>Input 1: null</li>
	 * <li>Input 2: empty string</li>
	 * <li>Input 3: string with only spaces</li>
	 * <li>Input 4: string with only tabs</li>
	 * <li>Input 5: string with only newlines</li>
	 * <li>Input 6: string with only carriage returns</li>
	 * <li>Input 7: string with only form feeds</li>
	 * <li>Input 8: string with only vertical tabs</li>
	 * <li>Input 9: string with only backspaces</li>
	 * <li>Input 10: string with only backslashes</li>
	 * </ul>
	 */
	@Test
	void testAutoPositionCaret() {
		// Input 1: null
		try {
			JTextPaneDestination.autoPositionCaret(null);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("textPane cannot be null", e.getMessage());
		}
		
		// Input 2: empty string
		try {
			JTextPaneDestination.autoPositionCaret("");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("textPane cannot be empty", e.getMessage());
		}
		
		// Input 3: string with only spaces
		try {
			JTextPaneDestination.autoPositionCaret("   ");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("textPane cannot be empty", e.getMessage());
		}
		
		// Input 4: string with only tabs
		try {
			JTextPaneDestination.autoPositionCaret("\t\t\t");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("textPane cannot be empty", e.getMessage());
		}
		
		// Input 5: string with only newlines
		try {
			JTextPaneDestination.autoPositionCaret("\n\n\n");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("textPane cannot be empty", e.getMessage());
		}
		
		// Input 6: string with only carriage returns
		try {
			JTextPaneDestination.autoPositionCaret("\r\r\r");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("textPane cannot be empty", e.getMessage());
		}
		
		// Input 7: string with only form feeds
		try {
			JTextPaneDestination.autoPositionCaret("\f\f\f");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("textPane cannot be empty", e.getMessage());
		}
		
		// Input 8: string with only vertical tabs
		try {
			JTextPaneDestination.autoPositionCaret("\u000B\u000B\u000B");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("textPane cannot be empty", e.getMessage());
		}
		
		// Input 9: string with only backspaces
		try {
			JTextPaneDestination.autoPositionCaret("\b\b\b");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("textPane cannot be empty", e.getMessage());
		}
		
		// Input 10: string with only backslashes
		try {
			JTextPaneDestination.autoPositionCaret("\\\b\b\b");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("textPane cannot be empty", e.getMessage());
		}
	}
}

// OutputDestination.java
package ghm.follow.io;

/**
 * Interface for classes which can receive output from the {@link OutputManager}.
 *
 * @see OutputManager
 * @author <a href="mailto:carl.hall@gmail.com">Carl Hall</a>
 */
public interface OutputDestination {

    /**
     * Append the given String to the destination.
     *
     * @param s the String to append
     */
    public void append(String s);
}

// OutputManager.java
package ghm.follow.io;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class which manages output destinations and provides a single point of access for outputting
 * Strings.
 *
 * @see OutputDestination
 * @author <a href="mailto:carl.hall@gmail.com">Carl Hall</a>
 */
public class OutputManager {

    /**
     * Append the given String to all registered output destinations.
     *
     * @param s the String to append
     */
    public void append(String s);
}

// OutputManagerTest.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link OutputManager}.
 * It contains ten unit test cases for the {@link OutputManager#append(String)} method.
 */
class OutputManagerTest {
		
	/**
	 * Test case for {@link OutputManager#append(String)} method.
	 * It tests the method with the following inputs.
	 * <ul>
	 * <li>Input 1: null</li>
	 * <li>Input 2: empty string</li>
	 * <li>Input 3: string with only spaces</li>
	 * <li>Input 4: string with only tabs</li>
	 * <li>Input 5: string with only newlines</li>
	 * <li>Input 6: string with only carriage returns</li>
	 * <li>Input 7: string with only form feeds</li>
	 * <li>Input 8: string with only vertical tabs</li>
	 * <li>Input 9: string with only backspaces</li>
	 * <li>Input 10: string with only backslashes</li>
	 * </ul>
	 */
	@Test
	void testAppend() {
		// Input 1: null
		try {
			OutputManager.append(null);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("s cannot be null", e.getMessage());
		}
		
		// Input 2: empty string
		try {
			OutputManager.append("");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("s cannot be empty", e.getMessage());
		}
		
		// Input 3: string with only spaces
		try {
			OutputManager.append("   ");
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
		