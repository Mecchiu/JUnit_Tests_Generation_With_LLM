// HasCloseElementsTest.java
package scenario1;

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
        Double threshold = 1.0;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    // Test case 2: List with one element
    @Test
    void testOneElement() {
        List<Double> numbers = List.of(1.0);
        Double threshold = 1.0;
        assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    // Test case 3: List with two elements
    @Test
    void testTwoElements() {
        List<Double> numbers = List.of(1.0, 2.0);
        Double threshold = 1.0;
        assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    // Test case 4: List with three elements
    @Test
    void testThreeElements() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0);
        Double threshold = 1.0;
        assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    // Test case 5: List with four elements
    @Test
    void testFourElements() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0);
        Double threshold = 1.0;
        assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    // Test case 6: List with five elements
    @Test
    void testFiveElements() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        Double threshold = 1.0;
        assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    // Test case 7: List with six elements
    @Test
    void testSixElements() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        Double threshold = 1.0;
        assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    // Test case 8: List with seven elements
    @Test
    void testSevenElements() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0);
        Double threshold = 1.0;
        assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    // Test case 9: List with eight elements
    @Test
    void testEightElements() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);
        Double threshold = 1.0;
        assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
    }

    // Test case 10: List with nine elements
    @Test
    void testNineElements() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
        Double threshold = 1.0;
        assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
    }
}
