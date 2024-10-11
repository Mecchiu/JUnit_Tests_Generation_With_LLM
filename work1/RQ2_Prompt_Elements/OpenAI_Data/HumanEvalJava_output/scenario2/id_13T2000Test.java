// GreatestCommonDivisorTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GreatestCommonDivisor}.
* It contains ten unit test cases for the {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)} method.
*/
class GreatestCommonDivisorTest {
	// Test case 1
    @Test
    void testGreatestCommonDivisor1() {
        int a = 0;
        int b = 0;
        int expected = 0;
        int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 2
    @Test
    void testGreatestCommonDivisor2() {
        int a = 0;
        int b = 1;
        int expected = 1;
        int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 3
    @Test
    void testGreatestCommonDivisor3() {
        int a = 1;
        int b = 0;
        int expected = 1;
        int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 4
    @Test
    void testGreatestCommonDivisor4() {
        int a = 1;
        int b = 1;
        int expected = 1;
        int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 5
    @Test
    void testGreatestCommonDivisor5() {
        int a = 1;
        int b = 2;
        int expected = 1;
        int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 6
    @Test
    void testGreatestCommonDivisor6() {
        int a = 2;
        int b = 1;
        int expected = 1;
        int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 7
    @Test
    void testGreatestCommonDivisor7() {
        int a = 2;
        int b = 2;
        int expected = 2;
        int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 8
    @Test
    void testGreatestCommonDivisor8() {
        int a = 2;
        int b = 3;
        int expected = 1;
        int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 9
    @Test
    void testGreatestCommonDivisor9() {
        int a = 3;
        int b = 2;
        int expected = 1;
        int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 10
    @Test
    void testGreatestCommonDivisor10() {
        int a = 3;
        int b = 3;
        int expected = 3;
        int actual = GreatestCommonDivisor.greatestCommonDivisor(a, b);
        assertEquals(expected, actual);
    }
}
