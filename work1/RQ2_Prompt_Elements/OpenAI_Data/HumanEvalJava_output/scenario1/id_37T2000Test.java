// SortEvenTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortEven}.
* It contains ten unit test cases for the {@link SortEven#sortEven(List)} method.
*/
class SortEvenTest {
	// Test case 1: Test with an empty list
    @Test
    void testSortEven1() {
        List<Integer> l = new ArrayList<Integer>();
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    // Test case 2: Test with a list containing one element
    @Test
    void testSortEven2() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    // Test case 3: Test with a list containing two elements
    @Test
    void testSortEven3() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    // Test case 4: Test with a list containing three elements
    @Test
    void testSortEven4() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    // Test case 5: Test with a list containing four elements
    @Test
    void testSortEven5() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    // Test case 6: Test with a list containing five elements
    @Test
    void testSortEven6() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    // Test case 7: Test with a list containing six elements
    @Test
    void testSortEven7() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    // Test case 8: Test with a list containing seven elements
    @Test
    void testSortEven8() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    // Test case 9: Test with a list containing eight elements
    @Test
    void testSortEven9() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    // Test case 10: Test with a list containing nine elements
    @Test
    void testSortEven10() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }
}
