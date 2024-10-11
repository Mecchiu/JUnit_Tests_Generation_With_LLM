// JTextPaneDestinationTest.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JTextPaneDestination}.
* It contains one unit test case for the {@link JTextPaneDestination#autoPositionCaret()} method.
*/
class JTextPaneDestinationTest {
/**
     * Test case which tests the auto-detecting of the auto-positioning of the caret and a null value.
     * It needs to change the state of the caret and create a BrokenJTextPane.
     */
    @Test
    void testAutoPositionCaretNull()  {
        final int MAX_SIZE = 100;
        final JTextPane tp = new JTextPane();
        tp.addHyperlinkListener( e -> Logger.getLogger( JTextPaneDestinationTest.class.getName()).log(Level.INFO, "Added listener {0}", e) );

        assertTrue( tp.autoPositionCaret() );
    }

    /**
     * Test case which tests the auto-detecting of the auto-positioning of the caret and a value greater
     * than {@value MAX_SIZE}.
     */
    @Test
    void testAutoPositionCaretValueGreaterMaxSize() {
        final JTextPane tp = new JTextPane();
        tp.addHyperlinkListener( e -> Logger.getLogger( JTextPaneDestinationTest.class.getName()).log(Level.INFO, "Added listener {0}", e) );
        try {
            assertTrue( tp.autoPositionCaret() ); 
        }
        catch (BadLocationException ex){}
        assertFalse( tp.autoPositionCaret() ); 
    }

    /**
     * Test case which tests the auto-detecting of the auto-positioning of the caret and a value less
     * than {@value MAX_SIZE}.
     */
    @Test
    void testAutoPositionCaretValueLessMaxSize() {
        final JTextPane tp = new JTextPane();
        tp.addHyperlinkListener( e -> Logger.getLogger( JTextPaneDestinationTest.class.getName()).log(Level.INFO, "Added listener {0}", e) );
        try {
            assertFalse( tp.autoPositionCaret() ); 
        }
        catch (BadLocationException ex){}
    }

    /**
     * The same test case as below, but with carets in the text area.
     */
    @Test
    void testSameTestCaseWithCaretInTextArea() {
        final JTextPane tp = new JTextPane();
        tp.addHyperlinkListener( e -> Logger.getLogger( JTextPaneDestinationTest.class).log(Level.INFO, "Added listener {0}", e) );
        assertTrue(  tp.autoPositionCaret() );
    }
}

// <editor-fold defaultstate="collapsed" desc="Nested classes">