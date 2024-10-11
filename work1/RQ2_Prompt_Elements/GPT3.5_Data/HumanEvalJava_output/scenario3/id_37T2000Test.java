// SortEven.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortEven {

    /**
     * This function takes a list l and returns a list l' such that
     * l' is identical to l in the odd indices, while its values at the even indices are equal
     * to the values of the even indices of l, but sorted.
     *
     * > sortEven([1, 2, 3])
     * [1, 2, 3]
     * > sortEven([5, 6, 3, 4])
     * [3, 6, 5, 4]
     * > sortEven([1, 2, 3])
     * [1, 2, 3]
     * > sortEven([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
     * [-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123]
     * > sortEven([5, 8, -12, 4, 23, 2, 3, 11, 12, -10])
     * [-12, 8, 3, 4, 5, 2, 12, 11, 23, -10]
     */
    public static List<Integer> sortEven(List<Integer> l) {
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < l.size(); i += 2) {
            evenList.add(l.get(i));
        }
        Collections.sort(evenList);
        List<Integer> result = new ArrayList<>();
        int evenIndex = 0;
        for (int i = 0; i < l.size(); i++) {
            if (i % 2 == 0) {
                result.add(evenList.get(evenIndex));
                evenIndex++;
            } else {
                result.add(l.get(i));
            }
        }
        return result;
    }
}

// SortEvenTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortEven}.
* It contains ten unit test cases for the {@link SortEven#sortEven(List)} method.
*/
class SortEvenTest {
    @Test
    void testSortEven() {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(5, 6, 3, 4);
        List<Integer> l3 = Arrays.asList(1, 2, 3);
        List<Integer> l4 = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        List<Integer> l5 = Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10);
        List<Integer> l6 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> l7 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> l8 = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10);
        List<Integer> l9 = Arrays.asList(2, 4, 6, 8, 10, 1, 3, 5, 7, 9);
        List<Integer> l10 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected1 = Arrays.asList(1, 2, 3);
        List<Integer> expected2 = Arrays.asList(3, 6, 5, 4);
        List<Integer> expected3 = Arrays.asList(1, 2, 3);
        List<Integer> expected4 = Arrays.asList(-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123);
        List<Integer> expected5 = Arrays.asList(-12, 8, 3, 4, 5, 2, 12, 11, 23, -10);
        List<Integer> expected6 = Arrays.asList(1, 4, 5, 8, 9);
        List<Integer> expected7 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> expected8 = Arrays.asList(1, 4, 5, 8, 9, 2, 4, 6, 8, 10);
        List<Integer> expected9 = Arrays.asList(2, 4, 6, 8, 10, 1, 3, 5, 7, 9);
        List<Integer> expected10 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(expected1, SortEven.sortEven(l1));
        assertEquals(expected2, SortEven.sortEven(l2));
        assertEquals(expected3, SortEven.sortEven(l3));
        assertEquals(expected4, SortEven.sortEven(l4));
        assertEquals(expected5, SortEven.sortEven(l5));
        assertEquals(expected6, SortEven.sortEven(l6));
        assertEquals(expected7, SortEven.sortEven(l7));
        assertEquals(expected8, SortEven.sortEven(l8));
        assertEquals(expected9, SortEven.sortEven(l9));
        assertEquals(expected10, SortEven.sortEven(l10));
    }
}