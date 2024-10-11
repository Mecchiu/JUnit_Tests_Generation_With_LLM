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
* It contains one unit test case for the {@link FileFollowingPane#autoPositionCaret()} method.
*/
class FileFollowingPaneTest {
		
	/**
	 * Test which tests behavior when the File Follower is given nothing.
	 *
	 * @throws BadLocationException
	 *
	 * @throws IOException
	 */
	@Test
	public void testNothing() throws IOException, BadLocationException {
		AutoPositionCaretTest.doNothing(this, false);
	}

	/**
	 * Test which tests behavior where the File Follower is given text file to which followed file's
	 * contents are being printed by appending to the end of the text file.
	 *
	 * @throws BadLocationException
	 * @throws IOException
	 */
	@Test
	public void testFileAppended() throws IOException, BadLocationException {
		AutoPositionCaretTest.doNothing(this, true);
	}

	private void doNothing(FileFollowingPane panel, boolean auto) throws IOException {
		Document doc = panel.getDocument();
		doc.getLength();
		panel.begin(doc);
		assertTrue(auto);
		panel.end(doc);
	}

	/**
	 * Test which tests behavior where the File Follower is given text file to which followed file's
	 * contents are being printed by appending to the end of the text file.
	 *
	 * @throws IOException
	 */
	@Test
	public void testFileAppended2() throws IOException {
		AutoPositionCaretTest.doYouWantToGoAgain(this, true);
	}

	// FileFollowingPaneTest.java ends here


	/**
	* Test which tests behavior where the File Follower is given text file to which followed file's
	* contents are being printed by appending to the end of the text file.
	*
	* @throws IOException
	*/
	@Test
	public void testNothing2() throws IOException {
		AutoPositionCaretTest.doNothing(this);
	}

	// FileFollowingPaneTest.java ends here
}