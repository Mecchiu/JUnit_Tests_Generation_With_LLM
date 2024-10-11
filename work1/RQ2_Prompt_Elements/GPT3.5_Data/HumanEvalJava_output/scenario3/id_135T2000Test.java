// CanArrange.java
package scenario3;

import java.util.List;

class CanArrange {

    /**
     * Create a function which returns the largest index of an element which
     * is not greater than or equal to the element immediately preceding it. If
     * no such element exists then return -1. The given array will not contain
     * duplicate values.
     *
     * Examples:
     * canArrange([1,2,4,3,5]) = 3
     * canArrange([1,2,3]) = -1
     *
     * > canArrange([1, 2, 4, 3, 5])
     * 3
     * > canArrange([1, 2, 4, 5])
     * -1
     * > canArrange([1, 4, 2, 5, 6, 7, 8, 9, 10])
     * 2
     * > canArrange([4, 8, 5, 7, 3])
     * 4
     * > canArrange([])
     * -1
     */
    public static int canArrange(List<Integer> arr) {
        if (arr.isEmpty()) {
            return -1;
        }
        int largestIndex = -1;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i - 1)) {
                largestIndex = i - 1;
            }
        }
        return largestIndex;
    }
}

// CanArrangeTest.java
package scenario3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CanArrange}.
* It contains ten unit test cases for the {@link CanArrange#canArrange(List)} method.
*/
class CanArrangeTest {
    
    @Test
    void testCanArrange1() {
        List<Integer> arr = Arrays.asList(1, 2, 4, 3, 5);
        int expected = 3;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCanArrange2() {
        List<Integer> arr = Arrays.asList(1, 2, 3);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCanArrange3() {
        List<Integer> arr = Arrays.asList(1, 2, 4, 5);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCanArrange4() {
        List<Integer> arr = Arrays.asList(1, 4, 2, 5, 6, 7, 8, 9, 10);
        int expected = 2;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCanArrange5() {
        List<Integer> arr = Arrays.asList(4, 8, 5, 7, 3);
        int expected = 4;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCanArrange6() {
        List<Integer> arr = Collections.emptyList();
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCanArrange7() {
        List<Integer> arr = Arrays.asList(1);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCanArrange8() {
        List<Integer> arr = Arrays.asList(1, 2);
        int expected = -1;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCanArrange9() {
        List<Integer> arr = Arrays.asList(2, 1);
        int expected = 0;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCanArrange10() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 2, 1);
        int expected = 2;
        int actual = CanArrange.canArrange(arr);
        assertEquals(expected, actual);
    }
}