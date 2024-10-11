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

	private static final String DUMMY = "\u0000";
	
	/**
    * Main method of the JTextPaneDestinationTester.
    * It contains one test case for the JTextPaneDestination::autoPositionCaret() method.
    */
	@Test
    void testAutopositionCaret() {
        assertNotNull(JTextPaneDestination.autoPositionCaret());
    }
    
    /**
    * Main method of the JTextPaneDestinationTester.
    * It contains one test case for the JTextPaneDestination::autoPositionCaret() method.
    */
	@Test
    public void testAppendString() throws IllegalArgumentException, BadLocationException {
        System.out.println();
        final StringBuilder builder = new StringBuilder();
        final JTextPane pane1 = new JTextPane();
        final JTextPane pane2 = new JTextPane();
        final JTextPane pane3 = new JTextPane();

        final AutoPositionCaretTester tester = new AutoPositionCaretTester();

        final int width = 800;

        pane3.setLineWrap(true);
        assertNotNull(tester.getTextArea());
        assertEquals(height, pane3.getLineHeight(), 0.0);

        pane2.setLineWrap(true);
        pane2.setLineWrapStyleWord(true);
        assertNotNull(tester.getTextArea());
        assertEquals(height, pane2.getLineHeight(), 0.0);
        
        pane1.setLineWrap(false);
        pane1.setLineWrapStyleWord(false);
        assertNotNull(tester.getTextArea());
        assertEquals(14, pane1.getCaretPosition(), 0.0);
        
        pane1.setLineWrap(false);
        assertNotNull(tester.getTextArea());
        assertEquals(14, pane1.getCaretPosition(), 0.0);
        
        pane1.setLineWrap(true);
        assertNotNull(tester.getTextArea());
        assertEquals(14, pane1.getCaretPosition(), 0.0);
        
        pane1.setLineWrapStyleWord(true);
        assertNotNull(tester.getTextArea());
        assertEquals(11, pane1.getCaretPosition(), 0.0);
        
        pane1.setLineWrap(true);
        assertNotNull(tester.getTextArea());
        assertTrue(pane1.getLineWrapStyleWord());
        
        pane3.revalidate();
        assertNotNull(tester.getTextArea());
        assertEquals(height, pane3.getLineHeight(), 0.0);
        
        assertEquals(height, pane2.getLineHeight(), 0.0);
        pane2.setLineWrap(true);
        assertNotNull(tester.getTextArea());
        assertEquals(height, pane2.getLineHeight(), 0.0);
        
        assertEquals(height, pane3.getLineHeight(), 0.0);
        pane3.setLineWrap(true);
        assertNotNull(tester.getTextArea());
        assertEquals(height, pane3.getLineHeight(), 0.0);


        Thread.sleep(1);
        pane3.setLineWrap(false);
        assertNotNull(tester.getTextArea());
        assertEquals(height, pane3.getLineHeight(), 0.0);
        
        pane3.revalidate();
        assertNotNull(tester.getTextArea());
        assertTrue(pane3.getLineWrapStyleWord());
        
        pane3.insert(1, DUMMY);
        assertEquals(height, pane3.getLineHeight(), 0.0);
        pane3.setLineWrap(false);
        assertEquals(height, pane3.getLineHeight(), 0.0);


        Thread.sleep(1);
        
        assertNotEquals(width, pane3.getWidth());
        assertNotEquals(1, pane3.getCaretPosition());
    }
    
    /**
    * @param tester Test case.
    * @throws IllegalArgumentException in case of wrong parameters.
    * @throws BadLocationException in case of bad location exception.
    */
    private class AutoPositionCaretTester extends JTextPaneDestinationTester {
        

        /**
        * @param area TextArea to check.
        * @throws IllegalArgumentException in case of invalid area.
        * @throws BadLocationException in case of bad location exception.
        */
        @Override
        public void checkTextPane(JTextPane area) throws IllegalArgumentException, BadLocationException, IllegalStateException {
            final JTextPane area1 = (JTextPane) area.getEditor().getWrappedComponent();
            final JTextPane area2 = (JTextPane) area.getSelection().getCaret().getTextPane();
            final Document doc = area1.getDocument();
            assertNotNull(doc.get(0));
            assertNotNull(doc.get(1));
            assertNotNull(doc.get(doc.getSpanCount()));
            assertNotNull(doc.get(doc.getParagraphBefore(1)).getText(0));
            assertNotNull(doc.get(doc.getSpanBefore(1)).getText());
            assertNotNull(area1.getSelectedText());
            assertNotNull(area1.getSelectionModel().getSelectedRange());
            assertNotNull(area2.getSelectedText());
            assertNotNull(area2.getSelectionModel().getSelectedRange());
        }
    }
    
}
