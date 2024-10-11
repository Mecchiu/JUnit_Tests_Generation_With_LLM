// RollingMaxTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {
			// Test case 1: Test with a list of positive integers
    @Test
    void testRollingMaxWithPositiveIntegers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    // Test case 2: Test with a list of negative integers
    @Test
    void testRollingMaxWithNegativeIntegers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(-3);
        numbers.add(-4);
        numbers.add(-5);
        List<Object> expected = new ArrayList<>();
        expected.add(-1);
        expected.add(-1);
        expected.add(-1);
        expected.add(-1);
        expected.add(-1);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    // Test case 3: Test with a list of mixed integers
    @Test
    void testRollingMaxWithMixedIntegers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(2);
        numbers.add(-3);
        numbers.add(4);
        numbers.add(-5);
        List<Object> expected = new ArrayList<>();
        expected.add(-1);
        expected.add(2);
        expected.add(2);
        expected.add(4);
        expected.add(4);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    // Test case 4: Test with a list of duplicate integers
    @Test
    void testRollingMaxWithDuplicateIntegers() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);
        expected.add(1);
        expected.add(1);
        expected.add(1);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    // Test case 5: Test with a list of one integer
    @Test
    void testRollingMaxWithOneInteger() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    // Test case 6: Test with a list of zero integers
    @Test
    void testRollingMaxWithZeroIntegers() {
        List<Object> numbers = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    // Test case 7: Test with a list of null integers
    @Test
    void testRollingMaxWithNullIntegers() {
        List<Object> numbers = null;
        assertThrows(NullPointerException.class, () -> {
            RollingMax.rollingMax(numbers);
        });
    }

    // Test case 8: Test with a list of mixed types
    @Test
    void testRollingMaxWithMixedTypes() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add("2");
        numbers.add(3);
        numbers.add("4");
        numbers.add(5);
        assertThrows(IllegalArgumentException.class, () -> {
            RollingMax.rollingMax(numbers);
        });
    }

    // Test case 9: Test with a list of null types
    @Test
    void testRollingMaxWithNullTypes() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(null);
        numbers.add(3);
        numbers.add(null);
        numbers.add(5);
        assertThrows(NullPointerException.class, () -> {
            RollingMax.rollingMax(numbers);
        });
    }

    // Test case 10: Test with a list of empty strings
    @Test
    void testRollingMaxWithEmptyStrings() {
        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add("");
        numbers.add(3);
        numbers.add("");
        numbers.add(5);
        assertThrows(NumberFormatException.class, () -> {
            RollingMax.rollingMax(numbers);
        });
    }
}