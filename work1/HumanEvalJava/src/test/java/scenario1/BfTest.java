// BfTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains ten unit test cases for the {@link Bf#bf(String, String)} method.
*/
class BfTest {
			// Test case 1: Both planets are in the list
    @Test
    void testBf1() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("Venus");
        expected.add("Earth");
        expected.add("Mars");
        List<Object> actual = Bf.bf("Venus", "Mars");
        assertEquals(expected, actual);
    }
			// Test case 2: Both planets are not in the list
    @Test
    void testBf2() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("Pluto", "Uranus");
        assertEquals(expected, actual);
    }
			// Test case 3: One planet is in the list and the other is not
    @Test
    void testBf3() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("Earth", "Pluto");
        assertEquals(expected, actual);
    }
			// Test case 4: Both planets are the same
    @Test
    void testBf4() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("Earth", "Earth");
        assertEquals(expected, actual);
    }
			// Test case 5: One planet is null
    @Test
    void testBf5() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf(null, "Earth");
        assertEquals(expected, actual);
    }
			// Test case 6: Both planets are null
    @Test
    void testBf6() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf(null, null);
        assertEquals(expected, actual);
    }
			// Test case 7: One planet is empty
    @Test
    void testBf7() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("", "Earth");
        assertEquals(expected, actual);
    }
			// Test case 8: Both planets are empty
    @Test
    void testBf8() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = Bf.bf("", "");
        assertEquals(expected, actual);
    }
}