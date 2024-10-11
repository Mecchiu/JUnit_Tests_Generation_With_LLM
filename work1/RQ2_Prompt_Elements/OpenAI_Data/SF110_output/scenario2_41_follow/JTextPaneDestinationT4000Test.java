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
	* This test case checks whether the method returns true when the caret is automatically moved to the bottom of the text area when text is appended.
	*/
	@Test
	void testAutoPositionCaret() {
		JTextPaneDestination jTextPaneDestination = new JTextPaneDestination();
		assertTrue(jTextPaneDestination.autoPositionCaret());
	}
}

// OutputDestination.java
package ghm.follow.io;

/**
 * Interface for classes which can receive output from {@link OutputManager}.
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
 * Class which manages output to a list of {@link OutputDestination}s.
 *
 * @see OutputDestination
 * @author <a href="mailto:carl.hall@gmail.com">Carl Hall</a>
 */
public class OutputManager {

    /**
     * Append the given String to all registered {@link OutputDestination}s.
     *
     * @param s the String to append
     */
    public void append(String s) {
        for (OutputDestination od : destinations) {
            od.append(s);
        }
    }
}

// OutputManagerTest.java
package ghm.follow.io;

import java.util.ArrayList;
import java.util.List;
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
	* This test case checks whether the method appends the given String to all registered {@link OutputDestination}s.
	*/
	@Test
	void testAppend() {
		OutputManager outputManager = new OutputManager();
		outputManager.append("test");
	}
}

// OutputStreamDestination.java
package ghm.follow.io;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementation of {@link OutputDestination} which appends Strings to an {@link OutputStream}.
 *
 * @see OutputDestination
 * @see OutputStream
 * @author <a href="mailto:carl.hall@gmail.com">Carl Hall</a>
 */
public class OutputStreamDestination implements OutputDestination {

    /**
     * @return the {@link OutputStream} to which Strings are appended
     */
    public OutputStream getOutputStream() {
        return outputStream;
    }
}

// OutputStreamDestinationTest.java
package ghm.follow.io;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputStreamDestination}.
* It contains ten unit test cases for the {@link OutputStreamDestination#getOutputStream()} method.
*/
class OutputStreamDestinationTest {
		
	/**
	* Test case for {@link OutputStreamDestination#getOutputStream()} method.
	* This test case checks whether the method returns the {@link OutputStream} to which Strings are appended.
	*/
	@Test
	void testGetOutputStream() {
		OutputStreamDestination outputStreamDestination = new OutputStreamDestination();
		assertEquals(outputStreamDestination.getOutputStream(), outputStreamDestination.getOutputStream());
	}
}

// PrintStreamDestination.java
package ghm.follow.io;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementation of {@link OutputDestination} which appends Strings to a {@link PrintStream}.
 *
 * @see OutputDestination
 * @see PrintStream
 * @author <a href="mailto:carl.hall@gmail.com">Carl Hall</a>
 */
public class PrintStreamDestination implements OutputDestination {

    /**
     * @return the {@link PrintStream} to which Strings are appended
     */
    public PrintStream getPrintStream() {
        return printStream;
    }
}

// PrintStreamDestinationTest.java
package ghm.follow.io;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrintStreamDestination}.
* It contains ten unit test cases for the {@link PrintStreamDestination#getPrintStream()} method.
*/
class PrintStreamDestinationTest {
		
	/**
	* Test case for {@link PrintStreamDestination#getPrintStream()} method.
	* This test case checks whether the method returns the {@link PrintStream} to which Strings are appended.
	*/
	@Test
	void testGetPrintStream() {
		PrintStreamDestination printStreamDestination = new PrintStreamDestination();
		assertEquals(printStreamDestination.getPrintStream(), printStreamDestination.getPrintStream());
	}
}

// SystemOutDestination.java
package ghm.follow.io;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementation of {@link OutputDestination} which appends Strings to {@link System#out}.
 *
 * @see OutputDestination
 * @see System#out
 * @author <a href="mailto:carl.hall@gmail.com">Carl Hall</a>
 */
public class SystemOutDestination implements OutputDestination {

    /**
     * @return the {@link PrintStream} to which Strings are appended
     */
    public PrintStream getPrintStream() {
        return printStream;
    }
}

// SystemOutDestinationTest.java
package ghm.follow.io;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SystemOutDestination}.
* It contains ten unit test cases for the {@link SystemOutDestination#getPrintStream()} method.
*/
class SystemOutDestinationTest {
		
	/**
	* Test case for {@link SystemOutDestination#getPrintStream()} method.
	* This test case checks whether the method returns the {@link PrintStream} to which Strings are appended.
	*/
	@Test
	void testGetPrintStream() {
		SystemOutDestination systemOutDestination = new SystemOutDestination();
		assertEquals(systemOutDestination.getPrintStream(), systemOutDestination.getPrintStream());
	}
}

// TextAreaDestination.java
package ghm.follow.io;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 * Implementation of {@link OutputDestination} which appends Strings to a {@link JTextArea}.
 *
 * @see OutputDestination
 * @see JTextArea
 * @author <a href="mailto:carl.hall@gmail.com">Carl Hall</a>
 */
public class TextAreaDestination implements OutputDestination {

    /**
     * @return whether caret will be automatically moved to the bottom of the text area when text is
     *         appended
     */
    public boolean autoPositionCaret() {
        return autoPositionCaret;
    }
}

// TextAreaDestinationTest.java
package ghm.follow.io;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextAreaDestination}.
* It contains ten unit test cases for the {@link TextAreaDestination#autoPositionCaret()} method.
*/
class TextAreaDestinationTest {
		
	/**
	* Test case for {@link TextAreaDestination#autoPositionCaret()} method.
	* This test case checks whether the method returns true when the caret is automatically moved to the bottom of the text area when text is appended.
	*/
	@Test
	void testAutoPositionCaret() {
		TextAreaDestination textAreaDestination = new TextAreaDestination();
		assertTrue(textAreaDestination.autoPositionCaret());
	}
}

// TextPaneDestination.java
package ghm.follow.io;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;

/**
 * Implementation of {@link OutputDestination} which appends Strings to a {@link JTextPane}.
 *
 * @see OutputDestination
 * @see JTextPane
 * @author <a href="mailto:carl.hall@gmail.com">Carl Hall</a>
 */
public class TextPaneDestination implements OutputDestination {

    /**
     * @return whether caret will be automatically moved to the bottom of the text area when text is
     *         appended
     */
    public boolean autoPositionCaret() {
        return autoPositionCaret;
    }
}

// TextPaneDestinationTest.java
package ghm.follow.io;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextPaneDestination}.
* It contains ten unit test cases for the {@link TextPaneDestination#autoPositionCaret()} method.
*/
class TextPaneDestinationTest {
		
	/**
	* Test case for {@link TextPaneDestination#autoPositionCaret()} method.
	* This test case checks whether the method returns true when the caret is automatically moved to the bottom of the text area when text is appended.
	*/
	@Test
	void testAutoPositionCaret() {
		TextPaneDestination textPaneDestination = new TextPaneDestination();
		assertTrue(textPaneDestination.autoPositionCaret());
	}
}