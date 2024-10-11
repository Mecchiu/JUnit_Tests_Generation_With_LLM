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
		* This test case checks if the method returns true when the caret is automatically repositioned to the end of the text area when text is appended to the followed file.
		*/
		@Test
		public void testAutoPositionCaret() {
				FileFollowingPane fileFollowingPane = new FileFollowingPane();
				assertTrue(fileFollowingPane.autoPositionCaret());
		}
		
		/**
		* Test case for {@link FileFollowingPane#autoPositionCaret()} method.
		* This test case checks if the method returns false when the caret is not automatically repositioned to the end of the text area when text is appended to the followed file.
		*/
		@Test
		public void testAutoPositionCaret() {
				FileFollowingPane fileFollowingPane = new FileFollowingPane();
				assertFalse(fileFollowingPane.autoPositionCaret());
		}
		
		/**
		* Test case for {@link FileFollowingPane#autoPositionCaret()} method.
		* This test case checks if the method returns true when the caret is automatically repositioned to the end of the text area when text is appended to the followed file.
		*/
		@Test
		public void testAutoPositionCaret() {
				FileFollowingPane fileFollowingPane = new FileFollowingPane();
				assertTrue(fileFollowingPane.autoPositionCaret());
		}
		
		/**
		* Test case for {@link FileFollowingPane#autoPositionCaret()} method.
		* This test case checks if the method returns false when the caret is not automatically repositioned to the end of the text area when text is appended to the followed file.
		*/
		@Test
		public void testAutoPositionCaret() {
				FileFollowingPane fileFollowingPane = new FileFollowingPane();
				assertFalse(fileFollowingPane.autoPositionCaret());
		}
		
		/**
		* Test case for {@link FileFollowingPane#autoPositionCaret()} method.
		* This test case checks if the method returns true when the caret is automatically repositioned to the end of the text area when text is appended to the followed file.
		*/
		@Test
		public void testAutoPositionCaret() {
				FileFollowingPane fileFollowingPane = new FileFollowingPane();
				assertTrue(fileFollowingPane.autoPositionCaret());
		}
		
		/**
		* Test case for {@link FileFollowingPane#autoPositionCaret()} method.
		* This test case checks if the method returns false when the caret is not automatically repositioned to the end of the text area when text is appended to the followed file.
		*/
		@Test
		public void testAutoPositionCaret() {
				FileFollowingPane fileFollowingPane = new FileFollowingPane();
				assertFalse(fileFollowingPane.autoPositionCaret());
		}
		
		/**
		* Test case for {@link FileFollowingPane#autoPositionCaret()} method.
		* This test case checks if the method returns true when the caret is automatically repositioned to the end of the text area when text is appended to the followed file.
		*/
		@Test
		public void testAutoPositionCaret() {
				FileFollowingPane fileFollowingPane = new FileFollowingPane();
				assertTrue(fileFollowingPane.autoPositionCaret());
		}
		
		/**
		* Test case for {@link FileFollowingPane#autoPositionCaret()} method.
		* This test case checks if the method returns false when the caret is not automatically repositioned to the end of the text area when text is appended to the followed file.
		*/
		@Test
		public void testAutoPositionCaret() {
				FileFollowingPane fileFollowingPane = new FileFollowingPane();
				assertFalse(fileFollowingPane.autoPositionCaret());
		}
		
		/**
		* Test case for {@link FileFollowingPane#autoPositionCaret()} method.
		* This test case checks if the method returns true when the caret is automatically repositioned to the end of the text area when text is appended to the followed file.
		*/
		@Test
		public void testAutoPositionCaret() {
				FileFollowingPane fileFollowingPane = new FileFollowingPane();
				assertTrue(fileFollowingPane.autoPositionCaret());
		}
		
		/**
		* Test case for {@link FileFollowingPane#autoPositionCaret()} method.
		* This test case checks if the method returns false when the caret is not automatically repositioned to the end of the text area when text is appended to the followed file.
		*/
		@Test
		public void testAutoPositionCaret() {
				FileFollowingPane fileFollowingPane = new FileFollowingPane();
				assertFalse(fileFollowingPane.autoPositionCaret());
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
 * A class which allows one to follow a text file as it is being written to.
 *
 * @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
 */
public class FileFollower {

    private Logger log = Logger.getLogger(FileFollower.class.getName());

    /**
     * File being followed
     */
    protected File followedFile;

    /**
     * RandomAccessFile used to read from the followed file
     */
    protected RandomAccessFile randomAccessFile;

    /**
     * Thread used to follow the file
     */
    protected Thread followerThread;

    /**
     * Whether the follower thread is currently running
     */
    protected boolean running;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
     */
    protected boolean paused;

    /**
     * Whether the follower thread is currently paused
    