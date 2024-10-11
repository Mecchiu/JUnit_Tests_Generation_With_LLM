// SearchTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains ten unit test cases for the {@link Search#search(List)} method.
*/
class SearchTest {
	// Test case 1: Empty list
    @Test
    void testEmptyList() {
        List<Integer> lst = new ArrayList<>();
        int result = Search.search(lst);
        assertEquals(-1, result);
    }
			// Test case 2: List with one element
    @Test
    void testOneElementList() {
        List<Integer> lst = new ArrayList<>();
        lst.add(5);
        int result = Search.search(lst);
        assertEquals(-1, result);
    }
			// Test case 3: List with all elements less than 1
    @Test
    void testAllElementsLessThanOne() {
        List<Integer> lst = new ArrayList<>();
        lst.add(0);
        lst.add(-1);
        lst.add(-5);
        int result = Search.search(lst);
        assertEquals(-1, result);
    }
			// Test case 4: List with all elements greater than 10
    @Test
    void testAllElementsGreaterThanTen() {
        List<Integer> lst = new ArrayList<>();
        lst.add(11);
        lst.add(15);
        lst.add(20);
        int result = Search.search(lst);
        assertEquals(-1, result);
    }
			// Test case 5: List with all elements equal to 1
    @Test
    void testAllElementsEqualToOne() {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(1);
        lst.add(1);
        int result = Search.search(lst);
        assertEquals(1, result);
    }
			// Test case 6: List with all elements equal to 10
    @Test
    void testAllElementsEqualToTen() {
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(10);
        lst.add(10);
        int result = Search.search(lst);
        assertEquals(10, result);
    }
			// Test case 7: List with elements from 1 to 10
    @Test
    void testElementsFromOneToTen() {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(10);
        int result = Search.search(lst);
        assertEquals(9, result);
    }
			// Test case 8: List with elements from 10 to 1
    @Test
    void testElementsFromTenToOne() {
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(9);
        lst.add(8);
        lst.add(7);
        lst.add(6);
        lst.add(5);
        lst.add(4);
        lst.add(3);
        lst.add(2);
        lst.add(1);
        int result = Search.search(lst);
        assertEquals(9, result);
    }
			// Test case 9: List with elements from 1 to 5 and 6 to 10
    @Test
    void testElementsFromOneToFiveAndSixToTen() {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(10);
        int result = Search.search(lst);
        assertEquals(5, result);
    }
			// Test case 10: List with elements from 1 to 5 and 7 to 10
    @Test
    void testElementsFromOneToFiveAndSevenToTen() {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(10);
        int result = Search.search(lst);
        assertEquals(5, result);
    }
}
