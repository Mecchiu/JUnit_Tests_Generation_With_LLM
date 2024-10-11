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
		
    private static final String SEARCH_TERM = new String("");
	private static final String SEARCH_CONTEXTS_SECTION = new String("contexts");
	private final static DefaultHighlighter.DefaultHighlightPainter HIGHLIGHT_PAINTER = new DefaultHighlightPainter(Color.ORANGE);
	private final static DefaultHighlighter.DefaultHighlightPainter WHITE_PAINTER = new DefaultHighlightPainter(Color.WHITE);
	private final static DefaultHighlighter.DefaultHighlightPainter DEFAULT_PAINTER = new DefaultHighlightPainter();

    private static String fileName = SearchableTextPane_1Test.class.getCanonicalName().replace(".", "/");

    private JTextArea textArea;

    @Test
    void testSearch() {
        String searchTerm = SEARCH_TERM;
        int pos = null;

        String content = "This is search term";

        textArea = new JTextArea(1, 0);
        documentAddContent(textArea, content);
        addHighlight(0, 0);

        textArea = new JTextArea(1, 0);
        documentAddContent(textArea, content);
        addHighlight(0, 0);

        listOfWords();

        listOfWords();

        listOfWords();

        listOfWords();

        listOfWords();

        listOfWords();

        listOfWords();

        listOfWords();

        listOfWords();

        listOfWords();

        listOfWords();

        listOfWords();

        searchTerm = null;
    }

    private void listOfWords() {
        documentAddElement(textArea, HIGHLIGHT_PAINTER);
        documentAddElement(textArea, DEFAULT_PAINTER);


        Element searchTermResult = findElementInText(SEARCH_TERM);
        pos = findMatchPosition(SEARCH_TERM, 0, SEARCH_TERM.length(),
                searchTermResult.getEndOffset(), HIGHLIGHT_PAINTER);
        listOfLines();

        documentRemoveElement(SEARCH_TERM, pos);

    }

    private void listOfLines() {
        Element searchTermResult = findElementInText(SEARCH_TERM);
        pos = findMatchPosition(SEARCH_TERM, 0, SEARCH_TERM.length(),
                searchTermResult.getEndOffset(), DEFAULT_PAINTER);
        Element lines = findElementInText(SEARCH_CONTEXTS_SECTION);
        Document document = textArea.getDocument();
        listOfLines(document, lines, pos);
    }

    private void documentHighlight(Document document, int posHighlight) throws BadLocationException {
        Element element = document.getDefaultRootElement();
        element.setStartElement(element.getElement(0, posHighlight));
        element.setEndElement(element.getElement(0, posHighlight + 1));
    }

    private void documentAddContent(JTextArea textArea, String content) throws BadLocationException {
        DefaultHighlighter.DefaultHighlightPainter backgroundPainter = new DefaultHighlighter.DefaultHighlightPainter(new Color(0, 0, 200));

        Utilities.fillComplementaryRectangle(textArea, textArea.getDocument(), 50, 50);

        int wordCount = 0;

        int currentOffset = 1;
        Element element2 = textArea.getDocument().getDefaultRootElement();
        textArea.setSelectedText("");

        listOfWords();

        int pos = 0;
        Element element;
}
}