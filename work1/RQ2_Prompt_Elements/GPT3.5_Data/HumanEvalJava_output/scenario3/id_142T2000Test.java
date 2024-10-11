// SumSquares1.java
package scenario3;

import java.util.List;

class SumSquares1 {

    /**
     * "
     * This function will take a list of integers. For all entries in the list, the function shall square the integer entry if its index is a
     * multiple of 3 and will cube the integer entry if its index is a multiple of 4 and not a multiple of 3. The function will not
     * change the entries in the list whose indexes are not a multiple of 3 or 4. The function shall then return the sum of all entries.
     *
     * Examples:
     * For lst = [1,2,3] the output should be 6
     * For lst = []  the output should be 0
     * For lst = [-1,-5,2,-1,-5]  the output should be -126
     *
     * > sumSquares([1, 2, 3])
     * 6
     * > sumSquares([1, 4, 9])
     * 14
     * > sumSquares([])
     * 0
     * > sumSquares([1, 1, 1, 1, 1, 1, 1, 1, 1])
     * 9
     * > sumSquares([-1, -1, -1, -1, -1, -1, -1, -1, -1])
     * -3
     * > sumSquares([0])
     * 0
     * > sumSquares([-1, -5, 2, -1, -5])
     * -126
     * > sumSquares([-56, -99, 1, 0, -2])
     * 3030
     * > sumSquares([-1, 0, 0, 0, 0, 0, 0, 0, -1])
     * 0
     * > sumSquares([-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37])
     * -14196
     * > sumSquares([-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10])
     * -1448
     */
    public static int sumSquares(List<Integer> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (i % 3 == 0) {
                sum += lst.get(i) * lst.get(i);
            } else if (i % 4 == 0 && i % 3 != 0) {
                sum += lst.get(i) * lst.get(i) * lst.get(i);
            } else {
                sum += lst.get(i);
            }
        }
        return sum;
    }
}

// SumSquares1Test.java
package scenario3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains ten unit test cases for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {
    
    @Test
    void testSumSquares1() {
        List<Integer> lst = Arrays.asList(1, 2, 3);
        int expected = 6;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares2() {
        List<Integer> lst = Collections.emptyList();
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares3() {
        List<Integer> lst = Arrays.asList(-1, -5, 2, -1, -5);
        int expected = -126;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares4() {
        List<Integer> lst = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1);
        int expected = 9;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares5() {
        List<Integer> lst = Arrays.asList(-1, -1, -1, -1, -1, -1, -1, -1, -1);
        int expected = -3;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares6() {
        List<Integer> lst = Arrays.asList(0);
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares7() {
        List<Integer> lst = Arrays.asList(-56, -99, 1, 0, -2);
        int expected = 3030;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares8() {
        List<Integer> lst = Arrays.asList(-1, 0, 0, 0, 0, 0, 0, 0, -1);
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares9() {
        List<Integer> lst = Arrays.asList(-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37);
        int expected = -14196;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares10() {
        List<Integer> lst = Arrays.asList(-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10);
        int expected = -1448;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
}