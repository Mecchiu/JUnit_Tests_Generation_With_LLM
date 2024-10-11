// CountNums.java
package scenario3;

import java.util.List;

class CountNums {

    /**
     * * Write a function count_nums which takes an array of integers and returns
     * the number of elements which has a sum of digits > 0.
     * If a number is negative, then its first signed digit will be negative:
     * e.g. -123 has signed digits -1, 2, and 3.
     * >>> countNums([]) == 0
     * >>> countNums([-1, 11, -11]) == 1
     * >>> countNums([1, 1, 2]) == 3
     *
     * > countNums([])
     * 0
     * > countNums([-1, -2, 0])
     * 0
     * > countNums([1, 1, 2, -2, 3, 4, 5])
     * 6
     * > countNums([1, 6, 9, -6, 0, 1, 5])
     * 5
     * > countNums([1, 100, 98, -7, 1, -1])
     * 4
     * > countNums([12, 23, 34, -45, -56, 0])
     * 5
     * > countNums([0, 1])
     * 1
     * > countNums([1])
     * 1
     */
    public static int countNums(List<Integer> arr) {
        int count = 0;
        for (int num : arr) {
            int sum = 0;
            int temp = num;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (num < 0) {
                sum *= -1;
            }
            if (sum != 0) {
                count++;
            }
        }
        return count;
    }
}

// CountNumsTest.java
package scenario3;

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
    void testEmptyList() {
        List<Integer> arr = Arrays.asList();
        assertEquals(0, CountNums.countNums(arr));
    }
    
    @Test
    void testAllZeros() {
        List<Integer> arr = Arrays.asList(0, 0, 0);
        assertEquals(0, CountNums.countNums(arr));
    }
    
    @Test
    void testAllNegatives() {
        List<Integer> arr = Arrays.asList(-1, -2, -3);
        assertEquals(0, CountNums.countNums(arr));
    }
    
    @Test
    void testMixedNumbers() {
        List<Integer> arr = Arrays.asList(1, 1, 2, -2, 3, 4, 5);
        assertEquals(6, CountNums.countNums(arr));
    }
    
    @Test
    void testMixedNumbersWithZeros() {
        List<Integer> arr = Arrays.asList(1, 6, 9, -6, 0, 1, 5);
        assertEquals(5, CountNums.countNums(arr));
    }
    
    @Test
    void testMixedNumbersWithNegatives() {
        List<Integer> arr = Arrays.asList(1, 100, 98, -7, 1, -1);
        assertEquals(4, CountNums.countNums(arr));
    }
    
    @Test
    void testMixedNumbersWithNegativesAndZeros() {
        List<Integer> arr = Arrays.asList(12, 23, 34, -45, -56, 0);
        assertEquals(5, CountNums.countNums(arr));
    }
    
    @Test
    void testSinglePositiveNumber() {
        List<Integer> arr = Arrays.asList(1);
        assertEquals(1, CountNums.countNums(arr));
    }
    
    @Test
    void testSingleNegativeNumber() {
        List<Integer> arr = Arrays.asList(-1);
        assertEquals(1, CountNums.countNums(arr));
    }
    
    @Test
    void testMixedNumbersWithSingleZero() {
        List<Integer> arr = Arrays.asList(0, 1);
        assertEquals(1, CountNums.countNums(arr));
    }
}