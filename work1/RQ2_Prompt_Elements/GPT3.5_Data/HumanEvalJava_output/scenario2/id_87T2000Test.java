// GetRowTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetRow}.
* It contains ten unit test cases for the {@link GetRow#getRow(List, int)} method.
*/
class GetRowTest {
    
    @Test
    void testEmptyList() {
        List<Object> lst = new ArrayList<Object>();
        List<Object> result = GetRow.getRow(lst, 1);
        assertTrue(result.isEmpty());
    }
    
    @Test
    void testNoMatch() {
        List<Object> lst = Arrays.asList(
            Arrays.asList(0, 1, 2),
            Arrays.asList(3, 4, 5),
            Arrays.asList(6, 7, 8)
        );
        List<Object> result = GetRow.getRow(lst, 9);
        assertTrue(result.isEmpty());
    }
    
    @Test
    void testSingleMatch() {
        List<Object> lst = Arrays.asList(
            Arrays.asList(0, 1, 2),
            Arrays.asList(3, 4, 5),
            Arrays.asList(6, 7, 8)
        );
        List<Object> expected = Arrays.asList(
            Arrays.asList(1, 2)
        );
        List<Object> result = GetRow.getRow(lst, 5);
        assertEquals(expected, result);
    }
    
    @Test
    void testMultipleMatches() {
        List<Object> lst = Arrays.asList(
            Arrays.asList(0, 1, 2),
            Arrays.asList(3, 4, 5),
            Arrays.asList(6, 7, 8)
        );
        List<Object> expected = Arrays.asList(
            Arrays.asList(0, 2),
            Arrays.asList(1, 2),
            Arrays.asList(2, 2)
        );
        List<Object> result = GetRow.getRow(lst, 2);
        assertEquals(expected, result);
    }
    
    @Test
    void testMultipleMatchesDifferentRows() {
        List<Object> lst = Arrays.asList(
            Arrays.asList(0, 1, 2),
            Arrays.asList(3, 2, 5),
            Arrays.asList(6, 7, 2)
        );
        List<Object> expected = Arrays.asList(
            Arrays.asList(0, 2),
            Arrays.asList(1, 1),
            Arrays.asList(2, 2)
        );
        List<Object> result = GetRow.getRow(lst, 2);
        assertEquals(expected, result);
    }
    
    @Test
    void testMultipleMatchesSameRow() {
        List<Object> lst = Arrays.asList(
            Arrays.asList(0, 1, 2),
            Arrays.asList(3, 2, 5),
            Arrays.asList(6, 7, 2)
        );
        List<Object> expected = Arrays.asList(
            Arrays.asList(0, 2),
            Arrays.asList(1, 1)
        );
        List<Object> result = GetRow.getRow(lst, 2);
        assertEquals(expected, result);
    }
    
    @Test
    void testMultipleMatchesSameRowDescendingOrder() {
        List<Object> lst = Arrays.asList(
            Arrays.asList(0, 1, 2),
            Arrays.asList(3, 2, 5),
            Arrays.asList(6, 7, 2)
        );
        List<Object> expected = Arrays.asList(
            Arrays.asList(1, 1),
            Arrays.asList(0, 2)
        );
        List<Object> result = GetRow.getRow(lst, 2);
        assertEquals(expected, result);
    }
    
    @Test
    void testMultipleMatchesDifferentRowsDescendingOrder() {
        List<Object> lst = Arrays.asList(
            Arrays.asList(0, 1, 2),
            Arrays.asList(3, 2, 5),
            Arrays.asList(6, 7, 2)
        );
        List<Object> expected = Arrays.asList(
            Arrays.asList(2, 2),
            Arrays.asList(1, 1),
            Arrays.asList(0, 2)
        );
        List<Object> result = GetRow.getRow(lst, 2);
        assertEquals(expected, result);
    }
    
    @Test
    void testMultipleMatchesDifferentRowsSameColumnDescendingOrder() {
        List<Object> lst = Arrays.asList(
            Arrays.asList(0, 1, 2),
            Arrays.asList(3, 2, 5),
            Arrays.asList(6, 7, 2)
        );
        List<Object> expected = Arrays.asList(
            Arrays.asList(2, 2),
            Arrays.asList(0, 2),
            Arrays.asList(1, 1)
        );
        List<Object> result = GetRow.getRow(lst, 2);
        assertEquals(expected, result);
    }
    
    @Test
    void testMultipleMatchesDifferentRowsSameColumnSameRowDescendingOrder() {
        List<Object> lst = Arrays.asList(
            Arrays.asList(0, 1, 2),
            Arrays.asList(3, 2, 5),
            Arrays.asList(6, 7, 2)
        );
        List<Object> expected = Arrays.asList(
            Arrays.asList(1, 1),
            Arrays.asList(0, 2)
        );
        List<Object> result = GetRow.getRow(lst, 2);
        assertEquals(expected, result);
    }
}