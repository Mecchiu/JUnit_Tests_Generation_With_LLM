// SortArray1Test.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray1}.
* It contains ten unit test cases for the {@link SortArray1#sortArray(List)} method.
*/
class SortArray1Test {
	// Test case 1: Test with an empty list
    @Test
    void testSortArrayWithEmptyList() {
        List<Object> array = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SortArray1.sortArray(array);
        assertEquals(expected, actual);
    }

    // Test case 2: Test with a list containing one element
    @Test
    void testSortArrayWithOneElement() {
        List<Object> array = new ArrayList<>();
        array.add(1);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        List<Object> actual = SortArray1.sortArray(array);
        assertEquals(expected, actual);
    }

    // Test case 3: Test with a list containing two elements
    @Test
    void testSortArrayWithTwoElements() {
        List<Object> array = new ArrayList<>();
        array.add(2);
        array.add(1);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        List<Object> actual = SortArray1.sortArray(array);
        assertEquals(expected, actual);
    }

    // Test case 4: Test with a list containing three elements
    @Test
    void testSortArrayWithThreeElements() {
        List<Object> array = new ArrayList<>();
        array.add(2);
        array.add(1);
        array.add(3);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        List<Object> actual = SortArray1.sortArray(array);
        assertEquals(expected, actual);
    }

    // Test case 5: Test with a list containing four elements
    @Test
    void testSortArrayWithFourElements() {
        List<Object> array = new ArrayList<>();
        array.add(2);
        array.add(1);
        array.add(3);
        array.add(4);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        List<Object> actual = SortArray1.sortArray(array);
        assertEquals(expected, actual);
    }

    // Test case 6: Test with a list containing five elements
    @Test
    void testSortArrayWithFiveElements() {
        List<Object> array = new ArrayList<>();
        array.add(2);
        array.add(1);
        array.add(3);
        array.add(4);
        array.add(5);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        List<Object> actual = SortArray1.sortArray(array);
        assertEquals(expected, actual);
    }

    // Test case 7: Test with a list containing six elements
    @Test
    void testSortArrayWithSixElements() {
        List<Object> array = new ArrayList<>();
        array.add(2);
        array.add(1);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        List<Object> actual = SortArray1.sortArray(array);
        assertEquals(expected, actual);
    }

    // Test case 8: Test with a list containing seven elements
    @Test
    void testSortArrayWithSevenElements() {
        List<Object> array = new ArrayList<>();
        array.add(2);
        array.add(1);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        List<Object> actual = SortArray1.sortArray(array);
        assertEquals(expected, actual);
    }

    // Test case 9: Test with a list containing eight elements
    @Test
    void testSortArrayWithEightElements() {
        List<Object> array = new ArrayList<>();
        array.add(2);
        array.add(1);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        List<Object> actual = SortArray1.sortArray(array);
        assertEquals(expected, actual);
    }

    // Test case 10: Test with a list containing nine elements
    @Test
    void testSortArrayWithNineElements() {
        List<Object> array = new ArrayList<>();
        array.add(2);
        array.add(1);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        List<Object> actual = SortArray1.sortArray(array);
        assertEquals(expected, actual);
    }
}
