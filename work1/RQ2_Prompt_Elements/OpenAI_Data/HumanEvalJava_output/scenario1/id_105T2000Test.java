// ByLengthTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByLength}.
* It contains ten unit test cases for the {@link ByLength#byLength(List)} method.
*/
class ByLengthTest {
	// Test case 1: Test with empty list
    @Test
    void testByLengthEmptyList() {
        List<Object> arr = new ArrayList<Object>();
        List<Object> result = ByLength.byLength(arr);
        assertEquals(0, result.size());
    }
    
    // Test case 2: Test with list of integers
    @Test
    void testByLengthIntegerList() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        List<Object> result = ByLength.byLength(arr);
        assertEquals(3, result.size());
        assertEquals("Three", result.get(0));
        assertEquals("Two", result.get(1));
        assertEquals("One", result.get(2));
    }
    
    // Test case 3: Test with list of integers and strings
    @Test
    void testByLengthIntegerStringList() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add("Two");
        arr.add(3);
        List<Object> result = ByLength.byLength(arr);
        assertEquals(2, result.size());
        assertEquals("Three", result.get(0));
        assertEquals("One", result.get(1));
    }
    
    // Test case 4: Test with list of integers and null values
    @Test
    void testByLengthIntegerNullList() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(null);
        arr.add(3);
        List<Object> result = ByLength.byLength(arr);
        assertEquals(2, result.size());
        assertEquals("Three", result.get(0));
        assertEquals("One", result.get(1));
    }
    
    // Test case 5: Test with list of integers and negative values
    @Test
    void testByLengthIntegerNegativeList() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(-2);
        arr.add(3);
        List<Object> result = ByLength.byLength(arr);
        assertEquals(2, result.size());
        assertEquals("Three", result.get(0));
        assertEquals("One", result.get(1));
    }
    
    // Test case 6: Test with list of integers and duplicate values
    @Test
    void testByLengthIntegerDuplicateList() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        List<Object> result = ByLength.byLength(arr);
        assertEquals(2, result.size());
        assertEquals("Two", result.get(0));
        assertEquals("One", result.get(1));
    }
    
    // Test case 7: Test with list of integers and values greater than 9
    @Test
    void testByLengthIntegerGreaterList() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(10);
        arr.add(3);
        List<Object> result = ByLength.byLength(arr);
        assertEquals(2, result.size());
        assertEquals("Three", result.get(0));
        assertEquals("One", result.get(1));
    }
    
    // Test case 8: Test with list of integers and values less than 1
    @Test
    void testByLengthIntegerLessList() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(0);
        arr.add(3);
        List<Object> result = ByLength.byLength(arr);
        assertEquals(2, result.size());
        assertEquals("Three", result.get(0));
        assertEquals("One", result.get(1));
    }
    
    // Test case 9: Test with list of integers and values of different types
    @Test
    void testByLengthIntegerDifferentTypeList() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2.0);
        arr.add(3);
        List<Object> result = ByLength.byLength(arr);
        assertEquals(2, result.size());
        assertEquals("Three", result.get(0));
        assertEquals("One", result.get(1));
    }
    
    // Test case 10: Test with list of integers and values of different types
    @Test
    void testByLengthIntegerDifferentTypeList2() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add("Two");
        arr.add(3);
        List<Object> result = ByLength.byLength(arr);
        assertEquals(2, result.size());
        assertEquals("Three", result.get(0));
        assertEquals("One", result.get(1));
    }
}
