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
		/**
	     * Constructs a new unit test instance.
	     */
	  public SearchableTextPane_1Test() {
	  }

	  /**
	   * Override this to setup UI testing
	   */
	  @Test
	  public void testSimpleExample() {
	    Document doc = new Document(10, 20);
	    Element root = doc.add(new Element("body"));
		JTextArea textArea = new JTextArea(20, 30, 30, 25);
        List<LineResult> expectedLines = new ArrayList();
        List<WordResult> words = getPlainWords();
        
        for(int i=0;i<words.size();i++) {
        	//Test case 1:  if the term is empty
        	if (words.get(i).text == null || words.get(i).text.isEmpty()) {
        		try {
	        		expectedLines.add(new LineResult(i, doc.getLength(), 0, Color.YELLOW, 1));
        		} catch (BadLocationException ex) {
        			log.log(Level.SEVERE, null, ex);
        		}
        	}
        	//Test case 2:  no hits in that search term
        	else {
        		try {
	        		expectedLines.add(new LineResult(i, doc.getLength(), words.get(i).pos, words.get(i).color, words.get(i).count));
        		} catch (BadLocationException ex) {
        			log.log(Level.SEVERE, null, ex);
        		}
        	}
        }
        listLineResults(textArea, words, words, root);
        
		//Test case 3:  highlight and search a string
		doc.insertString(doc.getLength(), "highlighter", null);
		expectedLines.addAll(convertWords2Lines(words));
		expectedLines.remove(0);
		expectedLines.add(new LineResult(0, doc.getLength(), 0, Color.GREEN, 1, expectedLines));
		try {
		  	testSearch(textArea, words, expectedLines);
		} catch (BadLocationException ex) {
		  	log.log(Level.SEVERE, null, ex);
		}
    	//testSearch(textArea, words, words, root, 20, 30, 15);
		//testSearch(textArea, words, root, 20, 30, 15);
		for(int i=0;i<words.size();i++) assertEquals("words[0] should be correct.", i+1, words.get(i).pos);
	    assertEquals("count should be correct.", 2, words.size());
    	//Test case 4:
    	/*
    	for(int j=0;j<words.size();j++)
    		assertEquals("pos for word["+j+"] should be correct.", 
    				0, words.get(j).pos);
    	*/
	  }

	  /**
	   * Converts word result into line result.
	   *
	   * @param textArea
	   * @param firstWord
	   * @param secondWord
	   * @param root
	   */
	  private void listLineResults(JTextArea textArea,
    		List<WordResult> firstWord,
    		List<WordResult> secondWord,
    		Element root) throws BadLocationException {
    		List<WordResult> wordResults = new ArrayList();
    		wordResults.addAll(firstWord);
    		wordResults.addAll(secondWord);
    		textArea.setText(TextUtilities.join(wordResults, '\n'));
    	}
}