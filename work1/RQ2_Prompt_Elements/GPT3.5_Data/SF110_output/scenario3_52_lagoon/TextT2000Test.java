// Here's an example implementation of the TextTest class:

package nu.staldal.xtree;

import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Text}.
 * It contains ten unit test cases for the {@link Text#asCharArray()} method.
 */
class TextTest {

    @Test
    void testEmptyText() {
        Text text = new Text("");
        char[] expected = {};
        assertArrayEquals(expected, text.asCharArray());
    }

    @Test
    void testSingleCharText() {
        Text text = new Text("a");
        char[] expected = {'a'};
        assertArrayEquals(expected, text.asCharArray());
    }

    @Test
    void testMultiCharText() {
        Text text = new Text("hello world");
        char[] expected = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        assertArrayEquals(expected, text.asCharArray());
    }

    @Test
    void testTextWithWhitespace() {
        Text text = new Text("  \t\n  ");
        char[] expected = {' ', ' ', '\t', '\n', ' ', ' '};
        assertArrayEquals(expected, text.asCharArray());
    }

    @Test
    void testTextWithSpecialChars() {
        Text text = new Text("<>&\"'");
        char[] expected = {'<', '>', '&', '"', '\''};
        assertArrayEquals(expected, text.asCharArray());
    }

    @Test
    void testTextWithUnicodeChars() {
        Text text = new Text("\u00E5\u00E4\u00F6");
        char[] expected = {'\u00E5', '\u00E4', '\u00F6'};
        assertArrayEquals(expected, text.asCharArray());
    }

    @Test
    void testTextWithNullChar() {
        Text text = new Text("hello\u0000world");
        char[] expected = {'h', 'e', 'l', 'l', 'o', '\u0000', 'w', 'o', 'r', 'l', 'd'};
        assertArrayEquals(expected, text.asCharArray());
    }

    @Test
    void testTextWithSurrogatePair() {
        Text text = new Text("\uD83D\uDE00");
        char[] expected = {'\uD83D', '\uDE00'};
        assertArrayEquals(expected, text.asCharArray());
    }

    @Test
    void testTextWithLineSeparator() {
        Text text = new Text("hello\nworld");
        char[] expected = {'h', 'e', 'l', 'l', 'o', '\n', 'w', 'o', 'r', 'l', 'd'};
        assertArrayEquals(expected, text.asCharArray());
    }

    @Test
    void testTextWithCarriageReturn() {
        Text text = new Text("hello\rworld");
        char[] expected = {'h', 'e', 'l', 'l', 'o', '\r', 'w', 'o', 'r', 'l', 'd'};
        assertArrayEquals(expected, text.asCharArray());
    }
}