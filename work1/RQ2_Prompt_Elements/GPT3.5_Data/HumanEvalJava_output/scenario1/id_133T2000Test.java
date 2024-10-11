// SumSquares.java
package scenario1;

import java.util.List;

class SumSquares {

    public static int sumSquares(List<Number> lst) {
        int sum = 0;
        for (Number n : lst) {
            sum += Math.pow(Math.ceil(n.doubleValue()), 2);
        }
        return sum;
    }
}

// SumSquaresTest.java
package scenario1;

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
    void testEmptyList() {
        List<Number> lst = Arrays.asList();
        int result = SumSquares.sumSquares(lst);
        assertEquals(0, result);
    }
    
    @Test
    void testListWithOneZero() {
        List<Number> lst = Arrays.asList(0);
        int result = SumSquares.sumSquares(lst);
        assertEquals(0, result);
    }
    
    @Test
    void testListWithOnePositiveNumber() {
        List<Number> lst = Arrays.asList(5);
        int result = SumSquares.sumSquares(lst);
        assertEquals(25, result);
    }
    
    @Test
    void testListWithOneNegativeNumber() {
        List<Number> lst = Arrays.asList(-5);
        int result = SumSquares.sumSquares(lst);
        assertEquals(25, result);
    }
    
    @Test
    void testListWithTwoPositiveNumbers() {
        List<Number> lst = Arrays.asList(2, 3);
        int result = SumSquares.sumSquares(lst);
        assertEquals(13, result);
    }
    
    @Test
    void testListWithTwoNegativeNumbers() {
        List<Number> lst = Arrays.asList(-2, -3);
        int result = SumSquares.sumSquares(lst);
        assertEquals(13, result);
    }
    
    @Test
    void testListWithMixedNumbers() {
        List<Number> lst = Arrays.asList(-2, 3);
        int result = SumSquares.sumSquares(lst);
        assertEquals(13, result);
    }
    
    @Test
    void testListWithDecimalNumbers() {
        List<Number> lst = Arrays.asList(2.5, 3.7);
        int result = SumSquares.sumSquares(lst);
        assertEquals(20, result);
    }
    
    @Test
    void testListWithLargeNumbers() {
        List<Number> lst = Arrays.asList(1000000000, 2000000000);
        int result = SumSquares.sumSquares(lst);
        assertEquals(5000000000000000000L, result);
    }
    
    @Test
    void testListWithMixedNumbersAndZero() {
        List<Number> lst = Arrays.asList(-2, 0, 3);
        int result = SumSquares.sumSquares(lst);
        assertEquals(13, result);
    }
}