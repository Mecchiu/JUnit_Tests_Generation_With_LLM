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
		public void testSearchNotFound() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test.");
				int pos = textPane.search("not found");
				assertEquals(-1, pos);
		}
		
		/**
		* Test case 2: Search for a term that is in the text.
		*/
		@Test
		public void testSearchFound() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test.");
				int pos = textPane.search("is");
				assertEquals(2, pos);
		}
		
		/**
		* Test case 3: Search for a term that is in the text twice.
		*/
		@Test
		public void testSearchFoundTwice() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test. This is a test.");
				int pos = textPane.search("is");
				assertEquals(2, pos);
		}
		
		/**
		* Test case 4: Search for a term that is in the text twice.
		* The second search should start at the end of the first term.
		*/
		@Test
		public void testSearchFoundTwice2() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test. This is a test.");
				textPane.search("is");
				int pos = textPane.search("is");
				assertEquals(18, pos);
		}
		
		/**
		* Test case 5: Search for a term that is in the text twice.
		* The second search should start at the end of the first term.
		* The third search should start at the end of the second term.
		*/
		@Test
		public void testSearchFoundTwice3() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test. This is a test.");
				textPane.search("is");
				textPane.search("is");
				int pos = textPane.search("is");
				assertEquals(2, pos);
		}
		
		/**
		* Test case 6: Search for a term that is in the text twice.
		* The second search should start at the end of the first term.
		* The third search should start at the end of the second term.
		* The fourth search should start at the end of the third term.
		*/
		@Test
		public void testSearchFoundTwice4() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test. This is a test.");
				textPane.search("is");
				textPane.search("is");
				textPane.search("is");
				int pos = textPane.search("is");
				assertEquals(18, pos);
		}
		
		/**
		* Test case 7: Search for a term that is in the text twice.
		* The second search should start at the end of the first term.
		* The third search should start at the end of the second term.
		* The fourth search should start at the end of the third term.
		* The fifth search should start at the end of the fourth term.
		*/
		@Test
		public void testSearchFoundTwice5() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test. This is a test.");
				textPane.search("is");
				textPane.search("is");
				textPane.search("is");
				textPane.search("is");
				int pos = textPane.search("is");
				assertEquals(2, pos);
		}
		
		/**
		* Test case 8: Search for a term that is in the text twice.
		* The second search should start at the end of the first term.
		* The third search should start at the end of the second term.
		* The fourth search should start at the end of the third term.
		* The fifth search should start at the end of the fourth term.
		* The sixth search should start at the end of the fifth term.
		*/
		@Test
		public void testSearchFoundTwice6() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test. This is a test.");
				textPane.search("is");
				textPane.search("is");
				textPane.search("is");
				textPane.search("is");
				textPane.search("is");
				int pos = textPane.search("is");
				assertEquals(18, pos);
		}
		
		/**
		* Test case 9: Search for a term that is in the text twice.
		* The second search should start at the end of the first term.
		* The third search should start at the end of the second term.
		* The fourth search should start at the end of the third term.
		* The fifth search should start at the end of the fourth term.
		* The sixth search should start at the end of the fifth term.
		* The seventh search should start at the end of the sixth term.
		*/
		@Test
		public void testSearchFoundTwice7() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test. This is a test.");
				textPane.search("is");
				textPane.search("is");
				textPane.search("is");
				textPane.search("is");
				textPane.search("is");
				textPane.search("is");
				int pos = textPane.search("is");
				assertEquals(2, pos);
		}
		
		/**
		* Test case 10: Search for a term that is in the text twice.
		* The second search should start at the end of the first term.
		* The third search should start at the end of the second term.
		* The fourth search should start at the end of the third term.
		* The fifth search should start at the end of the fourth term.
		* The sixth search should start at the end of the fifth term.
		* The seventh search should start at the end of the sixth term.
		* The eighth search should start at the end of the seventh term.
		*/
		@Test
		public void testSearchFoundTwice8() {
				SearchableTextPane textPane = new SearchableTextPane();
				textPane.setText("This is a test. This is a test.");
				textPane.search("is");
				textPane.search("is");
				textPane.search("is");
				textPane.search("is");
				textPane.search("is");
				textPane.search("is");
				textPane.search("is");
				int pos = textPane.search("is");
				assertEquals(18, pos);
		}
}