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
		//============================================================================================
		// test cases
		//============================================================================================

    @Test
    public void test_0_Constructor() {
        final SearchableTextPane searchableTextPane = new SearchableTextPane();
        assertFalse("setParent(null)", searchableTextPane.getParent() == null);
    }

    @Test
    public void test_0_FirstSentence() {
        final SearchableTextPane searchableTextPane = new SearchableTextPane();
        assertTrue("setFirstSentenceDocument(" + searchableTextPane + ")", searchableTextPane.getFirstSentenceDocument() instanceof DefaultDocument);
        assertTrue("setFirstSentenceText(" + searchableTextPane + ")", searchableTextPane.getFirstSentenceText() instanceof DefaultText);
        assertSame("firstSentenceDocument", searchableTextPane.getFirstSentenceDocument() instanceof DefaultDocument, searchableTextPane.getFirstSentenceDocument());
        assertSame("firstSentenceText", searchableTextPane.getFirstSentenceText() instanceof DefaultText, searchableTextPane.getFirstSentenceText());
        searchableTextPane.setFirstSentenceDocument(null);
    }

    @Test
    public void test_0_SetParent() {
        final SearchableTextPane searchableTextPane = new SearchableTextPane();
        assertFalse("setParent(null)", searchableTextPane.getParent() == null);
        searchableTextPane.setParent(null);
    }

    @Test
    public void test_0_SetFirstSentenceText() {
        final SearchableTextPane searchableTextPane = new SearchableTextPane();
        //setFirstSentenceText("First sentence"); // to set "First sentence"
        searchableTextPane.setFirstSentenceText("First sentence");
        assertTrue("setFirstSentenceText(" + searchableTextPane + ")", searchableTextPane.getFirstSentenceText() instanceof DefaultText);
        assertTrue("setFirstSentenceDocument(" + searchableTextPane + ")", searchableTextPane.getFirstSentenceDocument() instanceof DefaultDocument);
        searchableTextPane.setFirstSentenceText(""); // to clear "First (sentence)
        assertTrue("setFirstSentenceText(" + searchableTextPane + ")", searchableTextPane.getFirstSentenceText() instanceof DefaultText);
        searchableTextPane.setFirstSentenceText(""); // to clear "First (sentence)"
        assertTrue("setFirstSentenceText(" + searchableTextPane + ")", searchableTextPane.getFirstSentenceText() instanceof DefaultText);
        searchableTextPane.setFirstSentenceText(""); // to clear "First sentence"
        assertTrue("setFirstSentenceText(" + searchableTextPane + ")", searchableTextPane.getFirstSentenceText() instanceof DefaultText);
        final Document document = new DefaultDocument();
        searchableTextPane.setFirstSentenceDocument("First sentence");
        assertFalse("setFirstSentenceText(" + searchableTextPane + ")", searchableTextPane.getFirstSentenceText() instanceof DefaultText);
        searchableTextPane.setFirstSentenceDocument(document);
    }

    @Test
    public void test_0_SetText() {
        final SearchableTextPane searchableTextPane = new SearchableTextPane();
        searchableTextPane.setText("First sentence"); // to set "First sentence"
        searchableTextPane.setText("Second sentence"); // to set "Second sentence"
        assertTrue("setText(" + searchableTextPane + ")", searchableTextPane.getText() instanceof DefaultText);
        assertTrue("setText(" + searchableTextPane + ")", searchableTextPane.getText() instanceof DefaultText);
    }

    @Test
    public void test_0_SetDocument() {
        final SearchableTextPane searchableTextPane = new SearchableTextPane();
        searchableTextPane.setDocument(null);
        assertTrue("setDocument(" + searchableTextPane + ")", searchableTextPane.getDocument() == null);
        searchableTextPane.setDocument(new DefaultDocument());
        assertTrue("setDocument(" + searchableTextPane + ")", searchableTextPane.getDocument()!= null);
        // if there's no text to append to the document, the last position is at the end of the document
        searchableTextPane.setText("");
    }

    @Test
    public void test_0_HighlightTerm() {
        final SearchableTextPane searchableTextPane = new SearchableTextPane();
        assertTrue("setHighlightTerm(" + searchableTextPane + ")", searchableTextPane.getHighlightTerm() instanceof DefaultHighlighter.DefaultHighlightPainter);
        searchableTextPane.setHighlightTerm(null);
    }
	
	@Test
	public void test_1_IsSearchableWithTerm() {
		final SearchableTextPane searchableTextPane = new SearchableTextPane();
		final List<Object> results = new ArrayList<>();
		final DefaultHighlighter highlighter = (DefaultHighlighter)searchableTextPane.getHighlighter();
		searchableTextPane.addTag(null, 0, 0, new DefaultHighlighter.DefaultHighlightPainter(new DefaultHighlightPainter.DefaultHighlightInfoBgPainter() {
			@Override
			public Color getDefaultColorOfHighlightInfo() {
				return null;
			}

			@Override
			public Color getDefaultColorOfDefaultInfoBg() {
				return null;