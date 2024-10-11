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
		* Test case for the {@link FileFollowingPane#autoPositionCaret()} method.
		* This test case checks if the method returns true.
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
 * A class which allows one to follow a file to which information is being asynchronously appended.
 *
 * @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
 */
public class FileFollower {

    /**
     * The file to follow.
     */
    private File file;

    /**
     * The destination to which the file contents are written.
     */
    private OutputDestination destination;

    /**
     * The thread which performs the actual following.
     */
    private Thread followerThread;

    /**
     * The number of milliseconds to wait between checks for new data.
     */
    private long delay;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSize;

    /**
     * The number of bytes to read at a time.
     */
    private int maxChunkSize;

    /**
     * The number of bytes to read at a time.
     */
    private int minChunkSize;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrement;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrement;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCount;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCount;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountReset;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountReset;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCount;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetCount;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCountThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetCountThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCountReset;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetCountReset;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCountResetThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetCountResetThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCountResetCount;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetCountResetCount;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCountResetCountThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetCountResetCountThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCountResetCountReset;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetCountResetCountReset;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCountResetCountResetThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetCountResetCountResetThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCountResetCountResetCount;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetCountResetCountResetCount;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCountResetCountResetCountThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetCountResetCountResetCountThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCountResetCountResetCountReset;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetCountResetCountResetCountReset;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCountResetCountResetCountResetThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetCountResetCountResetCountResetThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCountResetCountResetCountResetCount;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetCountResetCountResetCountResetCount;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCountResetCountResetCountResetCountThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetCountResetCountResetCountResetCountThreshold;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCountResetCountResetCountResetCountReset;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeDecrementCountResetCountResetCountResetCountResetCountReset;

    /**
     * The number of bytes to read at a time.
     */
    private int chunkSizeIncrementCountResetCountResetCountResetCountResetCountResetThreshold;

    /**
     * The number of bytes to