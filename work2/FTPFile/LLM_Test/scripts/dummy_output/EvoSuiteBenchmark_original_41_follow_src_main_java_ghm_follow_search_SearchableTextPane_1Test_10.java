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
		
	private Font defaultFont = new Font(Font.DIALOG, Font.PLAIN, 12);
	private Font defaultFontSize=new Font("Monospaced", Font.PLAIN, 12);
	private int defaultTabSize = 10;

    @Test
    void shouldUseDefaultFontAsItself() throws BadLocationException {
        JTextPane textPane = new SearchableTextPane(defaultFont, defaultFontSize);
        List<Element> words = textPane.getDocument().getDefaultRootElement().getChildren();
        Element result = words.get(0);
        assertEquals("Default font doesn't match a searchable text pane.", defaultFont,result.getAttributes().getFont());
    }

    @Test
    void shouldUseDefaultFontSizeAndTabSize() throws BadLocationException {
        JTextPane textPane = new SearchableTextPane(defaultFont, defaultFontSize, defaultTabSize);
        List<Element> words = textPane.getDocument().getDefaultRootElement().getChildren();
        Element result = words.get(0);
        assertSame("Default font matches a searchable text pane.", defaultFont,result.getAttributes().getFont());
        assertEquals("Default tab size doesn't match a searchable text pane.", defaultTabSize,result.getAttributes().getFontSize());
    }

    @Test
    void shouldSetDefaultFontToDefaultSizeIfNotInitialized() throws BadLocationException {
        JTextPane textPane = new SearchableTextPane(defaultFont, defaultFontSize, defaultTabSize);

        DefaultHighlighter defaultHighlighter = (DefaultHighlighter) textPane.getHighlighter();
        DefaultHighlightPainter defaultHighlighterPainter = defaultHighlighter.getHolder();
        String defaultText = textPane.getText();
        String searchTerm = "searchString";
        defaultHighlighterPainter.setPaintBadLocation(textPane);
        highlight_4_4(defaultText,defaultTabSize,searchTerm,false);
        assertEquals("Font can't be set to default size.", defaultFontSize, defaultHighlighter.getFont());
    }

    @Test
    void shouldSetFontToDefaultFontSizeIfInitialized() throws BadLocationException {
        JTextPane textPane = new SearchableTextPane(defaultFont, defaultFontSize, defaultTabSize);
        DefaultHighlighter defaultHighlighter = (DefaultHighlighter) textPane.getHighlighter();
        String result = textPane.getText();
        String searchTerm = "result";
        defaultHighlighter.setPaintBadLocation(textPane);
        highlight_4_4(result, defaultTabSize,searchTerm,false);
        assertEquals("Font can't be set to default size.", defaultFontSize, defaultHighlighter.getFont());
    }

    private void highlight_4_4(String result, int size, String word, boolean highlight) throws BadLocationException {
        word = word.toLowerCase();
        result = Utilities.fillSimilar(result,size);
        doc_1_1(word + size, result + word, highlight);
        doc_1_2(result + word, result + size, highlight);
    }

    private void doc_1_1(String word,String result, boolean highlight) throws BadLocationException {
}
}