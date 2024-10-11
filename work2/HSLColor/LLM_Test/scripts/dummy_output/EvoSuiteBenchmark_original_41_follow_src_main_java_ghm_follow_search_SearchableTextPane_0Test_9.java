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
		
	private String searchTerm;
	
	/**
	 * This test focuses on replacing <code>WordResult</code> with
	 * <code>LINE_INFO</code>, which contains multiple {@link WordResult} objects.
	 */
	@Test
	public void testsearch() throws BadLocationException {
		JTextContentProvider content = new JTextContentProvider();
		
		List<String> words = new ArrayList<>();
		content.addContentProvider(content);
		for(Word w:new Word[]{new Word("toto", "toto"), new Word("taco", "taco")}) {
			words.add(w.word);
		}
		String text = "<span style='word-wrap: break-word;'>";
		text += content.getText(new DefaultHighlightPainter(Color.RED), 
				new DefaultHighlightPainter(Color.BLUE), text);
		text += "</span>";
		text += "<a>";
		text += content.getText(new DefaultHighlightPainter(Color.YELLOW), 
				new DefaultHighlightPainter(Color.DARKGREY), text);
		text += "</a>";

		text = content.getText(new DefaultHighlightPainter(Color.GREEN), 
				new DefaultHighlightPainter(Color.BLUE), text);
		text += "<br>";
		text += content.getText(new DefaultHighlightPainter(Color.YELLOW), 
				new DefaultHighlightPainter(Color.DARKGREY), text);
		
		text = content.getText(new DefaultHighlighter(Colors.RED), 
				new DefaultHighlighter(Colors.BLACK), text);
		text += "<br>";
		text += content.getText(new DefaultHighlighter(Colors.GREEN), 
				new DefaultHighlighter(Colors.MAGENTA), text);
		searchTerm = text;
		assertEquals(text, search(searchTerm));
	}
	
	/**
	 * Tests if result with provided content differs from previous result.
	 */
	@Test
	public void testline_search() {	

		String text = "<span>";
		text += content.getText(new DefaultHighlightPainter(Color.BLUE), text);
		text += "</span>";
		text += content.getText(new DefaultHighlightPainter(Color.GREEN), text);
		String pattern = "<span style='color: red;' style='color: red;'>";
		text = search(pattern + text);
		
		content = new JTextContentProvider();
		text = content.getText(new DefaultHighlightPainter(Color.BLUE), text);
		String text2 = "<span style='color: red;' style='color: blue;'>";
		
		text2 += content.getText(new DefaultHighlightPainter(Color.BLUE), text2);
		assertEquals(text, text2);
		
		text2 = content.getText(new DefaultHighlightPainter(Color.BLUE), text);
		assertTrue(text2);
		assertEquals(text, text2);
	}
	
	/**
	 * Tests if result with additional line has a different color.
	 */
	@Test
	public void testline_match() {	
		JTextContentProvider content = new JTextContentProvider();
		content.addContentProvider(content);
		content.setLineLength(3);
		
		// this will add \n + ":" to the pattern of <span style='color: green;'>
		String text = "<span style='color: green;' style='color: red;'>";
		text += content.getText(new DefaultHighlighter(Colors.GREEN), text);
}
}