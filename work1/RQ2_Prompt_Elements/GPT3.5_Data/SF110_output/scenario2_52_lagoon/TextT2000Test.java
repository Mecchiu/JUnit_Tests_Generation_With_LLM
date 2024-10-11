// TextTest.java
package nu.staldal.xtree;

import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Text}.
* It contains ten unit test cases for the {@link Text#asCharArray()} method.
*/
class TextTest {
    
    /**
     * Test case for empty character content.
     */
    @Test
    void testEmptyContent() {
        Text text = new Text("");
        char[] expected = {};
        assertArrayEquals(expected, text.asCharArray());
    }
    
    /**
     * Test case for single character content.
     */
    @Test
    void testSingleCharacterContent() {
        Text text = new Text("a");
        char[] expected = {'a'};
        assertArrayEquals(expected, text.asCharArray());
    }
    
    /**
     * Test case for multiple character content.
     */
    @Test
    void testMultipleCharacterContent() {
        Text text = new Text("abc");
        char[] expected = {'a', 'b', 'c'};
        assertArrayEquals(expected, text.asCharArray());
    }
    
    /**
     * Test case for character content with whitespace.
     */
    @Test
    void testWhitespaceContent() {
        Text text = new Text("   ");
        char[] expected = {' ', ' ', ' '};
        assertArrayEquals(expected, text.asCharArray());
    }
    
    /**
     * Test case for character content with special characters.
     */
    @Test
    void testSpecialCharacterContent() {
        Text text = new Text("&lt;&gt;&amp;");
        char[] expected = {'<', '>', '&'};
        assertArrayEquals(expected, text.asCharArray());
    }
    
    /**
     * Test case for character content with non-ASCII characters.
     */
    @Test
    void testNonAsciiContent() {
        Text text = new Text("åäö");
        char[] expected = {'å', 'ä', 'ö'};
        assertArrayEquals(expected, text.asCharArray());
    }
    
    /**
     * Test case for character content with surrogate pairs.
     */
    @Test
    void testSurrogatePairContent() {
        Text text = new Text("\uD83D\uDE00");
        char[] expected = {'\uD83D', '\uDE00'};
        assertArrayEquals(expected, text.asCharArray());
    }
    
    /**
     * Test case for character content with line breaks.
     */
    @Test
    void testLineBreakContent() {
        Text text = new Text("line\nbreak");
        char[] expected = {'l', 'i', 'n', 'e', '\n', 'b', 'r', 'e', 'a', 'k'};
        assertArrayEquals(expected, text.asCharArray());
    }
    
    /**
     * Test case for character content with carriage return.
     */
    @Test
    void testCarriageReturnContent() {
        Text text = new Text("carriage\rreturn");
        char[] expected = {'c', 'a', 'r', 'r', 'i', 'a', 'g', 'e', '\r', 'r', 'e', 't', 'u', 'r', 'n'};
        assertArrayEquals(expected, text.asCharArray());
    }
    
    /**
     * Test case for character content with tab.
     */
    @Test
    void testTabContent() {
        Text text = new Text("tab\ttab");
        char[] expected = {'t', 'a', 'b', '\t', 't', 'a', 'b'};
        assertArrayEquals(expected, text.asCharArray());
    }
}