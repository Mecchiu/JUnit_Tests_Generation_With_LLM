// CountNumsTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains ten unit test cases for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {

    @Test
    void testCountNums_emptyList() {
        List<Object> arr = Arrays.asList();
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_positiveNumbers() {
        List<Object> arr = Arrays.asList(123, 456, 789);
        int expected = 3;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_negativeNumbers() {
        List<Object> arr = Arrays.asList(-123, -456, -789);
        int expected = 3;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_mixedNumbers() {
        List<Object> arr = Arrays.asList(-123, 456, -789);
        int expected = 3;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_zero() {
        List<Object> arr = Arrays.asList(0);
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_singleDigit() {
        List<Object> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int expected = 9;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_multipleDigits() {
        List<Object> arr = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);
        int expected = 9;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_negativeSingleDigit() {
        List<Object> arr = Arrays.asList(-1, -2, -3, -4, -5, -6, -7, -8, -9);
        int expected = 9;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_negativeMultipleDigits() {
        List<Object> arr = Arrays.asList(-10, -20, -30, -40, -50, -60, -70, -80, -90);
        int expected = 9;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_mixedSingleDigit() {
        List<Object> arr = Arrays.asList(-1, 2, -3, 4, -5, 6, -7, 8, -9);
        int expected = 9;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_mixedMultipleDigits() {
        List<Object> arr = Arrays.asList(-10, 20, -30, 40, -50, 60, -70, 80, -90);
        int expected = 9;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }
}