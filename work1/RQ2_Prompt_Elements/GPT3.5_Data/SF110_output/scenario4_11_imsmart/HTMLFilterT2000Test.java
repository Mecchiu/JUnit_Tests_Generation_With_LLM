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
        assertEquals("hello world", HTMLFilter.filter("hello world"));
    }

    @Test
    void testLessThan() {
        assertEquals("&lt;script&gt;", HTMLFilter.filter("<script>"));
    }

    @Test
    void testGreaterThan() {
        assertEquals("&gt;script&lt;", HTMLFilter.filter(">script<"));
    }

    @Test
    void testAmpersand() {
        assertEquals("&amp;", HTMLFilter.filter("&"));
    }

    @Test
    void testDoubleQuote() {
        assertEquals("&quot;hello world&quot;", HTMLFilter.filter("\"hello world\""));
    }

    @Test
    void testMixedInput() {
        assertEquals("&lt;script&gt;alert(&#39;hello world&#39;);&lt;/script&gt;", HTMLFilter.filter("<script>alert('hello world');</script>"));
    }

    @Test
    void testLongInput() {
        StringBuilder input = new StringBuilder();
        StringBuilder expectedOutput = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            input.append("<script>alert('hello world');</script>");
            expectedOutput.append("&lt;script&gt;alert(&#39;hello world&#39;);&lt;/script&gt;");
        }
        assertEquals(expectedOutput.toString(), HTMLFilter.filter(input.toString()));
    }

    @Test
    void testUnicodeInput() {
        assertEquals("&#x1F600;", HTMLFilter.filter("\uD83D\uDE00"));
    }
}