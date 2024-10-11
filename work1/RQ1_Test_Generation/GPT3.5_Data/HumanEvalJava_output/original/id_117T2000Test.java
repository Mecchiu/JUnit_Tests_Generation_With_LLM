```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SelectWordsTest {

    @Test
    void testSelectWords_Example1() {
        List<Object> expected = new ArrayList<>();
        expected.add("little");
        assertEquals(expected, SelectWords.selectWords("Mary had a little lamb", 4));
    }

    @Test
    void testSelectWords_Example2() {
        List<Object> expected = new ArrayList<>();
        expected.add("Mary");
        expected.add("lamb");
        assertEquals(expected, SelectWords.selectWords("Mary had a little lamb", 3));
    }

    @Test
    void testSelectWords_Example3() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, SelectWords.selectWords("simple white space", 2));
    }

    @Test
    void testSelectWords_Example4() {
        List<Object> expected = new ArrayList<>();
        expected.add("world");
        assertEquals(expected, SelectWords.selectWords("Hello world", 4));
    }

    @Test
    void testSelectWords_Example5() {
        List<Object> expected = new ArrayList<>();
        expected.add("Uncle");
        assertEquals(expected, SelectWords.selectWords("Uncle sam", 3));
    }

    @Test
    void testSelectWords_EmptyString() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, SelectWords.selectWords("", 4));
    }

    @Test
    void testSelectWords_SingleConsonant() {
        List<Object> expected = new ArrayList<>();
        expected.add("b");
        expected.add("c");
        expected.add("d");
        expected.add("f");
        assertEquals(expected, SelectWords.selectWords("a b c d e f", 1));
    }
}
```
