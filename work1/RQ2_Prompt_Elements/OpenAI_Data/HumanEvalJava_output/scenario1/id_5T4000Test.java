// IntersperseTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersperse}.
* It contains ten unit test cases for the {@link Intersperse#intersperse(List, int)} method.
*/
class IntersperseTest {

    @Test
    void testIntersperse_1() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(0);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(0);
        expected.add(4);
        expected.add(0);
        expected.add(5);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse_2() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(0);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(0);
        expected.add(4);
        expected.add(0);
        expected.add(5);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse_3() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(0);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(0);
        expected.add(4);
        expected.add(0);
        expected.add(5);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse_4() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(0);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(0);
        expected.add(4);
        expected.add(0);
        expected.add(5);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse_5() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(0);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(0);
        expected.add(4);
        expected.add(0);
        expected.add(5);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse_6() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(0);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(0);
        expected.add(4);
        expected.add(0);
        expected.add(5);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse_7() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(0);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(0);
        expected.add(4);
        expected.add(0);
        expected.add(5);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse_8() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(0);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(0);
        expected.add(4);
        expected.add(0);
        expected.add(5);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse_9() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(0);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(0);
        expected.add(4);
        expected.add(0);
        expected.add(5);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testIntersperse_10() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(0);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(0);
        expected.add(4);
        expected.add(0);
        expected.add(5);
        List<Object> actual = Intersperse.intersperse(numbers, 0);
        assertEquals(expected, actual);
    }
}