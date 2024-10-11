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

	@Test
	void testStartPos() {
		
		String text = "this is a test";
		int searchStartPos = 16;
		
		JTextArea textArea = new JTextArea(200);
		DefaultHighlighter.DEFAULT_ATTRIBUTE_STRATEGY.setAttribute(textArea, "searchStartIndex", searchStartPos);
		
		DefaultHighlighter.DEFAULT_ATTRIBUTE_STRATEGY.apply(textArea);

//		search(text, searchStartPos);
		assertTrue(searchStartPos + text.length() * 2 <= getLength());
		assertEquals(text, textArea.getText());
		assertEquals(text, textArea.getText(0,searchStartPos));

	}

//	@Test
//	public void testHighlightPainterComponent() {
//		
//		
//	}
}

// SearchableTextPane_1Test.java
