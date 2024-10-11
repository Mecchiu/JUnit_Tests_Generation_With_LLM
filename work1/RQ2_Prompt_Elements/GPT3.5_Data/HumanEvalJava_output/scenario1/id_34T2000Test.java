// Unique.java
package scenario1;

import java.util.*;

class Unique {

    public static List<Integer> unique(List<Integer> l) {
        Set<Integer> set = new HashSet<Integer>();
        for (Integer i : l) {
            set.add(i);
        }
        List<Integer> result = new ArrayList<Integer>(set);
        Collections.sort(result);
        return result;
    }
}

// UniqueTest.java
package scenario1;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains ten unit test cases for the {@link Unique#unique(List)} method.
*/
class UniqueTest {
    
    @Test
    void testEmptyList() {
        List<Integer> l = new ArrayList<Integer>();
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSingleElementList() {
        List<Integer> l = Arrays.asList(1);
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
    
    @Test
    void testDuplicateElements() {
        List<Integer> l = Arrays.asList(1, 2, 3, 2, 1);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNegativeElements() {
        List<Integer> l = Arrays.asList(-1, -2, -3, -2, -1);
        List<Integer> expected = Arrays.asList(-3, -2, -1);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMixedElements() {
        List<Integer> l = Arrays.asList(1, -2, 3, -2, 1);
        List<Integer> expected = Arrays.asList(-2, 1, 3);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
    
    @Test
    void testLargeList() {
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++) {
            l.add(i % 100);
        }
        List<Integer> expected = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            expected.add(i);
        }
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNullList() {
        List<Integer> l = null;
        assertThrows(NullPointerException.class, () -> Unique.unique(l));
    }
    
    @Test
    void testPerformance() {
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++) {
            l.add(i % 100);
        }
        long startTime = System.currentTimeMillis();
        Unique.unique(l);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        assertTrue(duration < 100);
    }
    
    @Test
    void testEmptyResult() {
        List<Integer> l = Arrays.asList(1, 2, 3);
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = Unique.unique(Collections.emptyList());
        assertEquals(expected, actual);
    }
    
    @Test
    void testResultIsSorted() {
        List<Integer> l = Arrays.asList(3, 2, 1);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
}