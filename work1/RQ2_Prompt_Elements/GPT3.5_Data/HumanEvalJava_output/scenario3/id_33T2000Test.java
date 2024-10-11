// SortThird.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortThird {

    /**
     * This function takes a list l and returns a list l' such that
     * l' is identical to l in the indices that are not divisible by three, while its values at the indicies that are divisible by three are equal
     * to the values of the corresponding indices of l, but sorted.
     * > sortThird([1, 2, 3])
     * [1, 2, 3]
     * > sortThird([5, 6, 3, 4, 8, 9, 2])
     * [2, 6, 3, 4, 8, 9, 5]
     * > sortThird([1, 2, 3])
     * [1, 2, 3]
     * > sortThird([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
     * [1, 3, -5, 2, -3, 3, 5, 0, 123, 9, -10]
     * > sortThird([5, 8, -12, 4, 23, 2, 3, 11, 12, -10])
     * [-10, 8, -12, 3, 23, 2, 4, 11, 12, 5]
     * > sortThird([5, 6, 3, 4, 8, 9, 2])
     * [2, 6, 3, 4, 8, 9, 5]
     * > sortThird([5, 8, 3, 4, 6, 9, 2])
     * [2, 8, 3, 4, 6, 9, 5]
     * > sortThird([5, 6, 9, 4, 8, 3, 2])
     * [2, 6, 9, 4, 8, 3, 5]
     * > sortThird([5, 6, 3, 4, 8, 9, 2, 1])
     * [2, 6, 3, 4, 8, 9, 5, 1]
     */
    public static List<Integer> sortThird(List<Integer> l) {
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            if (i % 3 == 0) {
                temp.add(l.get(i));
            } else {
                result.add(l.get(i));
            }
        }
        Collections.sort(temp);
        int tempIndex = 0;
        for (int i = 0; i < l.size(); i++) {
            if (i % 3 == 0) {
                result.add(i, temp.get(tempIndex));
                tempIndex++;
            }
        }
        return result;
    }
}

// SortThirdTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains ten unit test cases for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {
    @Test
    void testSortThird() {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(5, 6, 3, 4, 8, 9, 2);
        List<Integer> l3 = Arrays.asList(1, 2, 3);
        List<Integer> l4 = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        List<Integer> l5 = Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10);
        List<Integer> l6 = Arrays.asList(5, 6, 3, 4, 8, 9, 2);
        List<Integer> l7 = Arrays.asList(5, 8, 3, 4, 6, 9, 2);
        List<Integer> l8 = Arrays.asList(5, 6, 9, 4, 8, 3, 2);
        List<Integer> l9 = Arrays.asList(5, 6, 3, 4, 8, 9, 2, 1);
        List<Integer> l10 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        List<Integer> expected1 = Arrays.asList(1, 2, 3);
        List<Integer> expected2 = Arrays.asList(2, 6, 3, 4, 8, 9, 5);
        List<Integer> expected3 = Arrays.asList(1, 2, 3);
        List<Integer> expected4 = Arrays.asList(1, 3, -5, 2, -3, 3, 5, 0, 123, 9, -10);
        List<Integer> expected5 = Arrays.asList(-10, 8, -12, 3, 23, 2, 4, 11, 12, 5);
        List<Integer> expected6 = Arrays.asList(2, 6, 3, 4, 8, 9, 5);
        List<Integer> expected7 = Arrays.asList(2, 8, 3, 4, 6, 9, 5);
        List<Integer> expected8 = Arrays.asList(2, 6, 9, 4, 8, 3, 5);
        List<Integer> expected9 = Arrays.asList(2, 6, 3, 4, 8, 9, 5, 1);
        List<Integer> expected10 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertEquals(expected1, SortThird.sortThird(l1));
        assertEquals(expected2, SortThird.sortThird(l2));
        assertEquals(expected3, SortThird.sortThird(l3));
        assertEquals(expected4, SortThird.sortThird(l4));
        assertEquals(expected5, SortThird.sortThird(l5));
        assertEquals(expected6, SortThird.sortThird(l6));
        assertEquals(expected7, SortThird.sortThird(l7));
        assertEquals(expected8, SortThird.sortThird(l8));
        assertEquals(expected9, SortThird.sortThird(l9));
        assertEquals(expected10, SortThird.sortThird(l10));
    }
}