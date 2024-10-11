// Here's an example implementation of the HTMLFilterTest class:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HTMLFilterTest {

    @Test
    void testNullInput() {
        assertNull(HTMLFilter.filter(null));
    }

    @Test
    void testEmptyInput() {
        assertEquals("", HTMLFilter.filter(""));
    }

    @Test
    void testNoSpecialCharacters() {
        String input = "This is a test message.";
        assertEquals(input, HTMLFilter.filter(input));
    }

    @Test
    void testLessThan() {
        String input = "This is < a test message.";
        String expected = "This is &lt; a test message.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testGreaterThan() {
        String input = "This is > a test message.";
        String expected = "This is &gt; a test message.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testAmpersand() {
        String input = "This is & a test message.";
        String expected = "This is &amp; a test message.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testDoubleQuote() {
        String input = "This is \" a test message.";
        String expected = "This is &quot; a test message.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testMultipleSpecialCharacters() {
        String input = "This is < & > \" a test message.";
        String expected = "This is &lt; &amp; &gt; &quot; a test message.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testLongInput() {
        String input = "This is a very long message that contains a lot of text and special characters such as <, >, &, and \".";
        String expected = "This is a very long message that contains a lot of text and special characters such as &lt;, &gt;, &amp;, and &quot;.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testUnicodeInput() {
        String input = "This is a test message with Unicode characters such as \u00A9 and \u00AE.";
        assertEquals(input, HTMLFilter.filter(input));
    }
}