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
		* This test case tests the method with the following parameters:
		* <ul>
		* <li>term = "test"</li>
		* </ul>
		* The expected result is:
		* <ul>
		* <li>return value = -1</li>
		* </ul>
		*/
		@Test
		public void testSearch_0() {
				// Arrange
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				String term = "test";
				
				// Act
				int returnValue = searchableTextPane.search(term);
				
				// Assert
				assertEquals(-1, returnValue);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with the following parameters:
		* <ul>
		* <li>term = null</li>
		* </ul>
		* The expected result is:
		* <ul>
		* <li>return value = -1</li>
		* </ul>
		*/
		@Test
		public void testSearch_1() {
				// Arrange
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				String term = null;
				
				// Act
				int returnValue = searchableTextPane.search(term);
				
				// Assert
				assertEquals(-1, returnValue);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with the following parameters:
		* <ul>
		* <li>term = ""</li>
		* </ul>
		* The expected result is:
		* <ul>
		* <li>return value = -1</li>
		* </ul>
		*/
		@Test
		public void testSearch_2() {
				// Arrange
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				String term = "";
				
				// Act
				int returnValue = searchableTextPane.search(term);
				
				// Assert
				assertEquals(-1, returnValue);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with the following parameters:
		* <ul>
		* <li>term = "test"</li>
		* </ul>
		* The expected result is:
		* <ul>
		* <li>return value = -1</li>
		* </ul>
		*/
		@Test
		public void testSearch_3() {
				// Arrange
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				String term = "test";
				
				// Act
				int returnValue = searchableTextPane.search(term);
				
				// Assert
				assertEquals(-1, returnValue);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with the following parameters:
		* <ul>
		* <li>term = null</li>
		* </ul>
		* The expected result is:
		* <ul>
		* <li>return value = -1</li>
		* </ul>
		*/
		@Test
		public void testSearch_4() {
				// Arrange
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				String term = null;
				
				// Act
				int returnValue = searchableTextPane.search(term);
				
				// Assert
				assertEquals(-1, returnValue);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with the following parameters:
		* <ul>
		* <li>term = ""</li>
		* </ul>
		* The expected result is:
		* <ul>
		* <li>return value = -1</li>
		* </ul>
		*/
		@Test
		public void testSearch_5() {
				// Arrange
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				String term = "";
				
				// Act
				int returnValue = searchableTextPane.search(term);
				
				// Assert
				assertEquals(-1, returnValue);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with the following parameters:
		* <ul>
		* <li>term = "test"</li>
		* </ul>
		* The expected result is:
		* <ul>
		* <li>return value = -1</li>
		* </ul>
		*/
		@Test
		public void testSearch_6() {
				// Arrange
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				String term = "test";
				
				// Act
				int returnValue = searchableTextPane.search(term);
				
				// Assert
				assertEquals(-1, returnValue);
		}
		
		/**
		* Test case for the {@link SearchableTextPane#search(String)} method.
		* This test case tests the method with the following parameters:
		* <ul>
		* <li>term = null</li>
		* </ul>
		* The expected result is:
		* <ul>
		* <li>return value = -1</li>
		* </ul>
		*/
		@Test
		public void testSearch_7() {
				// Arrange
				SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
				String term = null;
				
				// Act
				int returnValue = searchableTextPane.search(term);
				
				// Assert
				assertEquals(-1, returnValue);
		}
		
		/**
		