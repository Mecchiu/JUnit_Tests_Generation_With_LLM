// SearchTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains ten unit test cases for the {@link Search#search(List)} method.
*/
class SearchTest {
	// Test case 1
    @Test
    void testSearch1() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5);
        int result = Search.search(lst);
        assertEquals(1, result);
    }
			// Test case 2
    @Test
    void testSearch2() {
        List<Integer> lst = List.of(1, 1, 1, 1, 1);
        int result = Search.search(lst);
        assertEquals(1, result);
    }
			// Test case 3
    @Test
    void testSearch3() {
        List<Integer> lst = List.of(1, 1, 2, 2, 3);
        int result = Search.search(lst);
        assertEquals(2, result);
    }
			// Test case 4
    @Test
    void testSearch4() {
        List<Integer> lst = List.of(1, 1, 2, 2, 2);
        int result = Search.search(lst);
        assertEquals(2, result);
    }
			// Test case 5
    @Test
    void testSearch5() {
        List<Integer> lst = List.of(1, 1, 2, 2, 3, 3);
        int result = Search.search(lst);
        assertEquals(3, result);
    }
			// Test case 6
    @Test
    void testSearch6() {
        List<Integer> lst = List.of(1, 1, 2, 2, 3, 3, 3);
        int result = Search.search(lst);
        assertEquals(3, result);
    }
			// Test case 7
    @Test
    void testSearch7() {
        List<Integer> lst = List.of(1, 1, 2, 2, 3, 3, 3, 4);
        int result = Search.search(lst);
        assertEquals(4, result);
    }
			// Test case 8
    @Test
    void testSearch8() {
        List<Integer> lst = List.of(1, 1, 2, 2, 3, 3, 3, 4, 4);
        int result = Search.search(lst);
        assertEquals(4, result);
    }
			// Test case 9
    @Test
    void testSearch9() {
        List<Integer> lst = List.of(1, 1, 2, 2, 3, 3, 3, 4, 4, 4);
        int result = Search.search(lst);
        assertEquals(4, result);
    }
			// Test case 10
    @Test
    void testSearch10() {
        List<Integer> lst = List.of(1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5);
        int result = Search.search(lst);
        assertEquals(5, result);
    }
}
