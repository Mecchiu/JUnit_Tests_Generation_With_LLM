// FilterBySubstringTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterBySubstring}.
* It contains ten unit test cases for the {@link FilterBySubstring#filterBySubstring(List, String)} method.
*/
class FilterBySubstringTest {
			// Test case 1: Test with empty list
    @Test
    void testEmptyList() {
        List<Object> strings = new ArrayList<Object>();
        String substring = "test";
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertEquals(0, result.size());
    }

    // Test case 2: Test with empty substring
    @Test
    void testEmptySubstring() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("test");
        String substring = "";
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertEquals(1, result.size());
    }

    // Test case 3: Test with null list
    @Test
    void testNullList() {
        List<Object> strings = null;
        String substring = "test";
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertNull(result);
    }

    // Test case 4: Test with null substring
    @Test
    void testNullSubstring() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("test");
        String substring = null;
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertNull(result);
    }

    // Test case 5: Test with one element list
    @Test
    void testOneElementList() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("test");
        String substring = "test";
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertEquals(1, result.size());
    }

    // Test case 6: Test with one element list and substring not found
    @Test
    void testOneElementListSubstringNotFound() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("test");
        String substring = "test1";
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertEquals(0, result.size());
    }

    // Test case 7: Test with multiple elements list
    @Test
    void testMultipleElementsList() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("test1");
        strings.add("test2");
        strings.add("test3");
        String substring = "test";
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertEquals(3, result.size());
    }

    // Test case 8: Test with multiple elements list and substring not found
    @Test
    void testMultipleElementsListSubstringNotFound() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("test1");
        strings.add("test2");
        strings.add("test3");
        String substring = "test4";
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertEquals(0, result.size());
    }

    // Test case 9: Test with multiple elements list and substring found in one element
    @Test
    void testMultipleElementsListSubstringFoundInOneElement() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("test1");
        strings.add("test2");
        strings.add("test3");
        String substring = "test2";
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertEquals(1, result.size());
    }

    // Test case 10: Test with multiple elements list and substring found in all elements
    @Test
    void testMultipleElementsListSubstringFoundInAllElements() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("test1");
        strings.add("test2");
        strings.add("test3");
        String substring = "test";
        List<Object> result = FilterBySubstring.filterBySubstring(strings, substring);
        assertEquals(3, result.size());
    }
}