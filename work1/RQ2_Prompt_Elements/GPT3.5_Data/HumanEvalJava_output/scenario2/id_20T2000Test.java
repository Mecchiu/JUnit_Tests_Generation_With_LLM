// FindClosestElementsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindClosestElements}.
* It contains ten unit test cases for the {@link FindClosestElements#findClosestElements(List)} method.
*/
class FindClosestElementsTest {

    @Test
    void testFindClosestElements() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(4.0, 5.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithNegativeNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(-5.0, -3.0, -1.0, 2.0, 4.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(-1.0, 2.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithDuplicateNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 2.0, 3.0, 4.0, 5.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(2.0, 2.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithTwoNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(1.0, 2.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithThreeNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(2.0, 3.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithFourNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(3.0, 4.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithFiveNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(4.0, 5.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithSixNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(5.0, 6.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithSevenNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(6.0, 7.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    @Test
    void testFindClosestElementsWithEightNumbers() {
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0));
        List<Double> expected = new ArrayList<>(Arrays.asList(7.0, 8.0));
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }
}