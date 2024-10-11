// RemoveDuplicatesTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveDuplicates}.
* It contains ten unit test cases for the {@link RemoveDuplicates#removeDuplicates(List)} method.
*/
class RemoveDuplicatesTest {
			// Test case 1: Empty list
    @Test
    void testRemoveDuplicatesEmptyList() {
        List<Object> numbers = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    // Test case 2: List with one element
    @Test
    void testRemoveDuplicatesOneElement() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    // Test case 3: List with all unique elements
    @Test
    void testRemoveDuplicatesAllUniqueElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    // Test case 4: List with all duplicate elements
    @Test
    void testRemoveDuplicatesAllDuplicateElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    // Test case 5: List with some duplicate elements
    @Test
    void testRemoveDuplicatesSomeDuplicateElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    // Test case 6: List with negative elements
    @Test
    void testRemoveDuplicatesNegativeElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(-1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-2);
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    // Test case 7: List with zero elements
    @Test
    void testRemoveDuplicatesZeroElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    // Test case 8: List with multiple types of elements
    @Test
    void testRemoveDuplicatesMultipleTypesOfElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add("a");
        numbers.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    // Test case 9: List with null elements
    @Test
    void testRemoveDuplicatesNullElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }

    // Test case 10: List with multiple types of elements and some duplicates
    @Test
    void testRemoveDuplicatesMultipleTypesOfElementsSomeDuplicates() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add("a");
        numbers.add(1);
        numbers.add("b");
        numbers.add("a");
        List<Object> expected = new ArrayList<Object>();
        expected.add("b");
        List<Object> actual = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, actual);
    }
}