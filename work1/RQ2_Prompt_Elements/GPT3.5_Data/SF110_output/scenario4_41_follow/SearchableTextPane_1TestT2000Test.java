// SearchableTextPane.java
package ghm.follow.search;

import java.awt.Color;
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

    private Logger log = Logger.getLogger(SearchableTextPane.class.getName());

    private int lastSearchPos = -1;

    private String lastSearchTerm;

    private final DefaultHighlightPainter wordPainter = new DefaultHighlightPainter(Color.YELLOW);

    public SearchableTextPane(Font font, int tabSize) {
        super();
        setFont(font);
        setTabSize(tabSize);
        setLineWrap(false);
        setWrapStyleWord(false);
    }

    /**
     * Override this to keep the text from wrapping and to make the viewable area as wide as the
     * tabbed pane
     */
    @Override
    public boolean getScrollableTracksViewportWidth() {
        Component parent = getParent();
        ComponentUI ui = getUI();

        return parent != null ? (ui.getPreferredSize(this).width <= parent.getSize().width) : true;
    }

    /**
     * Highlight <code>term</code> wherever it is found in the view. Also highlights the entire
     * line on which the term is found.
     *
     * @param term
     * @param flags
     * @return
     */
    public List<LineResult> highlight(String term, int flags) {
        List<LineResult> results = new ArrayList<>();
        if (term == null || term.isEmpty()) {
            return results;
        }

        Document doc = getDocument();
        removeHighlights();

        try {
            String text = doc.getText(0, doc.getLength());
            int pos = 0;
            while ((pos = text.indexOf(term, pos)) >= 0) {
                int end = pos + term.length();
                int start = Utilities.getRowStart(this, pos);
                int lineEnd = Utilities.getRowEnd(this, pos);
                addHighlight(start, lineEnd - start);
                results.add(new LineResult(start, lineEnd, term));
                pos = end;
            }
            lastSearchPos = pos;
            lastSearchTerm = term;
        } catch (BadLocationException ex) {
            log.log(Level.SEVERE, null, ex);
        }

        return results;
    }

    /**
     * Highlight a piece of text in the document
     *
     * @param start
     * @param length
     */
    private void addHighlight(int start, int length) throws BadLocationException {
        getHighlighter().addHighlight(start, start + length, wordPainter);
    }

    /**
     * Removes highlights from text area
     */
    public void removeHighlights() {
        getHighlighter().removeAllHighlights();
    }

    /**
     * Searches for a term. If the term provided matches the last searched term, the last found
     * position is used as a starting point.<br>
     * <br>
     * Developer note: this method isn't currently used.
     *
     * @param term
     *            The string for which to search.
     * @return The position where the term was found.<br>
     *         If the term is null, empty or not found, -1 is returned.
     */
    public int search(String term) {
        return search(term, lastSearchPos);
    }

    /**
     * Searches for a term at the given starting position.<br>
     * <br>
     * Developer note: this method isn't currently used.
     *
     * @param term
     *            The string for which to search.
     * @param startPos
     *            Where to start.
     * @return The position where the term was found.<br>
     *         If the term is null, empty or not found, -1 is returned.
     */
    public int search(String term, int startPos) {
        if (term == null || term.isEmpty()) {
            return -1;
        }

        Document doc = getDocument();
        int textLength = doc.getLength();
        if (startPos < 0) {
            startPos = 0;
        } else if (startPos >= textLength) {
            startPos = textLength - 1;
        }

        try {
            String text = doc.getText(startPos, textLength - startPos);
            int pos = text.indexOf(term);
            if (pos >= 0) {
                lastSearchPos = startPos + pos;
                lastSearchTerm = term;
            }
            return lastSearchPos;
        } catch (BadLocationException ex) {
            log.log(Level.SEVERE, null, ex);
        }

        return -1;
    }

    /**
     * Converts word results from search into line results
     *
     * @param words
     * @return
     */
    private List<LineResult> convertWords2Lines(List<WordResult> words) throws BadLocationException {
        List<LineResult> results = new ArrayList<>();
        for (WordResult word : words) {
            int start = Utilities.getRowStart(this, word.getStart());
            int end = Utilities.getRowEnd(this, word.getEnd());
            LineResult lineResult = new LineResult(start, end, word.getWord());
            updateWordResult(word, lineResult);
            results.add(lineResult);
        }
        return results;
    }

    /**
     * Adds word result to line result and updates line information
     *
     * @param wordResult
     * @param lineResult
     */
    private void updateWordResult(WordResult wordResult, LineResult lineResult) throws BadLocationException {
        Document doc = getDocument();
        String text = doc.getText(lineResult.getStartOffset(), lineResult.getEndOffset() - lineResult.getStartOffset());
        int pos = 0;
        while ((pos = text.indexOf(wordResult.getWord(), pos)) >= 0) {
            int end = pos + wordResult.getWord().length();
            lineResult.addWordResult(new WordResult(lineResult.getStartOffset() + pos, lineResult.getStartOffset() + end, wordResult.getWord()));
            pos = end;
        }
    }
}

// SearchableTextPane_1Test.java
package ghm.follow.search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchableTextPane}.
* It contains ten unit test cases for the {@link SearchableTextPane#search(String, int)} method.
*/
class SearchableTextPane_1Test {

    @Test
    void testSearch_NullTerm() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        assertEquals(-1, pane.search(null));
    }

    @Test
    void testSearch_EmptyTerm() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        assertEquals(-1, pane.search(""));
    }

    @Test
    void testSearch_TermNotFound() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        pane.setText("This is a test");
        assertEquals(-1, pane.search("not found"));
    }

    @Test
    void testSearch_TermFound() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        pane.setText("This is a test");
        assertEquals(2, pane.search("is"));
    }

    @Test
    void testSearch_StartPosBeforeText() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        pane.setText("This is a test");
        assertEquals(0, pane.search("This", -1));
    }

    @Test
    void testSearch_StartPosAfterText() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        pane.setText("This is a test");
        assertEquals(12, pane.search("test", 20));
    }

    @Test
    void testSearch_StartPosAtEndOfText() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        pane.setText("This is a test");
        assertEquals(12, pane.search("test", 12));
    }

    @Test
    void testSearch_LastSearchTermMatches() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        pane.setText("This is a test");
        pane.search("is");
        assertEquals(5, pane.search("is"));
    }

    @Test
    void testSearch_LastSearchTermDoesNotMatch() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        pane.setText("This is a test");
        pane.search("is");
        assertEquals(-1, pane.search("not found"));
    }
}