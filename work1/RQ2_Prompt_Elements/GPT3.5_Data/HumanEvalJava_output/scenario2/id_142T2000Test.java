// SumSquares1.java
package scenario2;

import java.util.ArrayList;
import java.util.List;

class SumSquares1 {

    /**
     * This function will take a list of integers. For all entries in the list, the function shall square the integer entry if its index is a
     * multiple of 3 and will cube the integer entry if its index is a multiple of 4 and not a multiple of 3. The function will not
     * change the entries in the list whose indexes are not a multiple of 3 or 4. The function shall then return the sum of all entries.
     */
    public static int sumSquares(List<Integer> lst) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < lst.size(); i++) {
            if (i % 3 == 0) {
                result.add(lst.get(i) * lst.get(i));
            } else if (i % 4 == 0 && i % 3 != 0) {
                result.add(lst.get(i) * lst.get(i) * lst.get(i));
            } else {
                result.add(lst.get(i));
            }
        }
        int sum = 0;
        for (int i = 0; i < result.size(); i++) {
            sum += result.get(i);
        }
        return sum;
    }
}

// SumSquares1Test.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains ten unit test cases for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {
    
    @Test
    void testEmptyList() {
        List<Integer> lst = new ArrayList<Integer>();
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSingleEntry() {
        List<Integer> lst = Arrays.asList(2);
        int expected = 2;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMultipleEntries() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int expected = 355;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testAllEntriesMultipleOf3() {
        List<Integer> lst = Arrays.asList(3, 6, 9, 12, 15);
        int expected = 495;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testAllEntriesMultipleOf4() {
        List<Integer> lst = Arrays.asList(4, 8, 12, 16, 20);
        int expected = 2144;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testAllEntriesMultipleOf3And4() {
        List<Integer> lst = Arrays.asList(12, 24, 36, 48, 60);
        int expected = 22176;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNoEntriesMultipleOf3Or4() {
        List<Integer> lst = Arrays.asList(1, 2, 5, 7, 11);
        int expected = 139;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNegativeEntries() {
        List<Integer> lst = Arrays.asList(-2, 4, -6, 8, -10);
        int expected = 340;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testZeroEntries() {
        List<Integer> lst = Arrays.asList(0, 0, 0, 0, 0);
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testLargeEntries() {
        List<Integer> lst = Arrays.asList(1000, 2000, 3000, 4000, 5000);
        int expected = 550000000;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
}