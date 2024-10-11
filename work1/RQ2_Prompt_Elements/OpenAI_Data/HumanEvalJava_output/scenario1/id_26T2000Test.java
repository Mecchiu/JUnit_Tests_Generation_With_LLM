// RemoveDuplicatesTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveDuplicates}.
* It contains ten unit test cases for the {@link RemoveDuplicates#removeDuplicates(List)} method.
*/
class RemoveDuplicatesTest {
	// Test case 1: Test with an empty list
    @Test
    void testRemoveDuplicatesWithEmptyList() {
        List<Object> numbers = new ArrayList<Object>();
        List<Object> result = RemoveDuplicates.removeDuplicates(numbers);
        assertTrue(result.isEmpty());
    }

    // Test case 2: Test with a list containing one element
    @Test
    void testRemoveDuplicatesWithOneElementList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        List<Object> result = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0));
    }

    // Test case 3: Test with a list containing two different elements
    @Test
    void testRemoveDuplicatesWithTwoDifferentElementsList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        List<Object> result = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(2, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
    }

    // Test case 4: Test with a list containing two equal elements
    @Test
    void testRemoveDuplicatesWithTwoEqualElementsList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(1);
        List<Object> result = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(0, result.size());
    }

    // Test case 5: Test with a list containing three different elements
    @Test
    void testRemoveDuplicatesWithThreeDifferentElementsList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        List<Object> result = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }

    // Test case 6: Test with a list containing three equal elements
    @Test
    void testRemoveDuplicatesWithThreeEqualElementsList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        List<Object> result = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(0, result.size());
    }

    // Test case 7: Test with a list containing three different elements and one duplicate
    @Test
    void testRemoveDuplicatesWithThreeDifferentElementsAndOneDuplicateList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        List<Object> result = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(2, result.size());
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
    }

    // Test case 8: Test with a list containing three different elements and two duplicates
    @Test
    void testRemoveDuplicatesWithThreeDifferentElementsAndTwoDuplicatesList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        List<Object> result = RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(1, result.size());
        assertEquals(3, result.get(0));
    }

    // Test case 9: Test with a list containing three different elements and three duplicates
    @Test
    void testRemoveDuplicatesWithThreeDifferentElementsAndThreeDuplicatesList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        List<Object> result = RemoveDuplicates.removeDuplicates(numbers);
        assertTrue(result.isEmpty());
    }

    // Test case 10: Test with a list containing three different elements and four duplicates
    @Test
    void testRemoveDuplicatesWithThreeDifferentElementsAndFourDuplicatesList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        List<Object> result = RemoveDuplicates.removeDuplicates(numbers);
        assertTrue(result.isEmpty());
    }
}
