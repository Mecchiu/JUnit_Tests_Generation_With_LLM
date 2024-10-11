// Here's the source code for the HasCloseElementsTest class:

package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link HasCloseElements}.
 * It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
 */
class HasCloseElementsTest {

    @Test
    void testNoCloseElements() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0);
        assertFalse(HasCloseElements.hasCloseElements(numbers, 0.5));
    }

    @Test
    void testCloseElementsWithinThreshold() {
        List<Double> numbers = Arrays.asList(1.0, 2.8, 3.0, 4.0, 5.0, 2.0);
        assertTrue(HasCloseElements.hasCloseElements(numbers, 0.3));
    }

    @Test
    void testCloseElementsOutsideThreshold() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        assertTrue(HasCloseElements.hasCloseElements(numbers, 0.3));
    }

    @Test
    void testNoCloseElementsWithinSmallerThreshold() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        assertFalse(HasCloseElements.hasCloseElements(numbers, 0.05));
    }

    @Test
    void testCloseElementsWithinLargerThreshold() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0);
        assertTrue(HasCloseElements.hasCloseElements(numbers, 0.95));
    }

    @Test
    void testNoCloseElementsWithinLargerThreshold() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0);
        assertFalse(HasCloseElements.hasCloseElements(numbers, 0.8));
    }

    @Test
    void testCloseElementsWithinSmallerThreshold2() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        assertTrue(HasCloseElements.hasCloseElements(numbers, 0.1));
    }

    @Test
    void testCloseElementsWithinLargerThreshold2() {
        List<Double> numbers = Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1);
        assertTrue(HasCloseElements.hasCloseElements(numbers, 1.0));
    }

    @Test
    void testNoCloseElementsWithinSmallerThreshold3() {
        List<Double> numbers = Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1);
        assertFalse(HasCloseElements.hasCloseElements(numbers, 0.5));
    }

    @Test
    void testEmptyList() {
        List<Double> numbers = Arrays.asList();
        assertFalse(HasCloseElements.hasCloseElements(numbers, 0.5));
    }
}