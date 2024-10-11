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
		
	private final String FILENAME = "/home/gregh/src/ghm/follow/gui/FileFollowingPaneTest.java";

	@Test
	void autoPositionCaretIsOffWhenFileFollowedIsUnkown() {
		FileFollowingPane fileFollowingPane = null;

		fileFollowingPane = new FileFollowingPane(FILENAME, 4, 8, true, new Font("Serif", Font.BOLD, 20), 2);
		assertTrue(fileFollowingPane.autoPositionCaret());
		
		fileFollowingPane = new FileFollowingPane("", 4, 8, true, new Font("Serif", Font.BOLD, 20), 2);
		assertFalse(fileFollowingPane.autoPositionCaret());
	}	

	@Test
	void autoPositionCaretWhenFollowedFileIsKnown() {
		File file = new File(FILENAME);
		FileFollower fileFollower = new FileFollower(".", file);

		FileFollowingPane fileFollowingPane = fileFollower.getFollowedFile();
		assertEquals(fileFollowingPane.shouldAutoPositionCaret(), false);

		fileFollowingPane = fileFollower.getFollowedFile();
		assertEquals(fileFollowingPane.shouldAutoPositionCaret(), true);

		fileWritingToFile();

		fileReadingFile();
	}

	/**
	 * Test helper method that waits for the fileFollower to start and pause the processing for the file following operation.
	 */
	private void fileWritingToFile() {
		try {
			fileWritingToFileCb.doClick();
		} catch (NumberFormatException ex) {
			throw new RuntimeException("NumberFormatException with FileFollowingPane.autoPositionCaret();", ex);
		}
	}

	/**
	 * Method which waits for the fileFollower to start and pause the processing for the file following operation.
	 */
	private void fileReadingFile() throws NumberFormatException {
		try {
			fileReadingFileCb.doClick();
		} catch (NumberFormatException ex) {
			throw new NumberFormatException("NumberFormatException with FileFollowingPane.autoPositionCaret();", ex);
		}
	}
}


/**
* Test Class of {@link Document}.
*/
class DocumentPaneTester {

	@Test
	void getDocument() {
		DocumentPane pane = new DocumentPane();
		File f = new File(FILENAME);
		
}
}