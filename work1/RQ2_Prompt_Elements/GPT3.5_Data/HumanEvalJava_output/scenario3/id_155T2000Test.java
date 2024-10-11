// EvenOddCount.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class EvenOddCount {

    /**
     * Given an integer. return a tuple that has the number of even and odd digits respectively.
     *
     * Example:
     * evenOddCount(-12) ==> (1, 1)
     * evenOddCount(123) ==> (1, 2)
     *
     * > evenOddCount(7)
     * [0, 1]
     * > evenOddCount(-78)
     * [1, 1]
     * > evenOddCount(3452)
     * [2, 2]
     * > evenOddCount(346211)
     * [3, 3]
     * > evenOddCount(-345821)
     * [3, 3]
     * > evenOddCount(-2)
     * [1, 0]
     * > evenOddCount(-45347)
     * [2, 3]
     * > evenOddCount(0)
     * [1, 0]
     */
    public static List<Integer> evenOddCount(int num) {
        List<Integer> result = new ArrayList<>();
        int evenCount = 0;
        int oddCount = 0;
        String numString = Integer.toString(Math.abs(num));
        for (int i = 0; i < numString.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        result.add(evenCount);
        result.add(oddCount);
        return result;
    }
}

// EvenOddCountTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains ten unit test cases for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
    
    @Test
    void testEvenOddCountWithPositiveNumber() {
        List<Integer> result = EvenOddCount.evenOddCount(123);
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
    }
    
    @Test
    void testEvenOddCountWithNegativeNumber() {
        List<Integer> result = EvenOddCount.evenOddCount(-78);
        assertEquals(1, result.get(0));
        assertEquals(1, result.get(1));
    }
    
    @Test
    void testEvenOddCountWithZero() {
        List<Integer> result = EvenOddCount.evenOddCount(0);
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
    }
    
    @Test
    void testEvenOddCountWithSingleDigitPositiveNumber() {
        List<Integer> result = EvenOddCount.evenOddCount(7);
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
    }
    
    @Test
    void testEvenOddCountWithSingleDigitNegativeNumber() {
        List<Integer> result = EvenOddCount.evenOddCount(-2);
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
    }
    
    @Test
    void testEvenOddCountWithMultipleEvenDigits() {
        List<Integer> result = EvenOddCount.evenOddCount(3452);
        assertEquals(2, result.get(0));
        assertEquals(2, result.get(1));
    }
    
    @Test
    void testEvenOddCountWithMultipleOddDigits() {
        List<Integer> result = EvenOddCount.evenOddCount(346211);
        assertEquals(3, result.get(0));
        assertEquals(3, result.get(1));
    }
    
    @Test
    void testEvenOddCountWithMultipleDigits() {
        List<Integer> result = EvenOddCount.evenOddCount(-45347);
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
    }
    
    @Test
    void testEvenOddCountWithNegativeMultipleDigits() {
        List<Integer> result = EvenOddCount.evenOddCount(-345821);
        assertEquals(3, result.get(0));
        assertEquals(3, result.get(1));
    }
    
    @Test
    void testEvenOddCountWithLargeNumber() {
        List<Integer> result = EvenOddCount.evenOddCount(1234567890);
        assertEquals(5, result.get(0));
        assertEquals(5, result.get(1));
    }
}