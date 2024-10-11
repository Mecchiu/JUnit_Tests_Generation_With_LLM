// SearchableTextPane_0Test.java
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
* It contains one unit test case for the {@link SearchableTextPane#search(String)} method.
*/
class SearchableTextPane_0Test {
// SearchableTextPane.java
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

public class SearchableTextPane extends JTextArea {

    /**
     * Searches for a term. If the term provided matches the last searched term, the last found
     * position is used as a starting point.<br>
     * <br>
     * Developer note: this method isn't currently used.
     *
     * @param term The string for which to search.
     * @return The position where the term was found.<br>
     *         If the term is null, empty or not found, -1 is returned.
     */
    public int search(String term) {
        if (term!= null && term.length() > 0) {
            if (term.equals(lastSearchTerm)) {
                // assume to start at the beginning
                int pos = 0;
                // if there is a previous search position, start there plus the
                // length
                // of the last term so that last term again isn't found again
                if (lastSearchPos!= -1) {
                    pos = lastSearchPos + lastSearchTerm.length();
                }
                lastSearchPos = search(lastSearchTerm, pos);
            } else {
                lastSearchPos = search(term, 0);
            }
        }
        // remember the term if it was found
        if (lastSearchPos == -1) {
            lastSearchTerm = null;
        } else {
            lastSearchTerm = term;
        }
        return lastSearchPos;
    }
}

// SearchableTextPane_0Test.java
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
* It contains one unit test case for the {@link SearchableTextPane#search(String)} method.
*/
class SearchableTextPane_0Test {
		// This test checks that the {@code search()} method of the
		// {@code AbstractSearchableTextPane} interface returns a value that
		// is not {@code null} when the string to search is not null. For
		// this test to pass, the null value must be equal to the value
		// returned by {@code search(String)}.


	@junit.jupiter.ExpectedWhen
	@test
    void searchForTermWhenNotNull() {
          
		String searchedTerm = null;
		int pos = search("not existing", -1);
		assertNull(searchedTerm);
		assertTrue(pos!= -1);
  }	

	@junit.jupiter.ExpectedWhen
	@test
    void searchForTermStartsWithFoundTerm() {
		String foundTerm = "something";

		int pos = search("found it", foundTerm.length());

		assertTrue(pos!= -1);
		assertTrue(pos + foundTerm.length() < textArea().length());
	}
	
	@junit.jupiter.ExpectedWhen
	@test
	void searchForStartOfOtherTerm() {
		Object textArea = textArea();

		String otherTerm = "term";

		int pos = search(otherTerm, -1);
		assertTrue(pos + otherTerm.length() < textArea.length());

		DefaultHighlighter highlight = (DefaultHighlighter)textArea.getUI().getComponent("DefaultHighlighter").getHighlighter();
		highlight.setLineWrap(true);

		pos = search(otherTerm, pos);
		assertTrue(pos + otherTerm.length() < textArea.length());

		highlight.setLineWrap(false);

		pos = search(otherTerm, pos);
		assertTrue(pos + otherTerm.length() < textArea.length());
	}
	
	@junit.jupiter.ExpectedWhen
	@test
	void searchForTextWhenNull() {
		assertEquals(0, textArea().getDocument().getLength());
		assertEquals(0, textArea().getLineStartOffset(0));

		String text = null;

		int pos = search("text", -1, text);

		assertEquals(0, textArea().getDocument().getLength());
		assertEquals(0, textArea().getLineStartOffset(0));

		pos = search("text", text.length(), text);

		assertEquals(text, textArea().getText(0, text.length()));

		highlightString(text, pos);
	}

	@junit.jupiter.ExpectedWhen
	@test
	void searchForStartOfTextWhenNull() {
		assertEquals(0, textArea().getDocument().getLength());
		assertEquals(0, textArea().getLineStartOffset(0));

		String text = null;

		int pos = search("start", text);

		assertEquals(0, textArea().getDocument().getLength());
		assertEquals(0, textArea().getLineStartOffset(0));
        assertNotEquals(pos, 0);

		highlightString(text, pos);
	}

    @Test
    void testSearchingText() {
        String t = "";
        String fw = "";
        //String sw = "";
        String text = "";

        int pos = search("", -1, text);
        int lineLength = textArea().getLineLength(0);
        assertEquals(0, lineLength);
        assertEquals(-1, pos);

        DefaultHighlighter.DefaultHighlightPainter highlighter = textArea().getHighlighter();

        pos = search(fw + fw + fw + fw + fw + "", -1, text);
        lineLength = textArea().getLineLength(0);
        assertEquals("", textArea().getLine(0));
        assertEquals(1, pos);

        text = "foobarfoobar";
        pos = search(text + "foobar", -1, text);
        lineLength = textArea().getLineLength(0);
        assertEquals("foobarfoobar", textArea().getLine(0));
        assertEquals(text.length() + fw.length(), textArea().getLineStartOffset(0)) ;
        assertEquals(pos, textArea().getLineStartOffset(0)) ;
        assertEquals(lineLength, textArea().getLineLength(0));
        highlighter.setColors(Color.BLUE, Color.BLUE);
    }
    
    private int search(String text, int pos) {
        int result = pos;
        DefaultHighlighter highlighter = textArea().getHighlighter();
        Element el = textArea().getDocument().getDefaultRootElement();
        String currentLine = textArea().getText(0, text.length());
        List<Highlight> highlight = new ArrayList<Highlight>();
        try {
            highlighter.drawHighlight(el, currentLine, 0, currentLine.length());
        } catch (BadLocationException ex) {
            Logger.getLogger(SearchableTextPane_0Test.class.getName()).log(Level.SEVERE, "Cannot determine highlighted text");
        }
        Document doc