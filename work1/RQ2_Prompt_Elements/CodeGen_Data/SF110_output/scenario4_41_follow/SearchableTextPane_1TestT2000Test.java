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

    //@Test
    void test1Highlight() {

        String text = "The quick brown fox jumps over the lazy dog.";
        DefaultHighlightPainter wordpainter;
        DefaultHighlighter.DefaultHighlightPainter wordpainter2;

        try {
            // Get the UI for the line
            WordResult w = new WordResult(text);
            DefaultHighlighter defaultHighlighter = w.getDefaultHighlighter();
            wordpainter = defaultHighlighter.getWordPaint();
            wordpainter2 = defaultHighlighter.getWordHighlightPainter();

            Element element = w.getElement();

            // Get the text inside the text area.
            String text2 = element.getText();

            // Check the text inside the line.
            log.finest("The word found (" + text2 + ") in the text area. The new line should contain the word");
            assertEquals("The word found (" + text2 + ") in the text area. ", "The quick brown fox jumps over the lazy dog.", text2);

            // Now check the highlight of the text inside the text.
            List<LineResult> lineText = new ArrayList<>();

            text2 = Utilities.fillWord(text2, new char[]{ (char) 0x0009, (char) 0x000c, (char) 0x001b }, new int[]{ 0, 0, 0 });
            int endPos = 10;

            // The endPos is the start position of the word in the text area.
            while (endPos < text2.length()) {
                endPos = Utilities.searchNext(text2, endPos, wordpainter, wordpainter2);
            }

            // the endPos is at the end of the text from text2
            while (endPos < text2.length()) {
                endPos = Utilities.searchNext(text2, endPos, wordpainter, wordpainter2);
            }

            // the endPos is at the end of the text in the text area.
            while (endPos < text2.length()) {
                endPos = Utilities.searchNext(text2, endPos, wordpainter2, wordpainter);
            }

            List<LineResult> textResults = new ArrayList<>();

            textResults.add(new LineResult("The word found (" + text2 + ") at index 0", null, null, element));
			textResults.add(new LineResult("The word found (" + text2 + ") at index 1", null, null, element));
			textResults.add(new LineResult("The word found (" + text2 + ") at index 2", null, null, element));
    
    		text2 = Utilities.fillWord(text2, new char[]{ (char) 0x000b, (char) 0x000c, (char) 0x001b }, new int[]{ 0, 0, 0 });
			endPos = 10;
	
    		textResults.add(new LineResult("The word found (" + text2 + ") at index 1", null, null, element));
			textResults.add(new LineResult("The word found (" + text2 + ") at index 2", null, null, element));
			text2 = utilities.fillTextIfNeeded(text2, new char[]{ (char) 0x000b, (char) 0x000c, (char) 0x001b }, new Rectangle(0, 5, 2, 10, 2));
	
    		// the endPos is at the end of the text from text2
            while (endPos < text2.length()) {
                endPos = Utilities.searchNext(text2, endPos, wordpainter, wordpainter2);
            }
    		endPos = utilities.searchNext(text2, text2.length(), wordpainter, wordpainter2);
	
    