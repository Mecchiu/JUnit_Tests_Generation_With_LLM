// SearchableTextPane_1Test.java
package ghm.follow.search;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.plaf.ComponentUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Utilities;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchableTextPane}.
* It contains one unit test case for the {@link SearchableTextPane#search(String, int)} method.
*/
class SearchableTextPane_1Test {
		
	/**
	 * Test method.
	 *
	 * @throws BadLocationException
	 */
	@Test
	void testSearch() throws BadLocationException {
        SearchableTextPane sp = new SearchableTextPane();

        // test no terms
        Document document = new Document("");
        sp.setText(document);
        sp.addSearchHighlighter(new DefaultHighlighter(), Element.TEXT_ELEMENT);
        assertEquals("nothing found", 0, sp.search(null,"",0).size());

        // test a term starts with nothing
        Document document = new Document("");
        sp.setText(document);
        sp.addSearchHighlighter(new DefaultHighlighter(), Element.TEXT_ELEMENT);
        assertEquals("nothing found", 0, sp.search(null,"",0).size());

        int pos = sp.getCaretPosition() -1;
        sp.removeAllHighlighters();
        sp.setText("");
        sp.addSearchHighlighter(new DefaultHighlighter(), Element.TEXT_ELEMENT);
        assertEquals("nothing found", 0, sp.search(null,"",pos).size());

        sp.setText("a");
        sp.setActiveTextColor(Color.red);
        sp.addSearchHighlighter(new DefaultHighlighter(), Element.TEXT_ELEMENT);
        assertEquals("one result", 1, sp.search(null,"a",0).size());
    }


    /**
     * Test of the getCurrentPosition method, of class
     * SearchableTextPane.
     */
    @Test
    void testIsCurrentPosition() {
        SearchableTextPane instance = new SearchableTextPane();
        int pos = 1;
        
        // instance of SearchableTextPane
        Document document = new Document();
        instance.setDocument(document);
        
        // test isCurrentPosition()
        int cmp = instance.isCurrentPosition();
        
        assertEquals(false, cmp);
        
        sp = new SearchableTextPane();
        pos = sp.getCaretPosition() -1;
        sp.removeAllHighlighters();
        instance.setHighlighters(Collections.singletonList(new DefaultHighlighter(sp)));
        cmp = instance.isCurrentPosition();
        
        assertEquals(true, cmp);
        
        // test getCurrentPosition()
        sp.setText("a");
        pos = sp.getCurrentPosition();
        assertEquals(instance.getCaretPosition() + 1, instance.getCaretPosition());
        assertEquals(1, pos);
    }

    @Test
    void testClear() {
        SearchableTextPane sp = new SearchableTextPane();
        
        // test clearing
        Document document = new Document();
        sp.setDocument(document);
        sp.clearUndoHistory();
        sp.setText("a");
        assertEquals("nothing cleared", 0, sp.getUndoManager().size());
        
        // test clearing with nothing in the document
        document.addDocumentListener(new org.junit.jupiter.api.TestMethodExecutionListener(){
           
            @Override
            public void execute() throws Throwable {
                sp.setText("a");
            }});
        document.remove(10, 9);
        assertEquals("nothing cleared", 0, sp.getUndoManager().size());
        
        // test clearing with nothing in the document
}
}