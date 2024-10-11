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
    void testSearch_0() {
        String testString = ""
                + "a string from the text area"
                + "that will be highlighted"
                + "with the word that is found"
                + "from the cursor position on"
                + "the end";

        Document document;
        Element element;
        element = new Element("element");
        element.setContent(testString);
        DefaultHighlighter.DefaultHighlightPainter myHighlighter = new DefaultHighlightPainter();
        myHighlighter.setOffset(0);
        myHighlighter.setColorScheme("org.apache.commons.lang3.color");

//        int lastPosition = 0;

        JTextArea textArea = new JTextArea(document);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.addHighlighter(myHighlighter);
		List<WordResult> ourResultList = new ArrayList<>();
		DefaultHighlighter.HighlightPainter ourHighlighter;
		for (int i = 0; i < testString.length(); i++) {
			ourHighlighter = new DefaultHighlightPainter();
			ourHighlighter.setOffset(i);
			ourHighlighter.setColorScheme("org.apache.commons.lang3.color");
			int positionToAppendToLastPosition = new DefaultHighlighter.Position;
			positionToAppendToLastPosition = textArea.getUI().hitTest(textArea.getLineNumber(lastPosition), new Point(0, textArea.getHeight()), ourHighlighter, new Point(0, textArea.getHeight()), ourHighlighter);
			int positionToUpdate = new LineAndOffset(0, i, 0, textArea.getColumn());
   			ourResultList.add(new WordResult(positionToAppendToLastPosition, new Integer(positionToAppendToLastPosition), new Integer(positionToUpdate)));
			lastPosition = new DefaultHighlighter.Position(i - 1, 1);
			
			Element lineElement = new Element("line-element");
			lineElement.addContent(textArea, lastPosition);
   			lineElement.setAttribute("column-content", String.valueOf(i+1));

			Element wordElement = new Element("word-element");
			wordElement.addContent(new DefaultHighlighter.Position(positionToUpdate, 0), new DefaultHighlighter.Position(positionToUpdate, 1));
			wordElement.setAttribute("column-content", String.valueOf(i + 1));
			lineElement.addContent(wordElement, lastPosition);
   			element.addContent(lineElement, lastPosition);
		}

		assertNull(textArea.getText().toString());
		assertNotNull(ourResultList);
		String actualString = textArea.getText().toString();
		String expectedString = testString;
		if (ourResultList.size() > 1) {
//				expectedString = expectedString.substring(0, expectedString.length()-2);
		}
		expectedString = expectedString.substring(0, expectedString.length() - 1);
		assertEquals(expectedString, actualString);
	}


}//SearchableTextPane_0Test