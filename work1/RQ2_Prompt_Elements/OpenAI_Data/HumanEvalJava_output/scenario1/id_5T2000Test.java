// IntersperseTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersperse}.
* It contains ten unit test cases for the {@link Intersperse#intersperse(List, int)} method.
*/
class IntersperseTest {
	// Test case 1: Test with empty list
    @Test
    void testIntersperseWithEmptyList() {
        List<Object> numbers = new ArrayList<Object>();
        List<Object> result = Intersperse.intersperse(numbers, 0);
        assertEquals(0, result.size());
    }

    // Test case 2: Test with list of one element
    @Test
    void testIntersperseWithListOfOneElement() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        List<Object> result = Intersperse.intersperse(numbers, 0);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0));
    }

    // Test case 3: Test with list of two elements
    @Test
    void testIntersperseWithListOfTwoElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        List<Object> result = Intersperse.intersperse(numbers, 0);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
        assertEquals(2, result.get(2));
    }

    // Test case 4: Test with list of three elements
    @Test
    void testIntersperseWithListOfThreeElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        List<Object> result = Intersperse.intersperse(numbers, 0);
        assertEquals(5, result.size());
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(0, result.get(3));
        assertEquals(3, result.get(4));
    }

    // Test case 5: Test with list of four elements
    @Test
    void testIntersperseWithListOfFourElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        List<Object> result = Intersperse.intersperse(numbers, 0);
        assertEquals(7, result.size());
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(0, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(0, result.get(5));
        assertEquals(4, result.get(6));
    }

    // Test case 6: Test with list of five elements
    @Test
    void testIntersperseWithListOfFiveElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> result = Intersperse.intersperse(numbers, 0);
        assertEquals(9, result.size());
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(0, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(0, result.get(5));
        assertEquals(4, result.get(6));
        assertEquals(0, result.get(7));
        assertEquals(5, result.get(8));
    }

    // Test case 7: Test with list of six elements
    @Test
    void testIntersperseWithListOfSixElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        List<Object> result = Intersperse.intersperse(numbers, 0);
        assertEquals(11, result.size());
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(0, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(0, result.get(5));
        assertEquals(4, result.get(6));
        assertEquals(0, result.get(7));
        assertEquals(5, result.get(8));
        assertEquals(0, result.get(9));
        assertEquals(6, result.get(10));
    }

    // Test case 8: Test with list of seven elements
    @Test
    void testIntersperseWithListOfSevenElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        List<Object> result = Intersperse.intersperse(numbers, 0);
        assertEquals(13, result.size());
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(0, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(0, result.get(5));
        assertEquals(4, result.get(6));
        assertEquals(0, result.get(7));
        assertEquals(5, result.get(8));
        assertEquals(0, result.get(9));
        assertEquals(6, result.get(10));
        assertEquals(0, result.get(11));
        assertEquals(7, result.get(12));
    }

    // Test case 9: Test with list of eight elements
    @Test
    void testIntersperseWithListOfEightElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        List<Object> result = Intersperse.intersperse(numbers, 0);
        assertEquals(15, result.size());
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(0, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(0, result.get(5));
        assertEquals(4, result.get(6));
        assertEquals(0, result.get(7));
        assertEquals(5, result.get(8));
        assertEquals(0, result.get(9));
        assertEquals(6, result.get(10));
        assertEquals(0, result.get(11));
        assertEquals(7, result.get(12));
        assertEquals(0, result.get(13));
        assertEquals(8, result.get(14));
    }

    // Test case 10: Test with list of nine elements
    @Test
    void testIntersperseWithListOfNineElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        List<Object> result = Intersperse.intersperse(numbers, 0);
        assertEquals(17, result.size());
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(0, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(0, result.get(5));
        assertEquals(4, result.get(6));
        assertEquals(0, result.get(7));
        assertEquals(5, result.get(8));
        assertEquals(0, result.get(9));
        assertEquals(6, result.get(10));
        assertEquals(0, result.get(11));
        assertEquals(7, result.get(12));
        assertEquals(0, result.get(13));
        assertEquals(8, result.get(14));
        assertEquals(0, result.get(15));
        assertEquals(9, result.get(16));
    }
}
