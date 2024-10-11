```java
import static org.junit.jupiter.api.Assertions.assertEquals;

class InspirentoUtilities_3Test {

    @Test
    void testStringReplaceAll() {
        StringBuffer source = new StringBuffer("Hello, World!");
        StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'o', "X");
        assertEquals("HellX, WXrld!", result.toString());
    }

    @Test
    void testStringReplaceAllWithEmptyString() {
        StringBuffer source = new StringBuffer("Hello, World!");
        StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'o', "");
        assertEquals("Hell, Wrld!", result.toString());
    }

    @Test
    void testStringReplaceAllWithNoMatch() {
        StringBuffer source = new StringBuffer("Hello, World!");
        StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'x', "X");
        assertEquals("Hello, World!", result.toString());
    }

    @Test
    void testStringReplaceAllWithMultipleReplacements() {
        StringBuffer source = new StringBuffer("Hello, World!");
        StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'l', "LL");
        assertEquals("HeLLo, WorLLd!", result.toString());
    }

    @Test
    void testStringReplaceAllWithSpecialCharacters() {
        StringBuffer source = new StringBuffer("Hello & World < Test >");
        StringBuffer result = InspirentoUtilities.stringReplaceAll(source, '&', "&amp;");
        result = InspirentoUtilities.stringReplaceAll(result, '<', "&lt;");
        result = InspirentoUtilities.stringReplaceAll(result, '>', "&gt;");
        assertEquals("Hello &amp; World &lt; Test &gt;", result.toString());
    }

    @Test
    void testStringReplaceAllWithEmptySource() {
        StringBuffer source = new StringBuffer("");
        StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'o', "X");
        assertEquals("", result.toString());
    }

    @Test
    void testStringReplaceAllWithEmptyReplacement() {
        StringBuffer source = new StringBuffer("Hello, World!");
        StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'o', "");
        assertEquals("Hell, Wrld!", result.toString());
    }

    @Test
    void testStringReplaceAllWithEmptySourceAndReplacement() {
        StringBuffer source = new StringBuffer("");
        StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'o', "");
        assertEquals("", result.toString());
    }

    @Test
    void testStringReplaceAllWithNullSource() {
        StringBuffer result = InspirentoUtilities.stringReplaceAll(null, 'o', "X");
        assertEquals(null, result);
    }

    @Test
    void testStringReplaceAllWithNullReplacement() {
        StringBuffer source = new StringBuffer("Hello, World!");
        StringBuffer result = InspirentoUtilities.stringReplaceAll(source, 'o', null);
        assertEquals("Hell, Wrld!", result.toString());
    }
}
```
```