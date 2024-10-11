// SumToNTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
			// Test case 1: n = 0
    @Test
    void testSumToN1() {
        int n = 0;
        int expected = 0;
        int actual = SumToN.sumToN(n);
        assertEquals(expected, actual);
    }

    // Test case 2: n = 1
    @Test
    void testSumToN2() {
        int n = 1;
        int expected = 1;
        int actual = SumToN.sumToN(n);
        assertEquals(expected, actual);
    }

    // Test case 3: n = 2
    @Test
    void testSumToN3() {
        int n = 2;
        int expected = 3;
        int actual = SumToN.sumToN(n);
        assertEquals(expected, actual);
    }

    // Test case 4: n = 3
    @Test
    void testSumToN4() {
        int n = 3;
        int expected = 6;
        int actual = SumToN.sumToN(n);
        assertEquals(expected, actual);
    }

    // Test case 5: n = 4
    @Test
    void testSumToN5() {
        int n = 4;
        int expected = 10;
        int actual = SumToN.sumToN(n);
        assertEquals(expected, actual);
    }

    // Test case 6: n = 5
    @Test
    void testSumToN6() {
        int n = 5;
        int expected = 15;
        int actual = SumToN.sumToN(n);
        assertEquals(expected, actual);
    }

    // Test case 7: n = 6
    @Test
    void testSumToN7() {
        int n = 6;
        int expected = 21;
        int actual = SumToN.sumToN(n);
        assertEquals(expected, actual);
    }

    // Test case 8: n = 7
    @Test
    void testSumToN8() {
        int n = 7;
        int expected = 28;
        int actual = SumToN.sumToN(n);
        assertEquals(expected, actual);
    }

    // Test case 9: n = 8
    @Test
    void testSumToN9() {
        int n = 8;
        int expected = 36;
        int actual = SumToN.sumToN(n);
        assertEquals(expected, actual);
    }

    // Test case 10: n = 9
    @Test
    void testSumToN10() {
        int n = 9;
        int expected = 45;
        int actual = SumToN.sumToN(n);
        assertEquals(expected, actual);
    }
}