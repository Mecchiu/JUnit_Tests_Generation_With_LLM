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
     * @throws IOException
     * @throws TagException
     * @throws BadLocationException
     */
	@Test
	public void testAutoPosCaret() throws IOException, TagException, BadLocationException {
        FileFollowingPane follower = new FileFollowingPane(null, 128, 15);

        Document doc = follower.getTextPane().getDocument();
        assertNotNull(doc);
        doc.replace(0, 1, "Follower: ");
        doc.insert(2, new String(new char[]{'1'}));
        doc.insert(2, "test");
        doc.insert(4, "Follower: ");
        doc.replace(4, 1, "test");
        doc.insert(5, " test");
        doc.insert(10, "Follower: ");
        doc.replace(10, 1, "test");
        doc.insert(11, " test");
        doc.insert(14, "Follower: ");
        doc.replace(14, 1, "test");
        doc.insert(16, new String(new char[]{'1'}));
        doc.insert(22, "test1");
        doc.insert(22, " test1");
        JTextComponentDestination destination = follower.getFileFollower().getOutputDestination();
        doc.append(destination.getFileName());
        doc.insert(24, "test2");
        doc.insert(24, " test2");
        doc.insert(28, "Follower: ");
        doc.replace(28, 1, "test2");
        doc.insert(30, " test.txt");
        doc.insert(30, new String(new char[]{'1'}));
        doc.insert(30, "Follower: ");
        doc.replace(30, 1, "test2");
        doc.insert(33, " test.txt");
        doc.insert(34, " Follower: ");
        doc.replace(34, 1, "test2");
        doc.insert(34, " test.txt");
        doc.replace(34, 33, "test.txt");
	
        doc.insert(43, "Penguin : ");
        doc.insert(43, "Penguin : ");
        doc.insert(43, "Penguin : ");
        doc.replace(43, 1, "Penguin : ");
        doc.insert(43, " Penguin : ");
        doc.replace(43, 3, "Penguin : ");
        doc.insert(43, " Penguin : ");
    }

    @Test
    public void testClear() throws IOException, BadLocationException {
        FileFollowingPane follower = new FileFollowingPane(null, 128, 15);
        JTextComponentDestination destination = follower.getFileFollower().getOutputDestination();
        follower.getFileFollower().start();
    }

}