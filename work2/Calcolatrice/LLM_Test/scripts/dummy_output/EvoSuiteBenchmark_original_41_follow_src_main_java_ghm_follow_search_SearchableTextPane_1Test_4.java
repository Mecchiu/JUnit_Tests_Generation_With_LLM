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
		 static List<DefaultHighlightPainter> wordPainters = new ArrayList<DefaultHighlightPainter>(3);
		 static {	
	 // set up the test component
		 DefaultHighlightPainter wordPainter = new DefaultHighlightPainter(Color.RED);
				// wordPainters.add(wordPainter);
	 DefaultHighlightPainter wordSearchPaint = new DefaultHighlightPainter(Color.YELLOW);
				 // wordSearchPaint.setUnderline(true);
				// wordPainters.add(wordSearchPaint);
	 WordResult result = new WordResult(".foo.bar.quotes");
				wordPainters.add(wordPainter);
	 wordPainters.add(wordSearchPaint);
	 wordSearchPaint.setOverline(true);
				 wordPainters.add(wordSearchPaint);
				 wordPainters.add(wordPainter); // we should add only the two
//				 wordPainters.add(wordSearchPaint);  // we should add one for the "word" tag, as well 
	 wordSearchPaint.setStyle(DefaultHighlightPainter.STYLE_SELECTION);
		 }

	  
	  @Test
	  public void wordSearchShouldReturnAListOfDefaultHighlights() throws BadLocationException  {
		 try {
			// set up the component
			JTextArea component = new JTextArea(10);
			
			// get list of results
			ArrayList<WordResult> wordResults = SearchableTextPane.search(".foo.bar.quotes", 10);
			assertEquals(-1, wordResults.size());
			
			// set up component content
			DefaultHighlightPainter wordPainter2 = new DefaultHighlightPainter(Color.BLUE);
			wordPainter2.setStyle(DefaultHighlightPainter.STYLE_SELECTION);
			StringBuilder builder = new StringBuilder("aabb");
			for (WordResult wordResult : wordResults) {
				try {			
					
					Element elem = Utilities.markupToElement(builder.toString(), component, false, false);
					builder.delete(0, 3);
						// we have to set a highlighter for it, and to set the location of the
						// tag
					DefaultHighlightPainter wordPainter3 = new DefaultHighlightPainter (Color.BLUE, Color.RED);
					wordPainter2.setShowsOffsets(true);
					wordPainter2.setUse(wordResult.tag.equals("a"));
					builder.append(wordResult.tag);
					builder.append(" ", wordPainter3);
//					builder.append(". ");
//					assertDoesNotThrow(() -> Utilities.markupToElement(".foo.bar.quotes.", component, false, false), 
//						"DefaultTextPainter couldn't insert a word result into a component");
					TextUtilities.insertMarkup(builder.toString(), component, DefaultHighlighter.DefaultHighlightPainter.class);
					builder.delete(0, 3);

				}
				catch (RuntimeException e1) {
				// handle exceptions
				}
			}

		 }
		 catch(Exception e) { 
			e.printStackTrace(); 
			fail("Exception encountered after " + 
	 		"setting up component content: " + e.toString());
		 }
	



	}
	
	 class WordResult {
		 public String tag;

		 public WordResult(String tag) {
			super();
			this.tag = tag;
				
		 }		
		 }

	 
	 class DefaultHighlighter implements Highlighter {

		 List<DefaultHighlightPainter> colorHighlighters;
			DefaultHighlightPainter defaultHighlighter = new DefaultHighlighter();
}
}