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
		* Test case 1: Search for a term that is not in the text.
		*/
		@Test
		public void testSearch1() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test.");
				int position = textPane.search("not in text");
				assertEquals(-1, position);
		}
		
		/**
		* Test case 2: Search for a term that is in the text.
		*/
		@Test
		public void testSearch2() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test.");
				int position = textPane.search("is");
				assertEquals(5, position);
		}
		
		/**
		* Test case 3: Search for a term that is in the text, but not at the beginning.
		*/
		@Test
		public void testSearch3() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test.");
				int position = textPane.search("a");
				assertEquals(8, position);
		}
		
		/**
		* Test case 4: Search for a term that is in the text, but not at the end.
		*/
		@Test
		public void testSearch4() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test.");
				int position = textPane.search("test");
				assertEquals(10, position);
		}
		
		/**
		* Test case 5: Search for a term that is in the text, but not at the beginning or end.
		*/
		@Test
		public void testSearch5() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test.");
				int position = textPane.search("a");
				assertEquals(8, position);
		}
		
		/**
		* Test case 6: Search for a term that is in the text, but not at the beginning or end.
		*/
		@Test
		public void testSearch6() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test.");
				int position = textPane.search("a");
				assertEquals(8, position);
		}
		
		/**
		* Test case 7: Search for a term that is in the text, but not at the beginning or end.
		*/
		@Test
		public void testSearch7() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test.");
				int position = textPane.search("a");
				assertEquals(8, position);
		}
		
		/**
		* Test case 8: Search for a term that is in the text, but not at the beginning or end.
		*/
		@Test
		public void testSearch8() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test.");
				int position = textPane.search("a");
				assertEquals(8, position);
		}
		
		/**
		* Test case 9: Search for a term that is in the text, but not at the beginning or end.
		*/
		@Test
		public void testSearch9() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test.");
				int position = textPane.search("a");
				assertEquals(8, position);
		}
		
		/**
		* Test case 10: Search for a term that is in the text, but not at the beginning or end.
		*/
		@Test
		public void testSearch10() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test.");
				int position = textPane.search("a");
				assertEquals(8, position);
		}
}