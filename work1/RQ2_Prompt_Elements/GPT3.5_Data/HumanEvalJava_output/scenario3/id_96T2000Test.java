// CountUpTo.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class CountUpTo {

    /**
     * Implement a function that takes an non-negative integer and returns an array of the first n
     * integers that are prime numbers and less than n.
     * for example:
     * countUpTo(5) => [2,3]
     * countUpTo(11) => [2,3,5,7]
     * countUpTo(0) => []
     * countUpTo(20) => [2,3,5,7,11,13,17,19]
     * countUpTo(1) => []
     * countUpTo(18) => [2,3,5,7,11,13,17]
     *
     * > countUpTo(5)
     * [2, 3]
     * > countUpTo(6)
     * [2, 3, 5]
     * > countUpTo(7)
     * [2, 3, 5, 7]
     * > countUpTo(10)
     * [2, 3, 5, 7]
     * > countUpTo(0)
     * []
     * > countUpTo(22)
     * [2, 3, 5, 7, 11, 13, 17, 19]
     * > countUpTo(1)
     * []
     * > countUpTo(18)
     * [2, 3, 5, 7, 11, 13, 17]
     * > countUpTo(47)
     * [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43]
     * > countUpTo(101)
     * [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
     */
    public static List<Integer> countUpTo(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n < 2) {
            return primes;
        }
        primes.add(2);
        for (int i = 3; i < n; i += 2) {
            boolean isPrime = true;
            for (int j = 3; j <= Math.sqrt(i); j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }
}

// CountUpToTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains ten unit test cases for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {

    @Test
    void testCountUpToWith5() {
        List<Integer> expected = List.of(2, 3);
        List<Integer> actual = CountUpTo.countUpTo(5);
        assertEquals(expected, actual);
    }

    @Test
    void testCountUpToWith6() {
        List<Integer> expected = List.of(2, 3, 5);
        List<Integer> actual = CountUpTo.countUpTo(6);
        assertEquals(expected, actual);
    }

    @Test
    void testCountUpToWith7() {
        List<Integer> expected = List.of(2, 3, 5, 7);
        List<Integer> actual = CountUpTo.countUpTo(7);
        assertEquals(expected, actual);
    }

    @Test
    void testCountUpToWith10() {
        List<Integer> expected = List.of(2, 3, 5, 7);
        List<Integer> actual = CountUpTo.countUpTo(10);
        assertEquals(expected, actual);
    }

    @Test
    void testCountUpToWith0() {
        List<Integer> expected = List.of();
        List<Integer> actual = CountUpTo.countUpTo(0);
        assertEquals(expected, actual);
    }

    @Test
    void testCountUpToWith22() {
        List<Integer> expected = List.of(2, 3, 5, 7, 11, 13, 17, 19);
        List<Integer> actual = CountUpTo.countUpTo(22);
        assertEquals(expected, actual);
    }

    @Test
    void testCountUpToWith1() {
        List<Integer> expected = List.of();
        List<Integer> actual = CountUpTo.countUpTo(1);
        assertEquals(expected, actual);
    }

    @Test
    void testCountUpToWith18() {
        List<Integer> expected = List.of(2, 3, 5, 7, 11, 13, 17);
        List<Integer> actual = CountUpTo.countUpTo(18);
        assertEquals(expected, actual);
    }

    @Test
    void testCountUpToWith47() {
        List<Integer> expected = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43);
        List<Integer> actual = CountUpTo.countUpTo(47);
        assertEquals(expected, actual);
    }

    @Test
    void testCountUpToWith101() {
        List<Integer> expected = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        List<Integer> actual = CountUpTo.countUpTo(101);
        assertEquals(expected, actual);
    }
}