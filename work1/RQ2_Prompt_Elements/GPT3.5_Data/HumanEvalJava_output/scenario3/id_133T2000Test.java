// SumSquares.java
package scenario3;

import java.util.List;

class SumSquares {

    /**
     * You are given a list of numbers.
     * You need to return the sum of squared numbers in the given list,
     * round each element in the list to the upper int(Ceiling) first.
     * Examples:
     * For lst = [1,2,3] the output should be 14
     * For lst = [1,4,9] the output should be 98
     * For lst = [1,3,5,7] the output should be 84
     * For lst = [1.4,4.2,0] the output should be 29
     * For lst = [-2.4,1,1] the output should be 6
     *
     * > sumSquares([1, 2, 3])
     * 14
     * > sumSquares([1.0, 2, 3])
     * 14
     * > sumSquares([1, 3, 5, 7])
     * 84
     * > sumSquares([1.4, 4.2, 0])
     * 29
     * > sumSquares([-2.4, 1, 1])
     * 6
     * > sumSquares([100, 1, 15, 2])
     * 10230
     * > sumSquares([10000, 10000])
     * 200000000
     * > sumSquares([-1.4, 4.6, 6.3])
     * 75
     * > sumSquares([-1.4, 17.9, 18.9, 19.9])
     * 1086
     * > sumSquares([0])
     * 0
     * > sumSquares([-1])
     * 1
     * > sumSquares([-1, 1, 0])
     * 2
     */
    public static int sumSquares(List<Number> lst) {
        int sum = 0;
        for (Number num : lst) {
            int ceil = (int) Math.ceil(num.doubleValue());
            sum += ceil * ceil;
        }
        return sum;
    }
}

// SumSquaresTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares}.
* It contains ten unit test cases for the {@link SumSquares#sumSquares(List)} method.
*/
class SumSquaresTest {
    
    @Test
    void testSumSquares1() {
        List<Number> lst = Arrays.asList(1, 2, 3);
        int expected = 14;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares2() {
        List<Number> lst = Arrays.asList(1.0, 2, 3);
        int expected = 14;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares3() {
        List<Number> lst = Arrays.asList(1, 3, 5, 7);
        int expected = 84;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares4() {
        List<Number> lst = Arrays.asList(1.4, 4.2, 0);
        int expected = 29;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares5() {
        List<Number> lst = Arrays.asList(-2.4, 1, 1);
        int expected = 6;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares6() {
        List<Number> lst = Arrays.asList(100, 1, 15, 2);
        int expected = 10230;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares7() {
        List<Number> lst = Arrays.asList(10000, 10000);
        int expected = 200000000;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares8() {
        List<Number> lst = Arrays.asList(-1.4, 4.6, 6.3);
        int expected = 75;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares9() {
        List<Number> lst = Arrays.asList(-1.4, 17.9, 18.9, 19.9);
        int expected = 1086;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares10() {
        List<Number> lst = Arrays.asList(0);
        int expected = 0;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares11() {
        List<Number> lst = Arrays.asList(-1);
        int expected = 1;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares12() {
        List<Number> lst = Arrays.asList(-1, 1, 0);
        int expected = 2;
        int actual = SumSquares.sumSquares(lst);
        assertEquals(expected, actual);
    }
}