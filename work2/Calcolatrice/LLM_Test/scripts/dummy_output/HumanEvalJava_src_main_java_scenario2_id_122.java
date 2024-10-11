// AddElementsTest.java
package scenario2;

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
        int k = 5;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 2: k is greater than the size of the list
    @Test
    void testKGreaterThanListSize() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        int k = 10;
        int expected = 15;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 3: k is equal to the size of the list
    @Test
    void testKEqualToListSize() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        int k = 5;
        int expected = 15;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 4: k is less than the size of the list
    @Test
    void testKLessThanListSize() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        int k = 3;
        int expected = 6;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 5: k is equal to 0
    @Test
    void testKEqualToZero() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        int k = 0;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 6: k is negative
    @Test
    void testKNegative() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        int k = -3;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 7: List contains only one element
    @Test
    void testListContainsOneElement() {
        List<Integer> arr = List.of(5);
        int k = 1;
        int expected = 5;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 8: List contains only two elements
    @Test
    void testListContainsTwoElements() {
        List<Integer> arr = List.of(5, 10);
        int k = 2;
        int expected = 15;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 9: List contains only three elements
    @Test
    void testListContainsThreeElements() {
        List<Integer> arr = List.of(5, 10, 15);
        int k = 3;
        int expected = 30;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    // Test case 10: List contains elements with more than two digits
    @Test
    void testListContainsElementsWithMoreThanTwoDigits() {
        List<Integer> arr = List.of(5, 10, 100, 1000, 10000);
        int k = 5;
        int expected = 15;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }
}