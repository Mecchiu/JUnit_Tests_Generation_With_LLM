// PluckTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains ten unit test cases for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {

    @Test
    void testEmptyList() {
        List<Object> arr = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testNoEvenValues() {
        List<Object> arr = Arrays.asList(1, 3, 5, 7);
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testOneEvenValue() {
        List<Object> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> expected = Arrays.asList(2, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testMultipleEvenValues() {
        List<Object> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 10);
        List<Object> expected = Arrays.asList(2, 1);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testMultipleEvenValuesSameIndex() {
        List<Object> arr = Arrays.asList(2, 4, 6, 8, 10);
        List<Object> expected = Arrays.asList(2, 0);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testAllEvenValues() {
        List<Object> arr = Arrays.asList(2, 4, 6, 8, 10);
        List<Object> expected = Arrays.asList(2, 0);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testAllOddValues() {
        List<Object> arr = Arrays.asList(1, 3, 5, 7, 9);
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testMixedValues() {
        List<Object> arr = Arrays.asList(1, 3, 5, 7, 2, 4, 6, 8, 10);
        List<Object> expected = Arrays.asList(2, 4);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testLargeList() {
        List<Object> arr = new ArrayList<Object>();
        for (int i = 0; i < 10000; i++) {
            arr.add(i);
        }
        List<Object> expected = Arrays.asList(0, 0);
        assertEquals(expected, Pluck.pluck(arr));
    }

    @Test
    void testLargeListWithEvenValues() {
        List<Object> arr = new ArrayList<Object>();
        for (int i = 0; i < 10000; i++) {
            arr.add(i * 2 + 1);
        }
        arr.set(5000, 2);
        List<Object> expected = Arrays.asList(2, 5000);
        assertEquals(expected, Pluck.pluck(arr));
    }
}