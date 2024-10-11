// UniqueDigits.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class UniqueDigits {

    /**
     * Given a list of positive integers x. return a sorted list of all
     * elements that hasn't any even digit.
     *
     * Note: Returned list should be sorted in increasing order.
     *
     * For example:
     * >>> uniqueDigits([15, 33, 1422, 1])
     * [1, 15, 33]
     * >>> uniqueDigits([152, 323, 1422, 10])
     * []
     *
     * > uniqueDigits([15, 33, 1422, 1])
     * [1, 15, 33]
     * > uniqueDigits([152, 323, 1422, 10])
     * []
     * > uniqueDigits([12345, 2033, 111, 151])
     * [111, 151]
     * > uniqueDigits([135, 103, 31])
     * [31, 135]
     */
    public static List<Integer> uniqueDigits(List<Integer> x) {
        List<Integer> result = new ArrayList<>();
        for (int num : x) {
            boolean hasEvenDigit = false;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit % 2 == 0) {
                    hasEvenDigit = true;
                    break;
                }
                temp /= 10;
            }
            if (!hasEvenDigit) {
                result.add(num);
            }
        }
        result.sort(null);
        return result;
    }
}

// UniqueDigitsTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains ten unit test cases for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {

    @Test
    void testUniqueDigits1() {
        List<Integer> input = Arrays.asList(15, 33, 1422, 1);
        List<Integer> expected = Arrays.asList(1, 15, 33);
        List<Integer> actual = UniqueDigits.uniqueDigits(input);
        assertEquals(expected, actual);
    }

    @Test
    void testUniqueDigits2() {
        List<Integer> input = Arrays.asList(152, 323, 1422, 10);
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = UniqueDigits.uniqueDigits(input);
        assertEquals(expected, actual);
    }

    @Test
    void testUniqueDigits3() {
        List<Integer> input = Arrays.asList(12345, 2033, 111, 151);
        List<Integer> expected = Arrays.asList(111, 151);
        List<Integer> actual = UniqueDigits.uniqueDigits(input);
        assertEquals(expected, actual);
    }

    @Test
    void testUniqueDigits4() {
        List<Integer> input = Arrays.asList(135, 103, 31);
        List<Integer> expected = Arrays.asList(31, 135);
        List<Integer> actual = UniqueDigits.uniqueDigits(input);
        assertEquals(expected, actual);
    }

    @Test
    void testUniqueDigits5() {
        List<Integer> input = Arrays.asList(2, 4, 6, 8);
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = UniqueDigits.uniqueDigits(input);
        assertEquals(expected, actual);
    }

    @Test
    void testUniqueDigits6() {
        List<Integer> input = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> expected = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> actual = UniqueDigits.uniqueDigits(input);
        assertEquals(expected, actual);
    }

    @Test
    void testUniqueDigits7() {
        List<Integer> input = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = UniqueDigits.uniqueDigits(input);
        assertEquals(expected, actual);
    }

    @Test
    void testUniqueDigits8() {
        List<Integer> input = Arrays.asList(11, 22, 33, 44, 55);
        List<Integer> expected = Arrays.asList(11, 33, 55);
        List<Integer> actual = UniqueDigits.uniqueDigits(input);
        assertEquals(expected, actual);
    }

    @Test
    void testUniqueDigits9() {
        List<Integer> input = Arrays.asList(123, 456, 789);
        List<Integer> expected = Arrays.asList(123, 789);
        List<Integer> actual = UniqueDigits.uniqueDigits(input);
        assertEquals(expected, actual);
    }

    @Test
    void testUniqueDigits10() {
        List<Integer> input = Arrays.asList(123456789);
        List<Integer> expected = Arrays.asList(123456789);
        List<Integer> actual = UniqueDigits.uniqueDigits(input);
        assertEquals(expected, actual);
    }
}