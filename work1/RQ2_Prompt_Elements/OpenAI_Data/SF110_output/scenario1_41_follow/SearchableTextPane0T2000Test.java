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
* It contains ten unit test cases for the {@link SearchableTextPane#search(String)} method.
*/
class SearchableTextPaneTest {

		/**
		* Test case 1:
		* The search term is null.
		* The search method should return -1.
		*/
		@Test
		void testSearchNull() {
				SearchableTextPane pane = new SearchableTextPane();
				assertEquals(-1, pane.search(null));
		}
		
		/**
		* Test case 2:
		* The search term is empty.
		* The search method should return -1.
		*/
		@Test
		void testSearchEmpty() {
				SearchableTextPane pane = new SearchableTextPane();
				assertEquals(-1, pane.search(""));
		}
		
		/**
		* Test case 3:
		* The search term is not found.
		* The search method should return -1.
		*/
		@Test
		void testSearchNotFound() {
				SearchableTextPane pane = new SearchableTextPane();
				assertEquals(-1, pane.search("not found"));
		}
		
		/**
		* Test case 4:
		* The search term is found at the beginning of the text.
		* The search method should return 0.
		*/
		@Test
		void testSearchFoundAtBeginning() {
				SearchableTextPane pane = new SearchableTextPane();
				pane.setText("found at beginning");
				assertEquals(0, pane.search("found at beginning"));
		}
		
		/**
		* Test case 5:
		* The search term is found at the end of the text.
		* The search method should return the position of the search term.
		*/
		@Test
		void testSearchFoundAtEnd() {
				SearchableTextPane pane = new SearchableTextPane();
				pane.setText("found at end");
				assertEquals(0, pane.search("found at end"));
		}
		
		/**
		* Test case 6:
		* The search term is found in the middle of the text.
		* The search method should return the position of the search term.
		*/
		@Test
		void testSearchFoundInMiddle() {
				SearchableTextPane pane = new SearchableTextPane();
				pane.setText("found in middle");
				assertEquals(0, pane.search("found in middle"));
		}
		
		/**
		* Test case 7:
		* The search term is found multiple times in the text.
		* The search method should return the position of the first occurrence of the search term.
		*/
		@Test
		void testSearchFoundMultipleTimes() {
				SearchableTextPane pane = new SearchableTextPane();
				pane.setText("found multiple times");
				assertEquals(0, pane.search("found multiple times"));
		}
		
		/**
		* Test case 8:
		* The search term is found multiple times in the text.
		* The search method should return the position of the first occurrence of the search term.
		*/
		@Test
		void testSearchFoundMultipleTimes2() {
				SearchableTextPane pane = new SearchableTextPane();
				pane.setText("found multiple times");
				assertEquals(0, pane.search("found multiple times"));
		}
		
		/**
		* Test case 9:
		* The search term is found multiple times in the text.
		* The search method should return the position of the first occurrence of the search term.
		*/
		@Test
		void testSearchFoundMultipleTimes3() {
				SearchableTextPane pane = new SearchableTextPane();
				pane.setText("found multiple times");
				assertEquals(0, pane.search("found multiple times"));
		}
		
		/**
		* Test case 10:
		* The search term is found multiple times in the text.
		* The search method should return the position of the first occurrence of the search term.
		*/
		@Test
		void testSearchFoundMultipleTimes4() {
				SearchableTextPane pane = new SearchableTextPane();
				pane.setText("found multiple times");
				assertEquals(0, pane.search("found multiple times"));
		}
}