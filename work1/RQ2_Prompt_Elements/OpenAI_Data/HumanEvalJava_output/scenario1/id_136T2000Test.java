// LargestSmallestIntegersTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains ten unit test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {
	// Test case 1: List contains only negative numbers
    @Test
    void testLargestSmallestIntegers1() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-1);
        lst.add(-2);
        lst.add(-3);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(-1, result.get(0));
        assertEquals(null, result.get(1));
    }
		// Test case 2: List contains only positive numbers
    @Test
    void testLargestSmallestIntegers2() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(null, result.get(0));
        assertEquals(1, result.get(1));
    }
		// Test case 3: List contains both positive and negative numbers
    @Test
    void testLargestSmallestIntegers3() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-1);
        lst.add(2);
        lst.add(-3);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(-1, result.get(0));
        assertEquals(2, result.get(1));
    }
		// Test case 4: List contains only one negative number
    @Test
    void testLargestSmallestIntegers4() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-1);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(-1, result.get(0));
        assertEquals(null, result.get(1));
    }
		// Test case 5: List contains only one positive number
    @Test
    void testLargestSmallestIntegers5() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(null, result.get(0));
        assertEquals(1, result.get(1));
    }
		// Test case 6: List contains only one zero
    @Test
    void testLargestSmallestIntegers6() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(0);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(null, result.get(0));
        assertEquals(null, result.get(1));
    }
		// Test case 7: List contains only two negative numbers
    @Test
    void testLargestSmallestIntegers7() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-1);
        lst.add(-2);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(-1, result.get(0));
        assertEquals(null, result.get(1));
    }
		// Test case 8: List contains only two positive numbers
    @Test
    void testLargestSmallestIntegers8() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(null, result.get(0));
        assertEquals(1, result.get(1));
    }
		// Test case 9: List contains only two zeros
    @Test
    void testLargestSmallestIntegers9() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(0);
        lst.add(0);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(null, result.get(0));
        assertEquals(null, result.get(1));
    }
		// Test case 10: List contains only one null
    @Test
    void testLargestSmallestIntegers10() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(null);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(null, result.get(0));
        assertEquals(null, result.get(1));
    }
}
