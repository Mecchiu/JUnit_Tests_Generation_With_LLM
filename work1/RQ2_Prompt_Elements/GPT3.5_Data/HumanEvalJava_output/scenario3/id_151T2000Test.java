// DoubleTheDifference.java
package scenario3;

import java.util.List;

class DoubleTheDifference {

    /**
     * Given a list of numbers, return the sum of squares of the numbers
     * in the list that are odd. Ignore numbers that are negative or not integers.
     *
     * doubleTheDifference([1, 3, 2, 0]) == 1 + 9 + 0 + 0 = 10
     * doubleTheDifference([-1, -2, 0]) == 0
     * doubleTheDifference([9, -2]) == 81
     * doubleTheDifference([0]) == 0
     *
     * If the input list is empty, return 0.
     *
     * > doubleTheDifference([])
     * 0
     * > doubleTheDifference([5, 4])
     * 25
     * > doubleTheDifference([0.1, 0.2, 0.3])
     * 0
     * > doubleTheDifference([-10, -20, -30])
     * 0
     * > doubleTheDifference([-1, -2, 8])
     * 0
     * > doubleTheDifference([0.2, 3, 5])
     * 34
     * > doubleTheDifference([-99, -97, -95, -93, -91, -89, -87, -85, -83, -81, -79, -77, -75, -73, -71, -69, -67, -65, -63, -61, -59, -57, -55, -53, -51, -49, -47, -45, -43, -41, -39, -37, -35, -33, -31, -29, -27, -25, -23, -21, -19, -17, -15, -13, -11, -9, -7, -5, -3, -1, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99])
     * 166650
     */
    public static int doubleTheDifference(List<Object> lst) {
        int sum = 0;
        for (Object obj : lst) {
            if (obj instanceof Integer) {
                int num = (int) obj;
                if (num > 0 && num % 2 != 0) {
                    sum += num * num;
                }
            }
        }
        return sum;
    }
}

// DoubleTheDifferenceTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains ten unit test cases for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {
    
    @Test
    void testEmptyList() {
        List<Object> lst = new ArrayList<>();
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }
    
    @Test
    void testOnlyNegativeNumbers() {
        List<Object> lst = Arrays.asList(-1, -2, -3);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }
    
    @Test
    void testOnlyPositiveEvenNumbers() {
        List<Object> lst = Arrays.asList(2, 4, 6);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }
    
    @Test
    void testOnlyPositiveOddNumbers() {
        List<Object> lst = Arrays.asList(1, 3, 5);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(35, result);
    }
    
    @Test
    void testMixedNumbers() {
        List<Object> lst = Arrays.asList(-1, 2, 3, 4, 5);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(34, result);
    }
    
    @Test
    void testMixedNumbersWithDecimals() {
        List<Object> lst = Arrays.asList(0.2, 3, 5);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(34, result);
    }
    
    @Test
    void testMixedNumbersWithNegativeDecimals() {
        List<Object> lst = Arrays.asList(-0.2, 3, 5);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(34, result);
    }
    
    @Test
    void testMixedNumbersWithNegativeIntegers() {
        List<Object> lst = Arrays.asList(-1, -2, 8);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }
    
    @Test
    void testMixedNumbersWithNegativeAndPositiveIntegers() {
        List<Object> lst = Arrays.asList(-1, 2, 8);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(1, result);
    }
    
    @Test
    void testLargeListOfNumbers() {
        List<Object> lst = new ArrayList<>();
        for (int i = -99; i <= 99; i++) {
            lst.add(i);
        }
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(166650, result);
    }
}