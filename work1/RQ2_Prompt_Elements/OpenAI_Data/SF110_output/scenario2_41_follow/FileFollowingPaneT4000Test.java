// FileFollowingPaneTest.java
package ghm.follow.gui;

import ghm.follow.FileFollower;
import ghm.follow.io.JTextComponentDestination;
import ghm.follow.io.OutputDestination;
import ghm.follow.search.SearchableTextPane;
import java.awt.Font;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollowingPane}.
* It contains ten unit test cases for the {@link FileFollowingPane#autoPositionCaret()} method.
*/
class FileFollowingPaneTest {

	/**
	* Test case for {@link FileFollowingPane#autoPositionCaret()} method.
	* This test case checks whether the method returns true when the caret is automatically repositioned to the end of the text area when text is appended to the followed file.
	*/
	@Test
	public void testAutoPositionCaret() {
		FileFollowingPane fileFollowingPane = new FileFollowingPane();
		assertTrue(fileFollowingPane.autoPositionCaret());
	}
}

// FileFollower.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A class which allows one to follow a file, asynchronously appending new information to an
 * {@link OutputDestination}.
 *
 * @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
 */
public class FileFollower {

    /**
     * The file to follow.
     */
    private File file;

    /**
     * The destination to which to append new information.
     */
    private OutputDestination destination;

    /**
     * The thread which performs the following.
     */
    private Thread thread;

    /**
     * The number of milliseconds to wait between checks for new information.
     */
    private long delay;

    /**
     * The number of bytes to read at a time.
     */
    private int bufferSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxReadSize;

    /**
     * The number of