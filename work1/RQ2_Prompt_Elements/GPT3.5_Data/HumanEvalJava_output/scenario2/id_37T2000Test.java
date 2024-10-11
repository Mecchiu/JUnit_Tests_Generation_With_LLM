// SortEven.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortEven {

    /**
     * This function takes a list l and returns a list l' such that
     * l' is identical to l in the odd indices, while its values at the even indices are equal
     * to the values of the even indices of l, but sorted.
     */
    public static List<Integer> sortEven(List<Integer> l) {
        List<Integer> l2 = new ArrayList<Integer>(l);
        for (int i = 0; i < l.size(); i++) {
            if (i % 2 == 0) {
                List<Integer> subl = new ArrayList<Integer>();
                for (int j = 0; j < l.size(); j++) {
                    if (j % 2 == 0) {
                        subl.add(l.get(j));
                    }
                }
                Collections.sort(subl);
                l2.set(i, subl.get(i / 2));
            }
        }
        return l2;
    }
}

// SortEvenTest.java
package scenario2;

import java.util.ArrayList;
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
    void testSortEvenWithEmptyList() {
        List<Integer> l = new ArrayList<Integer>();
        List<Integer> expected = new ArrayList<Integer>();
        assertEquals(expected, SortEven.sortEven(l));
    }
    
    @Test
    void testSortEvenWithOneElement() {
        List<Integer> l = Arrays.asList(1);
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, SortEven.sortEven(l));
    }
    
    @Test
    void testSortEvenWithTwoElements() {
        List<Integer> l = Arrays.asList(2, 1);
        List<Integer> expected = Arrays.asList(2, 1);
        assertEquals(expected, SortEven.sortEven(l));
    }
    
    @Test
    void testSortEvenWithThreeElements() {
        List<Integer> l = Arrays.asList(2, 1, 4);
        List<Integer> expected = Arrays.asList(2, 1, 4);
        assertEquals(expected, SortEven.sortEven(l));
    }
    
    @Test
    void testSortEvenWithFourElements() {
        List<Integer> l = Arrays.asList(2, 1, 4, 3);
        List<Integer> expected = Arrays.asList(2, 1, 4, 3);
        assertEquals(expected, SortEven.sortEven(l));
    }
    
    @Test
    void testSortEvenWithFiveElements() {
        List<Integer> l = Arrays.asList(2, 1, 4, 3, 6);
        List<Integer> expected = Arrays.asList(2, 1, 4, 3, 6);
        assertEquals(expected, SortEven.sortEven(l));
    }
    
    @Test
    void testSortEvenWithSixElements() {
        List<Integer> l = Arrays.asList(2, 1, 4, 3, 6, 5);
        List<Integer> expected = Arrays.asList(2, 1, 4, 3, 6, 5);
        assertEquals(expected, SortEven.sortEven(l));
    }
    
    @Test
    void testSortEvenWithSevenElements() {
        List<Integer> l = Arrays.asList(2, 1, 4, 3, 6, 5, 8);
        List<Integer> expected = Arrays.asList(2, 1, 4, 3, 6, 5, 8);
        assertEquals(expected, SortEven.sortEven(l));
    }
    
    @Test
    void testSortEvenWithEightElements() {
        List<Integer> l = Arrays.asList(2, 1, 4, 3, 6, 5, 8, 7);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(expected, SortEven.sortEven(l));
    }
    
    @Test
    void testSortEvenWithNineElements() {
        List<Integer> l = Arrays.asList(2, 1, 4, 3, 6, 5, 8, 7, 10);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10);
        assertEquals(expected, SortEven.sortEven(l));
    }
}