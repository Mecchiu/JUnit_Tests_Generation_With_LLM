// LargestPrimeFactorTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestPrimeFactor}.
* It contains ten unit test cases for the {@link LargestPrimeFactor#largestPrimeFactor(int)} method.
*/
class LargestPrimeFactorTest {
			// Test case 1
    @Test
    void testLargestPrimeFactor1() {
        assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2));
    }

    // Test case 2
    @Test
    void testLargestPrimeFactor2() {
        assertEquals(3, LargestPrimeFactor.largestPrimeFactor(6));
    }

    // Test case 3
    @Test
    void testLargestPrimeFactor3() {
        assertEquals(5, LargestPrimeFactor.largestPrimeFactor(10));
    }

    // Test case 4
    @Test
    void testLargestPrimeFactor4() {
        assertEquals(7, LargestPrimeFactor.largestPrimeFactor(14));
    }

    // Test case 5
    @Test
    void testLargestPrimeFactor5() {
        assertEquals(11, LargestPrimeFactor.largestPrimeFactor(22));
    }

    // Test case 6
    @Test
    void testLargestPrimeFactor6() {
        assertEquals(13, LargestPrimeFactor.largestPrimeFactor(26));
    }

    // Test case 7
    @Test
    void testLargestPrimeFactor7() {
        assertEquals(17, LargestPrimeFactor.largestPrimeFactor(34));
    }

    // Test case 8
    @Test
    void testLargestPrimeFactor8() {
        assertEquals(19, LargestPrimeFactor.largestPrimeFactor(38));
    }

    // Test case 9
    @Test
    void testLargestPrimeFactor9() {
        assertEquals(23, LargestPrimeFactor.largestPrimeFactor(46));
    }

    // Test case 10
    @Test
    void testLargestPrimeFactor10() {
        assertEquals(29, LargestPrimeFactor.largestPrimeFactor(58));
    }
}