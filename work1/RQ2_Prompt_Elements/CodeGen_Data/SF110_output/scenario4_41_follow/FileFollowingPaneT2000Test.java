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
      * Initializes the test.
      */
    public FileFollowingPaneTest() {

    }

    @Test
    public void testSimpleRead() throws BadLocationException, Throwable {
	String contents = "This is a simple test of FileFOingPane.";
	fileFollower.append(contents.getBytes("UTF-8"), destination, fileFollower);
	assertTrue("Got incorrect number of contents", contents.length() > 0);
	assertTrue("Contents did not contain '" + contents + "'", contents.contains((new StringBuilder()).append(contents).append("\n").toString()));
    }

    @Test
    public void testReadingBack() throws Throwable {
	Document doc = new Document(0, 0, 0);
	try {
	    doc.insertString(0, "This is a simple test of FileFOingPane.", new char[] {' '});
	    fileFollower.appendText(new StringBuilder(), doc, destination, fileFollower);
	    assertTrue("Got incorrect number of contents", contents.length() > 0);
	    assertTrue("Contents did not contain '" + contents + "'", contents.contains((new StringBuilder()).append(contents).append("\n").toString()));
    } catch (Throwable t) {
	fail(t.getMessage());
    }
    }
}


/*************************************************************************
*                                                                        *
*                   ConsoleWriter for TestScript                       *
*                                                                        *
*************************************************************************/

class ConsoleOutputStream extends OutputDestination {
    public ConsoleOutputStream(File destFile, BufferedOutputStream dest) {
	super(destFile, dest);
    }

    public void write(Object o) {
	try {
	    textArea.addLine(o);
	} catch (BadLocationException bl) {
	}
    }
}
