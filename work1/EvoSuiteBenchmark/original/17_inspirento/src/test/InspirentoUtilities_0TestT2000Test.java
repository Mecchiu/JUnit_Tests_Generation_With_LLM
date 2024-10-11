```java
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InspirentoUtilities_0Test {

    @Test
    void testTokenize() {
        String input = "file edit view";
        String[] expected = {"file", "edit", "view"};
        String[] result = InspirentoUtilities.tokenize(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void testTokenizeWithDelim() {
        String input = "file,edit,view";
        String delim = ",";
        String[] expected = {"file", "edit", "view"};
        String[] result = InspirentoUtilities.tokenize(input, delim);
        assertArrayEquals(expected, result);
    }

    @Test
    void testEscapeText() {
        String input = "<html>";
        String expected = "&lt;html&gt;";
        String result = InspirentoUtilities.escapeText(input);
        assertEquals(expected, result);
    }
}
```
```