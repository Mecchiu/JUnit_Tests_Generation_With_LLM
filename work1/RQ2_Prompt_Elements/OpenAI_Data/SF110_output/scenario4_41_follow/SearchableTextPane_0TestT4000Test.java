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
* It contains ten unit test cases for the {@link SearchableTextPane#search(String)} method.
*/
class SearchableTextPane_0Test {

		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with a null value.
		*/
		@Test
		void testSearch_0() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				int result = searchableTextPane.search(null);
				assertEquals(-1, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with an empty string.
		*/
		@Test
		void testSearch_1() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				int result = searchableTextPane.search("");
				assertEquals(-1, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with a string that is not found.
		*/
		@Test
		void testSearch_2() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				int result = searchableTextPane.search("test");
				assertEquals(-1, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with a string that is found.
		*/
		@Test
		void testSearch_3() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("test");
				int result = searchableTextPane.search("test");
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with a string that is found.
		*/
		@Test
		void testSearch_4() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("test");
				int result = searchableTextPane.search("test");
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with a string that is found.
		*/
		@Test
		void testSearch_5() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("test");
				int result = searchableTextPane.search("test");
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with a string that is found.
		*/
		@Test
		void testSearch_6() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("test");
				int result = searchableTextPane.search("test");
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with a string that is found.
		*/
		@Test
		void testSearch_7() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("test");
				int result = searchableTextPane.search("test");
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with a string that is found.
		*/
		@Test
		void testSearch_8() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("test");
				int result = searchableTextPane.search("test");
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with a string that is found.
		*/
		@Test
		void testSearch_9() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("test");
				int result = searchableTextPane.search("test");
				assertEquals(0, result);
		}
}

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
* It contains ten unit test cases for the {@link SearchableTextPane#search(String, int)} method.
*/
class SearchableTextPane_1Test {
		
		/**
		* Test case for the {@link SearchableTextPane#search(String, int)} method.
		* This test case tests the method with a null value.
		*/
		@Test
		void testSearch_0() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				int result = searchableTextPane.search(null, 0);
				assertEquals(-1, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String, int)} method.
		* This test case tests the method with an empty string.
		*/
		@Test
		void testSearch_1() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				int result = searchableTextPane.search("", 0);
				assertEquals(-1, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String, int)} method.
		* This test case tests the method with a string that is not found.
		*/
		@Test
		void testSearch_2() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				int result = searchableTextPane.search("test", 0);
				assertEquals(-1, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String, int)} method.
		* This test case tests the method with a string that is found.
		*/
		@Test
		void testSearch_3() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("test");
				int result = searchableTextPane.search("test", 0);
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String, int)} method.
		* This test case tests the method with a string that is found.
		*/
		@Test
		void testSearch_4() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("test");
				int result = searchableTextPane.search("test", 0);
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String, int)} method.
		* This test case tests the method with a string that is found.
		*/
		@Test
		void testSearch_5() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("test");
				int result = searchableTextPane.search("test", 0);
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String, int)} method.
		* This test case tests the method with a string that is found.
		*/
		@Test
		void testSearch_6() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("test");
				int result = searchableTextPane.search("test", 0);
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String, int)} method.
		* This test case tests the method with a string that is found.
		*/
		@Test
		void testSearch_7() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("test");
				int result = searchableTextPane.search("test", 0);
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String, int)} method.
		* This test case tests the method with a string that is found.
		*/
		@Test
		void testSearch_8() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("test");
				int result = searchableTextPane.search("test", 0);
				assertEquals(0, result);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String, int)} method.
		* This test case tests the method with a string that is found.
		*/
		@Test
		void testSearch_9() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				searchableTextPane.setText("test");
				int result = searchableTextPane.search("test", 0);
				assertEquals(0, result);
		}
}

// SearchableTextPane_2Test.java
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
* It contains ten unit test cases for the {@link SearchableTextPane#highlight(String, int)} method.
*/
class SearchableTextPane_2Test {
		
		/**
		* Test case for the {@link SearchableTextPane#highlight(String, int)} method.
		* This test case tests the method with a null value.
		*/
		@Test
		void testHighlight_0() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				List<LineResult> result = searchableTextPane.highlight(null, 0);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case for the {@link SearchableTextPane#highlight(String, int)} method.
		* This test case tests the method with an empty string.
		*/
		@Test
		void testHighlight_1() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				List<LineResult> result = searchableTextPane.highlight("", 0);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case for the {@link SearchableTextPane#highlight(String, int)} method.
		* This test case tests the method with a string that is not found.
		*/
		@Test
		void testHighlight_2() {
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);