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
		
    private static final Logger log = Logger.getLogger(FileFollowingPaneTest.class.getName());

    /**
     * Test implementation of {@link SearchableTextPane#repositionText()}
     * @throws IOException 
     */
    @Test
    void testRepositionText() throws IOException {
        log.log(Level.INFO, "Testing " + FileFollowingPane.class.getName());
        final javax.swing.JScrollPane scrollPane = new JScrollPane(new SearchableTextPane());

        scrollPane.getViewport().getViewport().repaint();

        final String data = "Hello, world";

        File f = new File("f");
        FileOutputStream fo = new FileOutputStream(f);
        fo.write(data.getBytes());

        fo.close();

        bufferedOutputStream b = new BufferedOutputStream(new FileOutputStream(f));
        final String content = new String(b.toByteArray());

        assertTrue(content.equalsIgnoreCase(data));
    }

    /**
     * Test implementation of {@link SearchableTextPane#followingFile()}
     * @throws IOException 
     */
    @Test
    void testFollowingFile() throws IOException {
        FileFollowingPane fp = new FileFollowingPane(new File("f"), 512, null, false, null, null);
        Document doc = fp.getTextPane().getDocument();
        doc.setPlainText(new String(doc.getText(documentToPos(0, doc.getLength())).getBytes()));

        assertTrue(fp.getFileFollower().followingFile());

        try {
            fp.clear();
            assertFalse(fp.getFileFollower().followingFile());
        } catch (IOException e) {
            assertTrue(false);
        }

        fp.followingFile();

        assertTrue(fp.getFileFollower().followingFile());
    }

    /**
     * Test implementation of {@link SearchableTextPane#getFollowedFile()}
     * @throws IOException 
     */
    @Test
    void testGetFollowedFile() throws IOException {
        FileFollowingPane fp = new FileFollowingPane(new File("f"), 512, null, false, null, null);
        try {
            fp.clear();
            fp.getFileFollower(); // should throw exception
        } catch (IOException e) {
            assertTrue(false);
        }

        assertNull(fp.getFileFollower());

        fp.followingFile();

        File rfile = fp.getFileFollower().getFollowedFile();

        assertNotNull(rfile);
        assertEquals(new File(rfile).getName(), "f.txt");
        assertTrue(fp.getFileFollower().getFollowedFile().getAbsolutePath().equals(new File(rfile.getAbsolutePath()).getAbsolutePath(true)));

        //
}
}