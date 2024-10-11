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
	* It tests the case where the search term is null.
	*/
	@Test
	void testSearch_1() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = null;
		int startPos = 0;
		int expected = -1;
		int actual = searchableTextPane.search(term, startPos);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String, int)} method.
	* It tests the case where the search term is empty.
	*/
	@Test
	void testSearch_2() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "";
		int startPos = 0;
		int expected = -1;
		int actual = searchableTextPane.search(term, startPos);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String, int)} method.
	* It tests the case where the search term is not found.
	*/
	@Test
	void testSearch_3() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "not found";
		int startPos = 0;
		int expected = -1;
		int actual = searchableTextPane.search(term, startPos);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String, int)} method.
	* It tests the case where the search term is found at the beginning of the text.
	*/
	@Test
	void testSearch_4() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "found";
		int startPos = 0;
		int expected = 0;
		int actual = searchableTextPane.search(term, startPos);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String, int)} method.
	* It tests the case where the search term is found in the middle of the text.
	*/
	@Test
	void testSearch_5() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "found";
		int startPos = 5;
		int expected = 10;
		int actual = searchableTextPane.search(term, startPos);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String, int)} method.
	* It tests the case where the search term is found at the end of the text.
	*/
	@Test
	void testSearch_6() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "found";
		int startPos = 15;
		int expected = 20;
		int actual = searchableTextPane.search(term, startPos);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String, int)} method.
	* It tests the case where the search term is found at the beginning of the text.
	*/
	@Test
	void testSearch_7() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "found";
		int startPos = 0;
		int expected = 0;
		int actual = searchableTextPane.search(term, startPos);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String, int)} method.
	* It tests the case where the search term is found in the middle of the text.
	*/
	@Test
	void testSearch_8() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "found";
		int startPos = 5;
		int expected = 10;
		int actual = searchableTextPane.search(term, startPos);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String, int)} method.
	* It tests the case where the search term is found at the end of the text.
	*/
	@Test
	void testSearch_9() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "found";
		int startPos = 15;
		int expected = 20;
		int actual = searchableTextPane.search(term, startPos);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String, int)} method.
	* It tests the case where the search term is found at the beginning of the text.
	*/
	@Test
	void testSearch_10() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "found";
		int startPos = 0;
		int expected = 0;
		int actual = searchableTextPane.search(term, startPos);
		assertEquals(expected, actual);
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
* It contains ten unit test cases for the {@link SearchableTextPane#search(String)} method.
*/
class SearchableTextPane_2Test {
		
	/**
	* Test case for the {@link SearchableTextPane#search(String)} method.
	* It tests the case where the search term is null.
	*/
	@Test
	void testSearch_1() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = null;
		int expected = -1;
		int actual = searchableTextPane.search(term);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String)} method.
	* It tests the case where the search term is empty.
	*/
	@Test
	void testSearch_2() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "";
		int expected = -1;
		int actual = searchableTextPane.search(term);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String)} method.
	* It tests the case where the search term is not found.
	*/
	@Test
	void testSearch_3() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "not found";
		int expected = -1;
		int actual = searchableTextPane.search(term);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String)} method.
	* It tests the case where the search term is found at the beginning of the text.
	*/
	@Test
	void testSearch_4() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "found";
		int expected = 0;
		int actual = searchableTextPane.search(term);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String)} method.
	* It tests the case where the search term is found in the middle of the text.
	*/
	@Test
	void testSearch_5() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "found";
		int expected = 10;
		int actual = searchableTextPane.search(term);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String)} method.
	* It tests the case where the search term is found at the end of the text.
	*/
	@Test
	void testSearch_6() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "found";
		int expected = 20;
		int actual = searchableTextPane.search(term);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String)} method.
	* It tests the case where the search term is found at the beginning of the text.
	*/
	@Test
	void testSearch_7() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "found";
		int expected = 0;
		int actual = searchableTextPane.search(term);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String)} method.
	* It tests the case where the search term is found in the middle of the text.
	*/
	@Test
	void testSearch_8() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "found";
		int expected = 10;
		int actual = searchableTextPane.search(term);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String)} method.
	* It tests the case where the search term is found at the end of the text.
	*/
	@Test
	void testSearch_9() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "found";
		int expected = 20;
		int actual = searchableTextPane.search(term);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#search(String)} method.
	* It tests the case where the search term is found at the beginning of the text.
	*/
	@Test
	void testSearch_10() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "found";
		int expected = 0;
		int actual = searchableTextPane.search(term);
		assertEquals(expected, actual);
	}
	
}

// SearchableTextPane_3Test.java
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
class SearchableTextPane_3Test {
		
	/**
	* Test case for the {@link SearchableTextPane#highlight(String, int)} method.
	* It tests the case where the search term is null.
	*/
	@Test
	void testHighlight_1() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = null;
		int flags = 0;
		List<LineResult> expected = new ArrayList<LineResult>();
		List<LineResult> actual = searchableTextPane.highlight(term, flags);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#highlight(String, int)} method.
	* It tests the case where the search term is empty.
	*/
	@Test
	void testHighlight_2() {
		SearchableTextPane searchableTextPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
		String term = "";
		int flags = 0;
		List<LineResult> expected = new ArrayList<LineResult>();
		List<LineResult> actual = searchableTextPane.highlight(term, flags);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link SearchableTextPane#highlight(String, int)} method.
	* It tests the case where the search term is not found.
	*/
	@Test
	void testHighlight_3() {
		SearchableTextPane searchableText