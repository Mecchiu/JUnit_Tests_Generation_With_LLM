// LargestPrimeFactorTest.java
package scenario1;


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
        int result = LargestPrimeFactor.largestPrimeFactor(2);
        assertEquals(2, result);
    }
			// Test case 2
    @Test
    void testLargestPrimeFactor2() {
        int result = LargestPrimeFactor.largestPrimeFactor(3);
        assertEquals(3, result);
    }
			// Test case 3
    @Test
    void testLargestPrimeFactor3() {
        int result = LargestPrimeFactor.largestPrimeFactor(5);
        assertEquals(5, result);
    }
			// Test case 4
    @Test
    void testLargestPrimeFactor4() {
        int result = LargestPrimeFactor.largestPrimeFactor(7);
        assertEquals(7, result);
    }
			// Test case 5
    @Test
    void testLargestPrimeFactor5() {
        int result = LargestPrimeFactor.largestPrimeFactor(13);
        assertEquals(13, result);
    }
			// Test case 6
    @Test
    void testLargestPrimeFactor6() {
        int result = LargestPrimeFactor.largestPrimeFactor(29);
        assertEquals(29, result);
    }
			// Test case 7
    @Test
    void testLargestPrimeFactor7() {
        int result = LargestPrimeFactor.largestPrimeFactor(37);
        assertEquals(37, result);
    }
			// Test case 8
    @Test
    void testLargestPrimeFactor8() {
        int result = LargestPrimeFactor.largestPrimeFactor(41);
        assertEquals(41, result);
    }
			// Test case 9
    @Test
    void testLargestPrimeFactor9() {
        int result = LargestPrimeFactor.largestPrimeFactor(43);
        assertEquals(43, result);
    }
			// Test case 10
    @Test
    void testLargestPrimeFactor10() {
        int result = LargestPrimeFactor.largestPrimeFactor(47);
        assertEquals(47, result);
    }
}
