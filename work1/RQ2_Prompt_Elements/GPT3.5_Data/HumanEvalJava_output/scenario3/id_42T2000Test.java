// IncrList.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class IncrList {

    /**
     * Return list with elements incremented by 1.
     *
     * > incrList([1, 2, 3])
     * [2, 3, 4]
     * > incrList([5, 3, 5, 2, 3, 3, 9, 0, 123])
     * [6, 4, 6, 3, 4, 4, 10, 1, 124]
     * > incrList([])
     * []
     * > incrList([3, 2, 1])
     * [4, 3, 2]
     * > incrList([5, 2, 5, 2, 3, 3, 9, 0, 123])
     * [6, 3, 6, 3, 4, 4, 10, 1, 124]
     */
    public static List<Integer> incrList(List<Integer> l) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : l) {
            result.add(i + 1);
        }
        return result;
    }
}

// IncrListTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IncrList}.
* It contains ten unit test cases for the {@link IncrList#incrList(List)} method.
*/
class IncrListTest {
    
    @Test
    void testIncrListWithPositiveNumbers() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 3, 4));
        assertEquals(expected, IncrList.incrList(input));
    }
    
    @Test
    void testIncrListWithMixedNumbers() {
        List<Integer> input = new ArrayList<>(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123));
        List<Integer> expected = new ArrayList<>(Arrays.asList(6, 4, 6, 3, 4, 4, 10, 1, 124));
        assertEquals(expected, IncrList.incrList(input));
    }
    
    @Test
    void testIncrListWithEmptyList() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, IncrList.incrList(input));
    }
    
    @Test
    void testIncrListWithDescendingNumbers() {
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 2, 1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(4, 3, 2));
        assertEquals(expected, IncrList.incrList(input));
    }
    
    @Test
    void testIncrListWithRepeatedNumbers() {
        List<Integer> input = new ArrayList<>(Arrays.asList(5, 2, 5, 2, 3, 3, 9, 0, 123));
        List<Integer> expected = new ArrayList<>(Arrays.asList(6, 3, 6, 3, 4, 4, 10, 1, 124));
        assertEquals(expected, IncrList.incrList(input));
    }
    
    @Test
    void testIncrListWithNullList() {
        List<Integer> input = null;
        assertThrows(NullPointerException.class, () -> {
            IncrList.incrList(input);
        });
    }
    
    @Test
    void testIncrListWithMaxIntegerValue() {
        List<Integer> input = new ArrayList<>(Arrays.asList(Integer.MAX_VALUE));
        List<Integer> expected = new ArrayList<>(Arrays.asList(Integer.MIN_VALUE));
        assertEquals(expected, IncrList.incrList(input));
    }
    
    @Test
    void testIncrListWithMinIntegerValue() {
        List<Integer> input = new ArrayList<>(Arrays.asList(Integer.MIN_VALUE));
        List<Integer> expected = new ArrayList<>(Arrays.asList(Integer.MIN_VALUE + 1));
        assertEquals(expected, IncrList.incrList(input));
    }
    
    @Test
    void testIncrListWithMaxListSize() {
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            input.add(0);
        }
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            expected.add(1);
        }
        assertEquals(expected, IncrList.incrList(input));
    }
    
    @Test
    void testIncrListWithMinListSize() {
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i > Integer.MIN_VALUE; i--) {
            input.add(0);
        }
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i > Integer.MIN_VALUE; i--) {
            expected.add(1);
        }
        assertEquals(expected, IncrList.incrList(input));
    }
}