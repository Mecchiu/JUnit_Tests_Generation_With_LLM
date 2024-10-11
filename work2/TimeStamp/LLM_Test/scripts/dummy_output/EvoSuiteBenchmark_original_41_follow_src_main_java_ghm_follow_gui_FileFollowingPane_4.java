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
     * Convenience method; simply calls the TestCasesTest.test autoPositionCaret() method;
	 */
	@Test
	public void testAutoPositionCaret() {
        log.log(Level.FINE, String.format("testAutoPositionCaret()"));
		try {
			TestCasesTest.test(this);
		} catch (Throwable e) {
			log.log(Level.SEVERE, e.getMessage(), e);
		}
	}
	
	/**
	 * Convenience method; simply calls the TestCasesTest.test with a document
	 * instance which stores to the output pane a text file to which the
	 * output from this component has been appended.
	 */
	@Test
	public void testGetTextPane() {
		JTextComponentDestination dest = new JTextComponentDestination();
		dest.setComponent(new SearchableTextPane(new File("a.txt")));
		output(dest, "a.txt");
		
		FileFollower f = new FileFollower();
		dest = new JTextComponentDestination();
		dest.setComponent(new SearchableTextPane(f));
		output(dest, "a.txt");
	}
	
	private void output(final OutputDestination dest, final String name) throws BadLocationException, IOException {
		try (FileOutputStream fos = new FileOutputStream("a.txt")) {
            log.log(Level.FINE, String.format("Writing out a.txt for name=%s", name));
            BufferedOutputStream bos = new BufferedOutputStream(fos);
			Document doc = dest.getComponent().getDocument();
            doc.getStyleSheet().addRules(
					"p { font-style: italic; }"
			);
            doc.insertString(0, "Hello World!", doc.getDefaultRootElement().getAttributes().getLength());
            doc.insertString(0, " \n\n\n", doc.getDefaultRootElement().getAttributes().getLength());
			doc.insertString(0, name, doc.getDefaultRootElement().getAttributes().getLength());
			doc.remove(0, name.getBytes().length);
			doc.insertString(0, " \n\n", 0);
			doc.insertString(0, name, name.getBytes().length);
			doc.insertString(0, " \n\n", 0);
			dest.getComponent().setDocument(doc);
		}
	}
	
}