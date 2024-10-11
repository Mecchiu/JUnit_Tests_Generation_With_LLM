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
		/**
		* Basic test with null text input.
		*/
        @Test
	public void basicTest() {
		List<String> words = new ArrayList<>();
		words.add("test word");
		assertEquals("word", search("test word"));
		List<String> wordsForText = new ArrayList<>();
		wordsForText.add("test word");
		assertEquals("test word", search("test word", wordsForText));
	}


        /**
		* Test with text input which is not as long as it is (as long as it is less than 2 characters).
		*
		* @throws Exception
		*/
        @Test
	public void testNotMoreThan2Chars() throws Exception {
			defaultTextPaneTest();
	}

        /**
		* Test with empty string input.
		*/
        @Test
	void emptyTextInInputAndNoResult() {
	        defaultTextPaneTest();
	}


        /**
		* Basic test with 1 term.
		*/
        @Test
	public void basicTest1Term() {
		List<String> words = new ArrayList<>();
		words.add("test word");
		assertEquals("test word", search("test word"), 0);
		List<String> wordsForText = new ArrayList<>();
		wordsForText.add("test word");
		assertEquals("test word", search("test word", wordsForText), 0);
	}

	void defaultTextPaneTest() {
		List<String> words = new ArrayList<>();
		words.add("test word");
		defaultTextPaneTest(words);
	}

	void defaultTextPaneTest(List<String> words) {
		List<LineResult> lineResults = convertWords2Lines(words);
		assertEquals(15, lineResults.size());
		for (int i = 0; i < 15; i++) {
			LineResult lineResult = lineResults.get(i);
			assertEquals("The content of the line " + i + " should be the same", lineResult.getContent(), words.get(i));
			assertEquals(1, lineResult.getStartOffset());
			assertEquals(100, lineResult.getEndOffset());
			assertEquals(Color.BLACK, lineResult.getLineHighlight());
			assertEquals(Color.BLUE, lineResult.getLineShadow());
			assertEquals(Color.RED, lineResult.getCharShadow());
			assertEquals(Color.GREEN, lineResult.getCharHighlight());
			assertEquals(Color.MAGENTA, lineResult.getLineFont());
			assertEquals(0, lineResult.getStartLine());
			assertEquals(11, lineResult.getEndLine());
		}
		assertEquals(15, defaultTextPaneTest(words, lineResults));
	}

	int defaultTextPaneTest(List<String> words, List<LineResult> lineResults) {
		Document document = new DefaultStyledDocument();

		Element rootElement = document.getDefaultRootElement();

        DefaultHighlighter defaultHighlighter = new DefaultHighlighter(words);
        defaultHighlighter.setText(words.get(0));

		StyleScope scope = new StyleScope(rootElement);

		DefaultHighlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.BLACK);
		painter.setColor(Color.BLACK);
		painter.setFont(new Font("courier", Font.PLAIN, 14));
		defaultHighlighter.addHighlightPainter(painter);
		DefaultHighlighter.HighlightPainter linePainter = new DefaultHighlighter.DefaultHighlightPainter(Color.RED);
}
}