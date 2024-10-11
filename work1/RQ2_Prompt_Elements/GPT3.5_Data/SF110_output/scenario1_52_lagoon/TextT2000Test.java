// Here's an example implementation of the TextTest class:

package nu.staldal.xtree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @Test
    void testAsCharArray() {
        Text text = new Text("Hello, world!");
        char[] expected = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        assertArrayEquals(expected, text.asCharArray());
    }

    @Test
    void testAsCharArrayEmpty() {
        Text text = new Text("");
        char[] expected = {};
        assertArrayEquals(expected, text.asCharArray());
    }

    @Test
    void testAsCharArrayWhitespace() {
        Text text = new Text("   \t\n");
        char[] expected = {' ', ' ', ' ', '\t', '\n'};
        assertArrayEquals(expected, text.asCharArray());
    }

    @Test
    void testAsCharArrayUnicode() {
        Text text = new Text("\u00E5\u00E4\u00F6");
        char[] expected = {'\u00E5', '\u00E4', '\u00F6'};
        assertArrayEquals(expected, text.asCharArray());
    }

    @Test
    void testAsCharArrayNull() {
        Text text = new Text(null);
        assertThrows(NullPointerException.class, () -> text.asCharArray());
    }

    @Test
    void testAsCharArrayImmutable() {
        Text text = new Text("Hello");
        char[] original = text.asCharArray();
        original[0] = 'X';
        assertArrayEquals(new char[]{'H', 'e', 'l', 'l', 'o'}, text.asCharArray());
    }

    @Test
    void testAsCharArrayTwice() {
        Text text = new Text("Hello");
        char[] expected = {'H', 'e', 'l', 'l', 'o'};
        assertArrayEquals(expected, text.asCharArray());
        assertArrayEquals(expected, text.asCharArray());
    }

    @Test
    void testAsCharArraySAXException() {
        Text text = new Text("Hello");
        text.setSAXException(new SAXException("Test exception"));
        assertThrows(SAXException.class, () -> text.asCharArray());
    }

    @Test
    void testAsCharArrayObtainCharArrayException() {
        Text text = new Text("Hello");
        text.setObtainCharArrayException(new RuntimeException("Test exception"));
        assertThrows(RuntimeException.class, () -> text.asCharArray());
    }

    @Test
    void testAsCharArrayObtainCharArrayTwice() {
        Text text = new Text("Hello");
        text.setObtainCharArrayCount(0);
        char[] expected = {'H', 'e', 'l', 'l', 'o'};
        assertArrayEquals(expected, text.asCharArray());
        assertArrayEquals(expected, text.asCharArray());
        assertEquals(1, text.getObtainCharArrayCount());
    }
}