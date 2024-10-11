// LongestTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains ten unit test cases for the {@link Longest#longest(List)} method.
*/
class LongestTest {
			// Test case 1: Test with empty list
    @Test
    void testLongestWithEmptyList() {
        List<Object> strings = List.of();
        assertNull(Longest.longest(strings));
    }

    // Test case 2: Test with list of one element
    @Test
    void testLongestWithOneElement() {
        List<Object> strings = List.of("Hello");
        assertEquals("Hello", Longest.longest(strings));
    }

    // Test case 3: Test with list of two elements
    @Test
    void testLongestWithTwoElements() {
        List<Object> strings = List.of("Hello", "World");
        assertEquals("Hello", Longest.longest(strings));
    }

    // Test case 4: Test with list of three elements
    @Test
    void testLongestWithThreeElements() {
        List<Object> strings = List.of("Hello", "World", "!");
        assertEquals("Hello", Longest.longest(strings));
    }

    // Test case 5: Test with list of four elements
    @Test
    void testLongestWithFourElements() {
        List<Object> strings = List.of("Hello", "World", "!", "Welcome");
        assertEquals("Welcome", Longest.longest(strings));
    }

    // Test case 6: Test with list of five elements
    @Test
    void testLongestWithFiveElements() {
        List<Object> strings = List.of("Hello", "World", "!", "Welcome", "to");
        assertEquals("Welcome", Longest.longest(strings));
    }

    // Test case 7: Test with list of six elements
    @Test
    void testLongestWithSixElements() {
        List<Object> strings = List.of("Hello", "World", "!", "Welcome", "to", "Java");
        assertEquals("Welcome", Longest.longest(strings));
    }

    // Test case 8: Test with list of seven elements
    @Test
    void testLongestWithSevenElements() {
        List<Object> strings = List.of("Hello", "World", "!", "Welcome", "to", "Java", "!");
        assertEquals("Welcome", Longest.longest(strings));
    }

    // Test case 9: Test with list of eight elements
    @Test
    void testLongestWithEightElements() {
        List<Object> strings = List.of("Hello", "World", "!", "Welcome", "to", "Java", "!", "!");
        assertEquals("Welcome", Longest.longest(strings));
    }

    // Test case 10: Test with list of nine elements
    @Test
    void testLongestWithNineElements() {
        List<Object> strings = List.of("Hello", "World", "!", "Welcome", "to", "Java", "!", "!", "!");
        assertEquals("Welcome", Longest.longest(strings));
    }
}