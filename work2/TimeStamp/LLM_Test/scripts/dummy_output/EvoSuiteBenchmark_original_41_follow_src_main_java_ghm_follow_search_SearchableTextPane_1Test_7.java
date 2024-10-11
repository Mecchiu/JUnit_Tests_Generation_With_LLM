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
* It contains one unit test case for the {@link SearchableTextPane#search(String, int)} method.
*/
class SearchableTextPane_1Test {
		/**
		 * Test calls search() without setting the text
		 */
		@Test
		public void searchesNothing() {
                SearchableTextPane stp = new SearchableTextPane();    // this is where the test goes

                // when there is nothing in the text area
                assertFalse(System.getProperty("user.dir").isEmpty());
				assertEquals(System.getProperty("user.dir").hashCode(), stp.getDocument().getLength());
			}
		
		/**
		 * Test calls search() with no parameter in the text area
		 */
		@Test
		public void findsOnlyText() {
                SearchableTextPane stp = new SearchableTextPane();    // this is where the test goes

                // when stp.setText("text") is called
                String expectedText = "text";
        		String actualText = stp.getText();
        		assertEquals(expectedText, actualText);
        		assertFalse(System.getProperty("user.dir").isEmpty());
				assertEquals(System.getProperty("user.dir").hashCode(), stp.getDocument().getLength());
			}
		
		/**
		 * Test calls search() with parameters
		 */
		@Test
		public void searchesAllParameters() {
                SearchableTextPane stp = new SearchableTextPane();    // this is where the test goes

                // it is possible for the search text to be set to null
                // although the test is still valid
                String expectedText = "text";
        		String actualText = stp.search("text", 0, 1);
        		assertEquals(expectedText, actualText);
        		assertFalse(System.getProperty("user.dir").isEmpty());
				assertEquals(System.getProperty("user.dir").hashCode(), stp.getDocument().getLength());
			}
		
				/**
		 * Test calls search() with parameters
		 * The test won't fail when the document or text is null
		 */
		@Test
		public void searchesAllParametersWithText() {
                SearchableTextPane stp = new SearchableTextPane();    // this is where the test goes

                // we can't use System.setProperty(...) as it will overwrite the test document
				String expectedText = "text";
				String actualText = stp.search("text", 0, 1);
        		assertEquals(expectedText, actualText);
        		assertFalse(System.getProperty("user.dir").isEmpty());
				assertEquals(System.getProperty("user.dir").hashCode(), stp.getDocument().getLength());
			}
		
		/**
		 * Test calls search() with parameters
		 * The test won't fail when the document or text is empty
		 */
		@Test
		public void searchesAllParametersWithTextAndWord() {
                SearchableTextPane stp = new SearchableTextPane();  // this is where the test goes
		
                String text = "";
                String expectedText = "";
		
		// test searches when the text is empty
		TextHighlightPainter.getInstance().setAll(text, color1, color2);
        	String actualText = stp.search("text", 0, 1);
			assertEquals(expectedText, actualText);
        	assertFalse(System.getProperty("user.dir").isEmpty());
				assertEquals(System.getProperty("user.dir").hashCode(), stp.getDocument().getLength());
		}
		
		/**
		 * Test executes the search() method
		 */
        @Test
		public void executesSearch() {
				SearchableTextPane stp = new SearchableTextPane();    // this is where the test goes

                String text = "text";
                String expectedText = "text";
		
}
}