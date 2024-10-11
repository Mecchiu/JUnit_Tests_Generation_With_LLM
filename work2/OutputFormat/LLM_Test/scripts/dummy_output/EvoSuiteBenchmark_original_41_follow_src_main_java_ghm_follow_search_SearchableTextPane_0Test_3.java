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
		
	private static class LineResult {
	    private String result;

	    private int start;

	    private int end;

	    public LineResult (String result, int start, int end) {
	        this.result = result;
	        this.start = start;
	        this.end = end;
	    }

	    public String toString () {
	        return "(line = "+getLineNumber()+", start = "+getStartPosition()+", end = "+getEndPosition()+")";
	    }

	    /**
	     * Returns current line number.
	     */
	    private int getLineNumber() {
	    	if (result == null) {
	        	return -1;
	    	}
	    	int wordLength = Utilities.getText(result, 0, getEndPosition()).length();

	    	if (wordLength < 1) {
	    		return -1;
	    	}

	    	int lineNumber = 1;
	    	for (int i = 0; i < wordLength; i++) {
	    		if (Character.isWhitespace(result.charAt(i))) {
	    			wordLength--;
	    			i++;
	    		} else {
	    			i++;
	    		}
	    	}
	    	if (lineNumber > 100000) {
	    		return -1;
	    	}
	    	return lineNumber;
	    }

	    /**
	     * Returns current line position.
	     */
	    private int getStartPosition () {
	        return System.getProperty("user.dir") + File.separatorChar + "output" + File.separatorChar + "TextOutput.html";
	    }

	    /**
	     * Returns current line end position.
	     */
	    private int getEndPosition () {
	        return getStartPosition() + Utils.getText(result, StringUtils.MAX_COLUMN_COUNT, getEndPosition()).length();
	    }

	    /**
	     * Returns array of character that exist inside string
	     *
	     * @return Character array
	     */
	    private char[] getCharacters() {
	        char[] c = new char[Utils.getText(result, getStartPosition(), getEndPosition()).length()];
	        for (int i = 0; i < c.length; i++) {
	            c[i] = (char) result.charAt(getStartPosition()+ i, getEndPosition()-getStartPosition()+ i);
	        }
	        return c[0];
	    }

	    /**
	     * Returns current line text.
	     */
	    private String getText() {
	        return Utilities.getText(result, getStartPosition(), getEndPosition());
	    }
    }

	private static final String TEXT_OUTPUT = "TextOutput.html";

    private static DefaultHighlighter wordHighlighter = new DefaultHighlighter(new Color(0, 150, 100));
	 /**
      * Converts line results from {@link SearchableTextPane} into HTML.
      *
      * @param lineResults
      * @return html
      */
    private static String convertLineResultsToHtml(List<List<LineResult>> lineResults) {
    	StringBuilder sb = new StringBuilder();
    	int lines = lineResults.size();
    	for (int i = 0; i < lines; i++) {
    		sb.append(getLineInfoForResult(lineResults.get(i))).append("<br>");
    	}
    	return sb.toString();
    }

 	private static String getLineInfoForResult(List<LineResult> line) {
}
}