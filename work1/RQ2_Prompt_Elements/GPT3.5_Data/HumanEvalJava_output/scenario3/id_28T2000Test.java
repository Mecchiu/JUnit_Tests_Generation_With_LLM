// Concatenate.java
package scenario3;

import java.util.List;

class Concatenate {

    /**
     * Concatenate list of strings into a single string
     *
     * > concatenate([])
     * ""
     * > concatenate(["a", "b", "c"])
     * "abc"
     * > concatenate([])
     * ""
     * > concatenate(["x", "y", "z"])
     * "xyz"
     * > concatenate(["x", "y", "z", "w", "k"])
     * "xyzwk"
     */
    public static String concatenate(List<String> strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }
}

// ConcatenateTest.java
package scenario3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains ten unit test cases for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {

    @Test
    void testEmptyList() {
        List<String> strings = Collections.emptyList();
        String result = Concatenate.concatenate(strings);
        assertEquals("", result);
    }

    @Test
    void testSingleElementList() {
        List<String> strings = Collections.singletonList("a");
        String result = Concatenate.concatenate(strings);
        assertEquals("a", result);
    }

    @Test
    void testMultipleElementList() {
        List<String> strings = Arrays.asList("a", "b", "c");
        String result = Concatenate.concatenate(strings);
        assertEquals("abc", result);
    }

    @Test
    void testListWithNullElement() {
        List<String> strings = Arrays.asList("a", null, "c");
        String result = Concatenate.concatenate(strings);
        assertNull(result);
    }

    @Test
    void testListWithEmptyStringElement() {
        List<String> strings = Arrays.asList("a", "", "c");
        String result = Concatenate.concatenate(strings);
        assertEquals("ac", result);
    }

    @Test
    void testListWithWhitespaceStringElement() {
        List<String> strings = Arrays.asList("a", " ", "c");
        String result = Concatenate.concatenate(strings);
        assertEquals("a c", result);
    }

    @Test
    void testListWithNumbers() {
        List<String> strings = Arrays.asList("1", "2", "3");
        String result = Concatenate.concatenate(strings);
        assertEquals("123", result);
    }

    @Test
    void testListWithSpecialCharacters() {
        List<String> strings = Arrays.asList("!", "@", "#");
        String result = Concatenate.concatenate(strings);
        assertEquals("!@#", result);
    }

    @Test
    void testListWithMixedTypes() {
        List<String> strings = Arrays.asList("a", "1", "!", null);
        String result = Concatenate.concatenate(strings);
        assertNull(result);
    }

    @Test
    void testListWithLargeNumberOfElements() {
        List<String> strings = Collections.nCopies(100000, "a");
        String result = Concatenate.concatenate(strings);
        assertEquals(100000, result.length());
    }
}