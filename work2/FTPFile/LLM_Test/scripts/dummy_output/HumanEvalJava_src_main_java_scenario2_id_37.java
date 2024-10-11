// SortEvenTest.java
package scenario2;

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
    void testSortEvenEmptyList() {
        List<Integer> l = new ArrayList<Integer>();
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    // Test case 2: Test with a list of one element
    @Test
    void testSortEvenOneElementList() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    // Test case 3: Test with a list of two elements
    @Test
    void testSortEvenTwoElementsList() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    // Test case 4: Test with a list of three elements
    @Test
    void testSortEvenThreeElementsList() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    // Test case 5: Test with a list of four elements
    @Test
    void testSortEvenFourElementsList() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    // Test case 6: Test with a list of five elements
    @Test
    void testSortEvenFiveElementsList() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        List<Integer> l2 = SortEven.sortEven(l);
        assertEquals(l, l2);
    }

    // Test case 7: Test with a list of six elements
    @Test
    void testSortEvenSixElementsList() {
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

    // Test case 8: Test with a list of seven elements
    @Test
    void testSortEvenSevenElementsList() {
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

    // Test case 9: Test with a list of eight elements
    @Test
    void testSortEvenEightElementsList() {
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

    // Test case 10: Test with a list of nine elements
    @Test
    void testSortEvenNineElementsList() {
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