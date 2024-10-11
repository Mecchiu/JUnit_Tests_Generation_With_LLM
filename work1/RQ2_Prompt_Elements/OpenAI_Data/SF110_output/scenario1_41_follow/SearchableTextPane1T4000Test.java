// SearchableTextPaneTest.java
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
* It contains ten unit test cases for the {@link SearchableTextPane#search(String, int)} method.
*/
class SearchableTextPaneTest {

		private static final Logger log = Logger.getLogger(SearchableTextPaneTest.class.getName());
		
		/**
		* Test of search method, of class SearchableTextPane.
		*/
		@Test
		public void testSearch() {
				System.out.println("search");
				SearchableTextPane instance = new SearchableTextPane();
				String text = "This is a test string";
				instance.setText(text);
				int startPos = 0;
				int expResult = 0;
				int result = instance.search("This", startPos);
				assertEquals(expResult, result);
				startPos = 5;
				expResult = -1;
				result = instance.search("This", startPos);
				assertEquals(expResult, result);
				startPos = 0;
				expResult = 5;
				result = instance.search("is", startPos);
				assertEquals(expResult, result);
				startPos = 0;
				expResult = 8;
				result = instance.search("a", startPos);
				assertEquals(expResult, result);
				startPos = 0;
				expResult = 10;
				result = instance.search("test", startPos);
				assertEquals(expResult, result);
				startPos = 0;
				expResult = 15;
				result = instance.search("string", startPos);
				assertEquals(expResult, result);
				startPos = 0;
				expResult = -1;
				result = instance.search("not", startPos);
				assertEquals(expResult, result);
				startPos = 0;
				expResult = -1;
				result = instance.search("", startPos);
				assertEquals(expResult, result);
				startPos = 0;
				expResult = -1;
				result = instance.search(null, startPos);
				assertEquals(expResult, result);
				startPos = -1;
				expResult = -1;
				result = instance.search("This", startPos);
				assertEquals(expResult, result);
		}
}