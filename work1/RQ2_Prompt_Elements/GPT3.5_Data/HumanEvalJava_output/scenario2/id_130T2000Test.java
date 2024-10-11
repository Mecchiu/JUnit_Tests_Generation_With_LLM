// TriTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Tri}.
* It contains ten unit test cases for the {@link Tri#tri(int)} method.
*/
class TriTest {
    
    @Test
    void testTriWithZero() {
        List<Number> expected = Arrays.asList(1);
        List<Number> actual = Tri.tri(0);
        assertEquals(expected, actual);
    }
    
    @Test
    void testTriWithOne() {
        List<Number> expected = Arrays.asList(1, 3);
        List<Number> actual = Tri.tri(1);
        assertEquals(expected, actual);
    }
    
    @Test
    void testTriWithTwo() {
        List<Number> expected = Arrays.asList(1, 3, 2.0);
        List<Number> actual = Tri.tri(2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testTriWithThree() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0);
        List<Number> actual = Tri.tri(3);
        assertEquals(expected, actual);
    }
    
    @Test
    void testTriWithFour() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0);
        List<Number> actual = Tri.tri(4);
        assertEquals(expected, actual);
    }
    
    @Test
    void testTriWithFive() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 16.0);
        List<Number> actual = Tri.tri(5);
        assertEquals(expected, actual);
    }
    
    @Test
    void testTriWithSix() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 16.0, 5.0);
        List<Number> actual = Tri.tri(6);
        assertEquals(expected, actual);
    }
    
    @Test
    void testTriWithSeven() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 16.0, 5.0, 27.0);
        List<Number> actual = Tri.tri(7);
        assertEquals(expected, actual);
    }
    
    @Test
    void testTriWithEight() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 16.0, 5.0, 27.0, 7.0);
        List<Number> actual = Tri.tri(8);
        assertEquals(expected, actual);
    }
    
    @Test
    void testTriWithNine() {
        List<Number> expected = Arrays.asList(1, 3, 2.0, 8.0, 3.0, 16.0, 5.0, 27.0, 7.0, 44.0);
        List<Number> actual = Tri.tri(9);
        assertEquals(expected, actual);
    }
}