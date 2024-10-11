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
		
	@Test
	public void test1() throws BadLocationException {
        
		File file = new File("C:\\JGHT\\Follower\\Test.txt");
		OutputDestination output = new OutputDestination();
		JTextComponentDestination text = new JTextComponentDestination(output, file);
        String textString = text.getOutput();
		BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File(file.getPath())));
        System.out.println(textString);
		
		String expectedText = "#Followed# File Title # Followed # File Description ";
        Document document = new Document(textString);
		document.addDocumentListener(new TextDocumentListener());

        text.setSelection(0, text.getLength()); // set the caret to the selection
        fileFollower.followFile(text, document, text.getSelectedText());

		String actualText = new String(document.getText(0, document.getLength()));
		
	/*	for (int i = 0; i < expectedText.length(); i++) {
			
			assertEquals(expectedText.charAt((i - 1) - 10), actualText.charAt((i - 1) - 10));
			
		}
	*/

		assertTrue("Test failed!", fileFollower.isWaitingForResult());
		//assertEquals("Test passed!", actualText, expectedText);
		
		//fileFollower
		fileFollower = new FileFollower();
		try {
				fileFollower = new FileFollower(file);
				assertTrue("Test failed!", fileFollower.isWaitingForResult());
		} catch (IOException ex) {
				log.log(Level.SEVERE, "io exception", ex);
				assertTrue("Expected bad file exception!", ex instanceof BadFileException);
		}
		try {
				fileFollower = new FileFollower(file, "Test");
				assertTrue("Test failed!", fileFollower.isWaitingForResult());
		} catch (IOException ex) {
				log.log(Level.SEVERE, "io exception", ex);
				assertTrue("Expected bad file exception!", ex instanceof BadFileException);
		}
		try {
				fileFollower = new FileFollower(file, "Test", "desc");
				assertTrue("Test failed!", fileFollower.isWaitingForResult());
		} catch (IOException ex) {
				log.log(Level.SEVERE, "io exception", ex);
				assertTrue("Expected bad file exception!", ex instanceof BadFileException);
		}
		fileFollower = new FileFollower(file, "Test");
		try {
				fileFollower.addFollowers(file);
				assertTrue("Test failed!", fileFollower.isWaitingForResult());
		} catch (IOException ex) {
				log.log(Level.SEVERE, "io exception", ex);
				assertTrue("Expected bad file exception!", ex instanceof BadFileException);
		}
}
}