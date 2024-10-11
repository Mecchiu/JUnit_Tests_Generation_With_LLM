// CountUpToTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains ten unit test cases for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {
			// Test case 1
    @Test
    void testCountUpTo1() {
        int n = 1;
        List<Object> result = CountUpTo.countUpTo(n);
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, result);
    }

    // Test case 2
    @Test
    void testCountUpTo2() {
        int n = 2;
        List<Object> result = CountUpTo.countUpTo(n);
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, result);
    }

    // Test case 3
    @Test
    void testCountUpTo3() {
        int n = 3;
        List<Object> result = CountUpTo.countUpTo(n);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        assertEquals(expected, result);
    }

    // Test case 4
    @Test
    void testCountUpTo4() {
        int n = 4;
        List<Object> result = CountUpTo.countUpTo(n);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        assertEquals(expected, result);
    }

    // Test case 5
    @Test
    void testCountUpTo5() {
        int n = 5;
        List<Object> result = CountUpTo.countUpTo(n);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(3);
        assertEquals(expected, result);
    }

    // Test case 6
    @Test
    void testCountUpTo6() {
        int n = 6;
        List<Object> result = CountUpTo.countUpTo(n);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(3);
        assertEquals(expected, result);
    }

    // Test case 7
    @Test
    void testCountUpTo7() {
        int n = 7;
        List<Object> result = CountUpTo.countUpTo(n);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        assertEquals(expected, result);
    }

    // Test case 8
    @Test
    void testCountUpTo8() {
        int n = 8;
        List<Object> result = CountUpTo.countUpTo(n);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        assertEquals(expected, result);
    }

    // Test case 9
    @Test
    void testCountUpTo9() {
        int n = 9;
        List<Object> result = CountUpTo.countUpTo(n);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        assertEquals(expected, result);
    }

    // Test case 10
    @Test
    void testCountUpTo10() {
        int n = 10;
        List<Object> result = CountUpTo.countUpTo(n);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        assertEquals(expected, result);
    }
}