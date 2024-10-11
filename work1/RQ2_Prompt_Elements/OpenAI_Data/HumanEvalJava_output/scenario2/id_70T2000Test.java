// StrangeSortListTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains ten unit test cases for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {
	// Test case 1: Test with empty list
    @Test
    void testEmptyList() {
        List<Object> lst = new ArrayList<Object>();
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(0, result.size());
    }

    // Test case 2: Test with list of one element
    @Test
    void testOneElementList() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0));
    }

    // Test case 3: Test with list of two elements
    @Test
    void testTwoElementsList() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(1);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(2, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
    }

    // Test case 4: Test with list of three elements
    @Test
    void testThreeElementsList() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(3);
        lst.add(2);
        lst.add(1);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(2, result.get(2));
    }

    // Test case 5: Test with list of four elements
    @Test
    void testFourElementsList() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(4);
        lst.add(3);
        lst.add(2);
        lst.add(1);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(4, result.size());
        assertEquals(1, result.get(0));
        assertEquals(4, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(3, result.get(3));
    }

    // Test case 6: Test with list of five elements
    @Test
    void testFiveElementsList() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(5);
        lst.add(4);
        lst.add(3);
        lst.add(2);
        lst.add(1);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(5, result.size());
        assertEquals(1, result.get(0));
        assertEquals(5, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(3, result.get(4));
    }

    // Test case 7: Test with list of six elements
    @Test
    void testSixElementsList() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(6);
        lst.add(5);
        lst.add(4);
        lst.add(3);
        lst.add(2);
        lst.add(1);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(6, result.size());
        assertEquals(1, result.get(0));
        assertEquals(6, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(5, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(4, result.get(5));
    }

    // Test case 8: Test with list of seven elements
    @Test
    void testSevenElementsList() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(7);
        lst.add(6);
        lst.add(5);
        lst.add(4);
        lst.add(3);
        lst.add(2);
        lst.add(1);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(7, result.size());
        assertEquals(1, result.get(0));
        assertEquals(7, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(6, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(5, result.get(5));
        assertEquals(4, result.get(6));
    }

    // Test case 9: Test with list of eight elements
    @Test
    void testEightElementsList() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(8);
        lst.add(7);
        lst.add(6);
        lst.add(5);
        lst.add(4);
        lst.add(3);
        lst.add(2);
        lst.add(1);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(8, result.size());
        assertEquals(1, result.get(0));
        assertEquals(8, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(7, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(6, result.get(5));
        assertEquals(4, result.get(6));
        assertEquals(5, result.get(7));
    }

    // Test case 10: Test with list of nine elements
    @Test
    void testNineElementsList() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(9);
        lst.add(8);
        lst.add(7);
        lst.add(6);
        lst.add(5);
        lst.add(4);
        lst.add(3);
        lst.add(2);
        lst.add(1);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(9, result.size());
        assertEquals(1, result.get(0));
        assertEquals(9, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(8, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(7, result.get(5));
        assertEquals(4, result.get(6));
        assertEquals(6, result.get(7));
        assertEquals(5, result.get(8));
    }
}
