// MaxElement.java
package scenario3;

import java.util.List;

class MaxElement {

    /**
     * Return the maximum element in the list.
     *
     * > maxElement([1, 2, 3])
     * 3
     * > maxElement([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
     * 123
     * > maxElement([1, 2, 3])
     * 3
     * > maxElement([5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10])
     * 124
     */
    public static int maxElement(List<Integer> l) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) > max) {
                max = l.get(i);
            }
        }
        return max;
    }
}

// MaxElementTest.java
package scenario3;

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
    void testMaxElement() {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        assertEquals(3, MaxElement.maxElement(l1));
        
        List<Integer> l2 = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        assertEquals(123, MaxElement.maxElement(l2));
        
        List<Integer> l3 = Arrays.asList(1, 2, 3);
        assertEquals(3, MaxElement.maxElement(l3));
        
        List<Integer> l4 = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10);
        assertEquals(124, MaxElement.maxElement(l4));
    }
}