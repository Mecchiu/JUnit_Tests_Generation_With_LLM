// LargestDivisorTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
			// Test case 1: Test for a positive integer
    @Test
    void testLargestDivisor1() {
        int n = 10;
        int expected = 5;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 2: Test for a negative integer
    @Test
    void testLargestDivisor2() {
        int n = -10;
        int expected = 1;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 3: Test for zero
    @Test
    void testLargestDivisor3() {
        int n = 0;
        int expected = 1;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 4: Test for a prime number
    @Test
    void testLargestDivisor4() {
        int n = 7;
        int expected = 1;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 5: Test for a positive integer with only one divisor
    @Test
    void testLargestDivisor5() {
        int n = 1;
        int expected = 1;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 6: Test for a negative integer with only one divisor
    @Test
    void testLargestDivisor6() {
        int n = -1;
        int expected = 1;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 7: Test for a positive integer with two divisors
    @Test
    void testLargestDivisor7() {
        int n = 2;
        int expected = 1;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 8: Test for a negative integer with two divisors
    @Test
    void testLargestDivisor8() {
        int n = -2;
        int expected = 1;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 9: Test for a positive integer with more than two divisors
    @Test
    void testLargestDivisor9() {
        int n = 12;
        int expected = 6;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 10: Test for a negative integer with more than two divisors
    @Test
    void testLargestDivisor10() {
        int n = -12;
        int expected = 6;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }
}