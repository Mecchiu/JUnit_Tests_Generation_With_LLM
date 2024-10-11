// HasCloseElementsTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {
	// Test case 1: Empty list
    @Test
    void testEmptyList() {
        List<Double> numbers = List.of();
        Double threshold = 0.5;
        Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
        assertFalse(result);
    }

    // Test case 2: List with one element
    @Test
    void testOneElement() {
        List<Double> numbers = List.of(1.0);
        Double threshold = 0.5;
        Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
        assertFalse(result);
    }

    // Test case 3: List with two elements
    @Test
    void testTwoElements() {
        List<Double> numbers = List.of(1.0, 2.0);
        Double threshold = 0.5;
        Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
        assertFalse(result);
    }

    // Test case 4: List with three elements, no close elements
    @Test
    void testThreeElementsNoClose() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0);
        Double threshold = 0.5;
        Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
        assertFalse(result);
    }

    // Test case 5: List with three elements, two close elements
    @Test
    void testThreeElementsTwoClose() {
        List<Double> numbers = List.of(1.0, 2.8, 3.0);
        Double threshold = 0.3;
        Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
        assertTrue(result);
    }

    // Test case 6: List with six elements, two close elements
    @Test
    void testSixElementsTwoClose() {
        List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        Double threshold = 0.3;
        Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
        assertTrue(result);
    }

    // Test case 7: List with six elements, no close elements
    @Test
    void testSixElementsNoClose() {
        List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        Double threshold = 0.05;
        Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
        assertFalse(result);
    }

    // Test case 8: List with five elements, two close elements
    @Test
    void testFiveElementsTwoClose() {
        List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
        Double threshold = 0.95;
        Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
        assertTrue(result);
    }

    // Test case 9: List with five elements, no close elements
    @Test
    void testFiveElementsNoClose() {
        List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
        Double threshold = 0.8;
        Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
        assertFalse(result);
    }

    // Test case 10: List with six elements, two close elements
    @Test
    void testSixElementsTwoClose2() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        Double threshold = 0.1;
        Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
        assertTrue(result);
    }

    // Test case 11: List with five elements, two close elements
    @Test
    void testFiveElementsTwoClose2() {
        List<Double> numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
        Double threshold = 1.0;
        Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
        assertTrue(result);
    }

    // Test case 12: List with five elements, no close elements
    @Test
    void testFiveElementsNoClose2() {
        List<Double> numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
        Double threshold = 0.5;
        Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
        assertFalse(result);
    }
}
