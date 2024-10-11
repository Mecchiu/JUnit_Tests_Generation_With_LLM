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

		/**
		* Test case 1:
		* <br>
		* The term is null.
		* <br>
		* Expected result: -1
		*/
		@Test
		void testSearch_1() {
				SearchableTextPane instance = new SearchableTextPane();
				int startPos = 0;
				int expResult = -1;
				int result = instance.search(null, startPos);
				assertEquals(expResult, result);
		}
		
		/**
		* Test case 2:
		* <br>
		* The term is empty.
		* <br>
		* Expected result: -1
		*/
		@Test
		void testSearch_2() {
				SearchableTextPane instance = new SearchableTextPane();
				int startPos = 0;
				int expResult = -1;
				int result = instance.search("", startPos);
				assertEquals(expResult, result);
		}
		
		/**
		* Test case 3:
		* <br>
		* The term is not found.
		* <br>
		* Expected result: -1
		*/
		@Test
		void testSearch_3() {
				SearchableTextPane instance = new SearchableTextPane();
				int startPos = 0;
				int expResult = -1;
				int result = instance.search("not found", startPos);
				assertEquals(expResult, result);
		}
		
		/**
		* Test case 4:
		* <br>
		* The term is found at the start position.
		* <br>
		* Expected result: 0
		*/
		@Test
		void testSearch_4() {
				SearchableTextPane instance = new SearchableTextPane();
				int startPos = 0;
				int expResult = 0;
				int result = instance.search("found", startPos);
				assertEquals(expResult, result);
		}
		
		/**
		* Test case 5:
		* <br>
		* The term is found after the start position.
		* <br>
		* Expected result: 5
		*/
		@Test
		void testSearch_5() {
				SearchableTextPane instance = new SearchableTextPane();
				int startPos = 5;
				int expResult = 5;
				int result = instance.search("found", startPos);
				assertEquals(expResult, result);
		}
		
		/**
		* Test case 6:
		* <br>
		* The term is found at the end of the text.
		* <br>
		* Expected result: 10
		*/
		@Test
		void testSearch_6() {
				SearchableTextPane instance = new SearchableTextPane();
				int startPos = 0;
				int expResult = 10;
				int result = instance.search("found", startPos);
				assertEquals(expResult, result);
		}
		
		/**
		* Test case 7:
		* <br>
		* The term is found at the start of a line.
		* <br>
		* Expected result: 0
		*/
		@Test
		void testSearch_7() {
				SearchableTextPane instance = new SearchableTextPane();
				int startPos = 0;
				int expResult = 0;
				int result = instance.search("found", startPos);
				assertEquals(expResult, result);
		}
		
		/**
		* Test case 8:
		* <br>
		* The term is found at the end of a line.
		* <br>
		* Expected result: 5
		*/
		@Test
		void testSearch_8() {
				SearchableTextPane instance = new SearchableTextPane();
				int startPos = 0;
				int expResult = 5;
				int result = instance.search("found", startPos);
				assertEquals(expResult, result);
		}
		
		/**
		* Test case 9:
		* <br>
		* The term is found at the start of a paragraph.
		* <br>
		* Expected result: 0
		*/
		@Test
		void testSearch_9() {
				SearchableTextPane instance = new SearchableTextPane();
				int startPos = 0;
				int expResult = 0;
				int result = instance.search("found", startPos);
				assertEquals(expResult, result);
		}
		
		/**
		* Test case 10:
		* <br>
		* The term is found at the end of a paragraph.
		* <br>
		* Expected result: 5
		*/
		@Test
		void testSearch_10() {
				SearchableTextPane instance = new SearchableTextPane();
				int startPos = 0;
				int expResult = 5;
				int result = instance.search("found", startPos);
				assertEquals(expResult, result);
		}
}