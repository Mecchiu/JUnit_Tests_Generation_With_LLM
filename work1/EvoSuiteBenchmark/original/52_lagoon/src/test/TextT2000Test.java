```java
class TextTest {

    @Test
    void testAsCharArrayEmptyString() {
        Text text = new Text("");
        assertArrayEquals(new char[0], text.asCharArray());
    }

    @Test
    void testAsCharArraySingleChar() {
        Text text = new Text("a");
        assertArrayEquals(new char[]{'a'}, text.asCharArray());
    }

    @Test
    void testAsCharArrayMultipleChars() {
        Text text = new Text("abc");
        assertArrayEquals(new char[]{'a', 'b', 'c'}, text.asCharArray());
    }

    @Test
    void testAsCharArrayWithSpaces() {
        Text text = new Text("  a b c  ");
        assertArrayEquals(new char[]{' ', ' ', 'a', ' ', 'b', ' ', 'c', ' ', ' '}, text.asCharArray());
    }

    @Test
    void testAsCharArrayWithSpecialChars() {
        Text text = new Text("!@#$%^&*()");
        assertArrayEquals(new char[]{'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'}, text.asCharArray());
    }

    @Test
    void testAsCharArrayWithUnicodeChars() {
        Text text = new Text("€£¥");
        assertArrayEquals(new char[]{'€', '£', '¥'}, text.asCharArray());
    }

    @Test
    void testAsCharArrayForceCopy() {
        char[] data = {'a', 'b', 'c'};
        Text text = new Text(data, 0, 3, true);
        assertArrayEquals(new char[]{'a', 'b', 'c'}, text.asCharArray());
    }

    @Test
    void testAsCharArrayNoForceCopy() {
        char[] data = {'a', 'b', 'c'};
        Text text = new Text(data, 0, 3, false);
        assertSame(data, text.asCharArray());
    }

    @Test
    void testAsCharArrayPerformance() {
        Text text = new Text("abcdefghijklmnopqrstuvwxyz");
        long startTime = System.nanoTime();
        text.asCharArray();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        assertTrue(duration < 1000000, "Performance test took too long: " + duration + " ns");
    }
}
```
```