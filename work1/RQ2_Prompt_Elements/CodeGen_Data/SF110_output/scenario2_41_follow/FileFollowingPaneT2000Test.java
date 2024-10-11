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
     */
    @Test
    public void testAutoPositionCaret() {
        assertEquals("Expected auto caret position at the end of text", true, autoPositionCaret());
    }

    
    /**
     * Test method for {@link FileFollowingPane#autoPositionCaret()}.
     * @throws IOException
     * @throws BadLocationException 
     */
    @Test
    public void testAutoPositionCaretFail() throws IOException, BadLocationException {
        JTextComponentDestination destination = new JTextComponentDestination();

        destination.setText(new File(".").getCanonicalPath());
        destination.setAutoPositionCaret(true);
        assertEquals("Expected auto caret position at the end of text", true, autoPositionCaret());
    }

    
    @Test
    public void testClose() throws IOException, IOException, BadLocationException {
        File file = File.createTempFile("TestApp", ".txt");
        
        file.deleteOnExit();
                
        FileOutputStream out;

        try {
            out = new FileOutputStream(file);
            new Document(out).setPageOrientation(java.awt.PageOrientation.PORTRAIT);
            
            FileFollower following = new FileFollower(file, null);
            following.setDestination(new JTextComponentDestination(new OutputDestination()));

            JTextComponentSource tcs = new JTextComponentSource();
            tcs.setText(following.getText());

            SearchableTextPane textpane = new SearchableTextPane(tcs, null);
            textpane.setAutoPositionCaret(true);

            textpane.setFont(new Font("SansSerif", Font.PLAIN, 42));

            int length = textpane.getTextLength();

            String textstring = new String(new char[length]).replaceAll("\\\\n", "\n");
            textpane.appendText(textstring);
            
            FileFollowingPane fp = new FileFollowingPane(null, null, null, null);
            fp.setFont(new Font("SansSerif", Font.PLAIN, 42));
            fp.addText("abcdef");
            fp.addText("1234567");
            fp.setAutoRemoveLineStart(true);
            fp.setCaretPosition(length);
            fp.update(0);

            assertEquals("Auto close position is not as expected", new File(file, "/").length() / 2, lineCountToCaretPosition());

            fp.update(length);

            assertEquals("File position not correctly updated", length, lineCountToCaretPosition());
            assertFalse("Auto close position is now at the end", autoPositionCaret());
            assertTrue("Auto close position is still at the end", sameLine(textpane));
            
            assertFalse("After close position is at the end of text", sameLine(textpane));
            assertFalse("Auto close position is not set up when text is the same", autoPositionCaret());
            assertFalse("Auto close position is set up on the next update", autoPositionCaret());
            
            fp.setText(textpane.getText());
            assertTrue("After closing position set up the position", sameLine(textpane));
            fp.setAutoRemovingTheLine(false);
            assertFalse("After closing position not set up the position on the next update", autoPositionCaret());
            assertEquals("Position set for autoclose position not correctly set up", new File(file, "/").length() / 2, lineCountToCaretPosition());
            assertFalse("Position set for autoclose position set the next update", autoPositionCaret());

        } finally {
            file.delete();
        }
    }        
        
    @Test
    public void testSameLine() throws IOException, BadLocationException {
        PseudoDocument document = new PseudoDocument();
        FileOutputStream out;
        DocPageOrientation orientation = java.awt.PageOrientation.PORTRAIT;
        Font defaultFont = new Font("SansSerif", Font.PLAIN, 42);
        Document other = new Document(orientation, defaultFont, document, document.getEndOffset());
                
        FileFollower following = new FileFollower(new File("."), other);
        following.setDestination(new JTextComponentDestination(new OutputDestination()));

        JTextComponentSource tcs = new JTextComponentSource();
        tcs.setText(following.getText());

        SearchableTextPane textpane = new SearchableTextPane(tcs, null);
        textpane.setAutoPositionCaret(true);

        TextPosition otherLineStart = new TextPosition(0, 0);
        TextPosition otherLineEnd = new TextPosition(0, otherLineStart.getLength() - 1);

        textpane.appendText(".\\1");
        textpane.appendText(".\\2");
        textpane.appendText(".\\3");
        textpane.appendText("abc");
        textpane.appendText("def");
        
        TextPosition firstLineStart = textpane.getPosition(0, otherLineStart);
        TextPosition firstLineEnd = textpane.getPosition(0, otherLineEnd);
        
        textpane.setTextPositions(firstLineStart, firstLineEnd);
        textpane.setPosition(0, otherLineStart);
        
    }
    
    private int lineCountToCaretPosition() {
        Document doc = document();
        try {
            int lineCount = 0;
            int position = 0;
            
            // Find the first "line start" position
            //
            CharSequence start = doc.get(0, position);
            
            while(position > 0 && posBefore(start) > 0) {
                posBefore(start);
                position--;
            }
            
            // Find the last "line end" position
            //
                position = doc.getEndOffset();// - doc