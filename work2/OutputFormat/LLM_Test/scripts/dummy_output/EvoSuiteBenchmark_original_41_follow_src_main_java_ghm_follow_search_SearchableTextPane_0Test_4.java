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
		
    private static final Logger LOGGER = Logger.getAnonymousLogger();

    /**
     * Check if the default background color is equal to white
     */
    @Test
    public void testSearch_DefaultBackground() {
        SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("SansSerif", Font.PLAIN, 12));
        defaultTest(searchableTextPane);
    }

    /**
     * Check if default foreground color is in contrast to white.
     */
    @Test
    public void testSearch_DefaultForeground() {
        SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("SansSerif", Font.PLAIN, 12));
        defaultTest(searchableTextPane);
    }

    /**
     * Create a {@link SearchableTextPane} instance with the given font, size.
     * The view should use this size for the foreground color.
     *
     * @param font
     * @param inViewport
     */
    private void defaultTest(SearchableTextPane searchableTextPane) {
        // Setup the default font
        searchableTextPane.setFont(new Font("SansSerif", Font.PLAIN, 12));

        // Set the view
        JTextArea textArea = new JTextArea();
        textArea.setText("searchable text pane");
        searchableTextPane.setView(textArea);

        Document document = textArea.getDocument();

        // Add some junk to the text area
        try {
            document.insertString(0, "foobar", Element.TEXT_INLINE);
            fail("Should have thrown AttributeOutOfRangeException");
        } catch (BadLocationException ex) {
            if (LOGGER.isLoggable(Level.WARNING)) {
                LOGGER.log(Level.WARNING, "AttributeOutOfRangeException occurred", ex);
            }
        }

        DefaultHighlighter highlighter = new DefaultHighlighter(document);
        highlighter.setFolded(true);

        // Add some keyword results to text area
        List<WordResult> wordResults = new ArrayList<WordResult>();
        addHighlight(new LineString(0, new int[] { 0, 0}), 1);
        addHighlight(new LineString(0, new int[] { 1, 0}), 1);
        addHighlight(new LineString(0, new int[] { 2, 0}), 1);
        addHighlight(new LineString(0, new int[] { 3, 0}), 1);
        addHighlight(new LineString(2, new int[] { 4, 0}), 1);
        addHighlight(new LineString(2, new int[] { 5, 0}), 1);
        addHighlight(new LineString(3, new int[] { 6, 0}), 1);
        addHighlight(new LineString(1, new int[] { 7, 0}), 1);
        addHighlight(new LineString(0, new int[] { 8, 0}), 1);
        addHighlight(new LineString(6, new int[] { 9, 1}), 1);
        addHighlight(new LineString(5, new int[] { 10, 1}), 1);
        addHighlight(new LineString(4, new int[] { 11, 1}), 1);
        wordResults.add(new WordResult("key", "value", "key", Color.yellow));
        wordResults.add(new WordResult("word", "found", "word", Color.yellow));
        addHighlight(new LineString(2, new int[] { 1, 1}), 1);
        addHighlight(new LineString(5, new int[] { 2, 1}), 1);

}
}