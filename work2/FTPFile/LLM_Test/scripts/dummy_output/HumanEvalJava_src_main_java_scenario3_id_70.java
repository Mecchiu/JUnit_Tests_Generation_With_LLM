// StrangeSortListTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains ten unit test cases for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {
			@Test
    void testStrangeSortList() {
        // Test case 1
        List<Object> lst = List.of(1, 2, 3, 4);
        List<Object> expected = List.of(1, 4, 2, 3);
        List<Object> actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);

        // Test case 2
        lst = List.of(5, 6, 7, 8, 9);
        expected = List.of(5, 9, 6, 8, 7);
        actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);

        // Test case 3
        lst = List.of(1, 2, 3, 4, 5);
        expected = List.of(1, 5, 2, 4, 3);
        actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);

        // Test case 4
        lst = List.of(5, 6, 7, 8, 9, 1);
        expected = List.of(1, 9, 5, 8, 6, 7);
        actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);

        // Test case 5
        lst = List.of(5, 5, 5, 5);
        expected = List.of(5, 5, 5, 5);
        actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);

        // Test case 6
        lst = List.of();
        expected = List.of();
        actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);

        // Test case 7
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        expected = List.of(1, 8, 2, 7, 3, 6, 4, 5);
        actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);

        // Test case 8
        lst = List.of(0, 2, 2, 2, 5, 5, -5, -5);
        expected = List.of(-5, 5, -5, 5, 0, 2, 2, 2);
        actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);

        // Test case 9
        lst = List.of(111111);
        expected = List.of(111111);
        actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);

        // Test case 10
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        expected = List.of(1, 9, 2, 8, 3, 7, 4, 6, 5);
        actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);
    }
}