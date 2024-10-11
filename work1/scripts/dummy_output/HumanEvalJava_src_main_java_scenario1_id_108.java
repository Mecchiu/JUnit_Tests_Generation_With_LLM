// CountNumsTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains ten unit test cases for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {
			// Test case 1: Test with an empty list
    @Test
    void testCountNumsEmptyList() {
        List<Object> arr = List.of();
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    // Test case 2: Test with a list of one element
    @Test
    void testCountNumsOneElementList() {
        List<Object> arr = List.of(0);
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    // Test case 3: Test with a list of two elements
    @Test
    void testCountNumsTwoElementsList() {
        List<Object> arr = List.of(0, 0);
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    // Test case 4: Test with a list of three elements
    @Test
    void testCountNumsThreeElementsList() {
        List<Object> arr = List.of(0, 0, 0);
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    // Test case 5: Test with a list of four elements
    @Test
    void testCountNumsFourElementsList() {
        List<Object> arr = List.of(0, 0, 0, 0);
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    // Test case 6: Test with a list of five elements
    @Test
    void testCountNumsFiveElementsList() {
        List<Object> arr = List.of(0, 0, 0, 0, 0);
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    // Test case 7: Test with a list of six elements
    @Test
    void testCountNumsSixElementsList() {
        List<Object> arr = List.of(0, 0, 0, 0, 0, 0);
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    // Test case 8: Test with a list of seven elements
    @Test
    void testCountNumsSevenElementsList() {
        List<Object> arr = List.of(0, 0, 0, 0, 0, 0, 0);
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    // Test case 9: Test with a list of eight elements
    @Test
    void testCountNumsEightElementsList() {
        List<Object> arr = List.of(0, 0, 0, 0, 0, 0, 0, 0);
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    // Test case 10: Test with a list of nine elements
    @Test
    void testCountNumsNineElementsList() {
        List<Object> arr = List.of(0, 0, 0, 0, 0, 0, 0, 0, 0);
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }
}