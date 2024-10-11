Here's an example implementation of the `Wildcard_2Test` class:

```
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Wildcard_2Test {

    @Test
    void testInstantiateWildcard() {
        String pattern = "file*.txt";
        String part = "123";
        String expected = "file123.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcardWithEmptyPart() {
        String pattern = "file*.txt";
        String part = "";
        String expected = "file.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcardWithMultipleWildcards() {
        String pattern = "file*_*123*.txt";
        String part = "abc";
        String expected = "fileabc_123.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcardWithNoWildcard() {
        String pattern = "file.txt";
        String part = "123";
        String expected = "file.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcardWithMultipleParts() {
        String pattern = "file*.txt";
        String part = "abc;123";
        String expected = "fileabc.txt;file123.txt";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcardWithMultiplePatterns() {
        String pattern = "file*.txt;*.xml";
        String part = "123";
        String expected = "file123.txt;123.xml";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcardWithNullPattern() {
        String pattern = null;
        String part = "123";
        String expected = null;
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcardWithNullPart() {
        String pattern = "file*.txt";
        String part = null;
        String expected = null;
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcardWithEmptyPattern() {
        String pattern = "";
        String part = "123";
        String expected = "";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcardWithEmptyPatternAndPart() {
        String pattern = "";
        String part = "";
        String expected = "";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }
}
```

This class contains ten test cases for the `instantiateWildcard` method of the `Wildcard` class. Each test case tests a different scenario, such as when the pattern contains no wildcard, when the part is empty, or when there are multiple patterns separated by a semicolon. The `assertEquals` method is used to compare the expected result with the actual result.