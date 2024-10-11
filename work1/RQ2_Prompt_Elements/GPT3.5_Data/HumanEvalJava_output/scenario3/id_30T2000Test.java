// GetPositive.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class GetPositive {

    /**
     * Return only positive numbers in the list.
     *
     * > getPositive([-1, 2, -4, 5, 6])
     * [2, 5, 6]
     * > getPositive([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
     * [5, 3, 2, 3, 9, 123, 1]
     * > getPositive([-1, -2, 4, 5, 6])
     * [4, 5, 6]
     * > getPositive([5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10])
     * [5, 3, 2, 3, 3, 9, 123, 1]
     * > getPositive([-1, -2])
     * []
     * > getPositive([])
     * []
     */
    public static List<Integer> getPositive(List<Integer> l) {
        List<Integer> positiveList = new ArrayList<>();
        for (Integer i : l) {
            if (i > 0) {
                positiveList.add(i);
            }
        }
        return positiveList;
    }
}

// GetPositiveTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {

    @Test
    void testGetPositive() {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(-1, 2, -4, 5, 6));
        List<Integer> expected1 = new ArrayList<>(Arrays.asList(2, 5, 6));
        assertEquals(expected1, GetPositive.getPositive(l1));

        List<Integer> l2 = new ArrayList<>(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10));
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(5, 3, 2, 3, 9, 123, 1));
        assertEquals(expected2, GetPositive.getPositive(l2));

        List<Integer> l3 = new ArrayList<>(Arrays.asList(-1, -2, 4, 5, 6));
        List<Integer> expected3 = new ArrayList<>(Arrays.asList(4, 5, 6));
        assertEquals(expected3, GetPositive.getPositive(l3));

        List<Integer> l4 = new ArrayList<>(Arrays.asList(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10));
        List<Integer> expected4 = new ArrayList<>(Arrays.asList(5, 3, 2, 3, 3, 9, 123, 1));
        assertEquals(expected4, GetPositive.getPositive(l4));

        List<Integer> l5 = new ArrayList<>(Arrays.asList(-1, -2));
        List<Integer> expected5 = new ArrayList<>();
        assertEquals(expected5, GetPositive.getPositive(l5));

        List<Integer> l6 = new ArrayList<>();
        List<Integer> expected6 = new ArrayList<>();
        assertEquals(expected6, GetPositive.getPositive(l6));

        List<Integer> l7 = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        List<Integer> expected7 = new ArrayList<>();
        assertEquals(expected7, GetPositive.getPositive(l7));

        List<Integer> l8 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected8 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected8, GetPositive.getPositive(l8));

        List<Integer> l9 = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5));
        List<Integer> expected9 = new ArrayList<>();
        assertEquals(expected9, GetPositive.getPositive(l9));

        List<Integer> l10 = new ArrayList<>(Arrays.asList(1));
        List<Integer> expected10 = new ArrayList<>(Arrays.asList(1));
        assertEquals(expected10, GetPositive.getPositive(l10));
    }
}