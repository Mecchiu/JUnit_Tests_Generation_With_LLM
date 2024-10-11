// CountUpTo.java
package scenario2;

import java.util.ArrayList;
import java.util.List;

class CountUpTo {

    /**
     * Implement a function that takes an non-negative integer and returns an array of the first n
     * integers that are prime numbers and less than n.
     */
    public static List<Integer> countUpTo(int n) {
        List<Integer> result = new ArrayList<Integer>();
        int i = 2;
        while (i < n) {
            if (isPrime(i)) {
                result.add(i);
            }
            i++;
        }
        return result;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// CountUpToTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains ten unit test cases for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {
    
    @Test
    void testCountUpToWithZero() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = CountUpTo.countUpTo(0);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithOne() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = CountUpTo.countUpTo(1);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithTwo() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = CountUpTo.countUpTo(2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithThree() {
        List<Integer> expected = Arrays.asList(2);
        List<Integer> actual = CountUpTo.countUpTo(3);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithTen() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7);
        List<Integer> actual = CountUpTo.countUpTo(10);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithTwenty() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
        List<Integer> actual = CountUpTo.countUpTo(20);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithThirty() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        List<Integer> actual = CountUpTo.countUpTo(30);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithFifty() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
        List<Integer> actual = CountUpTo.countUpTo(50);
        assertEquals(expected, actual);
    }
    
    @Test
    void testCountUpToWithHundred() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        List<Integer> actual = CountUpTo.countUpTo(100);
        assertEquals(expected, actual);
    }
}