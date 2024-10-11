// Here's an example implementation of the TextTest class:

class TextTest {

    @Test
    void testAsCharArray() {
        // Test case 1: Empty text node
        Text text = new Text("");
        assertArrayEquals(new char[0], text.asCharArray());

        // Test case 2: Text node with one character
        text = new Text("a");
        assertArrayEquals(new char[]{'a'}, text.asCharArray());

        // Test case 3: Text node with multiple characters
        text = new Text("hello");
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, text.asCharArray());

        // Test case 4: Text node with whitespace characters
        text = new Text("  \t\n");
        assertArrayEquals(new char[]{' ', ' ', '\t', '\n'}, text.asCharArray());

        // Test case 5: Text node with special characters
        text = new Text("<>&\"'");
        assertArrayEquals(new char[]{'<', '>', '&', '"', '\''}, text.asCharArray());

        // Test case 6: Text node with surrogate pairs
        text = new Text("\uD83D\uDE00\uD83D\uDE01");
        assertArrayEquals(new char[]{'\uD83D', '\uDE00', '\uD83D', '\uDE01'}, text.asCharArray());

        // Test case 7: Text node with cached char array
        text = new Text("cached");
        text.obtainCharArray();
        assertArrayEquals(new char[]{'c', 'a', 'c', 'h', 'e', 'd'}, text.asCharArray());

        // Test case 8: Text node with non-cached char array
        text = new Text(new char[]{'n', 'o', 'n', '-', 'c', 'a', 'c', 'h', 'e', 'd'});
        assertArrayEquals(new char[]{'n', 'o', 'n', '-', 'c', 'a', 'c', 'h', 'e', 'd'}, text.asCharArray());

        // Test case 9: Text node with forceCopy=false
        char[] data = new char[]{'f', 'o', 'r', 'c', 'e', 'C', 'o', 'p', 'y'};
        text = new Text(data, 0, data.length, false);
        assertSame(data, text.asCharArray());

        // Test case 10: Text node with forceCopy=true
        data = new char[]{'f', 'o', 'r', 'c', 'e', 'C', 'o', 'p', 'y'};
        text = new Text(data, 0, data.length, true);
        assertNotSame(data, text.asCharArray());
        assertArrayEquals(data, text.asCharArray());
    }
}