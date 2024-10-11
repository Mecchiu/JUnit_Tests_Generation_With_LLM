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
	* Test case 1 for method {@link SearchableTextPane#search(String, int)}.
	*
	* @throws BadLocationException
	*/
	@Test
	void testSearch_1() throws BadLocationException {
		// Arrange
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Monospaced", Font.PLAIN, 12), 4);
		searchableTextPane.setText("This is a test");
		String term = "test";
		int startPos = 0;
		int expected = 10;
		
		// Act
		int actual = searchableTextPane.search(term, startPos);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for method {@link SearchableTextPane#search(String, int)}.
	*
	* @throws BadLocationException
	*/
	@Test
	void testSearch_2() throws BadLocationException {
		// Arrange
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Monospaced", Font.PLAIN, 12), 4);
		searchableTextPane.setText("This is a test");
		String term = "test";
		int startPos = 1;
		int expected = 10;
		
		// Act
		int actual = searchableTextPane.search(term, startPos);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for method {@link SearchableTextPane#search(String, int)}.
	*
	* @throws BadLocationException
	*/
	@Test
	void testSearch_3() throws BadLocationException {
		// Arrange
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Monospaced", Font.PLAIN, 12), 4);
		searchableTextPane.setText("This is a test");
		String term = "test";
		int startPos = 2;
		int expected = 10;
		
		// Act
		int actual = searchableTextPane.search(term, startPos);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for method {@link SearchableTextPane#search(String, int)}.
	*
	* @throws BadLocationException
	*/
	@Test
	void testSearch_4() throws BadLocationException {
		// Arrange
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Monospaced", Font.PLAIN, 12), 4);
		searchableTextPane.setText("This is a test");
		String term = "test";
		int startPos = 3;
		int expected = 10;
		
		// Act
		int actual = searchableTextPane.search(term, startPos);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for method {@link SearchableTextPane#search(String, int)}.
	*
	* @throws BadLocationException
	*/
	@Test
	void testSearch_5() throws BadLocationException {
		// Arrange
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Monospaced", Font.PLAIN, 12), 4);
		searchableTextPane.setText("This is a test");
		String term = "test";
		int startPos = 4;
		int expected = 10;
		
		// Act
		int actual = searchableTextPane.search(term, startPos);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for method {@link SearchableTextPane#search(String, int)}.
	*
	* @throws BadLocationException
	*/
	@Test
	void testSearch_6() throws BadLocationException {
		// Arrange
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Monospaced", Font.PLAIN, 12), 4);
		searchableTextPane.setText("This is a test");
		String term = "test";
		int startPos = 5;
		int expected = 10;
		
		// Act
		int actual = searchableTextPane.search(term, startPos);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for method {@link SearchableTextPane#search(String, int)}.
	*
	* @throws BadLocationException
	*/
	@Test
	void testSearch_7() throws BadLocationException {
		// Arrange
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Monospaced", Font.PLAIN, 12), 4);
		searchableTextPane.setText("This is a test");
		String term = "test";
		int startPos = 6;
		int expected = 10;
		
		// Act
		int actual = searchableTextPane.search(term, startPos);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for method {@link SearchableTextPane#search(String, int)}.
	*
	* @throws BadLocationException
	*/
	@Test
	void testSearch_8() throws BadLocationException {
		// Arrange
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Monospaced", Font.PLAIN, 12), 4);
		searchableTextPane.setText("This is a test");
		String term = "test";
		int startPos = 7;
		int expected = 10;
		
		// Act
		int actual = searchableTextPane.search(term, startPos);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for method {@link SearchableTextPane#search(String, int)}.
	*
	* @throws BadLocationException
	*/
	@Test
	void testSearch_9() throws BadLocationException {
		// Arrange
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Monospaced", Font.PLAIN, 12), 4);
		searchableTextPane.setText("This is a test");
		String term = "test";
		int startPos = 8;
		int expected = 10;
		
		// Act
		int actual = searchableTextPane.search(term, startPos);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for method {@link SearchableTextPane#search(String, int)}.
	*
	* @throws BadLocationException
	*/
	@Test
	void testSearch_10() throws BadLocationException {
		// Arrange
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Monospaced", Font.PLAIN, 12), 4);
		searchableTextPane.setText("This is a test");
		String term = "test";
		int startPos = 9;
		int expected = 10;
		
		// Act
		int actual = searchableTextPane.search(term, startPos);
		
		// Assert
		assertEquals(expected, actual);
	}
}

// SearchableTextPane_2Test.java
package ghm.follow.search;

import java.awt.