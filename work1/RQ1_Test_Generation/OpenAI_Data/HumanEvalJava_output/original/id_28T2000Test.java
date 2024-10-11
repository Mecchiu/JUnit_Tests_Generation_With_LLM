// ConcatenateTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains ten unit test cases for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {
	// Test case 1: Empty list
    @Test
    void testConcatenateEmptyList() {
        List<Object> strings = List.of();
        String result = Concatenate.concatenate(strings);
        assertEquals("", result);
    }

    // Test case 2: List with one element
    @Test
    void testConcatenateListWithOneElement() {
        List<Object> strings = List.of("a");
        String result = Concatenate.concatenate(strings);
        assertEquals("a", result);
    }

    // Test case 3: List with two elements
    @Test
    void testConcatenateListWithTwoElements() {
        List<Object> strings = List.of("a", "b");
        String result = Concatenate.concatenate(strings);
        assertEquals("ab", result);
    }

    // Test case 4: List with three elements
    @Test
    void testConcatenateListWithThreeElements() {
        List<Object> strings = List.of("a", "b", "c");
        String result = Concatenate.concatenate(strings);
        assertEquals("abc", result);
    }

    // Test case 5: List with four elements
    @Test
    void testConcatenateListWithFourElements() {
        List<Object> strings = List.of("a", "b", "c", "d");
        String result = Concatenate.concatenate(strings);
        assertEquals("abcd", result);
    }

    // Test case 6: List with five elements
    @Test
    void testConcatenateListWithFiveElements() {
        List<Object> strings = List.of("a", "b", "c", "d", "e");
        String result = Concatenate.concatenate(strings);
        assertEquals("abcde", result);
    }

    // Test case 7: List with six elements
    @Test
    void testConcatenateListWithSixElements() {
        List<Object> strings = List.of("a", "b", "c", "d", "e", "f");
        String result = Concatenate.concatenate(strings);
        assertEquals("abcdef", result);
    }

    // Test case 8: List with seven elements
    @Test
    void testConcatenateListWithSevenElements() {
        List<Object> strings = List.of("a", "b", "c", "d", "e", "f", "g");
        String result = Concatenate.concatenate(strings);
        assertEquals("abcdefg", result);
    }

    // Test case 9: List with eight elements
    @Test
    void testConcatenateListWithEightElements() {
        List<Object> strings = List.of("a", "b", "c", "d", "e", "f", "g", "h");
        String result = Concatenate.concatenate(strings);
        assertEquals("abcdefgh", result);
    }

    // Test case 10: List with nine elements
    @Test
    void testConcatenateListWithNineElements() {
        List<Object> strings = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");
        String result = Concatenate.concatenate(strings);
        assertEquals("abcdefghi", result);
    }
}
