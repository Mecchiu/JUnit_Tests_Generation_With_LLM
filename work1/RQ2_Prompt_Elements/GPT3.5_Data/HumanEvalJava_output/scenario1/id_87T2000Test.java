// GetRowTest.java
package scenario1;

import java.util.ArrayList;
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
    void testGetRowWithEmptyList() {
        List<Object> lst = new ArrayList<Object>();
        List<Object> result = GetRow.getRow(lst, 1);
        assertTrue(result.isEmpty());
    }
    
    @Test
    void testGetRowWithNonEmptyListAndNoMatchingElement() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(new ArrayList<Object>() {{ add(2); add(3); add(4); }});
        lst.add(new ArrayList<Object>() {{ add(5); add(6); add(7); }});
        lst.add(new ArrayList<Object>() {{ add(8); add(9); add(10); }});
        List<Object> result = GetRow.getRow(lst, 1);
        assertTrue(result.isEmpty());
    }
    
    @Test
    void testGetRowWithNonEmptyListAndMatchingElement() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(new ArrayList<Object>() {{ add(2); add(3); add(4); }});
        lst.add(new ArrayList<Object>() {{ add(5); add(1); add(7); }});
        lst.add(new ArrayList<Object>() {{ add(8); add(9); add(10); }});
        List<Object> expected = new ArrayList<Object>();
        expected.add(new ArrayList<Object>() {{ add(1); add(1); }});
        List<Object> result = GetRow.getRow(lst, 1);
        assertEquals(expected, result);
    }
    
    @Test
    void testGetRowWithNonEmptyListAndMultipleMatchingElements() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(new ArrayList<Object>() {{ add(2); add(3); add(1); }});
        lst.add(new ArrayList<Object>() {{ add(5); add(1); add(7); }});
        lst.add(new ArrayList<Object>() {{ add(1); add(9); add(10); }});
        List<Object> expected = new ArrayList<Object>();
        expected.add(new ArrayList<Object>() {{ add(0); add(2); }});
        expected.add(new ArrayList<Object>() {{ add(1); add(1); }});
        expected.add(new ArrayList<Object>() {{ add(2); add(0); }});
        List<Object> result = GetRow.getRow(lst, 1);
        assertEquals(expected, result);
    }
    
    @Test
    void testGetRowWithNonEmptyListAndMatchingElementAtFirstPosition() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(new ArrayList<Object>() {{ add(1); add(2); add(3); }});
        lst.add(new ArrayList<Object>() {{ add(4); add(5); add(6); }});
        lst.add(new ArrayList<Object>() {{ add(7); add(8); add(9); }});
        List<Object> expected = new ArrayList<Object>();
        expected.add(new ArrayList<Object>() {{ add(0); add(0); }});
        List<Object> result = GetRow.getRow(lst, 1);
        assertEquals(expected, result);
    }
    
    @Test
    void testGetRowWithNonEmptyListAndMatchingElementAtLastPosition() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(new ArrayList<Object>() {{ add(1); add(2); add(3); }});
        lst.add(new ArrayList<Object>() {{ add(4); add(5); add(6); }});
        lst.add(new ArrayList<Object>() {{ add(7); add(8); add(1); }});
        List<Object> expected = new ArrayList<Object>();
        expected.add(new ArrayList<Object>() {{ add(2); add(2); }});
        List<Object> result = GetRow.getRow(lst, 1);
        assertEquals(expected, result);
    }
    
    @Test
    void testGetRowWithNonEmptyListAndMatchingElementInMiddle() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(new ArrayList<Object>() {{ add(1); add(2); add(3); }});
        lst.add(new ArrayList<Object>() {{ add(4); add(1); add(6); }});
        lst.add(new ArrayList<Object>() {{ add(7); add(8); add(9); }});
        List<Object> expected = new ArrayList<Object>();
        expected.add(new ArrayList<Object>() {{ add(1); add(1); }});
        List<Object> result = GetRow.getRow(lst, 1);
        assertEquals(expected, result);
    }
    
    @Test
    void testGetRowWithNonEmptyListAndMatchingElementInMultipleRows() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(new ArrayList<Object>() {{ add(1); add(2); add(3); }});
        lst.add(new ArrayList<Object>() {{ add(4); add(1); add(6); }});
        lst.add(new ArrayList<Object>() {{ add(7); add(8); add(1); }});
        lst.add(new ArrayList<Object>() {{ add(1); add(2); add(3); }});
        List<Object> expected = new ArrayList<Object>();
        expected.add(new ArrayList<Object>() {{ add(1); add(1); }});
        expected.add(new ArrayList<Object>() {{ add(2); add(2); }});
        List<Object> result = GetRow.getRow(lst, 1);
        assertEquals(expected, result);
    }
    
    @Test
    void testGetRowWithNonEmptyListAndMatchingElementInMultipleColumns() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(new ArrayList<Object>() {{ add(1); add(2); add(1); }});
        lst.add(new ArrayList<Object>() {{ add(4); add(1); add(6); }});
        lst.add(new ArrayList<Object>() {{ add(7); add(8); add(1); }});
        List<Object> expected = new ArrayList<Object>();
        expected.add(new ArrayList<Object>() {{ add(0); add(2); }});
        expected.add(new ArrayList<Object>() {{ add(1); add(1); }});
        expected.add(new ArrayList<Object>() {{ add(2); add(2); }});
        List<Object> result = GetRow.getRow(lst, 1);
        assertEquals(expected, result);
    }
    
    @Test
    void testGetRowWithNonEmptyListAndMatchingElementInAllRows() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(new ArrayList<Object>() {{ add(1); add(1); add(1); }});
        lst.add(new ArrayList<Object>() {{ add(1); add(1); add(1); }});
        lst.add(new ArrayList<Object>() {{ add(1); add(1); add(1); }});
        List<Object> expected = new ArrayList<Object>();
        expected.add(new ArrayList<Object>() {{ add(0); add(0); }});
        expected.add(new ArrayList<Object>() {{ add(0); add(1); }});
        expected.add(new ArrayList<Object>() {{ add(0); add(2); }});
        expected.add(new ArrayList<Object>() {{ add(1); add(0); }});
        expected.add(new ArrayList<Object>() {{ add(1); add(1); }});
        expected.add(new ArrayList<Object>() {{ add(1); add(2); }});
        expected.add(new ArrayList<Object>() {{ add(2); add(0); }});
        expected.add(new ArrayList<Object>() {{ add(2); add(1); }});
        expected.add(new ArrayList<Object>() {{ add(2); add(2); }});
        List<Object> result = GetRow.getRow(lst, 1);
        assertEquals(expected, result);
    }
}