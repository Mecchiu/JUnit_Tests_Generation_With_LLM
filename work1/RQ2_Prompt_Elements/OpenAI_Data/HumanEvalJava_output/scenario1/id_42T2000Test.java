// IncrListTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IncrList}.
* It contains ten unit test cases for the {@link IncrList#incrList(List)} method.
*/
class IncrListTest {
	// Test case 1: Test with an empty list
    @Test
    void testIncrListEmptyList() {
        List<Object> l = new ArrayList<Object>();
        List<Object> result = IncrList.incrList(l);
        assertTrue(result.isEmpty());
    }

    // Test case 2: Test with a list containing only one element
    @Test
    void testIncrListOneElement() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        List<Object> result = IncrList.incrList(l);
        assertEquals(2, result.get(0));
    }

    // Test case 3: Test with a list containing only one element
    // of type String
    @Test
    void testIncrListOneElementString() {
        List<Object> l = new ArrayList<Object>();
        l.add("Hello");
        List<Object> result = IncrList.incrList(l);
        assertTrue(result.isEmpty());
    }

    // Test case 4: Test with a list containing only one element
    // of type Double
    @Test
    void testIncrListOneElementDouble() {
        List<Object> l = new ArrayList<Object>();
        l.add(1.0);
        List<Object> result = IncrList.incrList(l);
        assertTrue(result.isEmpty());
    }

    // Test case 5: Test with a list containing two elements
    // of type Integer
    @Test
    void testIncrListTwoElements() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        List<Object> result = IncrList.incrList(l);
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
    }

    // Test case 6: Test with a list containing two elements
    // of type Integer and String
    @Test
    void testIncrListTwoElementsString() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add("Hello");
        List<Object> result = IncrList.incrList(l);
        assertEquals(2, result.get(0));
        assertTrue(result.size() == 1);
    }

    // Test case 7: Test with a list containing two elements
    // of type Integer and Double
    @Test
    void testIncrListTwoElementsDouble() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(1.0);
        List<Object> result = IncrList.incrList(l);
        assertEquals(2, result.get(0));
        assertTrue(result.size() == 1);
    }

    // Test case 8: Test with a list containing three elements
    // of type Integer
    @Test
    void testIncrListThreeElements() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        List<Object> result = IncrList.incrList(l);
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(4, result.get(2));
    }

    // Test case 9: Test with a list containing three elements
    // of type Integer, String and Double
    @Test
    void testIncrListThreeElementsStringDouble() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add("Hello");
        l.add(1.0);
        List<Object> result = IncrList.incrList(l);
        assertEquals(2, result.get(0));
        assertTrue(result.size() == 1);
    }

    // Test case 10: Test with a list containing three elements
    // of type Integer, Double and Integer
    @Test
    void testIncrListThreeElementsDoubleInteger() {
        List<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(1.0);
        l.add(2);
        List<Object> result = IncrList.incrList(l);
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
        assertTrue(result.size() == 2);
    }
}
