// AddElements.java
package scenario3;

import java.util.List;

class AddElements {

    /**
     * * Given a non-empty array of integers arr and an integer k, return
     * the sum of the elements with at most two digits from the first k elements of arr.
     *
     * Example:
     *
     * Input: arr = [111,21,3,4000,5,6,7,8,9], k = 4
     * Output: 24 # sum of 21 + 3
     *
     * Constraints:
     * 1. 1 <= len(arr) <= 100
     * 2. 1 <= k <= len(arr)
     *
     * > addElements([1, -2, -3, 41, 57, 76, 87, 88, 99], 3)
     * -4
     * > addElements([111, 121, 3, 4000, 5, 6], 2)
     * 0
     * > addElements([11, 21, 3, 90, 5, 6, 7, 8, 9], 4)
     * 125
     * > addElements([111, 21, 3, 4000, 5, 6, 7, 8, 9], 4)
     * 24
     * > addElements([1], 1)
     * 1
     */
    public static int addElements(List<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k && i < arr.size(); i++) {
            int num = arr.get(i);
            if (num >= 10 && num <= 99 || num <= -10 && num >= -99) {
                sum += num;
            }
        }
        return sum;
    }
}

// AddElementsTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {

    @Test
    void testAddElements1() {
        List<Integer> arr = Arrays.asList(1, -2, -3, 41, 57, 76, 87, 88, 99);
        int k = 3;
        int expected = -4;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElements2() {
        List<Integer> arr = Arrays.asList(111, 121, 3, 4000, 5, 6);
        int k = 2;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElements3() {
        List<Integer> arr = Arrays.asList(11, 21, 3, 90, 5, 6, 7, 8, 9);
        int k = 4;
        int expected = 125;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElements4() {
        List<Integer> arr = Arrays.asList(111, 21, 3, 4000, 5, 6, 7, 8, 9);
        int k = 4;
        int expected = 24;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElements5() {
        List<Integer> arr = Arrays.asList(1);
        int k = 1;
        int expected = 1;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElements6() {
        List<Integer> arr = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);
        int k = 9;
        int expected = 450;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElements7() {
        List<Integer> arr = Arrays.asList(-10, -20, -30, -40, -50, -60, -70, -80, -90);
        int k = 9;
        int expected = -450;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElements8() {
        List<Integer> arr = Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800, 900);
        int k = 9;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElements9() {
        List<Integer> arr = Arrays.asList(-100, -200, -300, -400, -500, -600, -700, -800, -900);
        int k = 9;
        int expected = 0;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    void testAddElements10() {
        List<Integer> arr = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);
        int k = 5;
        int expected = 50;
        int actual = AddElements.addElements(arr, k);
        assertEquals(expected, actual);
    }
}