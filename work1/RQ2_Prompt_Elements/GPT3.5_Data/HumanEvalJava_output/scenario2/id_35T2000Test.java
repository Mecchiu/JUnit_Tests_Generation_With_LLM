// MaxElement.java
package scenario2;

import java.util.List;

class MaxElement {

    /**
     * Return maximum element in the list.
     */
    public static int maxElement(List<Integer> l) {
        int max = Integer.MIN_VALUE;
        for (Integer i : l) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}

// MaxElementTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains ten unit test cases for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {
    
    @Test
    void testMaxElementWithEmptyList() {
        List<Integer> l = Arrays.asList();
        assertThrows(IllegalArgumentException.class, () -> MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithOneElement() {
        List<Integer> l = Arrays.asList(5);
        assertEquals(5, MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithTwoElements() {
        List<Integer> l = Arrays.asList(5, 10);
        assertEquals(10, MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithMultipleElements() {
        List<Integer> l = Arrays.asList(5, 10, 15, 20, 25);
        assertEquals(25, MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithNegativeElements() {
        List<Integer> l = Arrays.asList(-5, -10, -15, -20, -25);
        assertEquals(-5, MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithMixedElements() {
        List<Integer> l = Arrays.asList(-5, 10, -15, 20, -25);
        assertEquals(20, MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithDuplicateElements() {
        List<Integer> l = Arrays.asList(5, 10, 15, 20, 25, 25);
        assertEquals(25, MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithNullList() {
        List<Integer> l = null;
        assertThrows(NullPointerException.class, () -> MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithLargeList() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44,
                45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68,
                69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92,
                93, 94, 95, 96, 97, 98, 99, 100);
        assertEquals(100, MaxElement.maxElement(l));
    }
}