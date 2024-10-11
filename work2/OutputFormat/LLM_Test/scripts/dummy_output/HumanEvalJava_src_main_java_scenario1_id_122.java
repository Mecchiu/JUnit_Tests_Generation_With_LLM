// AddElementsTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {
			// Test case 1: Empty list
    @Test
    void testEmptyList() {
        List<Integer> arr = List.of();
        int k = 3;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 2: List with one element
    @Test
    void testOneElement() {
        List<Integer> arr = List.of(5);
        int k = 1;
        int expected = 5;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 3: List with all elements less than 100
    @Test
    void testAllElementsLessThan100() {
        List<Integer> arr = List.of(10, 20, 30, 40, 50);
        int k = 5;
        int expected = 150;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 4: List with all elements greater than or equal to 100
    @Test
    void testAllElementsGreaterThanOrEqualTo100() {
        List<Integer> arr = List.of(100, 200, 300, 400, 500);
        int k = 5;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 5: List with some elements less than 100
    @Test
    void testSomeElementsLessThan100() {
        List<Integer> arr = List.of(10, 20, 100, 40, 50);
        int k = 5;
        int expected = 120;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 6: List with some elements greater than or equal to 100
    @Test
    void testSomeElementsGreaterThanOrEqualTo100() {
        List<Integer> arr = List.of(100, 200, 300, 400, 50);
        int k = 5;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 7: List with k greater than list size
    @Test
    void testKGreaterThanListSize() {
        List<Integer> arr = List.of(10, 20, 30, 40, 50);
        int k = 6;
        int expected = 150;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 8: List with k less than list size
    @Test
    void testKLessThanListSize() {
        List<Integer> arr = List.of(10, 20, 30, 40, 50);
        int k = 3;
        int expected = 60;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 9: List with k equal to list size
    @Test
    void testKEqualToListSize() {
        List<Integer> arr = List.of(10, 20, 30, 40, 50);
        int k = 5;
        int expected = 150;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 10: List with negative elements
    @Test
    void testNegativeElements() {
        List<Integer> arr = List.of(-10, -20, -30, -40, -50);
        int k = 5;
        int expected = -150;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }
}