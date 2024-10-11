// ByLengthTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByLength}.
* It contains ten unit test cases for the {@link ByLength#byLength(List)} method.
*/
class ByLengthTest {

    @Test
    void testByLengthWithEmptyList() {
        List<Object> arr = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testByLengthWithOnlyStrings() {
        List<Object> arr = Arrays.asList("hello", "world");
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testByLengthWithOnlyIntegers() {
        List<Object> arr = Arrays.asList(3, 1, 9, 5, 2, 7, 8, 4, 6);
        List<Object> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testByLengthWithMixedTypes() {
        List<Object> arr = Arrays.asList("hello", 3, "world", 1, 9, 5, "foo", 2, 7, 8, "bar", 4, 6);
        List<Object> expected = Arrays.asList("Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One");
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testByLengthWithNegativeIntegers() {
        List<Object> arr = Arrays.asList(-3, 1, -9, 5, 2, 7, 8, -4, 6);
        List<Object> expected = Arrays.asList("Eight", "Seven", "Six", "Five", "Two", "One");
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testByLengthWithZero() {
        List<Object> arr = Arrays.asList(0);
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testByLengthWithOnlyOne() {
        List<Object> arr = Arrays.asList(1);
        List<Object> expected = Arrays.asList("One");
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testByLengthWithOnlyNine() {
        List<Object> arr = Arrays.asList(9);
        List<Object> expected = Arrays.asList("Nine");
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testByLengthWithOneAndNine() {
        List<Object> arr = Arrays.asList(1, 9);
        List<Object> expected = Arrays.asList("Nine", "One");
        assertEquals(expected, ByLength.byLength(arr));
    }

    @Test
    void testByLengthWithDuplicates() {
        List<Object> arr = Arrays.asList(3, 1, 9, 5, 2, 7, 8, 4, 6, 5, 2, 7, 8, 4, 6);
        List<Object> expected = Arrays.asList("Nine", "Eight", "Eight", "Seven", "Seven", "Six", "Six", "Five", "Five", "Four", "Four", "Three", "Two", "Two", "One");
        assertEquals(expected, ByLength.byLength(arr));
    }
}