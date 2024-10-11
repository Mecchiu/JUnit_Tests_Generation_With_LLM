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

    @Test
    void testSearch_String() {
        defaultHighlighter.setFont(new Font("Tahoma", Font.PLAIN, 12));
        final DefaultHighlighter defaultHighlighter = DefaultHighlighter.defaultHighlighter;
        List<DefaultHighlight> highlights = new ArrayList<>();
        highlights.add(new LineHighlight(Color.MAGENTA, Color.GRAY, 100));
        defaultHighlighter.setTokenMarker(highlights);

        final List<WordResult> words = new ArrayList<>();
        words.add(new WordResult("Hello", -1, Color.GREEN, new DefaultHighlightPainter(Color.BLACK)));
        words.add(new WordResult("World", 3, Color.GREEN, new DefaultHighlightPainter(Color.GRAY.darker())));
        words.add(new WordResult("Welt", -2, Color.RED, wordPainter));

        Document doc = new DefaultMutableDocument();
        Element rootElement = doc.getDefaultRootElement();
        Element searchableTextElement = Utilities.findFirstElement(rootElement, "searchable");

        // test case with null string & empty text
        SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Tahomoto", Font.PLAIN, 12), 10);
        searchableTextPane.setText("Nothing");
        searchableTextPane.document.insertString(0, searchableTextPane.text, searchableTextPane.getDocument().getLength(), null);
        assertTrue(searchableTextPane.document.getLength()!= 0);
        assertTrue(searchableTextPane.getSelectedText().equals("Nothing"));
        searchableTextPane.clear();

        // test case with empty string & selected text
        searchableTextPane.setText(StringUtils.EMPTY);
        assertTrue(searchableTextPane.document.getLength() == 0);
        assertTrue(searchableTextPane.getSelectedText().equals(StringUtils.EMPTY));

        // test case with words only
        DefaultHighlighter.DefaultHighlightPainter defaultHighlighter3 = new DefaultHighlighter.DefaultHighlightPainter(Color.GREEN.darker());
        searchableTextPane.setHighlighters(defaultHighlighter3);
        searchableTextPane.text = "There, I'm on the fly!";
        assertTrue(searchableTextPane.document.getLength() == 14);
        assertTrue(searchableTextPane.getSelectedText().equals("There, I'm on the fly!"));

        // test case 1 to add the whole word
        DefaultHighlighter.DefaultHighlightPainter defaultHighlighter4 = new DefaultHighlighter.DefaultHighlightPainter(Color.MAGENTA);
        defaultHighlighter3.setTokenMarker(defaultHighlighter4);
        DefaultHighlighter.DefaultHighlightPainter defaultHighlighter5 = new DefaultHighlighter.DefaultHighlightPainter(Color.GREEN.darker());
        searchableTextPane.setHighlighters(defaultHighlighter3, defaultHighlighter4, defaultHighlighter5);
        searchableTextPane.text = "No.";
        assertTrue(searchableTextPane.document.getLength() == 14);
        assertTrue(searchableTextPane.getSelectedText().equals("No."));

        // test case 2
        searchableTextPane.text = "I'm on the fly.";
        searchableTextPane.setHighlighters(null, defaultHighlighter2);
        searchableTextPane.setHighlighters(null, defaultHighlighter5);
        searchableTextPane.setHighlighters(null, defaultHighlighter5);