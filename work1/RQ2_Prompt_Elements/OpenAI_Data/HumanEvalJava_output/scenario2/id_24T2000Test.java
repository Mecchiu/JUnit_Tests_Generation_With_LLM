// LargestDivisorTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
	// Test case 1: n = 1
    @Test
    void testLargestDivisor1() {
        int n = 1;
        int expected = 1;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 2: n = 2
    @Test
    void testLargestDivisor2() {
        int n = 2;
        int expected = 1;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 3: n = 3
    @Test
    void testLargestDivisor3() {
        int n = 3;
        int expected = 1;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 4: n = 4
    @Test
    void testLargestDivisor4() {
        int n = 4;
        int expected = 2;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 5: n = 5
    @Test
    void testLargestDivisor5() {
        int n = 5;
        int expected = 1;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 6: n = 6
    @Test
    void testLargestDivisor6() {
        int n = 6;
        int expected = 3;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 7: n = 7
    @Test
    void testLargestDivisor7() {
        int n = 7;
        int expected = 1;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 8: n = 8
    @Test
    void testLargestDivisor8() {
        int n = 8;
        int expected = 4;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 9: n = 9
    @Test
    void testLargestDivisor9() {
        int n = 9;
        int expected = 3;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }

    // Test case 10: n = 10
    @Test
    void testLargestDivisor10() {
        int n = 10;
        int expected = 5;
        int actual = LargestDivisor.largestDivisor(n);
        assertEquals(expected, actual);
    }
}
