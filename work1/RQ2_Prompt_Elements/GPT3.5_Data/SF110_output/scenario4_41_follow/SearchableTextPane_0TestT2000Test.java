// SearchableTextPane_0Test.java
package ghm.follow.search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link SearchableTextPane}.
 * It contains ten unit test cases for the {@link SearchableTextPane#search(String)} method.
 */
class SearchableTextPane_0Test {

    @Test
    void testSearch_NullTerm() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        int result = pane.search(null);
        assertEquals(-1, result);
    }

    @Test
    void testSearch_EmptyTerm() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        int result = pane.search("");
        assertEquals(-1, result);
    }

    @Test
    void testSearch_TermNotFound() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        pane.setText("This is a test");
        int result = pane.search("not found");
        assertEquals(-1, result);
    }

    @Test
    void testSearch_TermFound() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        pane.setText("This is a test");
        int result = pane.search("test");
        assertEquals(10, result);
    }

    @Test
    void testSearch_TermFoundMultipleTimes() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        pane.setText("This is a test. This is another test.");
        int result = pane.search("test");
        assertEquals(10, result);
        result = pane.search("test", result + 1);
        assertEquals(28, result);
    }

    @Test
    void testSearch_TermFoundAtStart() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        pane.setText("This is a test");
        int result = pane.search("This");
        assertEquals(0, result);
    }

    @Test
    void testSearch_TermFoundAtEnd() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        pane.setText("This is a test");
        int result = pane.search("test");
        assertEquals(10, result);
    }

    @Test
    void testSearch_TermFoundWithCaseSensitive() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        pane.setText("This is a test");
        int result = pane.search("tEsT", SearchableTextPane.CASE_SENSITIVE);
        assertEquals(10, result);
    }

    @Test
    void testSearch_TermFoundWithRegularExpression() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        pane.setText("This is a test");
        int result = pane.search("t[a-z]{2}t", SearchableTextPane.USE_REGULAR_EXPRESSION);
        assertEquals(10, result);
    }

    @Test
    void testSearch_TermFoundWithCaseSensitiveAndRegularExpression() {
        SearchableTextPane pane = new SearchableTextPane(null, 0);
        pane.setText("This is a test");
        int result = pane.search("t[A-Z]{2}T", SearchableTextPane.CASE_SENSITIVE | SearchableTextPane.USE_REGULAR_EXPRESSION);
        assertEquals(10, result);
    }
}