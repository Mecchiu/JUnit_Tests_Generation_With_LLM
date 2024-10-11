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
		static DefaultHighlighter highlighter;
		static SearchableTextPane textPane;
		private DefaultHighlightPainter wordPainter;
		private DefaultHighlightPainter whiteHighlightPainter;
    
		
    @Test
    void testSearch() throws Exception {
    	List<WordResult> wordsToFind = new ArrayList<>(4);
    	
    	for (int i = 0; i < 7; ++i){
    		wordsToFind.add(new WordResult("", "", 0, i));
    	}
    	
    	wordsToFind.add(new WordResult("", "", 0, 7));
    	wordsToFind.add(new WordResult("", "", 0, 10));
    	
    	wordsToFind.add(new WordResult("", "", 0, 6));
    	wordsToFind.add(new WordResult("", "", 0, 1));
    	
    	textPane = new SearchableTextPane(10) {
        	@Override
				public List<LineResult> find(String term) throws BadLocationException {
					SearchableTextPane_Utils.log(Level.WARNING, "TEST " + this);
                    return super.find(term)
                    	.stream()
                    	.filter(x -> x.isHighlight())
                    	.map(LineResult::getHighlights)
                    	.collect(Collectors.toList());
                }
        }.addHighlight(13, 16);
        assertNotNull(textPane);
    }

    @Test
    void testSearch_highlighter() throws Exception {
    	List<WordResult> wordsToFind = new ArrayList<>(4);
    	
    	for (int i = 0; i < 7; ++i){
    		wordsToFind.add(new WordResult("", "", 0, i));
    	}
    	
    	wordsToFind.add(new WordResult("", "", 0, 7));
    	wordsToFind.add(new WordResult("", "", 0, 10));
    	
    	wordsToFind.add(new WordResult("", "", 0, 6));
    	wordsToFind.add(new WordResult("", "", 0, 1));
    	
    	textPane = new SearchableTextPane.SearchableTextPane(10) {
        	@Override
				public List<LineResult> find(String term) throws BadLocationException {
					SearchableTextPane_Utils.log(Level.WARNING, "TEST " + this);
    	            return super.find(term)
    	               .stream()
    	               .filter(x -> x.isHighlight())
    	               .map(line -> new LineResult(line.getText(), getText(line), (float) x.getHighlight(), true))
    	               .collect(Collectors.toList());
                }
        }.addHighlighter(new DefaultHighlighter(Color.black, 20, Color.blue));
    	assertNotNull(textPane.getTextPane().getHighlighter().getDefaultHighlightPainter());
    	assertNotNull(textPane.getTextPane().getHighlighter().getDefaultHighlightPainter());
    	assertEquals(whiteHighlightPainter, textPane.getTextPane().getHighlighter().getDefaultHighlightPainter());
    }
    
    public void testGetDefaultHighlighter() {
        DefaultHighlighter defaultHighlighter = textPane.getTextPane().getHighlighter();
}
}