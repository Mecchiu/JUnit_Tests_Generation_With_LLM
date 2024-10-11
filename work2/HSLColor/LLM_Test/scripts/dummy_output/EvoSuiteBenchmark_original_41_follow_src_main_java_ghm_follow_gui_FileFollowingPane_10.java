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
	 * Tests if we can automatically reposition caret on newline position when text is appended to
	 * the followed file.
	 * 
	 * @throws IOException
	 * @throws BadLocationException
	 */
	@Test
	public void testAutoPositionCaretOnNewLine() throws IOException, BadLocationException {
		File file = new File("newline-separated-text.txt");
		FileFollowingPane fo = new FileFollowingPane(file, 24, 200, false, Font.decode(FileFollowingPaneTest.class.getProperty("fontName")), 20); 
		fo.setAutoPositionCaret(true);
		assertEquals(new Integer(15), fo.autoPositionCaret());
		String readContent;
		OutputDestination dest = new JTextComponentDestination(null, new DocumentSource(), null);
		OutputDestination.writeTo(null, fo, dest, "", true, null, null, null, null, null);
		JScrollPane scrollPane = new JScrollPane(fo);
		scrollPane.getVerticalScrollBar().setUnitIncrement(1); // make sure scrolling is not a bad attempt
		scrollPane.getHorizontalScrollBar().setUnitIncrement(1);
		scrollPane.setBorder(null); // force border to not paint
		scrollPane.getVerticalScrollBar().setBlockIncrement(1);
		assertEquals(new Integer(15), fo.autoPositionCaret());
		String text = null;
		FileFollower f = new FileFollower(null, new File("x"), new DocumentSource(), readContent);
		f.start();
		f.stop();
		text = f.getContent();
		assertNotNull("no content", text);
		String expected = new String("FOLLOWING_TOKEN_1\nFOLLOWING_TOKEN_2\nFOLLOWING_TOKEN_3\nFOLLOWING_TOKEN_4\nFOLLOWING_TOKEN_5");
		assertEquals(expected, text);
		Document doc = null;
		f = new FileFollower(null, new File("x"), new DocumentSource(), readContent);
		assertNotNull("no content", f);
		DocExecutePane dopp = null;
		try {
			dopp = new DocExecutePane(f, null, true, null, null, null, null);
		} catch (IOException e) {
			// do nothing, as this is a test only case
		}
		f.stop();
		assertNotNull("no content", f);
		f = new FileFollower(null, new File("x"), new DocumentSource(), readContent);
}
}