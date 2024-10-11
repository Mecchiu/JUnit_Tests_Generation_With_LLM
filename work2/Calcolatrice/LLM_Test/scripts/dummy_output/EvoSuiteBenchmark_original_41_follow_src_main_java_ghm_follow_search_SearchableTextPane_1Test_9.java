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
		static final int WIDTH = 1000;
		static final int HEIGHT = 50;
		static final int X = 0;
		static final int TOP_OFFSET = 10;
		static final int TEXT_WIDTH = 300;
		static final Font NORMAL_FONT = new Font("Consolas", Font.PLAIN, 24);
		static final int NORMAL_HEIGHT = 24;
		static final Font WRONG_FONT = new Font("Consolas", Font.PLAIN, 37);
		static final int WRONG_HEIGHT = 37;
		static final String TITLE = "Hellow World";
		int termLength;
		List<LineResult> originalResults;
		List<LineResult> text2Lines;
		List<WordResult> results;
		int text2LinesOffset;
		int searchPos;
		int text2LinesEnd;
		int linePos;
		int termFound;
		
		String createText(String text) {return text;}
		
		public SearchableTextPane_1Test() {
			document = createText(createText(createText(TEXT_WIDTH, 5)));
			document.setPageSize(WIDTH, HEIGHT);
			StringBuilder sb = new StringBuilder();
			Document doc = document.getDocument();
			int startPos = doc.getText(new Element("h").getStartOffset(), doc.getLength());
			try
			{
				startPos = doc.getText(0, doc.getLength());
			}
			catch (BadLocationException e)
			{
				Utilities.logException(e);
			}
			doc.remove(startPos, doc.getLength());
			doc.insertString(startPos, sb.toString(), null);
			document.getStyleSheet().addRule("body", "span.h{font-size:10pt;color:#008000;}" + sb.toString());
			originalResults = doc.getAllMatches(new Element("h").getStartOffset() - 1,
					document.getLength() - 1, sb.toString(), DEFAULT_SHOW_RESULTS);
		}

		@Test
		void test() {
			text2Lines = convertWords2Lines(new ArrayList<WordResult>(results));
			System.out.println("text2Lines: " + text2Lines);
			for (LineResult res : text2Lines) {
				linePos = document.getLength();
				termFound = search(createText(res.word()), 0);
				System.out.println("line: " + linePos);
				System.out.println("result: " + res);
			}
			text2Lines = convertWords2Lines(new ArrayList<WordResult>(results));
			System.out.println("text2Lines: " + text2Lines);
		}
}