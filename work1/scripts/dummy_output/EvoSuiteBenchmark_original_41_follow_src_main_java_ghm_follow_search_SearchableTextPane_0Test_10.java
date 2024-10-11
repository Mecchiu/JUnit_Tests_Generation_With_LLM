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
		
	Logger log;
	public SearchableTextPane_0Test(Logger l) {
		log = l;
	}

	// Test case 1. Test for case 1a.
	@Test
	public void testCase1a() throws BadLocationException {
		
		JTextArea test = new JTextArea();
		DefaultHighlighter.HighlightPainter wordPainter = new DefaultHighlightPainter(Color.YELLOW);
		DefaultHighlighter wHighlighter = new DefaultHighlighter(wordPainter);
		test.setHighlighter(wHighlighter);

		test.setSelectionStart(1);
		test.setSelectionEnd(10);

		List<LineResult> wLineResult = new ArrayList<LineResult>();
		List<WordResult> wWordResult = new ArrayList<WordResult>();
		String testWordResult = "Sesame";
		boolean found = search("ses");
		boolean done = false;
		while (!done) {
            int pos = text.getText().indexOf(testWordResult);
            if (pos!= -1) {
            	wLineResult.add(new LineResult(pos, pos, pos + testWordResult.length(), pos + 5, "word"));
            	wLineResult.add(new LineResult(pos+testWordResult.length(), pos, pos + 5, "word"));
            	wWordResult.add(new WordResult(pos, testWordResult.length()));
                testWordResult = "toto";
                found = search("toto");
                done = found;
            } else {
            	if (testWordResult.length() < 15) {
            		wLineResult.add(new LineResult(pos, pos, pos + testWordResult.length(), pos + 5, "word"));
            	} else {
            		wLineResult.add(new LineResult(pos, pos, pos + testWordResult.length(), pos + 5, testWordResult));
            	}
            }
        }

		compareLines(text.getText(), test.getText());

		{
			DefaultHighlighter.HighlightPainter wordPainterNew = new DefaultHighlighter.HighlightPainter(Color.YELLOW);
			wHighlighter = new DefaultHighlighter(wordPainterNew);

			test.setHighlighter(wHighlighter);
			compareLines(test.getText(), text.getText());
		}

		// Test case 2. Test for case 2a.
		JTextArea test = new JTextArea();
		DefaultHighlighter wHighlighterNew = new DefaultHighlighter(null);
		test.setHighlighter(wHighlighterNew);

		String expected = "ses";
		String found = search(expected);
		done = found!= null && found.equals(expected);
	}

	// Test case 2b.
	@Test
	public void testCase2b() throws BadLocationException {
		
		JTextArea test = new JTextArea();
		DefaultHighlighter hHighlighter = new DefaultHighlighter(null);
		test.setHighlighter(hHighlighter);

		String expected = "toto";
		String found = search(expected);
		String result = "";
		if (found!= null && found.equals(expected)) {
			result = "";
		} else {
			result = "non";
		}
		compareLines(test.getText(), result);

}
}