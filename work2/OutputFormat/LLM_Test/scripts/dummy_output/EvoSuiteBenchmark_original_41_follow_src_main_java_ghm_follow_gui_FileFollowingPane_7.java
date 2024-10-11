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
	 * Test method for {@link FileFollowingPane#autoPositionCaret()}.
	 *
	 * We want to be able to test if the caret for the following text file is properly
	 * positioned.
	 */
	@Test
	public void testAutomaticPositionCaretAutoPosition() throws Exception {
		/**
		 * Tests if the autocalcaret is set
		 */
		fileFollower.setAutoCaret(new Boolean(true));
		
		/**
		 * Tests if the autocalcaret value is after the position of the autocalceted textfile
		 */
		try {
			fileFollower.nextPage();
		} catch (IOException e) {
			throw new Exception("Exception checking autocalceted text");
		}

		/**
		 * Tests if the autocalceted textfile is correctly positioned after autocalceted text file
		 */
		assertTrue(FileFollower.isPositionCaretOk(fileFollower, 0));
		
		/**
		 * Stops and waits for processing to complete
		 */
		fileFollower.stopAndWait();
	}

	/**
	 * Tests if the autocalceted textfile is correctly positioned after autocalceted text file
	 */
	@Test
	public void testAutomaticPositionCaretWithJTextPane() throws Exception {
		
		/**
		 * Tests if the autocalceted textfile is correctly positioned after autocalceted text
		 * file (via JTextComponentDestination)
		 */
		try {
			testFile();
		} catch (IOException e) {
			throw new Exception("Exception checking autocalceted text");
		}

		/**
		 * Stops and waits for processing to complete
		 */
		fileFollower.stopAndWait();
	}
	
    /**
     * Tries to print the string to the terminal.
     *
     * @param str
     *            string to be printed
     **/
    private void testFile() throws IOException{

        String str = "Hello world\n";

        JTextComponentDestination jTextComponentDestination = new JTextComponentDestination();

    	File sourceFile = new File(str);
    	File destFile = new File(str);

    	destFile.deleteOnExit();

    	DestinationTextPaneJTextConverter.setDestination(destFile);
    	
    	OutputDestination destination = new OutputDestination();

    	destination.setFile(sourceFile);

    	BufferedOutputStream bufferedStdout = new BufferedOutputStream(
            new FileOutputStream(destFile));

    	OutputDestinationJTextConverter.setDestination(destination);

    	FileFollowingPane follow =
    		new FileFollowingPane(sourceFile, destFile.getSize(), System.currentTimeMillis() * 1000, true, Font.TIMES_ROMAN, tabSize);
    	
        buffer(bufferedStdout);
        System.exit(0);
}
}