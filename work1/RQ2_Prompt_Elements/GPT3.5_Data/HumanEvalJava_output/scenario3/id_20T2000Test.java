// FindClosestElements.java
package scenario3;

import java.util.Collections;
import java.util.List;

class FindClosestElements {

    /**
     * From a supplied list of numbers (of length at least two) select and return two that are the closest to each
     * other and return them in order (smaller number, larger number).
     *
     * > findClosestElements([1.0, 2.0, 3.9, 4.0, 5.0, 2.2])
     * [3.9, 4.0]
     * > findClosestElements([1.0, 2.0, 5.9, 4.0, 5.0])
     * [5.0, 5.9]
     * > findClosestElements([1.0, 2.0, 3.0, 4.0, 5.0, 2.2])
     * [2.0, 2.2]
     * > findClosestElements([1.0, 2.0, 3.0, 4.0, 5.0, 2.0])
     * [2.0, 2.0]
     * > findClosestElements([1.1, 2.2, 3.1, 4.1, 5.1])
     * [2.2, 3.1]
     */
    public static List<Double> findClosestElements(List<Double> numbers) {
        Collections.sort(numbers);
        double minDiff = Double.MAX_VALUE;
        double first = 0;
        double second = 0;
        for (int i = 0; i < numbers.size() - 1; i++) {
            double diff = numbers.get(i + 1) - numbers.get(i);
            if (diff < minDiff) {
                minDiff = diff;
                first = numbers.get(i);
                second = numbers.get(i + 1);
            }
        }
        return List.of(first, second);
    }
}

// FindClosestElementsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindClosestElements}.
* It contains ten unit test cases for the {@link FindClosestElements#findClosestElements(List)} method.
*/
class FindClosestElementsTest {

    @Test
    void testFindClosestElements1() {
        List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        List<Double> expected = List.of(3.9, 4.0);
        List<Double> actual = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testFindClosestElements2() {
        List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
        List<Double> expected = List.of(5.0, 5.9);
        List<Double> actual = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testFindClosestElements3() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.2);
        List<Double> expected = List.of(2.0, 2.2);
        List<Double> actual = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testFindClosestElements4() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        List<Double> expected = List.of(2.0, 2.0);
        List<Double> actual = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testFindClosestElements5() {
        List<Double> numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
        List<Double> expected = List.of(2.2, 3.1);
        List<Double> actual = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testFindClosestElements6() {
        List<Double> numbers = List.of(1.0, 2.0);
        List<Double> expected = List.of(1.0, 2.0);
        List<Double> actual = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testFindClosestElements7() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0);
        List<Double> expected = List.of(2.0, 3.0);
        List<Double> actual = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testFindClosestElements8() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0);
        List<Double> expected = List.of(3.0, 4.0);
        List<Double> actual = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testFindClosestElements9() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> expected = List.of(4.0, 5.0);
        List<Double> actual = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testFindClosestElements10() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        List<Double> expected = List.of(5.0, 6.0);
        List<Double> actual = FindClosestElements.findClosestElements(numbers);
        assertEquals(expected, actual);
    }
}