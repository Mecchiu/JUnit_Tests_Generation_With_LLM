// SmallestChange.java
package scenario3;

import java.util.List;

class SmallestChange {

    /**
     * * Given an array arr of integers, find the minimum number of elements that
     * need to be changed to make the array palindromic. A palindromic array is an array that
     * is read the same backwards and forwards. In one change, you can change one element to any other element.
     *
     * For example:
     * smallest_change([1,2,3,5,4,7,9,6]) == 4
     * smallest_change([1, 2, 3, 4, 3, 2, 2]) == 1
     * smallest_change([1, 2, 3, 2, 1]) == 0
     *
     * > smallestChange([1, 2, 3, 5, 4, 7, 9, 6])
     * 4
     * > smallestChange([1, 2, 3, 4, 3, 2, 2])
     * 1
     * > smallestChange([1, 4, 2])
     * 1
     * > smallestChange([1, 4, 4, 2])
     * 1
     * > smallestChange([1, 2, 3, 2, 1])
     * 0
     * > smallestChange([3, 1, 1, 3])
     * 0
     * > smallestChange([1])
     * 0
     * > smallestChange([0, 1])
     * 1
     */
    public static int smallestChange(List<Integer> arr) {
        int count = 0;
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i).equals(arr.get(j))) {
                i++;
                j--;
            } else if (arr.get(i) < arr.get(j)) {
                arr.set(i + 1, arr.get(i) + arr.get(i + 1));
                i++;
                count++;
            } else {
                arr.set(j - 1, arr.get(j) + arr.get(j - 1));
                j--;
                count++;
            }
        }
        return count;
    }
}

// SmallestChangeTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains ten unit test cases for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {
    @Test
    void testSmallestChange1() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 5, 4, 7, 9, 6);
        int expected = 4;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testSmallestChange2() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 3, 2, 2);
        int expected = 1;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testSmallestChange3() {
        List<Integer> arr = Arrays.asList(1, 4, 2);
        int expected = 1;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testSmallestChange4() {
        List<Integer> arr = Arrays.asList(1, 4, 4, 2);
        int expected = 1;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testSmallestChange5() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 2, 1);
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testSmallestChange6() {
        List<Integer> arr = Arrays.asList(3, 1, 1, 3);
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testSmallestChange7() {
        List<Integer> arr = Arrays.asList(1);
        int expected = 0;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testSmallestChange8() {
        List<Integer> arr = Arrays.asList(0, 1);
        int expected = 1;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testSmallestChange9() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int expected = 9;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testSmallestChange10() {
        List<Integer> arr = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        int expected = 9;
        int actual = SmallestChange.smallestChange(arr);
        assertEquals(expected, actual);
    }
}