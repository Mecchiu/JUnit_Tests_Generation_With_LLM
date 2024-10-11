// Specialfilter.java
package scenario3;

import java.util.List;

class Specialfilter {

    /**
     * Write a function that takes an array of numbers as input and returns
     * the number of elements in the array that are greater than 10 and both
     * first and last digits of a number are odd (1, 3, 5, 7, 9).
     * For example:
     * specialFilter([15, -73, 14, -15]) => 1
     * specialFilter([33, -2, -3, 45, 21, 109]) => 2
     *
     * > specialfilter([5, -2, 1, -5])
     * 0
     * > specialfilter([15, -73, 14, -15])
     * 1
     * > specialfilter([33, -2, -3, 45, 21, 109])
     * 2
     * > specialfilter([43, -12, 93, 125, 121, 109])
     * 4
     * > specialfilter([71, -2, -33, 75, 21, 19])
     * 3
     * > specialfilter([1])
     * 0
     * > specialfilter([])
     * 0
     */
    public static int specialfilter(List<Integer> nums) {
        int count = 0;
        for (int num : nums) {
            if (num > 10 && isOdd(num % 10) && isOdd(getFirstDigit(num))) {
                count++;
            }
        }
        return count;
    }

    private static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    private static int getFirstDigit(int num) {
        while (num >= 10) {
            num /= 10;
        }
        return num;
    }
}

// SpecialfilterTest.java
package scenario3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Specialfilter}.
* It contains ten unit test cases for the {@link Specialfilter#specialfilter(List)} method.
*/
class SpecialfilterTest {

    @Test
    void testEmptyList() {
        List<Integer> nums = Collections.emptyList();
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }

    @Test
    void testSingleElementList() {
        List<Integer> nums = Collections.singletonList(1);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }

    @Test
    void testNoSpecialElements() {
        List<Integer> nums = Arrays.asList(5, -2, 1, -5);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }

    @Test
    void testOneSpecialElement() {
        List<Integer> nums = Arrays.asList(15, -73, 14, -15);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(1, result);
    }

    @Test
    void testTwoSpecialElements() {
        List<Integer> nums = Arrays.asList(33, -2, -3, 45, 21, 109);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(2, result);
    }

    @Test
    void testFourSpecialElements() {
        List<Integer> nums = Arrays.asList(43, -12, 93, 125, 121, 109);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(4, result);
    }

    @Test
    void testThreeSpecialElements() {
        List<Integer> nums = Arrays.asList(71, -2, -33, 75, 21, 19);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(3, result);
    }

    @Test
    void testAllSpecialElements() {
        List<Integer> nums = Arrays.asList(135, -73, 143, -157);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(4, result);
    }

    @Test
    void testAllElementsGreaterThan10() {
        List<Integer> nums = Arrays.asList(11, 12, 13, 14, 15);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(0, result);
    }

    @Test
    void testAllElementsSpecial() {
        List<Integer> nums = Arrays.asList(135, -73, 143, -157, 135, -73, 143, -157);
        int result = Specialfilter.specialfilter(nums);
        assertEquals(8, result);
    }
}