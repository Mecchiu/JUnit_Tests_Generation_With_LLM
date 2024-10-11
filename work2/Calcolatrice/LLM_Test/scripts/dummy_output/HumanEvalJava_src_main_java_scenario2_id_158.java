// FindMaxTest.java
package scenario2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains ten unit test cases for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {
			// Test case 1: null list
    @Test
    void testNullList() {
        assertNull(FindMax.findMax(null));
    }

    // Test case 2: empty list
    @Test
    void testEmptyList() {
        assertNull(FindMax.findMax(List.of()));
    }

    // Test case 3: one word
    @Test
    void testOneWord() {
        assertEquals("abc", FindMax.findMax(List.of("abc")));
    }

    // Test case 4: two words with same unique characters
    @Test
    void testTwoWordsSameUnique() {
        assertEquals("abc", FindMax.findMax(List.of("abc", "cba")));
    }

    // Test case 5: two words with different unique characters
    @Test
    void testTwoWordsDifferentUnique() {
        assertEquals("abc", FindMax.findMax(List.of("abc", "def")));
    }

    // Test case 6: multiple words with same unique characters
    @Test
    void testMultipleWordsSameUnique() {
        assertEquals("abc", FindMax.findMax(List.of("abc", "cba", "bca")));
    }

    // Test case 7: multiple words with different unique characters
    @Test
    void testMultipleWordsDifferentUnique() {
        assertEquals("abc", FindMax.findMax(List.of("abc", "def", "ghi")));
    }

    // Test case 8: multiple words with same unique characters and same lexicographical order
    @Test
    void testMultipleWordsSameUniqueSameLexicographicalOrder() {
        assertEquals("abc", FindMax.findMax(List.of("abc", "acb", "bac")));
    }

    // Test case 9: multiple words with different unique characters and same lexicographical order
    @Test
    void testMultipleWordsDifferentUniqueSameLexicographicalOrder() {
        assertEquals("abc", FindMax.findMax(List.of("abc", "def", "ghi", "jkl")));
    }

    // Test case 10: multiple words with different unique characters and different lexicographical order
    @Test
    void testMultipleWordsDifferentUniqueDifferentLexicographicalOrder() {
        assertEquals("abc", FindMax.findMax(List.of("abc", "def", "ghi", "jkl", "mno")));
    }
}