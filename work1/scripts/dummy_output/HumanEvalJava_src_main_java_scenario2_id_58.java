// CommonTest.java
package scenario2;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains ten unit test cases for the {@link Common#common(List, List)} method.
*/
class CommonTest {
			// Test case 1: Test with two empty lists
    @Test
    void testCommonWithTwoEmptyLists() {
        List<Integer> l1 = new ArrayList<Integer>();
        List<Object> l2 = new ArrayList<Object>();
        List<Object> result = Common.common(l1, l2);
        assertEquals(0, result.size());
    }

    // Test case 2: Test with one empty list and one non-empty list
    @Test
    void testCommonWithOneEmptyListAndOneNonEmptyList() {
        List<Integer> l1 = new ArrayList<Integer>();
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        List<Object> result = Common.common(l1, l2);
        assertEquals(0, result.size());
    }

    // Test case 3: Test with two lists with no common elements
    @Test
    void testCommonWithTwoListsWithNoCommonElements() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
        List<Object> result = Common.common(l1, l2);
        assertEquals(0, result.size());
    }

    // Test case 4: Test with two lists with one common element
    @Test
    void testCommonWithTwoListsWithOneCommonElement() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(3);
        l2.add(4);
        l2.add(5);
        List<Object> result = Common.common(l1, l2);
        assertEquals(1, result.size());
        assertEquals(3, result.get(0));
    }

    // Test case 5: Test with two lists with multiple common elements
    @Test
    void testCommonWithTwoListsWithMultipleCommonElements() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        List<Object> result = Common.common(l1, l2);
        assertEquals(3, result.size());
        assertEquals(3, result.get(0));
        assertEquals(4, result.get(1));
        assertEquals(5, result.get(2));
    }

    // Test case 6: Test with two lists with duplicate common elements
    @Test
    void testCommonWithTwoListsWithDuplicateCommonElements() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(3);
        l2.add(4);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        List<Object> result = Common.common(l1, l2);
        assertEquals(3, result.size());
        assertEquals(3, result.get(0));
        assertEquals(4, result.get(1));
        assertEquals(5, result.get(2));
    }

    // Test case 7: Test with two lists with common elements of different types
    @Test
    void testCommonWithTwoListsWithCommonElementsOfDifferentTypes() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(3);
        l2.add("4");
        l2.add(5);
        l2.add(6);
        l2.add(7);
        List<Object> result = Common.common(l1, l2);
        assertEquals(2, result.size());
        assertEquals(3, result.get(0));
        assertEquals(5, result.get(1));
    }

    // Test case 8: Test with two lists with common elements of different types
    // and duplicate common elements
    @Test
    void testCommonWithTwoListsWithCommonElementsOfDifferentTypesAndDuplicateCommonElements() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(3);
        l2.add("4");
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        List<Object> result = Common.common(l1, l2);
        assertEquals(2, result.size());
        assertEquals(3, result.get(0));
        assertEquals(5, result.get(1));
    }

    // Test case 9: Test with two lists with common elements of different types
    // and duplicate common elements
    @Test
    void testCommonWithTwoListsWithCommonElementsOfDifferentTypesAndDuplicateCommonElements2() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(3);
        l2.add("4");
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(7);
        List<Object> result = Common.common(l1, l2);
        assertEquals(2, result.size());
        assertEquals(3, result.get(0));
        assertEquals(5, result.get(1));
    }

    // Test case 10: Test with two lists with common elements of different types
    // and duplicate common elements
    @Test
    void testCommonWithTwoListsWithCommonElementsOfDifferentTypesAndDuplicateCommonElements3() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(3);
        l2.add("4");
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(7);
        l2.add(1);
        List<Object> result = Common.common(l1, l2);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(5, result.get(2));
    }
}