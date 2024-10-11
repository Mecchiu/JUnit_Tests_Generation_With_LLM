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
				pane.setText("This is a test.");
				assertEquals(-1, pane.search("test"));
		}
		
		/**
		* Test case 4:
		* The search term is found.
		* The search method should return the position of the first occurrence.
		*/
		@Test
		void testSearchFound() {
				SearchableTextPane pane = new SearchableTextPane();
				pane.setText("This is a test.");
				assertEquals(8, pane.search("test"));
		}
		
		/**
		* Test case 5:
		* The search term is found.
		* The search method should return the position of the first occurrence.
		*/
		@Test
		void testSearchFound2() {
				SearchableTextPane pane = new SearchableTextPane();
				pane.setText("This is a test. This is a test.");
				assertEquals(8, pane.search("test"));
		}
		
		/**
		* Test case 6:
		* The search term is found.
		* The search method should return the position of the first occurrence.
		*/
		@Test
		void testSearchFound3() {
				SearchableTextPane pane = new SearchableTextPane();
				pane.setText("This is a test. This is a test.");
				assertEquals(8, pane.search("test"));
				assertEquals(22, pane.search("test"));
		}
		
		/**
		* Test case 7:
		* The search term is found.
		* The search method should return the position of the first occurrence.
		*/
		@Test
		void testSearchFound4() {
				SearchableTextPane pane = new SearchableTextPane();
				pane.setText("This is a test. This is a test.");
				assertEquals(8, pane.search("test"));
				assertEquals(22, pane.search("test"));
				assertEquals(8, pane.search("test"));
		}
		
		/**
		* Test case 8:
		* The search term is found.
		* The search method should return the position of the first occurrence.
		*/
		@Test
		void testSearchFound5() {
				SearchableTextPane pane = new SearchableTextPane();
				pane.setText("This is a test. This is a test.");
				assertEquals(8, pane.search("test"));
				assertEquals(22, pane.search("test"));
				assertEquals(8, pane.search("test"));
				assertEquals(22, pane.search("test"));
		}
		
		/**
		* Test case 9:
		* The search term is found.
		* The search method should return the position of the first occurrence.
		*/
		@Test
		void testSearchFound6() {
				SearchableTextPane pane = new SearchableTextPane();
				pane.setText("This is a test. This is a test.");
				assertEquals(8, pane.search("test"));
				assertEquals(22, pane.search("test"));
				assertEquals(8, pane.search("test"));
				assertEquals(22, pane.search("test"));
				assertEquals(8, pane.search("test"));
		}
		
		/**
		* Test case 10:
		* The search term is found.
		* The search method should return the position of the first occurrence.
		*/
		@Test
		void testSearchFound7() {
				SearchableTextPane pane = new SearchableTextPane();
				pane.setText("This is a test. This is a test.");
				assertEquals(8, pane.search("test"));
				assertEquals(22, pane.search("test"));
				assertEquals(8, pane.search("test"));
				assertEquals(22, pane.search("test"));
				assertEquals(8, pane.search("test"));
				assertEquals(22, pane.search("test"));
		}
}