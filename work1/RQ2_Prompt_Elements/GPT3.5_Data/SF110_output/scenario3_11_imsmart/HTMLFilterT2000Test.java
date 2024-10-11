// Here's an example implementation of the HTMLFilter class and its test class:

// HTMLFilter.java
package com.imsmart.servlet;

public final class HTMLFilter {

    /**
     * Filter the specified message string for characters that are sensitive
     * in HTML.  This avoids potential attacks caused by including JavaScript
     * codes in the request URL that is often reported in error messages.
     *
     * @param message The message string to be filtered
     * @return The filtered message string
     */
    public static String filter(String message) {
        if (message == null) {
            return null;
        }
        StringBuilder result = new StringBuilder(message.length());
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            switch (c) {
                case '<':
                    result.append("&lt;");
                    break;
                case '>':
                    result.append("&gt;");
                    break;
                case '&':
                    result.append("&amp;");
                    break;
                case '"':
                    result.append("&quot;");
                    break;
                case '\'':
                    result.append("&#39;");
                    break;
                default:
                    result.append(c);
            }
        }
        return result.toString();
    }
}

// HTMLFilterTest.java
package com.imsmart.servlet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link HTMLFilter}.
 * It contains ten unit test cases for the {@link HTMLFilter#filter(String)} method.
 */
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
    void testSingleQuote() {
        String input = "This is ' a test message.";
        String expected = "This is &#39; a test message.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testMixedSpecialCharacters() {
        String input = "This is < & > \" ' a test message.";
        String expected = "This is &lt; &amp; &gt; &quot; &#39; a test message.";
        assertEquals(expected, HTMLFilter.filter(input));
    }

    @Test
    void testLongInput() {
        StringBuilder input = new StringBuilder();
        StringBuilder expected = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            input.append("<>&\"'");
            expected.append("&lt;&gt;&amp;&quot;&#39;");
        }
        assertEquals(expected.toString(), HTMLFilter.filter(input.toString()));
    }
}